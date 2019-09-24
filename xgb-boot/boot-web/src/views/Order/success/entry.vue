<template>
  <div class="bj" style="padding-bottom: 50px;">
    <div class="container">
      <div class="pay-success-title">支付成功</div>
      <div class="pay-success success-wrapper">
        <div class="info">
          <i class="fa fa-check-circle-o"></i>
          <p class="value">订单支付成功</p>
          <p class="label">我们将尽快为您发货，收货期间请保持手机畅通</p>
        </div>
        <div class="pay-info">
          <p>
            <span class="label">支付方式：</span>
            <span class="value" v-if='payType==="union"'>银联快捷支付</span>
          </p>
          <p>
            <span class="label">支付金额：</span>
            <span class="value">¥{{amountPayable | toFixed}}</span>
          </p>
        </div>
        <div class="btn">
          <router-link to="/" class="to-home">进入首页</router-link>
          <router-link to="/center/order" class="default">查看订单</router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      payType: "",
      amountPayable: 0
    };
  },
  filters: {
    toFixed(val) {
      if (typeof val === "string") {
        return Number(val).toFixed(2);
      } else if (typeof val === "number") {
        return val.toFixed(2);
      }
      return val;
    }
  },
  mounted() {
    let { payType, amountPayable } = this.$route.params;
    this.payType = payType;
    this.amountPayable = amountPayable;
  }
};
</script>

<style lang="scss" scoped>
.pay-success-title {
  font-size: 16px;
  color: #999999;
  line-height: 80px;
}
.pay-success {
  padding-top: 100px;
  margin-top: 0;
  .btn {
    padding-top: 31px;
  }
  .pay-info {
    padding-top: 24px;
    p {
      padding-left: 525px;
      line-height: 30px;
      .label {
        padding-right: 10px;
        font-size: 14px;
        color: #999;
      }
      .value {
        font-size: 14px;
        color: #f04844;
      }
    }
  }
}
</style>
