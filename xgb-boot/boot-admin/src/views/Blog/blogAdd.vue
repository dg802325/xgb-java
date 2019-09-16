<template>
    <div>
        <glob-breadcrumb title="博客发表"/>
        <br><br>
        <div class="container">
            <el-form label-width="80px">
                <el-form-item label="标题">
                    <el-input v-model="title"></el-input>
                </el-form-item>
                <el-form-item label="所属分类">
                    <el-select v-model="classification" placeholder="请选择所属分类">
                        <el-option label="区域一" value="shanghai"></el-option>
                        <el-option label="区域二" value="beijing"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="是否显示">
                    <el-switch v-model="delivery"></el-switch>
                </el-form-item>
                <el-form-item label="标签">
                    <el-checkbox-group style="margin-top: 1px;" v-model="type">
                        <el-checkbox label="美食/餐厅线上活动" name="type"></el-checkbox>
                        <el-checkbox label="地推活动" name="type"></el-checkbox>
                        <el-checkbox label="线下主题活动" name="type"></el-checkbox>
                        <el-checkbox label="单纯品牌曝光" name="type"></el-checkbox>
                    </el-checkbox-group>
                </el-form-item>
                <el-form-item label="博客内容">
                    <quill-editor
                            style="height: 400px;"
                            v-model="content"
                            ref="myQuillEditor"
                            :options="editorOption"
                            @blur="onEditorBlur($event)" @focus="onEditorFocus($event)"
                            @change="onEditorChange($event)">
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

    import { quillEditor } from 'vue-quill-editor' //调用编辑器
    export default {
        data() {
            return {
                title:'',
                classification:'',
                delivery:'',
                content:'',
                type:'',
                editorOption:{},
            }
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
                console.log(data)
                console.log('submit!');
                let res = await this.$post("/admin/saveBlogGarden", data)
                console.log(res)
            },
            onEditorBlur(e){//失去焦点事件
                console.log(e)
                console.log("失去焦点事件")
            },
            onEditorFocus(e){//获得焦点事件
                console.log(e)
                console.log("获得焦点事件")
            },
            onEditorChange(e){//内容改变事件
                console.log(e)
                console.log("内容改变事件")
                console.log("字数："+this.content.length)
            },
        }
    }
</script>
<style>
    .container{
        height: 900px;
    }
    .but_submit{
        margin-top:80px;
        margin-left: 425px;
    }
</style>