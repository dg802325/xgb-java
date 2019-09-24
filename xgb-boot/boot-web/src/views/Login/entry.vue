<template>
  <div>
    <v-init-view>
      <router-link slot="right" to="/" class="link">进入网站首页 </router-link>
      <div class="login-form-container">
        <div class="form-wrapper">
          <div class="login-container">
            <h2 style="font-family: '微软雅黑';">用户登录</h2>
            <el-form ref="loginForm">
              <el-form-item :class="{'is-error':userError}" >
                <el-input v-model="username" maxlength="20" size=""  @keyup.enter.native="submitForm"  clearable placeholder="用户名称/手机号码">
                  <i slot="prefix" class="icon">
                    <img src="./images/u1014.svg" />
                  </i>
                </el-input>
              </el-form-item>
              <el-form-item  :class="{'is-error':passError}">
                <el-input v-model="password" type="password"  @keyup.enter.native="submitForm"  size="" clearable placeholder="输入登录密码">
                  <i slot="prefix" class="icon">
                    <img src="./images/u1009.svg" />
                  </i>
                </el-input>
              </el-form-item>
              <el-form-item>
                <div class="msg" v-if="msg"><i class="el-icon-warning"></i>{{msg}}</div>
                <el-button class="login-button" :loading="loading"  type="primary" @click="submitForm('loginForm')">登录</el-button>
              </el-form-item>
            </el-form>
            <div class="sub-line">
              <router-link to="/forgetPassword">忘记密码?</router-link>
              <router-link to="/register">新用户注册</router-link>
            </div>
          </div>
        </div>
      </div>
    </v-init-view>
  </div>
</template>

<script>
import MD5 from 'md5.js';
import {setToken,setMember} from "../../utils/auth";

export default {
  data(){
    return {
      userError: false,
      passError: false,
      username: '',
      password: '',
      msg: '',
      loading: false
    }
  },
  created(){
    // this.$router.afterHooks((to,from)=>{
    //   console.log(to,from)
    // })
  },
  methods: {
    async submitForm(){
     this.userError = false;
     this.passError = false;
     if(this.username===""){
       this.userError = true;
       this.msg = "请输入用户名"
       return;
     }
     if(this.password===""){
       this.passError = true;
       this.msg = "密码不能为空!"
       return;
     }
     this.loading = true;
     const md5stream = new MD5();
     const password = md5stream.update(this.password).digest('hex').toUpperCase();
     let res = await this.$post('/api/eLoginMember',{
       mobile:this.username,
       password
     });
      this.loading = false;
      if(res.code==='200'){
        setToken(res.token);
        setMember(JSON.stringify(res.member));
        this.$router.push('/')
      }else{
        this.msg = res.message;
      }
     return false;
    }
  }
}
</script>

<style lang="scss">
.login-form-container{
  height: 600px;
  background: url(./images/u7520_state0.jpg) no-repeat center;
  .form-wrapper{
    padding-top: 50px;
    margin: 0 auto;
    width: 1183px;
    overflow: hidden;
    .login-container{
      padding: 2px 39px 0 41px;
      float: right;
      width: 380px;
      height: 365px;
      background:#fff;
      box-sizing: border-box;
      h2{
        font-weight: 400;
        font-size: 20px;
        color: #999;
        padding-left: 111px;
        padding-top: 27px;
        height: 76px;
        line-height: 1;
        box-sizing: border-box;
      }
      .login-button{
        margin-top: 30px;
        height: 45px;
        width: 100%;
        border-radius: 0;
        span{
          font-size: 14px;
          color:#fff;
        }
      }
      .el-input__inner{
        height:50px;
        padding-top: 1px;
        line-height: 48px;
        padding-left: 52.5px;
      }
      .el-form-item{
        position: relative;
        margin-bottom: 20px;
        .msg{
          position: absolute;
          left: 15px;
          top:-4px;
          color: #F04844;
          line-height: 1;
          font-size: 12px;
          i{
            margin-right: 2px;
            color: #F04844;
            font-size: 16px;
          }
        }
      }
      .el-input__prefix{
        display: flex;
        left: 12px;
        align-items: center;
        height: 50px;
        .icon{
          float: left;
          height: 20px;
          img{
            display: block;
            color: #666666;
          }
        }
      }
      .sub-line{
        padding: 0 0 0 1px;
        display: flex;
        justify-content: space-between;
        a{
          font-size: 12px;
          color: #1ABC9C;
        }
      }
    }
  }
}
</style>
