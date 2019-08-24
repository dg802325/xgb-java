<template>
    <div>
        <div>
            <glob-breadcrumb title="新增仓库"/>
            <br><br>
            <div class="container" >
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        新增仓库
                    </div>
                </div>
                <div class="content_b"style="border: 1px solid #e4e4e4;">
                    <div class="content_b_tx">
                        <br/>
                        <div style="height: 702px;padding-left: 15px;padding-top: 39px">
                            <el-form ref="form" label-width="100px" class="el-form-item_1">
                                <el-form-item label="仓库名称:" required>
                                    <el-input v-model="storehouseName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="仓库地址:" required>
                                    <el-input v-model="storehouseAddress" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="联系人:" required>
                                    <el-input v-model="storehouseContact" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="联系人电话:" required>
                                    <el-input v-model="storehouseMobile" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
<!--                                <el-form-item label="有效状态:" required>-->
<!--                                    <el-select v-model="isDel" placeholder="请选择" size="1" style="width: 240px;">-->
<!--                                        <el-option-->
<!--                                                v-for="item in statusList"-->
<!--                                                :key="item.value"-->
<!--                                                :label="item.name"-->
<!--                                                :value="item.value">-->
<!--                                        </el-option>-->
<!--                                    </el-select>-->
<!--                                </el-form-item>-->
                                <el-form-item label="备注信息:" required>
                                    <el-input type="textarea" v-model="note" resize="none" rows="9" size="1"
                                              style="width: 450px;" placeholder="请输入内容"></el-input>
                                </el-form-item>
                            </el-form>
                            <div slot="footer" class="dialog-footer" style="padding-top: 37px;padding-left: 470px">
                                <el-button class="el-button_2" type="primary" @click="toSaveStorehouse">确 定</el-button>
                            </div>
                        </div>
                    </div>
                </div>
<!--                &lt;!&ndash; 提交提示框 &ndash;&gt;-->
<!--                <el-dialog title="提示" :visible.sync="saveVisible" width="300px" center>-->
<!--                    <div class="del-dialog-cnt">是否提交？</div>-->
<!--                    <span slot="footer" class="dialog-footer">-->
<!--        <el-button class="el-button_1" @click="saveVisible = false">取 消</el-button>-->
<!--        <el-button class="el-button_1" type="primary" @click="saveStorehouse">确 定</el-button>-->
<!--        </span>-->
<!--                </el-dialog>-->
            </div>
        </div>
    </div>
</template>
<script>

    export default {
        data() {
            return {
                id: '',
                isDel:'',
                storehouseName: '',
                storehouseAddress: '',
                storehouseMobile: '',
                storehouseContact: '',
                note: '',
                statusList: [
                    {
                        name: '正常',
                        value: 0,
                    },
                    {
                        name: '其他状态',
                        value: 2,
                    },
                ],
                saveVisible: false,
            }
        },
        created() {

        },
        methods: {
            // toSaveStorehouse() {
            //
            // },
            async toSaveStorehouse() {
                this.saveVisible = true
                let data = {
                    id: this.id,
                    storehouseName: this.storehouseName,
                    storehouseAddress: this.storehouseAddress,
                    storehouseMobile: this.storehouseMobile,
                    storehouseContact: this.storehouseContact,
                    isDel: this.isDel,
                    note: this.note
                };
                let res = await this.$post("/admin/save_erpStorehouse", data);
                if (res.code == 200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.$router.push('/stock/erpStorehouseList')
                } else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
            }
        }
    }
</script>

<style>
    .content_b {
        width: 1098px;
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

    .el-button_2 {
        width: 80px;
        height: 35px;
        padding: 10px 20px;
        border-radius: 2px;
    }

    .el-button--primary {
        background-color: #1abc9c;
        border-color: #1abc9c;
    }
</style>
