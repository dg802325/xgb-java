<template>
    <div>
        <div>
            <glob-breadcrumb title="修改密码"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        修改密码
                    </div>
                </div>
                <div class="content_u">
                    <div class="content_b_tx">
                        <div style="padding-top: 70px">
                            <el-form ref="form" label-width="125px">
                                <el-form-item label="登录名:" required>
                                    <el-input v-model="userName" size="1" disabled
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="旧密码:" required>
                                    <el-input v-model="oPassword" size="1" type="password"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="新密码:" required>
                                    <el-input v-model="nPassword" size="1" type="password"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="确认密码:" required>
                                    <el-input v-model="cnPassword" size="1" type="password"
                                              style="margin-top: -10px;width: 300px"></el-input>
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
                userName: '',
                nPassword: '',
                cnPassword:'',
                oPassword: '',
                id: '',
            }
        },
        async created() {
            this.getUserInfo()
        },
        methods: {
            async getUserInfo() {
                let res = await this.$get("/admin/getUserInfo")
                if (res != null) {
                    this.userName = res.userName;
                    this.id = res.id
                }
            },
            async submission() {
                if (this.nPassword != this.cnPassword) {
                    this.$message.warning("两次输入密码不一致")
                }
                let data = {
                    id: this.id,
                    userName: this.userName,
                    password: this.cnPassword,
                };
                let res = await this.$post("/admin/saveSysUserPassword", data);
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
                this.nPassword = ''
                this.cnPassword = ''
                this.oPassword = ''
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

    .el-button_2{
        width:80px;
        height: 35px;
        padding:10px 20px;
        border-radius: 2px;
    }
</style>
