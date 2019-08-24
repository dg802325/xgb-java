<template>
    <div>
        <div>
            <glob-breadcrumb title="添加品牌"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        添加新品牌
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx">
                        <div style="height: 1000px;padding-top: 50px">
                            <el-form ref="form" label-width="100px">
                                <el-form-item label="品牌名称：" required>
                                    <el-input v-model="brandName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="品牌商标：">
                                    <div style="padding-bottom: 20px;">
                                        <div class="img_Border_1" align="center">
                                            <img v-if="tradeMark" :src="tradeMark" width="150px;" height="120px;">
                                            <img v-else src="./img/u6753.png" style="padding-top: 30px;" >
                                        </div>
                                        <div class="img_bottom" align="center">
                                            <el-button type="text" @click="removeMain">删除图片</el-button>
                                        </div>
                                    </div>
                                    <div>
                                        <el-upload
                                                :action="Base_url+'/admin/upload'"
                                                :show-file-list="false"
                                                :on-success="mainImgSuccess"
                                        >
                                            <el-button type="primary" class="el-button_2" style="width: 117px;">上传图片</el-button>
                                        </el-upload>
                                    </div>
                                </el-form-item>
                                <el-form-item label="品牌资质：">
                                    <div style="padding-bottom: 20px;float: left" v-if="brandResources.length" v-for="(item,index) in brandResources">
                                        <div class="img_Border_1" align="center">
                                            <img :src="item" height="120px;" width="150px;">
                                        </div>
                                        <div class="img_bottom" align="center">
                                            <el-button type="text" @click="removeResource(index)">删除图片</el-button>
                                        </div>
                                    </div>
                                    <div style="padding-bottom: 20px;" v-if="!brandResources.length">
                                        <div class="img_Border_1" align="center">
                                            <img src="./img/u6753.png" style="padding-top: 30px;">
                                        </div>
                                        <div class="img_bottom" align="center">
                                            <el-button type="text">删除图片</el-button>
                                        </div>
                                    </div>
                                    <div style="position: absolute;top: 180px;">
                                        <el-upload
                                                :action="Base_url+'/admin/upload'"
                                                :show-file-list="false"
                                                :on-success="handlePictureCardPreview"
                                        >
                                            <el-button type="primary" class="el-button_2" style="width: 117px;">上传图片</el-button>
                                        </el-upload>
                                    </div>
                                </el-form-item>
                                <br><br><br>
                                <el-form-item label="品牌制造商：">
                                    <el-radio label="0" v-model="isManufacturer">是</el-radio>
                                    <el-radio label="1" v-model="isManufacturer">否</el-radio>
                                </el-form-item>
                                <el-form-item label="申请备注：" required>
                                    <el-input type="textarea" v-model="applyRemark" resize="none" rows="9" size="1" style="width: 450px;" placeholder="请输入内容"></el-input>
                                </el-form-item>
                            </el-form>
                            <br>
                            <div slot="footer" class="dialog-footer" style="padding-left: 100px">
                                <el-button class="el-button_2" type="primary" @click="saveEvent">确 定</el-button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import {Base_url} from "../../config";
    export default {
        data() {
            return {
                id:'',
                tradeMark:'',
                brandName:'',
                Base_url:'',
                applyRemark:'',
                brandResources:[],
                isManufacturer:'0',
            }
        },
        created(){
            this.Base_url = Base_url;
        },
        methods: {
            removeMain(){
                this.tradeMark = ''
            },
            mainImgSuccess(res){
                this.tradeMark = res.fileUrl
            },
            removeResource(index){
                this.brandResources.splice(index,1)
            },
            handlePictureCardPreview(res) {
                this.brandResources.push(res.fileUrl)
            },
            async saveEvent() {
                //名称是否已存在
                if (!this.brandName) {
                    this.$message.warning('请输入品牌名称')
                    return;
                }
                let brand = await this.$get('/supplier/isHaveBrand',{brandName:this.brandName})
                if (brand.code==200) {
                    this.$message.warning('该名称已存在')
                    return;
                }

                let data = {
                    id:'',
                    brandName: this.brandName,
                    tradeMark: this.tradeMark,
                    applyRemark: this.applyRemark,
                    isManufacturer:this.isManufacturer,
                    brandResources: JSON.stringify(this.brandResources)
                };
                let res = await this.$post("/supplier/save_erpBrand",data);
                if (res.code==200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.$router.push('/sku/brandManager')
                }else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
            },
        }
    }
</script>

<style>

    .content_b {
        width: 100%;
        height: auto;
        background-color: #fff;
    }

    .content_b_tx {
        width: 50%;
        margin: 0 auto;
    }

    .el-button_2{
        width:80px;
        height: 35px;
        padding:10px 20px;
        border-radius: 2px;
    }

    .el-button--primary{
        background-color:#1abc9c;
        border-color:#1abc9c;
    }

    .img_Border_1 {
        border:solid;
        border-width: 1px;
        border-color: #e4e4e4;
        width:150px;
        height:120px;
    }
    .img_bottom {
        border-left:solid;
        border-right:solid;
        border-bottom:solid;
        border-width: 1px;
        border-color: #e4e4e4;
        background-color: #f9f9f9;
        width:150px;
        height:35px;
    }

</style>
