<template>
    <div class="login-container">
        <div class="login-wrapper_1" style="width: 500px">
            <!--<div class="login-logo">-->
                <!--<img src="./images/login_logo.png"/>-->
            <!--</div>-->
            <div style="padding-left: 60px">
                <h2 class="title_1">
                    供应商业务管理系统
                </h2>
                <h2 class="title_2">
                    Business Management System
                </h2>
            </div>
            <el-form ref="ruleForm" label-width="0px" onsubmit="return false">
                <div class="login-form_1">
                    <div class="login-form-wrapper_2">
                        <div style="padding-left: 128px;">
                            <div class="img_1">
                                <img src="./images/u1342.png">
                            </div>
                            <div class="text_1">
                                恭喜注册成功
                            </div>
                            <div class="text_2">
                                请妥善保管您的账户信息
                            </div>
                        </div>
                        <span class="button-wrapper_2">
                            <button @click="toHome">进入首页</button>
                        </span>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <span class="button-wrapper_3">
                            <button @click="toAuthen">去认证</button>
                        </span>
                    </div>
                </div>
            </el-form>
        </div>
    </div>
</template>

<script>
    import {setToken} from "../../utils/auth";
    export default {
        data() {
            return {
                id:'',
            }
        },
        created(){
            this.id = this.$route.params.id;
        },
        methods: {
            //去认证
           async toAuthen(){
               let res = await this.$post("/supplier/supplierLogin", {id:this.id})
               if (res.code == 200) {
                   setToken(res['boot-admin'])
                   localStorage.ms_username = res.userAccount;
                   this.$router.push({path:'/companyWelcome'});
               }
            },
            //去首页
            async toHome(){
                let res = await this.$post("/supplier/supplierLogin", {id:this.id})
                if (res.code == 200) {
                    setToken(res['boot-admin'])
                    localStorage.ms_username = res.userAccount;
                    this.$router.push({path:'/dashboard'});
                }
            }
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
            .login-logo {
                padding: 57px 0 0;
                text-align: center;
                img {
                    margin: 0 auto 20px;
                    display: block;
                }
            }
            .login-form_1 {
                padding: 0px 60px;
                width: 890px;
                height: 600px;
                background: #fff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
                border-radius: 8px;
                .login-form-wrapper_2 {
                    padding-left: 220px;
                    padding-top: 180px;
                    .login-form-item {
                        display: flex;
                        position: relative;
                        overflow: hidden;
                        height: 50px;
                        width: 300px;
                        margin-bottom: 20px;
                        border-radius: 3px;
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
                font-size: 27px;
                font-family: '微软雅黑';
                text-align: center;
                color: white;
            }
            .title_2 {
                height: 42px;
                font-size: 20px;
                font-weight: 400;
                text-align: center;
                font-family: '微软雅黑';
                color: white;
            }
            .button-wrapper_2 {
                margin-bottom: 10px;
                button {
                    border: none;
                    height: 45px;
                    font-size: 14px;
                    background: #1abc9c;
                    color: #fff;
                    width: 200px;
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
            .button-wrapper_3 {
                margin-bottom: 10px;
                button {
                    border: none;
                    height: 45px;
                    font-size: 14px;
                    background: white;
                    color: #1abc9c;
                    border: solid;
                    border-width: 1px;
                    width: 200px;
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

            .text_1{
                padding-left: 10px;
                font-size: 24px;
                line-height:36px;
                font-family:'微软雅黑';
                font-weight:400;
                color: #666666;
            }
            .text_2{
                padding-bottom: 20px;
                font-size: 16px;
                line-height:36px;
                font-family:'微软雅黑';
                font-weight:400;
                color: #999999;
            }
            .img_1{
                padding-left: 50px;
                padding-bottom: 10px;
            }

        }
    }
</style>