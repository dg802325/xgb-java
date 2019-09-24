<template>
  <div class="c-border security-container">
    <div class="name">
      您当前的帐号 {{member.memberName}}
    </div>
    <div class="security-set-item">
      <div class="icon">
        <img src="../images/u3737.png"/>
      </div>
      <div class="txt">
        <p class="value"  >登录密码</p>
        <p class="label">建议您定期更换密码，设置安全性高的密码可以使帐号更安全</p>
      </div>
      <div class="opt">
        <button class="button" @click="visibility=true">修改</button>
      </div>
    </div>
    <!--<div class="security-set-item">-->
      <!--<div class="icon">-->
        <!--<img src="../images/u3736.png"/>-->
      <!--</div>-->
      <!--<div class="txt">-->
        <!--<p class="value">安全手机 180******49</p>-->
        <!--<p class="label">安全手机可以用于登录帐号，重置密码或其他安全验证</p>-->
      <!--</div>-->
      <!--<div class="opt">-->
        <!---->
        <!--<router-link to="/center/changeMobile" tag="button" class="button">更换</router-link>-->
      <!--</div>-->
    <!--</div>-->
    <dl class="tips">
      <dt>安全服务提示</dt>
      <dd>• 确认您登录的是e农商城网址，注意防范进入钓鱼网站，不要轻信各种即时通讯工具发送的商品或支付链接，谨防网购诈骗</dd>
      <dd>• 建议您安装杀毒软件，并定期更新操作系统等软件补丁，确保帐号及交易安全</dd>
    </dl>
    <div class="security-mask" v-if="visibility" @click="visibility=false"></div>
    <el-card class="security-change-password" v-if="visibility">
      <div class="change-password-header">
       <h2>修改密码</h2>
       <i class="close fa fa-close" @click="visibility=false"></i>
      </div>
      <div class="change-password-body">
        <el-form label-position="top" label-width="100px" >
          <el-form-item label="原密码">
            <el-input v-model="oldPwd" type="password" placeholder="请输入原密码"></el-input>
          </el-form-item>
          <el-form-item label="新的密码">
            <el-input v-model="newPwd" maxlength="20" type="password" style="margin-bottom:10px;" placeholder="设置6至20位登录密码"></el-input>
            <el-input v-model="rePwd" maxlength="20" type="password" placeholder="请再次输入登录密码"></el-input>
          </el-form-item>
        </el-form>
        <div class="form-item-button">
          <button class="default"  @click="visibility=false">取消</button>
          <button class="primary"  @click="changePwdEvent">确定</button>
        </div>
      </div>
    </el-card>
  </div>
</template>

<script>
import MD5 from 'md5.js';
import {getMember,getToken} from "../../../utils/auth";
export default {
  data(){
    return {
      visibility: false,
      oldPwd: '',
      newPwd: '',
      rePwd: '',
      member: {}
    }
  },
  mounted(){
    let member = getMember();
    member = JSON.parse(member);
    this.member = member;
  },
  methods: {
    md5Event(data){
      const md5stream = new MD5();
      return md5stream.update(data).digest('hex').toUpperCase();
    },
    async changePwdEvent(){
      if(!this.oldPwd){
        this.$message.warning('请输入原密码！');
        return ;
      }
      if(!this.newPwd){
        this.$message.warning('请输入新密码！');
        return;
      }
      if(!this.rePwd){
        this.$message.warning('请输入确认密码！');
        return;
      }
      if(this.newPwd.length<6 || this.rePwd.length<6){
        this.$message.warning('请设置6至20位登录密码！');
        return;
      }
      let token = getToken();
      let params = {
        token,
        oldPassword: this.md5Event(this.oldPwd),
        password: this.md5Event(this.newPwd),
        rePassword: this.md5Event(this.rePwd)
      }
      let res = await this.$post('/api/updatePwd',params);
      console.log(res)
      if(res.code==='200'){
        this.visibility = false;
        this.$message.success(res.message)
      }else{
        this.$message.warning(res.message)
      }
    }
  }
}
</script>

<style lang="scss">
.security-container{
  padding: 0 39px;
  height: 800px;
  background:#fff;
  .name{
    padding: 71px 0 0 11px;
    height: 119px;
    box-sizing: border-box;
    font-size: 16px;
    border-bottom: 1px #e4e4e4 solid;
  }
  .security-set-item{
    display: flex;
    height: 139px;
    border-bottom: 1px #ededed solid;
    .icon{
      flex: 0 0 92px;
      width: 92px;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .txt{
      flex: 1;
      padding-left: 9px;
      .value{
        font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
        font-weight: 700;
        padding:43px 0 19px ;
        font-size: 18px;
      }
      .label{
        font-size: 16px;
        color:#999;
      }
    }
    .opt{
      padding: 52px 18px 0 0;
      .button{
        width: 149px;
        height: 45px;
        color: #999999;
        cursor: pointer;
        background-color: rgba(245, 245, 245, 1);
        box-sizing: border-box;
        border-width: 1px;
        border-style: solid;
        border-color: rgba(228, 228, 228, 1);
        &:hover{
          color:#333333;
        }
      }
    }
  }
  .tips{
    padding-left: 19px;
    margin-top: 50px;
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
.security-mask{
  position: fixed;
  left:0;
  top: 0;
  bottom:0;
  right:0;
  z-index:90;
  background: rgba(0,0,0,0.5);
}
.security-change-password{
  position: fixed;
  left: 50%;
  top: 50%;
  z-index:100;
  transform: translate(-50%,-50%);
  width: 500px;
  height: 464px;
  .el-card__body{
    padding: 0;
  }
  .change-password-header{
    position: relative;
    padding: 14px 0 23px;
    .close{
      position: absolute;
      right: 15px;
      top: 15px;
      font-size: 18px;
      color:#ccc;
      cursor: pointer;
      &:hover{
        color:#1abc9c
      }
    }
    h2{
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight: 700;
      font-size: 20px;
      text-align: center;
      line-height: 1
    }
  }
  .change-password-body{
    padding: 0 100px;
    .el-form-item__label{
      font-size: 16px;
      line-height: 50px;
      padding:0;
    }
    .el-input__inner{
      height: 50px;
      line-height: 50px;
      border-color: #e4e4e4;
    }
    .el-form-item{
      margin-bottom:0;
    }
    .form-item-button{
      padding-top: 30px;
      display: flex;
      justify-content: space-between;
      .default{
        border:1px #e4e4e4 solid;
        background: #f5f5f5;
        width: 137px;
        height: 43px;
        cursor: pointer;
        font-size: 14px;
        color: #999999;
        &:hover{
          color: rgb(51, 51, 51);
        }
      }
      .primary{
        width: 141px;
        height: 45px;
        border:none;
        background: #1abc9c;
        font-size: 14px;
        color:#fff;
        cursor: pointer;
        &:hover{
          opacity: 0.9;
        }
      }
    }
  }
}
</style>
