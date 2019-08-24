<template>
    <div>
        <div>
            <glob-breadcrumb title="查看品牌"></glob-breadcrumb>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        查看新品牌
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx" style="height: 824px;">
                            <div style="padding-top: 49px;">
                                    <el-form ref="form" label-width="120px" class="el-form-item_1">
                                        <el-form-item label="品牌名称:" required>
                                            <el-input v-model="brandName" size="1" style="width: 240px;" disabled></el-input>
                                        </el-form-item>
                                        <el-form-item label="品牌商标:" required>
                                            <div style="padding-top: 12px;">
                                                <div class="img_Border" v-if="tradeMark">
                                                    <img :src="tradeMark" width="150px;">
                                                </div>
                                                <div class="img_Border" v-else>
                                                    <img src="./img/u6753.png" style="padding-top: 30px;padding-left: 30px">
                                                </div>
                                            </div>
                                        </el-form-item>
                                        <el-form-item label="品牌资质:">
                                            <div style="padding-top: 12px;">
                                                <div v-if="brandImgList.length" v-for="img in brandImgList">
                                                    <img :src="img" width="150px;">
                                                </div>
                                                <div v-if="!brandImgList.length" class="img_Border">
                                                    <img src="./img/u6753.png" style="padding-top: 30px;padding-left: 30px">
                                                </div>
                                            </div>
                                        </el-form-item>
                                        <el-form-item label="品牌制造商：">
                                            <el-radio label="0" v-model="isManufacturer" disabled>是</el-radio>
                                            <el-radio label="1" v-model="isManufacturer" disabled>否</el-radio>
                                        </el-form-item>
                                        <el-form-item label="申请备注:" >
                                            <el-input type="textarea" v-model="applyRemark" resize="none" rows="8" size="1" style="width: 433px;" placeholder="请输入内容" disabled></el-input>
                                        </el-form-item>
                                        <el-form-item label="审核状态:">
                                            <span style="font-size:14px;color: #999999;" v-if="auditStatus=='0'">待审核</span>
                                            <span style="font-size:14px;color: #999999;" v-else-if="auditStatus=='1'">审核通过</span>
                                            <span style="font-size:14px;color: #999999;" v-else-if="auditStatus=='2'">驳回</span>
                                        </el-form-item>
                                    </el-form>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>

    export default {
        data() {
            return {
                isManufacturer:'',
                showItem:{},
                applyRemark:'',
                manufacturerName:'',
                isManufacturer:'',
                brandName:'',
                auditStatus:'0',
                tradeMark:'',
                brandImgList:[],
                id:'',
            }
        },
        created(){
            this.id = this.$route.params.id;
            this.backData(this.id)
        },
        methods: {
            //回显数据
            async backData(id){
                let res = await this.$get('/supplier/getBrandById',{id:id});
                this.showItem = res.item;
                this.brandName =  this.showItem.brandName
                this.tradeMark =  this.showItem.tradeMark
                this.brandImgList =  this.showItem.brandImgList
                this.applyRemark =  this.showItem.applyRemark
                this.auditStatus =  this.showItem.auditStatus
                this.isManufacturer = this.showItem.isManufacturer
            },
        }
    }
</script>

<style>

    .content_b {
        width: 99.8%;
        height: auto;
        background-color: #fff;
        border:1px #e4e4e4 solid;
    }

    .el-form-item_1 .el-form-item__label {
        font-size: 12px;
    }
    .el-form-item_1 .el-form-item {
        margin-bottom: 10px;
    }

    .img_Border {
        border:solid;
        border-width: 1px;
        border-color: #e4e4e4;
        width:150px;
        height:109px;
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
</style>
