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
                        <div class="el">
                            <el-upload
                                    class="avatar-uploader"
                                    action="http://localhost:20910/admin/upload/imgUrl"
                                    :data="userData"
                                    :show-file-list="false"
                                    :on-success="handleAvatarSuccess">
                                <img v-if="imgUrl" :src="imgUrl" class="avatar">
                                <i v-else class="el-icon-plus avatar-uploader-icon"></i>
                            </el-upload>
                            <p class="sc">上传头像</p>
                        </div>
                        <div style="margin-top: 20px">
                            <el-form ref="form" label-width="125px">
                                <el-form-item label="登录名:" required>
                                    <el-input v-model="loginName" size="1" disabled
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="旧密码:" required>
                                    <el-input v-model="oPassword" size="1"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="新密码:" required>
                                    <el-input v-model="nPassword" size="1"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="确认密码:" required>
                                    <el-input v-model="nPassword" size="1"
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
                show: false,
                userData: {},
                loginName: '',
                userName: '',
                nPassword: '',
                oPassword: '',
                name: '',
                id: '',
                imgUrl: '',
            }
        },
        props: {
            editItem: Object,
            seaportItem: Array,
            editVisible: Boolean
        },
        async created() {
            this.getUserInfo()
        },
        methods: {
            async getUserInfo() {
                let res = await this.$get("/admin/getUserInfo")
                console.log(res)
                if (res != null) {
                    this.loginName = res.loginName;
                    this.userName = res.userName;
                    this.imgUrl = res.imgUrl;
                    this.userData = {userId: res.id}
                }
            },
            handleAvatarSuccess(res) {
                if (res.code == 200) {
                    this.imgUrl = res.fileUrl
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }

            },
            closeEvent() {
                this.$emit('closeEdit')
            },
            async submission() {
                let data = {
                    id: this.id,
                    loginName: this.loginName,
                    imgUrl: this.imgUrl,
                    nPassword: this.nPassword,
                    pwd: this.oPassword

                };
                // let res = await this.$post("/admin/updateUserInfo", data);
                let res = await this.$post("/admin/saveSysUser", data);
                if (res.code == 200) {
                    window.location.reload();
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
