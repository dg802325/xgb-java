<template>
    <div>
        <div>
            <glob-breadcrumb title="账户设置"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        账户设置
                    </div>
                </div>
                <div class="content_u">
                    <div class="content_b_tx">
                        <div style="padding-top: 50px">
                            <el-form ref="form" label-width="125px">
                                <el-form-item label="登录账号:" required>
                                    <el-input v-model="userAccount" size="1" disabled
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="供应商名称:" required >
                                    <el-input v-model="userName" size="1" disabled
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="旧密码:" required>
                                    <el-input v-model="oldPassword" size="1" type="password"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="新密码:" required>
                                    <el-input v-model="newPassword" size="1" type="password"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="确认密码:" required>
                                    <el-input v-model="cpassword" size="1" type="password"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                            </el-form>
                            <div class="btn-tj">
                                <el-button type="primary" style="height: 35px;width: 90px;margin-top: 20px"
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
                userAccount:'',
                userName: '',
                password:'',
                oldPassword:'',
                newPassword:'',
                cpassword:'',
                id: '',
            }
        },
        created() {
            this.backData()
        },
        methods: {
            async backData() {
                let item = await this.$get("/supplier/getUserInfo")
                if (item.code==200) {
                    let res = item.item
                    this.userAccount = res.userAccount;
                    this.userName = res.userName;
                    this.password = res.password
                    this.id = res.id
                } else {
                    this.$message.error(res.message)
                }
            },
            async submission() {
                if (this.oldPassword==this.newPassword) {
                    this.$message.warning("新密码不能与原来密码一致")
                    return;
                }
                if (this.newPassword!=this.cpassword) {
                    this.$message.warning("确认密码与新密码不一致")
                    return;
                }
                let data = {
                    id: this.id,
                    userAccount: this.userAccount,
                    userName: this.userName,
                    password: this.newPassword

                };
                let res = await this.$post("/supplier/saveSupplierUser", data);
                if (res.code == 200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
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
        width: 50%;
        margin: 0 auto;
    }

    .sc {
        text-align: center;
        color: #1abc9c;
        font-size: 16px;
        margin-top: 10px;
    }
</style>
