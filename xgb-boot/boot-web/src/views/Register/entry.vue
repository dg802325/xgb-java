<template>
    <v-init-view class="bj">
        <p slot="right" class="to-login">
            已有账号，
            <router-link to="/login">立即登录</router-link>
        </p>
        <div class="container">
            <div class="register-container">
                <p class="title">新用户注册</p>
                <el-form ref="loginForm" :show-message="false">
                    <!--<el-form-item>-->
                        <!--<el-input v-model="username" maxlength="20" size="" clearable placeholder="设置用户名称">-->
                            <!--<i slot="prefix" class="icon">-->
                                <!--<img src="./images/u1014.svg"/>-->
                            <!--</i>-->
                        <!--</el-input>-->
                        <!--<div class="message" v-html="userNameMsg"></div>-->
                    <!--</el-form-item>-->
                    <el-form-item>
                        <el-input v-model="mobile" maxlength="20" size="" clearable placeholder="输入手机号码">
                            <i slot="prefix" class="icon">
                                <img src="./images/u7564.svg"/>
                            </i>
                        </el-input>
                        <div class="message" v-html="mobileMsg"></div>
                    </el-form-item>
                    <el-form-item>
                        <el-input v-model="code" maxlength="20" size=""  placeholder="短信验证码">
                            <i slot="prefix" class="icon">
                                <img src="./images/u7565.svg"/>
                            </i>
                            <i slot="suffix">
                                <!--<a href="javascript:;" class="send-msg">发送验证码</a>-->
                                <el-button :disabled="isDisabled" class="send-msg" @click="sendMobile" type="text">
                                    {{msg}}
                                </el-button>
                            </i>
                        </el-input>
                        <div class="message" v-html="codeMsg"></div>
                    </el-form-item>
                    <el-form-item>
                        <el-input v-model="password"  type="password"  maxlength="20" size="" clearable placeholder="设置6至20位登录密码">
                            <i slot="prefix" class="icon">
                                <img src="./images/u1009.svg"/>
                            </i>
                        </el-input>
                        <div class="message" v-html="passwordMsg"></div>
                    </el-form-item>
                    <el-form-item>
                        <el-input v-model="rePassword" type="password" maxlength="20" size="" clearable placeholder="请再次输入登录密码">
                            <i slot="prefix" class="icon">
                                <img src="./images/u1009.svg"/>
                            </i>
                        </el-input>
                        <div class="message" v-html="rePasswordMsg"></div>
                    </el-form-item>
                    <el-form-item>
                        <p class="tip">
                            <i class="fa "
                               :class="check?'fa-check-circle':'fa-check-circle-o'"
                               @click="check = !check"
                            ></i>
                            已阅读并同意《<a href="javascript:;" @click='toAgreement'>用户服务协议</a>》
                        </p>
                    </el-form-item>
                    <el-form-item>
                        <el-button class="register-button" type="primary" @click="submitEvent">立即注册</el-button>
                    </el-form-item>
                </el-form>
            </div>
        </div>

    </v-init-view>
</template>

