<template>

   <div class="bj pb34">
    <div class="container evaluate-container">
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link> >
        <span>{{title}}</span>
      </div>
    </div>
    <div class="container">
      <div class="center-nav">
        <dl>
          <dt >我的账户</dt>
          <dd><router-link to="/center/person" >个人中心</router-link></dd>
          <dd><router-link to="/center/message">消息通知</router-link></dd>
          <dd><router-link to="/center/info">个人信息</router-link></dd>
          <dd><router-link to="/center/security">安全设置</router-link></dd>
          <dd><router-link to="/center/address">地址管理</router-link></dd>
        </dl>
        <dl>
          <dt >交易管理</dt>
          <dd><router-link to="/center/order">我的订单</router-link></dd>
          <!--<dd><router-link to="/center/evaluate">评价晒单</router-link></dd>-->
          <dd><router-link to="/center/service">售后服务</router-link></dd>
        </dl>
         <dl>
          <dt>帮助中心</dt>
          <dd><router-link to="/center/user">帮助中心</router-link></dd>
        </dl>
      </div>
      <div class="center-container">
        <router-view></router-view>
      </div>
      <div class="clear"></div>
    </div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex';
import { getToken } from '../../utils/auth';

export default {
  data(){
    return {
      title: ''
    }
  },
  computed:{
    ...mapGetters(['member'])
  },
  watch: {
    $route(route){
      this.title = route.meta.title;
    },
    member(member){
      let token = getToken();
      if(!token){
        this.$router.push('/login')
      }
    }
  },
  mounted(){
    this.title = this.$route.meta.title;
    let token = getToken();
    if(!token){
      this.$router.push('/login')
    }
  }
}
</script>

<style lang="scss">
.center-nav{
  float: left;
  width: 218px;
  padding:12px 0;
  border: 1px #e4e4e4 solid;
  background: #fff;
  dl{
    padding-bottom: 1px;
    dt{
      padding-left: 49px;
      padding-bottom: 1px;
      line-height: 48px;
      font-weight: 700;
      font-size: 18px;
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
    }
    dd{
      height: 40px;
      line-height: 40px;
      a{
        position: relative;
        float: left;
        padding-left: 49px;
        font-size: 14px;
        color: #666666;
        line-height: 40px;
        &:hover{
          color:#1abc9c;
        }
        &::after{
          display: none;
          position: absolute;
          left: -1px;
          top: 0;
          content: '';
          width: 5px;
          height: 40px;
          background: #1abc9c;
        }
      }
      .router-link-active{
        color:#1abc9c;
        cursor: auto;
        &::after{
          display: block;
        }
      }
    }
  }
}
.center-container{
  float: right;
  width: 960px;
}
</style>
