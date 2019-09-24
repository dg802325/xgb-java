<template>
  <div class="bj" style="min-height: 100vh">
    <div class="login-header">
      <div class="container">
        <div class="login-logo">
          <router-link to="/">
            <img src="images/web-logo.png"/>
          </router-link>
          <p>
            <b style="font-family:'微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';font-weight:700;color:#999999;">e农商城</b> 惠聚优质商品
          </p>
        </div>
        <slot name="right">
          <router-link to="/" class="link">进入网站首页 </router-link>
        </slot>
      </div>
    </div>
    <slot></slot>
    <div class="login-copy">
      CopyRight &copy; 京ICP备16000129号-3 e农商城 2015 - 2019  <router-link to="/business" class="business-link">商家中心</router-link>
    </div>
  </div>
</template>

<script>
export default {
  data(){
    return {
      userError: false,
      passError: false,
      username: '',
      password: '',
      msg: ''
    }
  },
  methods: {
    submitForm(){
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
     return false;
    }
  }
}
</script>

<style lang="scss">
.login-header{
  border-bottom:1px #e4e4e4 solid;
  background: #fff;
  .container{
    display: flex;
    justify-content: space-between;
    padding-top:25px;
    height: 75px;
  }
  .login-logo{
    display: flex;
    align-items: center;
    height: 55px;
    a{
      margin-right: 8px;
      display: flex;
      align-items: center;
      justify-content: center;
      width:55px;
      height: 55px;
      background: url(./images/u147.png);
      background-size: 55px 55px;
      img{
        width: 35px;
      }
    }
    p{
      b{
        padding-right: 1px;
        font-size: 24px;
      }
      font-size: 20px;
      color: #CCCCCC;
    }
  }
  .link{
    margin-top: 14px;
    font-size: 14px;
    color: #1ABC9C;
  }
}

.login-copy{
  text-align: center;
  height: 80px;
  padding-top: 73px;
  font-size: 13px;
  color: #999999;
}
</style>
