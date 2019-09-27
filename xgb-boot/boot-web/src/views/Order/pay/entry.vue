<template>
  <div style="background: rgb(245, 245, 245);">
    <div class="container c-payment-container">
      <div class="pay-title">支付订单</div>
      <div class="c-border payment-info" >
        <div class="l">
          <div class="icon">
            <i class="fa fa-check-circle-o"></i>
          </div>
          <div class="info">
            <h2>订单提交成功！请尽快完成支付。</h2>
            <p>
              请在
              <span>{{message}}</span> 内完成支付, 超时后将取消订单
            </p>
          </div>
        </div>
        <div class="price">
          <p>
            应付总额：
            <b>¥{{amountPayable | toFixed}}</b>
          </p>
        </div>
      </div>
      <div class="c-border payment-type">
        <div class="title">选择以下支付方式付款</div>
        <dl>
          <dt>支付平台</dt>
          <dd>
             <!--<a href="javascript:;" @click="wxPay">微信支付</a>-->
            <a href="javascript:;" @click="alPay">支付宝</a>
            <a href="javascript:;" @click="unionPay">银联快捷支付</a>
          </dd>
        </dl>
      </div>
    </div>
    <div class="pay-dialog-mask" v-show="visible" @click="visible=false"></div>
    <el-card shadow="always" v-show="visible" class="pay-dialog ">
      <div class="close"  @click="visible=false" ></div>
      <div class="header">正在支付订单</div>
      <div class="body">
        <div class="l">
           <img src="../images/u2186.png" />
        </div>
        <div class="r">
          <dl>
            <dt>支付成功了</dt>
            <dd>
              <router-link to="/center/order">立即查看订单详情 ></router-link>
            </dd>
          </dl>
          <div class="line"></div>
          <dl>
            <dt>支付失败了</dt>
            <dd>
              <a href="javascript:;">查看支付常见问题 ></a>
            </dd>
          </dl>
        </div>

      </div>
    </el-card>
  </div>
</template>

<script>


const toDou = n => {
  return n > 9 ? n : '0' + n
}
export default {
  data(){
    return {
      visible: false,
      amountPayable: 0,
      orderCancelTime: 0,
      message: '',
      orderId: '',
      targetTime: 0,
      timer: null
    }
  },
  created(){
    const {orderId,amountPayable,orderCancelTime} = this.$route.params;
    this.orderCancelTime = orderCancelTime;
    this.amountPayable = amountPayable;
    this.orderId = orderId;
    this.showChangeTime(orderCancelTime);
  },
  filters: {
    toFixed(val){
      if(typeof val ==='string'){
        return Number(val).toFixed(2)
      }else if(typeof val === 'number'){
        return val.toFixed(2)
      }
      return val;
    }
  },
  methods:{
    showChangeTime(orderCancelTime){
      if (orderCancelTime){
        let oTarget = new Date(orderCancelTime);
        this.targetTime = oTarget.getTime();
        this.tick();
        this.timer = setInterval(()=>{
          this.tick();
        },1000)
      }
    },
    tick(){
      let oDate = new Date();
      let sToday=oDate.getTime();
      let dis = parseInt((this.targetTime-sToday)/1000);
      if(dis<=0){
        clearInterval(this.timer);
        this.message ="0小时0分0秒";
        return;
      }
      let d = parseInt(dis/86400);
      let s =dis%86400;
      let h = parseInt(s/3600);
      s=s%3600;
      let m = parseInt(s/60);
      s=s%60;
      if(d>0){
        this.message = d+"天"+h+"时"+toDou(m)+"分"+toDou(s)+"秒"
      }else{
        this.message = h+"小时"+toDou(m)+"分"+toDou(s)+"秒"
      }
    },
    wxPay(){
      // this.open('/wx/'+this.orderId);
      // this.visible = true;
      // let timer = setInterval(async ()=>{
      //   let res = await this.$get('/api/queryOcSettlementState',{
      //     orderId:this.orderId
      //   })
      //   console.log(res)
      // },1000)
      // this.$router.push('/wxpay/'+this.orderId)
    },
    unionPay(){
      // this.open('/b2bUnion/'+this.orderId+'/'+this.amountPayable);
      this.$router.push('/b2bUnion/'+this.orderId+'/'+this.amountPayable)
    },
    alPay(){
      // this.visible = true;
      //this.open('/alpay/'+this.orderId);
      this.$router.push('/alpay/'+this.orderId)
    },
     open(url){
      let oLink = document.createElement('a');
      oLink.setAttribute('href',url);
      oLink.setAttribute('target','_blank');
      oLink.style.display= 'none'
      document.body.appendChild(oLink)
      oLink.click();
    }
  }
};
</script>

<style lang="scss">
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
