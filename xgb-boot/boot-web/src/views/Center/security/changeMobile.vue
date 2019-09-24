<template>
  <div class="c-border change-mobile-container">
    <div class="title">更换手机号码</div>
    <div class="change-mobile-wrapper" v-if="steps<3">
       <div class="steps-container">
          <div class="steps-link">
            <div class="progress" ref="progress"></div>
          </div>
          <dl
            :class="{
              'current': steps==1,
              'active': steps>1
            }"
          >
            <dt>
              1
            </dt>
            <dd>验证身份</dd>
          </dl>
          <dl
              :class="{
              'current': steps==2,
              'active': steps>2
            }"
          >
            <dt>2</dt>
            <dd>修改手机号码</dd>
          </dl>
          <dl
              :class="{
              'current': steps==3,
              'active': steps>3
            }"
          >
            <dt>3</dt>
            <dd>完成更换</dd>
          </dl>
        </div>
      <div class="v-form-group" v-if="steps==1">
        <dl class="mobile">
          <dt>已绑定的手机：180****1849</dt>
          <dd>若该手机号已无法使用请联系客服</dd>
        </dl>
        <el-form label-width="290px">
          <el-form-item label="验证码：">
            <el-input placeholder="短信验证码" v-model="code"/>
            <a href="javascript:;" class="send-msg">发送验证码</a>
          </el-form-item>  
          <el-form-item label="">
            <el-button type="primary" class="primary-button" @click="steps=2">下一步</el-button>
          </el-form-item>
        </el-form>   
        <dl class="tips">
          <dt>温馨提醒</dt>
          <dd>• 为保障您的帐号安全，变更重要信息需要身份验证</dd>
          <dd>• 若有疑问请联系在线客服或拨打400-0000-000（周一至周日 8:00-18:00）</dd>
        </dl>   
      </div>
      <div class="v-form-group" v-if="steps==2">
        <el-form label-width="290px">
         <el-form-item label="手机号码">
            <el-input placeholder="输入新的手机号码" v-model="mobile"/>
          </el-form-item>  
          <el-form-item label="验证码：">
            <el-input placeholder="短信验证码" v-model="code1"/>
            <a href="javascript:;" class="send-msg">发送验证码</a>
          </el-form-item>  
          <el-form-item label="">
            <el-button type="primary" class="primary-button" @click="steps=3">下一步</el-button>
          </el-form-item>
        </el-form>  
        <dl class="tips">
          <dt>安全服务提示</dt>
          <dd>• 绑定手机可提高帐号安全性，您也可以使用已绑定手机快速找回支付密码等</dd>
          <dd>• 一个手机号只能绑定一个帐号</dd>
        </dl>      
      </div>
    </div>
    <div class="change-mobile-success" v-if="steps==3">
      <div class="success-wrapper">
        <div class="info">
          <i class="fa fa-check-circle-o"></i>
          <p class="value">手机号码更换成功</p>
          <p class="label">您可以在下次使用新号码进行登录</p>
        </div>
        <div class="btn">
          <router-link to="/center/security" class="to-home">返回</router-link>
        </div>
      </div>
       <dl class="tips">
          <dt>安全服务提示</dt>
          <dd>• 绑定手机可提高帐号安全性，您也可以使用已绑定手机快速找回支付密码等</dd>
          <dd>• 一个手机号只能绑定一个帐号</dd>
        </dl>   
    </div>
  </div>
</template>

<script>
export default {
  data(){
    return {
      steps: 1,
      code: '',
      mobile: '',
      code1: ''
    }
  }
}
</script>

<style lang="scss">
.change-mobile-container{
  background:#fff;
  padding: 0 39px;
  height: 850px;
  .change-mobile-wrapper{
    width: 800px;
  }
  .title{
    padding: 51px 0 0 10px;
    height: 99px;
    font-size: 16px;
    border-bottom: 1px #e4e4e4 solid;
    box-sizing: border-box;
  }
  .steps-container{
    margin-left: 180px;
    width: 481px;
    height: 136px;
  }
  .mobile{
    padding-left: 305px;
    padding-bottom: 22px;
    dt{
      font-size: 18px;
    }
    dd{
      padding-left: 11px;
      font-size: 14px;
      line-height: 42px;
      color: #999999;
    }
  }
  .change-mobile-wrapper{
    padding-top: 60px;
    .el-form{
      width: 590px;
      .el-form-item__content{
        position: relative;
        .send-msg{
          position: absolute;
          right: 15px;
          top:0;
          margin:0;
        }
      }
    }
    .primary-button{
      width:300px;
    }
  }
  .success-wrapper{
      padding-top: 60px;
      padding-bottom: 90px;
      border:none;
  }
  .tips{
    padding-left: 19px;
    margin-top: 110px;
    border:1px #e4e4e4 solid;
    background:#f2f2f2;
    height: 127px;
    dt{
      font-family:微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight:700;
      font-size: 16px;
      color: #999999;
      padding-top: 25px;
      padding-bottom: 6px;
    }
    dd{
      line-height: 28px;
      color: #999999;
      font-size: 14px;
    }
  }
}
</style>
