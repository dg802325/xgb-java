<template>
    <div class="login-container">
        <div class="login-wrapper_1" style="width: 500px">
            <div class="login-logo_1" style="float: left">
                <img src="./images/login_logo.png" width="80px;"/>
            </div>
            <div style="padding-left: 60px">
                <h2 class="title_1">
                    供应商业务管理系统&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </h2>
                <h2 class="title_2">
                    Business Management System
                </h2>
            </div>
            <el-form ref="ruleForm" label-width="0px" onsubmit="return false">
                <div class="login-form_1">
                    <div  class="title_3" style="float: left">新用户注册</div>
                    <div  style="padding-left: 850px;">
                        <el-button type="text" class="el-button_5" @click="toLogin">去登录</el-button>
                    </div>

                    <div class="login-form-wrapper_1">
                        <div class="login-form-item">
                            <span class="icon user"></span>
                            <input type="text" v-model="userName" @keyup="handleKeyUp" @focus="handleInputFocus" v-focus="true"
                                   @blur="handleInputBlur" placeholder="设置供应商名称">
                            <span class="close el-icon-error" @click="removeValue('userName')"></span>
                        </div>
                        <div class="login-form-item">
                            <span class="icon lock"></span>
                            <input type="text" v-model="phoneNo" @focus="handleInputFocus" @keyup="handleKeyUp"
                                   @blur="handleInputBlur" placeholder="输入手机号码">
                            <span class="close el-icon-error" @click="removeValue('phoneNo')"></span>
                        </div>
                        <div to style="position: absolute;left: 545px;top:330px;z-index:1;width: 100px;">
                            <el-button type="text" @click="sendSMS" v-if="showSMS" style="padding-left: 25px;">获取验证码</el-button>
                            <el-button type="text" v-if="!showSMS" style="color: #999999">{{timeMSM}}s后重新获取</el-button>
                        </div>
                        <div class="login-form-item">
                            <span class="icon user"></span>
                            <input type="text" v-model="smsCode" @keyup="handleKeyUp" @focus="handleInputFocus"
                                   @blur="handleInputBlur" placeholder="短信验证码">
                            <span class="close el-icon-error" @click="removeValue('smsCode')"></span>
                        </div>
                        <div class="login-form-item">
                            <span class="icon lock"></span>
                            <input type="password" v-model="password" @focus="handleInputFocus" @keyup="handleKeyUp"
                                   @blur="handleInputBlur" placeholder="设置6至20位登录密码">
                            <span class="close el-icon-error" @click="removeValue('password')"></span>
                        </div>
                        <div class="login-form-item">
                            <span class="icon user"></span>
                            <input type="password" v-model="cpassword" @keyup="handleKeyUp" @focus="handleInputFocus"
                                   @blur="handleInputBlur" placeholder="请再次输入登录密码">
                            <span class="close el-icon-error" @click="removeValue('cpassword')"></span>
                        </div>
                        <div style="padding-top:10px;padding-bottom: 30px;">
                            <el-checkbox v-model="agree">
                                <span style="color: #999999;font-size: 14px">已阅读并同意</span>
                                <el-button type="text" @click="showLook" style="font-size: 14px">《供应商服务协议》</el-button>
                            </el-checkbox>
                        </div>
                        <div class="button-wrapper_1">
                            <button @click="handleSubmit">立即注册</button>
                        </div>
                        <div class="error-wrapper" v-show="msg">
                            <span class="icon el-icon-info"></span>
                            <span class="tips">
                             {{msg}}
                        </span>
                        </div>
                    </div>
                </div>
            </el-form>
        </div>
        <LookProtocol v-if="lookVisible" :lookVisible="lookVisible" @closeLookProtocol="closeLookProtocol" @agreeProtocol="agreeProtocol"></LookProtocol>
    </div>
</template>

