<template>
    <div>
        <div>
            <glob-breadcrumb title="修改基本信息"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        修改基本信息
                    </div>
                </div>
                <div class="content_u">
                    <div class="content_b_tx">
                        <div style="padding-top: 70px">
                            <el-form ref="form" label-width="125px">
                                <el-form-item label="用户名:" required>
                                    <el-input v-model="userName" size="1" disabled
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="昵称:" required>
                                    <el-input v-model="nickName" size="1" type="text"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="邮箱:" required>
                                    <el-input v-model="email" size="1" type="text"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="手机号:" required>
                                    <el-input v-model="mobile" size="1" type="password"
                                              style="margin-top: -10px;width: 300px"></el-input>
                                </el-form-item>
                                <el-form-item label="性别:" required>
                                    <template>
                                        <el-radio v-model="sex" label="0">boy</el-radio>
                                        <el-radio v-model="sex" label="1">girl</el-radio>
                                    </template>
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
                id:'',
                userName: '',
                nickName: '',
                email:'',
                mobile: '',
                sex:'1',
            }
        },
        async created() {
            this.getNowUser()
        },
        methods: {
            async getNowUser() {
                let res = await this.$get("/admin/getNowUser")
                console.log(res)
                if (res != null) {
                    this.userName = res.sys.userName;
                    this.id = res.sys.id
                    this.nickName = res.sys.nickName
                    this.email = res.sys.email
                    this.mobile = res.sys.mobile
                    this.sex = res.sys.sex
                }
            },
            async submission() {
                if (!this.nickName) {
                    this.$message.warning("昵称不能为空")
                }
                if (!this.email) {
                    this.$message.warning("昵称不能为空")
                }
                if (!this.mobile) {
                    this.$message.warning("昵称不能为空")
                }
                if (!this.sex) {
                    this.$message.warning("昵称不能为空")
                }
                let data = {
                    id:this.id,
                    userName: this.userName,
                    nickName: this.nickName,
                    email: this.email,
                    mobile: this.mobile,
                    sex: this.sex,
                };
                // let res = await this.$post("/admin/updateUserInfo", data);
                let res = await this.$post("/admin/saveSysUser", data);
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
