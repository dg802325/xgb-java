<template>
  <div class="change-order-model">
    <div class="change-order-container">
      <div class="header">
        取消订单
        <span class="close" @click="closeEvent">
          <img src="./images/u977.png" />
        </span>
      </div>
      <div class="body">
        <p class="tip">取消订单后，本单享有的优惠可能会一并取消，是否继续？</p>
        <p class="tip" style="color:#999999;">请选择取消订单的原因（必选）：</p>
      </div>
      <ul class="list">
        <li v-for="(item,index) in list" :key="index"
        :class="{'active':index===currentIndx}"
        @click="currentIndx=index"
        >{{item}}</li>
      </ul>
      <div class="footer">
        <a href="javacript:;" class="btn default" @click="closeEvent">再想想</a>
        <a href="javacript:;" class="btn danger" @click="submitEvent">提交</a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      list: [
        "配送信息有误",
        "商品买错了",
        "重复下单/误下单",
        "忘记使用优惠券、优币等",
        "其他渠道价格更低",
        "不想买了"
      ],
      currentIndx:-1
    };
  },
  methods: {
    closeEvent() {
      this.$emit("close",false);
    },
    submitEvent(){
      this.$emit("close",true);
    }
  }
};
</script>

<style lang="scss">
.change-order-model {
  font-family: "微软雅黑";
  position: fixed;
  left: 0;
  top: 0;
  bottom: 0;
  right: 0;
  z-index: 99999;
  background: rgba(0, 0, 0, 0.34);
  .change-order-container {
    position: fixed;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    width: 600px;
    padding-bottom: 30px;
    min-height: 279px;
    background-color: rgba(255, 255, 255, 1);
    border-radius: 3px;
    box-shadow: 0px 0px 5px rgba(51, 51, 51, 0.34);
    font-size: 20px;
    .header {
      position: relative;
      padding: 17px 0;
      text-align: center;
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight: 700;
      font-size: 20px;
      .close {
        position: absolute;
        right: 20px;
        top: 20px;
        cursor: pointer;
      }
    }
    .body {
      margin: 5px 32px 22px;
      .tip {
        font-size: 14px;
        line-height: 26px;
      }
    }
    .list {
      margin-left: 30px;
      overflow: hidden;
      li {
        margin: 0 11px 20px 0;
        float: left;
        font-size: 14px;
        color: #666666;
        width: 257px;
        height: 38px;
        line-height: 38px;
        text-align: center;
        border: 1px #e4e4e4 solid;
        cursor: pointer;
      }
      .active{
        color:#f04844;
        border:1px #f04844 solid;
      }
    }
    .footer {
      display: flex;
      justify-content: center;
      .btn {
        margin: 0 6px;
        display: block;
        width: 150px;
        height: 45px;
        color: #ffffff;
        background-color: rgba(26, 188, 156, 1);
        line-height: 45px;
        text-align: center;
        font-size: 14px;
        &:hover {
          opacity: 0.9;
        }
      }
      .default{
        background:#f5f5f5;
        border:1px #e4e4e4 solid;
        color: #999999;
        &:hover{
          color:#333333
        }
      }
      .danger{
        background:#f04844;
        border:1px #f04844 solid;
        color: #fff;
        &:hover{
          color:#fff;
        }
      }
    }
  }
}
</style>
