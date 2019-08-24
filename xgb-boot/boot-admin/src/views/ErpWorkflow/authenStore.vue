<template>
    <div>
        <div>
            <div class="glob-breadcrumb">
                <div class="container">
                    <div class="title">
                        <span class="line"></span>添加数据类型
                    </div>
                    <div>
                        <el-button @click="toEntry" size="mini" icon="el-icon-arrow-left">返回</el-button>
                    </div>
                </div>
            </div>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        添加专家
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx">
                        <br/>
                        <div style="height: 702px;padding-left: 15px;padding-top: 39px">
                            <el-form ref="form" label-width="100px" class="el-form-item_1">
                                <el-form-item label="流程节点:" required>
                                    <el-input v-model="nodeName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="部门/岗位:" required>
                                    <el-input v-model="erpDepartment" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                            </el-form>
                            <div slot="footer" class="dialog-footer" style="padding-top: 37px;padding-left: 100px">
                                <el-button class="el-button_2" type="primary" @click="saveUser">确 定</el-button>
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
                nodeName:'',
                erpDepartment:'',
            }
        },
        methods: {
            async saveUser() {
                let data = {
                    nodeName:this.nodeName,
                    erpDepartment:this.erpDepartment,
                };
                let res = await this.$post("/admin/save_erpWorkflowNode",data);
                if (res.code==200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.id=res.id
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
<style lang="scss" scoped>
    @import "../../assets/scss/common";

    .glob-breadcrumb {
        height: 48px;
        background: #f3f3f3;
        border-bottom: 1px #e4e4e4 solid;
        .container {
            display: flex;
            align-items: center;
            justify-content: space-between;
            height: 100%;
            .title {
                display: flex;
                align-items: center;
                font-size: 12px;
                color: #999;
                .line {
                    margin-right: 5px;
                    width: 5px;
                    height: 18px;
                    background: #1abc9c;
                }
            }
        }
    }

    .content_b {
        width: 100%;
        height: auto;
        background-color: #fff;
    }

    .el-form-item_1 .el-form-item__label {
        font-size: 12px;
    }
    .el-form-item_1 .el-form-item {
        margin-bottom: 10px;
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
