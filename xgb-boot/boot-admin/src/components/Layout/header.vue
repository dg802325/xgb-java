<template>
    <div class="header-container">
        <div class="logo-wrapper">
            <img src="../../assets/images/logo.svg" height="33">
            <p class="name">X-G-B工具箱</p>
        </div>

        <div class="header-right">
            <div class="head-avatar" @mouseleave="noShowCard">
                <img v-if="userInfo.imgUrl" :src="userInfo.imgUrl" style="width: 35px;height: 35px;"/>
                <img  v-else src="../../assets/images/head.png"/>
            </div>
            <el-dropdown>
                <div class="user-name" style="padding: 10px">
                    {{userInfo.userName}}
                </div>
                <el-dropdown-menu slot="dropdown">
                    <div class="s-user-info" >
                        <div slot="header" class="clearfix">
                            <span style="margin-top: 15px">账户信息</span>
                            <el-button style="float: right; padding: 0px" type="text" @click="toUserInfo">账户设置</el-button>
                        </div>
                        <hr style="margin-top: 15px"/>
                        <div class="user-item">
                            {{'• 部门：' + userInfo.departmentName }}
                        </div>
                        <div class="user-item">
                            {{'• 岗位：' + userInfo.roleName }}
                        </div>
                        <div class="user-item">
                            {{'• 本次登录：' + userInfo.loginThisTime }}
                        </div>
                        <div class="user-item">
                            {{'• 登录地区：' + userInfo.loginArea }}
                        </div>
                        <div class="user-item" v-if="userInfo.lastLogin">
                            {{'• 上次登录：' + userInfo.lastLogin}}
                        </div>
                    </div>
                </el-dropdown-menu>
            </el-dropdown>

            <div class="line"></div>
            <i class="close-icon el-icon-switch-button" @click="toSignOut"></i>
        </div>

    </div>
</template>

<script>
    import {removeToken} from "../../utils/auth";

    export default {
        data() {
            return {
                o: 0,
                isShow: false,
                activeIndex: 1,
                userInfo: {},
                department: {},
                activeHomePage: 'active',
                activeHomePageManager: '',
                activeJurisdiction: '',
            };
        },
        props: {
            menu: Array,
            currentIndex: {
                type: Number,
                default: 0
            }
        },
        created() {
            this.getUserInfo()
        },
        methods: {
            handleClick(index){
                this.currentIndex = index,
                    this.$emit('change',index);
            },
            showCard() {
                this.isShow = true
            },
            noShowCard() {
                this.isShow = false
            },
            async getUserInfo() {
                let res = await this.$get("/admin/getUserInfo")
                if (res.code == 200) {
                    this.userInfo = res
                }
            },
            async toSignOut() {
                let res = await this.$post("/admin/toUserOut")
                if (res.code == 200) {
                    removeToken();
                    this.$router.push('/login');
                }
            },
            async toUserInfo() {
                this.$router.push(`/home/userInfo`);
            }
        }

    };
</script>

<style>
    .s-user-info {
        padding: 20px ;
        /*position: absolute;*/
        /*right: 0;*/
        /*top: 51px;*/
        /*z-index: 10;*/
        width: 350px;
    }

    .user-item {
        height: 30px;
        line-height: 30px;
    }
</style>
