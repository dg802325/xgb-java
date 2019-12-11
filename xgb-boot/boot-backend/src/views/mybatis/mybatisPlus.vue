<template>
    <div>
        <div>
            <glob-breadcrumb title="代码生成"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        代码生成
                    </div>
                </div>
                <div class="content_u">
                    <div class="content_b_tx">
                        <div style="padding-top: 30px">
                            <div style="color: #666666;padding-bottom: 10px;font-size: 20px;margin-bottom: 20px;" class="el-icon-star-on">
                                <span style="margin-left: 10px;font-size: 20px;">选择</span>
                            </div>
                            <el-form ref="form" label-width="125px">
                                <el-form-item label="选择数据库：">
                                    <el-select v-model="databaseId" clearable placeholder="请选择">
                                        <el-option
                                                v-for="item in databaseList"
                                                :key="item.id"
                                                :label="item.databaseName"
                                                :value="item.id">
                                        </el-option>
                                    </el-select>
                                </el-form-item>
                                <el-form-item label="选择表：">
                                    <el-select v-model="tableName" clearable placeholder="请选择">
                                        <el-option
                                                v-for="item in tableList"
                                                :key="item.tableName"
                                                :label="item.tableName"
                                                :value="item.tableName">
                                        </el-option>
                                    </el-select>
                                </el-form-item>

                                <div style="color: #666666;padding-bottom: 10px;font-size: 20px;margin-top: 20px;" class="el-icon-star-on">
                                    <span style="margin-left: 10px;font-size: 20px;">生成文件</span>
                                </div>

                                <div style="margin-left: 20px;">
                                    <div>
                                        <el-checkbox :indeterminate="isIndeterminate" v-model="checkAll" size="small" @change="handleCheckAllChange">全选</el-checkbox>
                                    </div>

                                    <div>
                                        <el-checkbox v-model="isModel" label="Model" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isModelExample" label="ModelExample" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isMapper" label="Mapper" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isMapperXml" label="MapperXml" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isSqlMapper" label="SqlMapper" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isSqlMapperXml" label="SqlMapperXml" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isService" label="Service" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isController" label="Contoller" border size="small"></el-checkbox>
                                        <el-checkbox v-model="isVueList" label="VueList" border size="small"></el-checkbox>
                                    </div>
                                </div>
                            </el-form>
                            <div class="btn-tj">
                                <el-button type="primary" class="el-button_2"
                                           @click="submission">提 交
                                </el-button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import {Base_url} from '../../config/index'
    export default {
        data() {
            return {
                databaseList: [],
                databaseId: '',
                tableList:[],
                tableName:'',
                dataId:'',
                checkAll:true,
                isIndeterminate: true,
                isModel:true,
                isModelExample:true,
                isMapper:true,
                isMapperXml:true,
                isSqlMapper:true,
                isSqlMapperXml:true,
                isService:true,
                isController:true,
                isVueList:true,
            }
        },
        created() {
            this.getDatabases()
        },
        watch:{
            databaseId(val){
                this.getTablesList(val)
            }
        },
        methods: {
            async getDatabases() {
                let res = await this.$get("/admin/getDatabaseList")
                if(res.code=='200'){
                    this.databaseList = res.databases;
                }
            },
            async getTablesList(val){
                this.dataId= val;
                let res = await this.$get("/admin/getTableList",{dataId:val})
                if(res.code=='200'){
                    this.tableList = res.tables;
                }
            },
            handleCheckAllChange() {
                if(
                    this.isModel==true&&
                    this.isModelExample==true&&
                    this.isMapper==true&&
                    this.isMapperXml==true&&
                    this.isSqlMapper==true&&
                    this.isSqlMapperXml==true&&
                    this.isService==true&&
                    this.isController==true&&
                    this.isVueList==true
                ){
                    this.isModel=false
                    this.isModelExample=false
                    this.isMapper=false
                    this.isMapperXml=false
                    this.isSqlMapper=false
                    this.isSqlMapperXml=false
                    this.isService=false
                    this.isController=false
                    this.isIndeterminate = false
                    this.isVueList = false
                }else {
                    this.isModel=true
                    this.isModelExample=true
                    this.isMapper=true
                    this.isMapperXml=true
                    this.isSqlMapper=true
                    this.isSqlMapperXml=true
                    this.isService=true
                    this.isController=true
                    this.isIndeterminate = true
                    this.isVueList = true
                }
            },
            async submission() {
                let tableRemark = this.tableName;
                if(!this.tableName.remark){
                    tableRemark = '';
                }
                let data = {
                    dataId:this.dataId,
                    tableName:this.tableName,
                    tableRemark:tableRemark,
                    isModel:this.isModel,
                    isModelExample:this.isModelExample,
                    isMapper:this.isMapper,
                    isMapperXml:this.isMapperXml,
                    isSqlMapper:this.isSqlMapper,
                    isSqlMapperXml:this.isSqlMapperXml,
                    isService:this.isService,
                    isController:this.isController,
                    isVueList:this.isVueList,
                }
                let res = await this.$post("/admin/runGenerator",data)
                if(res.code=='200'){
                    window.open(Base_url+"/admin/codeGeneratorDownload?dataId="+this.dataId);
                }else {
                    this.$message.error('生成失败!');
                }
            },
        }
    }
</script>

<style scoped>
    .btn-tj {
        height: 35px;
        width: 90px;
        margin-left: 225px;
        margin-top: 21px;
    }

    .el {
        margin-top: 15px;
    }

    .avatar-uploader .el-upload {
        border: 1px dashed #d9d9d9;
        border-radius: 6px;
        cursor: pointer;
        position: relative;
        overflow: hidden;
        margin-top: 8px;
    }

    .avatar-uploader .el-upload:hover {
        border-color: #409EFF;
    }

    .avatar-uploader-icon {
        font-size: 28px;
        color: #8c939d;
        width: 178px;
        height: 178px;
        line-height: 178px;
        text-align: center;
    }

    .avatar {
        width: 178px;
        height: 178px;
        display: block;
    }

    .avatar-uploader {
        padding-left: 184px;
    }

    .content_u {
        width: 99.9%;
        height: 650px;
        background-color: #fff;
        border: 1px #e4e4e4 solid;
    }

    .content_b_tx {
        width: 80%;
        margin: 0 auto;
    }

    .sc {
        text-align: center;
        color: #1abc9c;
        font-size: 16px;
        margin-top: 10px;
    }

    .el-button_2{
        width:80px;
        height: 35px;
        padding:10px 20px;
        border-radius: 2px;
    }
    .el-checkbox{
        margin-top: 10px;
        width: 150px;
    }
    .el-checkbox.is-bordered.el-checkbox--small{
        padding:5px 15px 5px 20px !important;
    }
    .el-checkbox.is-bordered + .el-checkbox.is-bordered{
        margin-left: 0px !important;
    }
</style>