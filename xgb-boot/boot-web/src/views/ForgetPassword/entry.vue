<template>
  <v-init-view class="bj">
    <p slot="right" class="to-login">
      <router-link to="/" v-if="steps==4">进入网站首页</router-link>
      <router-link to="/login" v-else><i class="fa fa-arrow-left"></i>返回登录</router-link>
    </p>
    <div class="container forget-c" v-show="steps==1">
      <div class="forget-container">
        <p class="title" style="padding-bottom:40px;">重置密码</p>
        <div class="form-wrapper" v-if="steps==1">
          <el-form label-width="412px">
            <el-form-item label="手机号：">
              <el-input v-model="mobile" placeholder="输入手机号"></el-input>
            </el-form-item>

            <el-form-item label="验证码：">
              <el-input v-model="mobileCode" placeholder="短信验证码" style="width: 300px">
                <span slot="suffix">

                </span>
                <i slot="suffix">
                  <el-button :disabled="isDisabled" class="send-msg" @click="sendMobile" type="text">
                    {{msg}}
                  </el-button>
                </i>
              </el-input>
            </el-form-item>
            <el-form-item label="新的密码：">
              <el-input v-model="password" type="password" placeholder="设置6至20位登录密码"></el-input>
            </el-form-item>
            <el-form-item label="重复密码：" style="margin-bottom:45px">
              <el-input v-model="rePassword" type="password" placeholder="请再次输入登录密码"></el-input>
            </el-form-item>
            <el-form-item label="">
              <el-button class="next-step-btn" type="primary" @click="forgetPwdEvent">提交</el-button>
            </el-form-item>
          </el-form>
        </div>
      </div>
    </div>
    <div class="container forget-c" v-if="steps==2">
      <div class="success-wrapper forget-success-wrapper">
        <div class="info">
          <i class="fa fa-check-circle-o"></i>
          <p class="value">密码重置成功</p>
          <p class="label">下次请使用新密码进行登录</p>
        </div>
        <div class="btn">
          <router-link to="/" class="to-home" style="margin-right:0;">进入首页</router-link>
        </div>
      </div>
    </div>
  </v-init-view>
</template>

<script>
  export default {
    data() {
      return {
        count: 60,
        steps: 1,
        username: "",
        mobile: "",
        code: "",
        msgCode: "",
        mobileCode: "",
        password: "",
        rePassword: "",
        msg: '发送验证码',
        isDisabled: false
      }
    },
    watch: {
      // steps(val){
      //     this.$refs.progress.style.width = val*28+'%'
      // }
    },
    mounted() {
      // this.$refs.progress.style.width = this.steps*28+'%'
    },
    methods: {
      async sendMobile() {
        if (!this.mobile) {
          this.$message.error('手机号不能为空')
          return;
        }
        let res = await this.$post('/api/mobileCode', {
          mobile: this.mobile
        });

        if (res.code === '200') {
          this.$message.success('短信已发送!');
          this.countDown();
        } else {
          this.$message.error(res.message)
        }

      },
      countDown() {
        this.isDisabled = true;
        this.msg = this.count + '秒后重新发送';
        let timer = setInterval(() => {
          this.count--;
          if (this.count <= 0) {
            clearInterval(timer);
            this.msg = "获取验证码";
            this.isDisabled = false;
          } else {
            this.msg = this.count + '秒后重新发送';
          }
        }, 1000);
      },
      async forgetPwdEvent() {
        if (!this.mobile) {
          this.$message.error('手机号不能为空')
          return;
        }
        if (!this.mobileCode) {
          this.$message.error('短信验证码不能为空')
          return;
        }
        if (!this.password) {
          this.$message.error('密码不能为空')
          return;
        }
        if(this.password.length<6 ||this.password.length>20 ){
          this.$message.error('请设置6至20位登录密码')
          return;
        }
        if (!this.rePassword) {
          this.$message.error('确认密码不能为空')
          return;
        }
        if (this.password !== this.rePassword) {
          this.$message.error('两次密码不一致')
          return;
        }

        let res = await this.$post('/api/forgetPwd',{
          mobile:this.mobile,
          password:this.password,
          mobileCode: this.mobileCode
        })
        if(res.code==="200"){
          this.steps = 2;
        }else{
          this.$message.error(res.message)
        }

      }
    }
  }
</script>

<style lang="scss">
  .to-login {
    padding-top: 21px;
    font-size: 14px;

    a {
      color: rgb(26, 188, 156);

      .fa {
        margin-right: 2px;
        color: rgb(26, 188, 156);
      }
    }
  }

  .forget-container {
    margin-top: 21px;
    padding: 39px 39px 114px;
    border: 1px #e4e4e4 solid;
    background: #fff;

    .title {
      font-size: 16px;
      height: 38px;
      color: #999999;
    }

    .form-wrapper {
      .el-form-item {
        position: relative;
        margin-bottom: 24px;

        .tip {
          position: absolute;
          top: 8px;
          left: 320px;
          color: #999999;
          font-size: 14px;
        }
      }

      .bolder {
        .el-input__inner {
          font-weight: bold;
          color: #666666;
          font-size: 18px;
        }
      }

      .el-form-item__label {
        padding-right: 19px;
        font-size: 16px;
        color: #999999;
        line-height: 50px;
      }

      .el-input__inner {
        padding-left: 10px;
        width: 300px;
        height: 50px;

        &::placeholder {
          font-size: 14px;
        }
      }

      .verification-wrapper {
        padding-left: 3px;
        display: flex;

        p {
          margin-left: 10px;
          padding-top: 13px;
          font-size: 16px;
          color: #999999;

          a {
            color: #1ABC9C;
          }
        }
      }

      .next-step-btn {
        width: 300px;
        height: 45px;
        background: #1abc9c;
        font-size: 14px;
        border-radius: 0;

        span {
          color: #fff;
        }

        &:hover {
          opacity: 0.8;
        }
      }
    }
  }

  .forget-success-wrapper {
    padding-top: 176px;
  }

  .send-msg {
    float: left;
    margin: 5px 10px 0 0;
    font-size: 12px;

    span {
      color: #1ABC9C;
    }
  }

  .is-disabled.send-msg span {
    color: #ccc
  }

</style>
