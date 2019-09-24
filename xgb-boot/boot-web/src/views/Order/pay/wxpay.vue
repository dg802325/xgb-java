<template>
  <div style="background: rgb(245, 245, 245);">
    <div class="container c-payment-container">
      <div class="pay-title">微信支付</div>
      <div class="c-border payment-type" style="margin-top:0;height:auto">
        <div class="cr-code">
         <div class="left">
             <div id="qrcode2" ref="qrcode" class="pw-box-hd"></div>
            <div class="pw-box-ft">
              <p data-v-b2b50180="">请使用微信扫一扫</p><p >扫描二维码支付</p>
            </div>
         </div>
         <!-- <div class="p-w-sidebar"></div> -->
        </div>        
      </div>
    </div>
  </div>
</template>

<script>
import QRCode from 'qrcodejs2'
export default {
  data(){
    return {
      orderId: '',
      url:'',
      codeurl: ''
    }
  },
  mounted(){
    let { orderId } = this.$route.params;
    this.orderId = orderId;
    this.pcWxPay(orderId);
  },
  methods:{
    async pcWxPay(orderId){
      this.$post('/api/pcWxPay',{
        orderId
      }).then((res)=>{
        if(res.code==='200'){
          this.$nextTick(async () => {
              let qrcode = new QRCode('qrcode2',{
                  width: 298, // 设置宽度，单位像素
                  height: 298, // 设置高度，单位像素
                  text: res.qrcode   // 设置二维码内容或跳转地址
              })
              qrcode.clear();
              qrcode.makeCode(res.qrcode);
          })
        }
      }).catch(e=>{
        this.$message('请求错误请稍后重试！')
      })
      
    }
  }
};
</script>

<style lang="scss">
#qrcode2{
  width: 298px;
  height: 298px;
}
.cr-code{
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 80px 40px 100px;
  .left{
    width: 298px;
    img{
      width: 298px;
      height: 298px;
    }
  }
  .pw-box-ft p {
    margin: 0;
    font-size: 14px;
    line-height: 22px;
    color: #fff;
    font-weight: 700
  }
  .p-w-sidebar {
    width: 379px;
    height: 421px;
    padding-left: 50px;
    margin-top: -20px;
    background: url(./images/pc_icon_phone-bg.52ecad42.png) 50px 0 no-repeat
  }
}
.pw-box-ft {
    height: 44px;
    padding: 8px 0 8px 125px;
    background: #ff7674 url(./images/123.png) 50px 8px no-repeat
}

.c-payment-container {
  padding-bottom: 20px;
  .pay-title {
    font-size: 16px;
    color: #999999;
    line-height: 80px;
  }
  .payment-info {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 0 40px 0 63px;
    height: 178px;
    background: #fff;
    .l {
      display: flex;
      align-items: center;
      .icon {
        margin-right: 26px;
        .fa {
          font-size: 72px;
          color: #1abc9c;
        }
      }
      h2 {
        padding-bottom: 16px;
        font-size: 24px;
        font-weight: normal;
      }
      p {
        padding-bottom: 4px;
        font-size: 16px;
        color: #999;
        span {
          color: #f04844;
        }
      }
    }
    .price {
      font-size: 14px;
      b {
        font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
        font-weight: 700;
        color: #f04844;
        font-size: 20px;
      }
    }
  }
  .payment-type {
    margin: 20px 0 0;
    background: #fff;
    padding: 0 49px;
    height: 263px;
    .title {
      padding-top: 51px;
      height: 84px;
      font-size: 16px;
      box-sizing: border-box;
      border-bottom: 1px rgb(228, 228, 228) solid;
    }
    dl {
      dt {
        height: 70px;
        padding-top: 27px;
        font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
        font-weight: 700;
        font-size: 16px;
        box-sizing: border-box;
      }
      dd {
        a {
          margin-right: 20px;
          width: 205px;
          height: 60px;
          display: inline-block;
          border: 1px #e4e4e4 solid;
          background:#f9f9f9;
          font-size: 18px;
          color: #999999;
          text-align: center;
          line-height: 58px;
          box-sizing: border-box;
          &:hover{
            border-color: rgba(240, 72, 68, 1);
            color: rgb(240, 72, 68);
          }
        }
      }
    }
  }

}
.pay-dialog-mask{
  position: fixed;
  right:0;
  top:0;
  bottom:0;
  left:0;
  background:rgba(0,0,0,0.34);
  z-index:9998;
}
 .pay-dialog {
    left: 50%;
    top: 50%;
    position: fixed;
    z-index:99999;
    width: 600px;
    height:343px;
    transform: translate(-50%,-50%);
    .header{
      text-align: center;
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight: 700;
      font-size: 20px;
    }
    .close{
      cursor: pointer;
      position: absolute;
      right: 20px;
      top: 20px;
      width: 13px;
      height: 13px;
      background: url(../images/u977.png);
      &:hover{
        background: url(../images/u978.png);
      }
    }
    .body{
      padding: 40px 70px 0 60px;
      display: flex;
      align-items: center;
      .l{
        margin-right: 100px;
      }
      .line{
        height: 30px;
        margin-bottom: 20px;
        border-bottom:1px rgb(228,228,228) solid;
      }
      dl{
        width: 235px;
        dt{
          line-height: 50px;
          color:#999;
          font-size: 24px;
        }
        a{
          font-size:16px;
          color:#1ABC9C;
        }
      }
    }
  }
</style>
