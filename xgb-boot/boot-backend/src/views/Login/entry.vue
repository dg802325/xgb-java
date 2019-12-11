<template>
    <div class="login-container">
        <div class="login-wrapper">
            <div class="login-logo">
                <!--<img src="./images/login_logo.png"/>-->
            </div>
            <div class="error-wrapper" v-show="msg" style="margin-left: 120px">
                <span class="icon el-icon-info"></span>
                <span class="tips">
                             {{msg}}
                        </span>
            </div>
            <el-form ref="ruleForm" label-width="0px" class="ms-content" onsubmit="return false">
                <div class="login-form" >
                    <br>
                    <h2 class="title">X-G-B工具箱</h2>
                    <p class="en">&nbsp;</p>
                    <div class="login-form-wrapper">
                        <div class="login-form-item">
                            <span class="icon user"></span>
                            <input type="text" v-model="userName" @keyup="handleKeyUp" @focus="handleInputFocus" v-if="true" v-focus="true"
                                   @blur="handleInputBlur" placeholder="请输入用户名称">
                            <span class="close el-icon-error" @click="removeValue('userName')"></span>
                        </div>
                        <div class="login-form-item">
                            <span class="icon lock"></span>
                            <input type="password" v-model="password" @focus="handleInputFocus" @keyup="handleKeyUp"
                                   @blur="handleInputBlur" placeholder="请输入登录密码">
                            <span class="close el-icon-error" @click="removeValue('password')"></span>
                        </div>
                        <div class="login-form-item">
                            <span class="icon code"></span>
                            <input type="text" v-model="verifyCode" placeholder="请输入验证码" style="width: 75px">
                            <img style="width:110px;height:50px;margin-left: 10px;height: 43px;margin-top: 3px" @click="handleChange" :src="url"/>
                        </div>
                        <div class="button-wrapper">
                            <button @click="handleSubmit">登录</button>
                        </div>
                        <div style="float: left">
                            <br>
                            <span>测试账号 test 密码 test ,如果有地方感觉缺少按钮，是因为权限不够，不会显示</span>
                            <!--<router-link to="/registUser" style="font-size: 14px">申请入驻</router-link>-->
                        </div>

                    </div>
                </div>
            </el-form>
        </div>
    </div>
</template>

<script>
    import {setToken} from "../../utils/auth";
    import {Base_url} from "../../config/index";

    export default {
        data() {
            return {
                msg: '',
                url:'',
                userName: '',
                password: '',
                verifyCode: '',
            }
        },
        directives: {
            focus: {
                inserted: function (el) {
                    el.focus()
                }
            }
        },
        created(){
            this.Base_url = Base_url
            this.handleChange();
        },
        methods: {

            handleChange() {
                this.url = this.Base_url + '/admin/kaptcha?m=' + Math.random()
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
                if (!this.userName) {
                    this.msg = ' 请填写用户账号';
                    return;
                }
                if (!this.password) {
                    this.msg = ' 请填写登录密码';
                    return;
                }
                if (!this.verifyCode) {
                    this.msg = ' 请填写验证码';
                    return;
                }
                let data = {
                    userName: this.userName,
                    password: this.password,
                    code: this.verifyCode,
                };
                let res = await this.$post("/admin/login", data)
                if (res.code == 200) {
                    setToken(res['boot-admin'])
                    localStorage.ms_userName = this.userName;
                    this.$router.push("/home/dashboard");
                } else {
                    this.msg = res.message
                }

            }
        }
    }
</script>

<style lang="scss" scoped>
    .login-container {
        width: 100%;
        height: 100%;
        background: #0a97bc url(./images/login_bj.png) no-repeat center top;
        .login-wrapper {
            position: absolute;
            left: 50%;
            top: 40%;
            transform: translate(-50%, -50%);
            width: 420px;
            .login-logo {
                padding: 57px 0 0;
                text-align: center;
                img {
                    margin: 0 auto 20px;
                    display: block;
                }
            }
            .login-form {
                padding: 0 60px;
                width: 300px;
                height: 450px;
                background: #fff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
                border-radius: 8px;
                .title {
                    padding: 40px 0 0;
                    height: 42px;
                    font-size: 27px;
                    text-align: center;
                    color: #0a97bc;
                }
                .en {

                    height: 40px;
                    text-align: center;
                    font-size: 20px;
                    color: #0a97bc;
                    line-height: 1;
                    font-family: Arial;
                }
                .login-form-wrapper {
                    .login-form-item {
                        display: flex;
                        position: relative;
                        overflow: hidden;
                        height: 50px;
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
                        .code{
                            background: url(./images/code.png) center 10px no-repeat;
                            background-size:30px ;
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
                                outline: 2px #0a97bc solid;
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
                            color: #0a97bc;
                            cursor: pointer;
                        }
                    }
                }
            }
            .button-wrapper {
                margin-bottom: 10px;
                button {
                    border: none;
                    height: 50px;
                    font-size: 17px;
                    background: #0a97bc;
                    color: #fff;
                    width: 100%;
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
</style>