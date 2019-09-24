<template>
  <div style="background: rgb(245, 245, 245);padding-bottom:20px;">
    <div class="container forget-c alpay-container">
      <div class="pay-title">银联快捷支付</div>
      <div class="forget-container" style="margin-top:0;background:#fff">
        <div class="steps-container">
          <div class="steps-link">
            <div class="progress" ref="progress"></div>
          </div>
          <dl
            :class="{
              'current': steps==0,
              'active': steps>0
            }"
          >
            <dt>1</dt>
            <dd>填写信息</dd>
          </dl>
          <dl
            :class="{
              'current': steps==1,
              'active': steps>1
            }"
          >
            <dt>2</dt>
            <dd>确认支付</dd>
          </dl>
        </div>
        <div class="form-wrapper" v-if="steps==0">
          <el-form label-width="412px">
            <el-form-item label="银行卡注册人名称：">
              <el-input v-model="payerName" placeholder="银行卡注册人名称"></el-input>
            </el-form-item>
            <el-form-item label="身份证号：">
              <el-input v-model="idCardNo" placeholder="身份证号"></el-input>
            </el-form-item>
            <el-form-item label="银行卡号：">
              <el-input v-model="cardNo" placeholder="银行卡号"></el-input>
            </el-form-item>
            <el-form-item label="手机号：">
              <el-input v-model="phone" placeholder="手机号"></el-input>
            </el-form-item>
            <el-form-item label>
              <el-button class="next-step-btn" type="primary" @click="unionFenZhangOrder">下一步</el-button>
            </el-form-item>
          </el-form>
        </div>
        <div class="form-wrapper" v-if="steps==1">
          <el-form label-width="412px">
            <el-form-item label="支付短信验证码：" style="margin-bottom:45px">
              <el-input v-model="validateCode" placeholder="短信验证码" style="width: 300px">
                <i slot="suffix">
                  <a href="javascript:;" class="send-msg" @click="sendMobile">{{msg}}</a>
                </i>
              </el-input>
            </el-form-item>
            <el-form-item label>
              <el-button class="next-step-btn" type="primary" @click="confirmPay">确认支付</el-button>
            </el-form-item>
          </el-form>
        </div>
      </div>
    </div>
    <!-- <div class="container forget-c" v-if="steps==2">
      <div class="success-wrapper forget-success-wrapper">
        <div class="info">
          <i class="fa fa-check-circle-o"></i>
          <p class="value">支付成功</p>
        </div>
        <div class="btn">
          <router-link to="/" class="to-home" style="margin-right:0;">返回首页</router-link>
        </div>
      </div>
    </div> -->
  </div>
</template>

<script>
import { getMember,getToken } from "../../../utils/auth";

export default {
  data() {
    return {
      steps: 0,
      username: "",
      mobile: "18033441849",
      code: "",
      msgCode: "",
      password: "",
      rePassword: "", //
      userId: "",
      orderId: "",
      payerName: "",
      idCardNo: "",
      cardNo: "",
      phone: "",
      terminalType: "OTHER",
      terminalId: "",
      ocSettlementId: "",
      count: 60,
      msg: "发送验证码",
      validateCode: "",
      vSend: true,
      amountPayable: ''
    };
  },
  watch: {
    steps(val) {
      this.$refs.progress.style.width = val * 100 + "%";
    }
  },
  mounted() {
    this.$refs.progress.style.width = this.steps * 100 + "%";
    let { orderId, amountPayable } = this.$route.params;
    this.orderId = orderId;
    this.amountPayable = amountPayable;
  },
  methods: {
    // 确认支付
    async confirmPay() {
      // this.$router.push('/order/success/union/'+ this.amountPayable)
      // return;
      let res = await this.$post('/api/confirmPay',{
        ocSettlementId:this.ocSettlementId,
        validateCode: this.validateCode
      })
      if(res.code==='200'){
        this.$router.push('/order/success/union/'+this.amountPayable)
      }else{
        this.$message.warning(res.message);
      }
    },
    // 获取短信验证码
    async sendMobile() {
      if(!this.vSend){
        return;
      }
      this.vSend = false
      let res = await this.$post("/api/paySendValidateCode", {
        ocSettlementId: this.ocSettlementId
      });
      if (res.code === "200") {
        this.$message.success("短信已发送!");
        this.countDown();
      } else {
        this.$message.warning(res.message);
      }
      this.vSend = true;
    },
    countDown() {
      this.isDisabled = true;
      this.msg = this.count + "秒后重新发送";
      let timer = setInterval(() => {
        this.count--;
        if (this.count <= 0) {
          clearInterval(timer);
          this.vSend = true;
          this.msg = "获取验证码";
          this.isDisabled = false;
        } else {
          this.msg = this.count + "秒后重新发送";
        }
      }, 1000);
    },
    async unionFenZhangOrder() {
      let member = getMember();
      member = JSON.parse(member);
      if (!member) {
        this.$router.push("/login");
        return;
      }
      if (!this.payerName) {
        this.$message.warning("银行卡注册人名称不能为空");
        return;
      }
      if (!this.idCardNo) {
        this.$message.warning("身份证号不能为空");
        return;
      }

      if (!this.cardNo) {
        this.$message.warning("银行卡号不能为空");
        return;
      }

      if (!this.phone) {
        this.$message.warning("手机号不能为空");
        return;
      }

      if (!/^((\+|00)86)?1[3-9]\d{9}$/.test(this.phone)) {
        this.$message.warning("手机号格式不正确");
        return;
      }
      let token = getToken();
      let res = await this.$post("/api/unionFenZhangOrder", {
        token,
        //userId: member.id,
        orderId: this.orderId,
        payerName: this.payerName,
        idCardNo: this.idCardNo,
        cardNo: this.cardNo,
        phone: this.phone,
        terminalType: this.terminalType,
        terminalId: this.terminalId
      });
      if (res.code === "200") {
        this.ocSettlementId = res.ocSettlementId;
        this.steps = 1;
      } else {
        this.$message.error(res.message);
      }
    }
  }
};
</script>

<style lang="scss" >
.pay-title {
  font-size: 16px;
  color: #999999;
  line-height: 80px;
}
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
          color: #1abc9c;
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
.alpay-container {
}
</style>
