<template>
    <div style="margin: 0 auto">
        <glob-breadcrumb title="填写商品信息"/>
        <br><br>
        <div class="z-di-cc">
            <div class="z-space-cc">
                <el-steps :space="340" :active="3" finish-status="success" align-center>
                    <el-step title="选择商品分类"></el-step>
                    <el-step title="填写商品信息"></el-step>
                    <el-step title="填写商品属性"></el-step>
                </el-steps>
            </div>
        </div>

        <div class="all">
            <div class="left">


                <div class="image1">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">图文详情</p>
                </div>

                <div class="image">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">商品相册</p>
                </div>

            </div>

            <div class="right">
                <div class="photo"style="margin-left: 45px" v-if="uploadFileList.length==0">
                    <img style="width: 100%;height: 80%" src="./image/1120.png">
                    <div style=" width: 100%;height: 20%;display: flex;line-height: 32px">
                        <p style="margin-left: 20px;color: #1abc9c">设为主图</p>
                        <p style="margin-left: 10px;color: #1abc9c">删除图片</p>
                    </div>
                </div>
                <div class="photos" style="display: flex " v-if="uploadFileList.length">
                    <div class="photo" style="margin-left: 45px" v-for="(url,index) in uploadFileList">
                        <img style=" width: 100%;height: 80%"
                             :src="url"
                             fit="contain"
                        >
                        <div style=" width: 100%;height: 20%;display: flex;line-height: 32px">
                            <p v-if="index==0"><span class="red" style="margin-left: 20px;color: red">商品主图</span></p>
                            <p v-else @click="setMain(index)" style="margin-left: 20px;color: #1abc9c"><span>设为主图</span></p>
                            <p><span @click="handleRemove(index)" style="margin-left: 20px;color: #1abc9c">删除图片</span></p>
                        </div>
                    </div>

                </div>

                <div class="uploading">
                    <el-upload
                            :action="Base_url+'/admin/upload/pictureUrl'"
                            :show-file-list="false"
                            :on-change="fileChange"
                            multiple
                            :limit="5"
                            :on-exceed="exceedMsg"
                            :on-success="imageSuccess"
                    >
                        <el-button style="width: 117px;height: 35px;background: #48c9b0;border: none;color: white;margin-left: 15px">上传图片</el-button>
                    </el-upload>
                    <p style="margin-left: 35px;margin-top: 12px;color: #a6a6c4">最多可以上传5张图片，建议尺寸800*800px</p>
                </div>

                <div class="content" >
                    <el-form ref="form" >
                        <vue-editor
                                style="width:839px;height: 350px;padding-top: 50px"
                                useCustomImageHandler
                                v-model="skuExplain">
                        </vue-editor>
                    </el-form>
                </div>

                <div style="padding-top: 50px;padding-left: 250px">
                    <button @click="retreat" style="width: 180px;height: 35px;border: 1px solid #1abcb6;color: #1abcb6;background: white">上一步，填写商品信息</button>
                    <button @click="saveGoods" style="width: 180px;height: 35px;border: 1px solid #1abcb6;color: white;background:#1abcb6;margin-left: 100px;">完成，提交商品</button>
                </div>

            </div>

        </div>
    </div>

</template>

<script>
    import {quillRedefine} from 'vue-quill-editor-upload'
    import { VueEditor } from "vue2-editor";
    import {Base_url} from '../../config/index'

    export default {
        data() {
            return {
                skuExplain:'',
                Base_url: '',
                categoryIcon: '',
                uploadFileList:[],
                skuId:'',
            }
        },
        components: {
            VueEditor
        },

        mounted() {
            this.Base_url = Base_url
            this.parentId = this.$route.params.parentId
            this.skuId = this.$route.params.skuId
            console.log(this.$route.params)
        },
        methods: {
            handleRemove(index) {
                this.uploadFileList.splice(index, 1);
            },
            setMain(index) {
                let main = this.uploadFileList.splice(index, 1);
                this.uploadFileList = [...main, ...this.uploadFileList]
            },
            fileChange(file, fileList) {
            },
            exceedMsg() {
                this.$message.error('最多上传5张图片')
            },
            imageSuccess(res) {
                this.uploadFileList.push(res.fileUrl)
            },
            async handleAvatarSuccess(res) {
                this.categoryIcon = res.fileUrl;
                console.log(this.categoryIcon)
            },
            async saveGoods(){
                let resa = await this.$get("/admin/getSkuShop", {id:this.parentId});
                this.skuId = resa.item.id;
                let data = {
                    // id:this.skuId,
                    skuId: resa.item.id,
                    shpSkuResources:JSON.stringify(this.uploadFileList),
                };
                if (!this.uploadFileList.length){
                    this.$message.info("请录入图片片!")
                    return;
                }
                let res = await this.$post("/admin/insertSkuResources", data);

                let data1 = {
                    id:this.skuId,
                    skuExplain:this.skuExplain
                };
                let resb = await this.$post("/admin/insertSku", data1);
                this.$router.push('/sku/selectTable')
            },


            async retreat(){
                this.$router.push('/sku/addGoods/AddShopsAttribute/ReturnInformation/'+ this.skuId+'/'+this.parentId)
                console.log(this.parentId)
            }
        }
    }
</script>

<style scoped>
    .z-di-cc {
        padding-top: 5px;
        margin: 0 auto;
        height: 70px;
        width: 1100px;
    }

    .z-space-cc {
        margin: 0 auto;
        width: 75%;
    }
    .all{
        display: flex;
        width: 1100px;
        height: 931px;
        border: 1px solid;
        margin: 0 auto;
        border: 1px solid #e4e4e4;
    }
    .left{
        width: 180px;
        height: 931px;
        background: #fcfcfc;
        border-right:1px solid #e4e4e4 ;
    }
    .right{
        width: 920px ;
        height: 921px;
        background: #ffffff;
    }
    .image{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 170px;
    }
    .image1{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 450px;
    }
    .image2{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 920px;
    }
    .photo{
        width: 150px;
        height: 170px;
        border: 1px solid #e4e4e4;
        margin-top: 25px;
    }
    .uploading{
        display: flex;
        margin-top: 20px;
        margin-left: 30px;
    }
    .content{
        width: 830px;
        height: 410px;
        margin: 0 auto;
    }
</style>