<script>
    import LookProtocol from './lookProtocol'
    export default {
        data() {
            return {
                lookVisible:false,
                showSMS:true,
                agree:false,
                msg: '',
                userName: '',
                phoneNo: '',
                smsCode:'',
                password:'',
                cpassword:'',
                timeMSM:'',
                timer:null,
                checkSms:'',
            }
        },
        directives: {
            focus: {
                inserted: function (el) {
                    el.focus()
                }
            }
        },
        methods: {
            showLook(){
                this.lookVisible = true
            },
            agreeProtocol(sign){
                if (sign=='1') {
                    this.agree = true
                }
            },
            closeLookProtocol(){
                this.lookVisible = false

            },
            //发送短信验证码
            async sendSMS(){
                if (!this.phoneNo) {
                    this.$message.warning("请输入手机号码")
                    return;
                }
                //验证手机号是否已被注册
                let phone = await this.$get('/supplier/getSupplierByPhone',{phoneNo:this.phoneNo})
                if (phone.code==200) {
                    this.$message.warning(phone.message)
                    return;
                }

                //进入倒计时
                const TIME_COUNT = 60;
                if (!this.timer) {
                    this.timeMSM = TIME_COUNT;
                    this.showSMS = false;
                    this.timer = setInterval(()=>{
                        if (this.timeMSM>0 && this.timeMSM<=TIME_COUNT) {
                            this.timeMSM --;
                        } else {
                            this.showSMS = true;
                            clearInterval(this.timer);
                            this.timer = null;
                        }
                    },1000)
                }
                //发送短信验证码
                let res = await this.$post('/erp/sendSms',{phoneNo:this.phoneNo});
                if (res.code==200) {
                    this.checkSms = res.smsCode
                } else {
                    this.$message.warning(res.message)
                    return;
                }
            },
            handleKeyUp(e) {
                if (e.target.value) e.target.nextElementSibling.style.display = 'block';
            },
            handleInputFocus(e) {
                if (e.target.value) e.target.nextElementSibling.style.display = 'block';
            },
            handleInputBlur(e) {
                setTimeout(function () {
                    e.target.nextElementSibling.style.display = 'none'
                }, 500)
            },
            removeValue(el) {
                this[el] = ''
            },
            async handleSubmit() {
                if (!this.agree) {
                    this.$message.warning("未同意供应商服务协议")
                    return;
                }
                if (!this.userName) {
                    this.$message.warning("请设置供应商名称")
                    return;
                }
                if (!this.phoneNo) {
                    this.$message.warning("请输入手机号码")
                    return;
                }

                if (!this.smsCode) {
                    this.$message.warning("请输入短信验证码")
                    return;
                }

                if (!this.password) {
                    this.$message.warning("请输入6-20位登录密码")
                    return;
                }
                if (this.cpassword!=this.password) {
                    this.$message.warning("两次输入密码不一致")
                    return;
                }

                if (this.checkSms!=this.smsCode) {
                    this.$message.warning("输入验证码错误")
                    return;
                }

                let data = {
                    id:'',
                    userName: this.userName,
                    phoneNo: this.phoneNo,
                    password: this.password,
                    userAccount: this.phoneNo,
                };
                let res = await this.$post("/supplier/saveSupplierUser", data)
                if (res.code == 200) {
                    this.$router.push("/registSuccess/"+res.id);
                } else {
                    this.msg = res.message
                }
            },
            toLogin(){
                this.$router.push({path:'/login'})
            }
        },
        components:{
            LookProtocol,
        }
    }
</script>

<style lang="scss" scoped>
    .login-container {
        width: 100%;
        height: 100%;
        background: #1abc9c url(./images/login_bj.png) no-repeat center top;
        .login-wrapper_1 {
            position: absolute;
            left: 37%;
            top: 37%;
            transform: translate(-50%, -50%);
            width: 420px;
            .login-logo_1 {
                padding: 30px 0 0;
                text-align: center;
                img {
                    margin: 0 auto 20px;
                    display: block;
                }
            }
            .login-form_1 {
                padding: 0 60px;
                width: 890px;
                height: 600px;
                background: #fff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
                border-radius: 8px;
                .title {
                    padding: 40px 0 0;
                    height: 42px;
                    font-size: 27px;
                    text-align: center;
                    color: #1abc9c;
                }
                .en {

                    height: 40px;
                    text-align: center;
                    font-size: 20px;
                    color: #1ABC9C;
                    line-height: 1;
                    font-family: Arial;
                }
                .login-form-wrapper_1 {
                    padding-left: 280px;
                    .login-form-item {
                        display: flex;
                        position: relative;
                        overflow: hidden;
                        height: 50px;
                        width: 300px;
                        margin-bottom: 20px;
                        border-radius: 3px;
                        .icon {
                            position: absolute;
                            left: 0;
                            top: 0;
                            width: 49px;
                            height: 46px;
                            background: url(./images/user.png) no-repeat center;
                        }
                        .lock {
                            background-image: url(./images/lock.png);
                        }
                        input {
                            flex: 1;
                            padding-left: 49px;
                            border-radius: 3px;
                            border: 1px #dadada solid;
                            height: 46px;
                            font-size: 14px;
                            font-family: '微软雅黑';
                            font-weight: 400;
                            color: #ccc;
                            &:focus {
                                outline: 2px #1abc9c solid;
                            }
                            &::placeholder {
                                font-size: 14px;
                                color: #ccc;
                            }
                        }
                        .close {
                            display: none;
                            position: absolute;
                            right: 8px;
                            top: 15px;
                            font-size: 20px;
                            color: #1ABC9C;
                            cursor: pointer;
                        }
                    }
                }
            }
            .title_3 {
                padding: 31px 0 0;
                height: 42px;
                font-size: 16px;
                text-align: left;
                color: #999999;
            }
            .title_1 {
                padding: 40px 0 0;
                height: 42px;
                font-size: 30px;
                font-family: '微软雅黑';
                text-align: center;
                color: white;
            }
            .title_2 {
                padding-left: 75px;
                height: 42px;
                font-size: 18px;
                font-weight: 400;
                text-align: left;
                font-family: '微软雅黑';
                color: white;
            }
            .button-wrapper_1 {
                margin-bottom: 10px;
                button {
                    border: none;
                    height: 50px;
                    font-size: 17px;
                    background: #1abc9c;
                    color: #fff;
                    width: 300px;
                    border-radius: 3px;
                    cursor: pointer;
                    transition: all 0.5s;
                    &:hover {
                        opacity: 0.8;
                    }
                    &:focus {
                        outline: none;
                    }
                }
            }
            .error-wrapper {
                display: flex;
                align-items: center;
                width: 180px;
                height: 40px;
                border-radius: 5px;
                background: #808080;
                color: #fff;
                .icon {
                    font-size: 16px;
                    margin: 0 3px 0 18px;
                }
            }

        }
    }
    .el-button_5 {
        font-size: 36px;
    }
</style>