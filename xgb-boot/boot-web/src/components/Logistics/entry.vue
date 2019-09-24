<template>
  <div class="logistics-model">
    <div class="m-logistics-container">
      <div class="header">
        查看物流
        <span class="close" @click="closeEvent">
          <img src="./images/u977.png"/>
        </span>
      </div>
      <div class="body">
        <div class="sku">
          <img src="./images/u978.png"/>
          <span class="num">2件商品</span>
        </div>
        <div class="list">
          <p><span class="label">配送企业：</span><span class="value">顺丰快递心连心南京秦淮区旗舰店</span></p>
          <p><span class="label">货车车牌：</span><span class="value">苏A12345</span></p>
          <p><span class="label">联系电话：</span><span class="value">13212341234</span></p>
          <p><span class="label">发货日期：</span><span class="value">2018-11-11   11:11:11</span></p>
          <p><span class="label">收货日期：</span><span class="value">2018-11-12   11:11:11</span></p>
        </div>
      </div>
      <div class="footer">
        <a href="javacript:;" class="btn" @click="closeEvent">确定</a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods:{
    closeEvent(){
      this.$emit('close')
    }
  }
}
</script>

<style lang="scss">
.logistics-model{
  position: fixed;
  left:0;
  top: 0;
  bottom:0;
  right:0;
  z-index:99999;
  background: rgba(0,0,0,0.34);
  .m-logistics-container{
    position: fixed;
    left:50%;
    top: 50%;
    transform: translate(-50%,-50%);
    width: 600px;
    padding-bottom: 10px;
    min-height: 299px;
    background-color: rgba(255, 255, 255, 1);
    border-radius: 3px;
    box-shadow: 0px 0px 5px rgba(51, 51, 51, 0.34);
    font-size: 20px;
    .header{
      position: relative;
      padding: 17px 0;
      text-align: center;
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight: 700;
      font-size: 20px;
      .close{
        position: absolute;
        right:20px;
        top: 20px;
        cursor: pointer;
      }
    }
    .body{
      margin: 5px 32px 22px;
      padding: 16px 0 0 35px;
      background:#f9f9f9;
      border:1px #ededed solid;
      overflow: hidden;
      .sku{
        float:left;
        position: relative;
        width: 80px;
        height:80px;
        margin-right: 24px;
        img{
          display: block;
          width: 80px;
          height:80px;
        }
        .num{
          position: absolute;
          left:0;
          bottom:0;
          width: 100%;
          line-height: 20px;
          height:20px;
          background:#666666;
          color:#fff;
          font-size: 12px;
          text-align: center;
          font-style: normal;
          font-family: 微软雅黑;
        }
      }
      .list{
        float: left;
        p{
          display: flex;
          height: 28px;
          span{
            font-size: 14px;
            color: #999999;
          }
          .label{
            font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
            font-weight: 700;
          }
        }
      }
    }
    .footer{
      display: flex;
      justify-content: center;
      .btn{
        display: block;
        width: 150px;
        height: 45px;
        color: #FFFFFF;
        background-color: rgba(26, 188, 156, 1);
        line-height: 45px;
        text-align: center;
        font-size: 14px;
        &:hover{
          opacity: 0.9;
        }
      }
    }
  }
}
</style>