<script>
    import MD5 from 'md5.js';
    export default {
        data() {
            return {
                empty: '<i class="el-icon-warning"></i>',
                error: '<i class="el-icon-error"></i>',
                check: true,
                username: '',
                count: 60,
                msg:'发送验证码',
                isDisabled: false,
                mobile: '',
                code: '',
                password: '',
                rePassword: '',
                userNameMsg: '',
                mobileMsg: '',
                codeMsg: '',
                passwordMsg: '',
                rePasswordMsg: ''
            }
        },
        methods: {
            // 获取短信验证码
            async sendMobile() {
                if(!this.mobile){
                    this.mobileMsg = '手机号不能为空';
                    return;
                }
                this.codeMsg = ``;
                let res = await this.$post('/api/mobileCode', {
                    mobile: this.mobile
                });

                if (res.code === '200') {
                    this.$message.success('短信已发送!');
                    this.countDown();
                } else {
                    this.codeMsg = `${this.error} ${res.message}`;
                }

            },
            countDown() {
                this.isDisabled = true;
                this.msg = this.count+'秒后重新发送';
                let timer = setInterval(() => {
                    this.count--;
                    if (this.count <= 0) {
                        clearInterval(timer);
                        this.msg = "获取验证码";
                        this.isDisabled = false;
                    } else {
                        this.msg = this.count+'秒后重新发送';
                    }
                }, 1000);
            },
            async submitEvent() {
                this.reset();
                // if (this.username === "") {
                //     this.userNameMsg = `${this.empty}请输入用户名称`
                //     return;
                // }
                if(!this.mobile){
                    this.mobileMsg =  `${this.empty}请输入手机号`;
                    return;
                }
                if(!this.code){
                    this.codeMsg =  `${this.empty}请输入手机验证码`;
                    return;
                }
                if(!this.password){
                    this.passwordMsg =  `${this.empty}请输入密码`;
                    return;
                }
                if(this.password.length<6 || this.password.length>20){
                    this.passwordMsg =  `${this.error}登录密码长度为6至20位`;
                    return;
                }
                if(!this.rePassword){
                    this.rePasswordMsg =  `${this.empty}请再次输入登录密码`;
                    return;
                }
                if(this.password!==this.rePassword){
                    this.rePasswordMsg =  `${this.error}两次密码不一致`;
                    return;
                }
                if(!this.check){
                    this.$message.error('请阅读并勾选用户服务协议！');
                    return;
                }
                let res = await this.$post('/api/registered',{
                    mobile: this.mobile,
                    password: this.md5Event(this.password),
                    mobileCode: this.code,
                    origin: 'pc'
                });
                if(res.code==='200'){
                    this.$router.push('/register/success');
                }else{
                   this.$message.error(res.message);
                }
            },
            md5Event(data){
                const md5stream = new MD5();
                return md5stream.update(data).digest('hex').toUpperCase();
            },
            reset() {
                this.userNameMsg = "";
                this.mobileMsg = "";
                this.codeMsg = "";
                this.passwordMsg = "";
                this.rePasswordMsg = "";
            },
            toAgreement(){
                window.open('/agreement','_blank')
            }
        }
    }
</script>

<style lang="scss">
    .to-login {
        padding-top: 21px;
        font-size: 14px;
        color: rgb(153, 153, 153);

        a {
            color: rgb(26, 188, 156);
        }
    }
    .send-msg span{
        color: #17a98c;
    }
    .is-disabled span{
        color: rgb(204, 204, 204);
    }
    .register-container {
        margin-top: 21px;
        padding: 39px 39px 114px;
        border: 1px #e4e4e4 solid;
        background: #fff;

        .title {
            font-size: 16px;
            height: 70px;
            color: #999999;
        }

        .el-form {
            margin: 0 auto;
            width: 300px;
        }

        .el-form-item {
            position: relative;
            margin-bottom: 20px;

            .message {
                position: absolute;
                left: 100%;
                top: 0;
                height: 50px;
                padding-left: 15px;
                line-height: 50px;
                white-space: nowrap;
                color: #F04844;

                i {
                    margin-right: 3px;
                    font-size: 16px;
                    color: #F04844;
                }
            }
        }

        .tip {
            padding-bottom: 7px;
            line-height: 35px;
            display: flex;
            align-items: center;
            color: #999999;
            font-size: 14px;

            a {
                color: #1ABC9C;
            }
        }

        .el-input__inner {
            height: 50px;
            padding-top: 1px;
            line-height: 48px;
            padding-left: 52px;
        }

        .fa {
            margin: 0 5px 0 15px;
            font-size: 20px;
            color: #e4e4e4;
            cursor: pointer;
        }

        .fa-check-circle {
            color: #1abc9c;
        }

        .el-input__prefix {
            display: flex;
            left: 12px;
            align-items: center;
            height: 50px;

            .icon {
                float: left;
                height: 20px;

                img {
                    display: block;
                    color: #666666;
                }
            }
        }

        .register-button {
            height: 45px;
            width: 100%;
            border-radius: 0;

            span {
                font-size: 14px;
                color: #fff;
            }
        }
    }
</style>
