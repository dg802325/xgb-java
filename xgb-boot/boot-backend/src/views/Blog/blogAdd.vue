<template>
    <div>
        <glob-breadcrumb title="博客发表"/>
        <br><br>
        <div class="container">
            <el-form label-width="120px">
                <el-form-item label="标题">
                    <el-input v-model="title"></el-input>
                </el-form-item>
                <el-form-item label="所属分类">
                    <el-select v-model="classification" clearable placeholder="请选择所属分类">
                        <el-option
                                v-for="item in classificationList"
                                :key="item.id"
                                :label="item.classIfication"
                                :value="item.id">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="是否显示">
                    <el-switch v-model="delivery"></el-switch>
                </el-form-item>
                <el-form-item label="标签">
                    <el-checkbox-group
                            v-model="checkedCities"
                            :min="0"
                            :max="3">
                        <el-checkbox v-for="city in cities" :label="city" :key="city">{{city}}</el-checkbox>
                    </el-checkbox-group>
                </el-form-item>
                <el-form-item label="博客内容" style="background-color: #FFFFFF">
                    <quill-editor
                            style="height: 600px"
                            v-model="content"
                            ref="myQuillEditor"
                            :options="editorOption">
                    </quill-editor>
                </el-form-item>
                <el-form-item>
                    <el-button class="but_submit" type="primary" @click="onSubmit">立即创建</el-button>
                    <el-button>取消</el-button>
                </el-form-item>
            </el-form>

        </div>
    </div>
</template>

<script>
    import {quillEditor, Quill} from 'vue-quill-editor'
    import {container, ImageExtend, QuillWatch} from 'quill-image-extend-module'
    Quill.register('modules/ImageExtend', ImageExtend)
    const cityOptions = ['上海', '北京', '广州', '深圳'];
    export default {
        components: {quillEditor},
        data() {
            return {
                cities: cityOptions,
                checkedCities: [],
                title:'',
                classification:'',
                delivery:'',
                content:'',
                type:'',
                classificationList:[],
                editorOption: {
                    modules: {
                        ImageExtend: {
                            loading: true,  // 可选参数 是否显示上传进度和提示语
                            name: 'img',  // 图片参数名
                            size: 3,  // 可选参数 图片大小，单位为M，1M = 1024kb
                            action: "http://localhost:10010/admin/upload/pictureUrl",  // 服务器地址, 如果action为空，则采用base64插入图片
                            // response 为一个函数用来获取服务器返回的具体图片地址
                            // 例如服务器返回{code: 200; data:{ url: 'baidu.com'}}
                            // 则 return res.data.url
                            response: (res) => {
                                return res.data.url
                            },
                            headers: (xhr) => {},  // 可选参数 设置请求头部
                            start: () => {},  // 可选参数 自定义开始上传触发事件
                            end: () => {},  // 可选参数 自定义上传结束触发的事件，无论成功或者失败
                            error: () => {},  // 可选参数 自定义网络错误触发的事件
                            change: (xhr, formData) => {} // 可选参数 选择图片触发，也可用来设置头部，但比headers多了一个参数，可设置formData
                        },
                        toolbar: {
                            container: container,  // container为工具栏，此次引入了全部工具栏，也可自行配置
                            handlers: {
                                'image': function () {  // 劫持原来的图片点击按钮事件
                                    QuillWatch.emit(this.quill.id)
                                }
                            }
                        }
                    }
                }
            }

        },
        created() {
            this.getClassification()
        },
        methods: {
            async onSubmit() {
                let data = {
                    blogTaitl:this.title,
                    classificationId:this.classification,
                    status:this.delivery,
                    type:this.type,
                    content:this.content,
                }
                let res = await this.$post("/admin/saveBlogGarden", data)
            },
            async getClassification(){
                let data = {
                }
                let res = await this.$get("/admin/getBlogClassList", data)
                if(res.code=='200'){
                    this.classificationList = res.lists;
                }
            }

        }
    }
</script>
<style>
    .item_editor{
        height: 600px;
    }
    .but_submit{
        margin-top:80px;
        margin-left: 425px;
    }
</style>