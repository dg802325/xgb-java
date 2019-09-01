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
                                    <el-select v-model="tableId" clearable placeholder="请选择">
                                        <el-option
                                                v-for="item in tableList"
                                                :key="item.id"
                                                :label="item.tableName"
                                                :value="item.id">
                                        </el-option>
                                    </el-select>
                                </el-form-item>
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
    export default {
        data() {
            return {
                databaseList: [],
                databaseId: '',
                tableList:[],
                tableId:'',
            }
        },
        created() {
            this.getDatabases()
        },
        watch:{
            editDeptId(val){
                this.getRoleBydeptId(val)
            }
        },
        methods: {
            async getDatabases() {
                let res = await this.$get("/admin/databaseList")
                if(res.code=='200'){
                    this.databaseList = res.databases;
                }
            },
            async submission() {

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

</style>