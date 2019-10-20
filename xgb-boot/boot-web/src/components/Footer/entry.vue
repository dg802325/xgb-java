<template>
  <div class="footer-container">
<!--    <div class="container top">-->
<!--      <div class="app">-->
<!--        <dl>-->
<!--          <dt>下载APP</dt>-->
<!--          <dd>-->
<!--            <img src="./images/u9.png"/>-->
<!--            <p>-->
<!--              扫描二维码下载e农商城APP-->
<!--            </p>-->
<!--          </dd>-->
<!--        </dl>-->
<!--      </div>-->
<!--      <div class="tal-wrapper">-->
<!--          <p class="title">服务热线</p>-->
<!--          <p class="tal">400-1126-800</p>-->
<!--          <p>周一至周日 8:00-18:00</p>-->
<!--          <p>（仅收市话费）</p>-->
<!--      </div>-->
<!--    </div>-->
<!--    <div class="bottom">-->
<!--      <div class="container">-->
<!--        <ul>-->
<!--          <li>30天无忧退换货</li>-->
<!--          <li style="width:330px;"><img src="./images/u14.png"/>满88元免邮费</li>-->
<!--          <li><img src="./images/u16.png" style="margin-right:22px;"/>e农商城品质保证</li>-->
<!--        </ul>-->
<!--        <p class="copyright ">-->
<!--          CopyRight &copy; 京ICP备16000129号-3 e农商城 2015 - 2019-->
<!--          <router-link to="/business" class="business-link">商家中心</router-link>-->
<!--        </p>-->
<!--      </div>-->
<!--    </div>-->
<!--    <div class="suspension">-->
<!--      <div class="item">-->
<!--        <i class="fa fa-arrow-circle-o-up" @click="backtopEvent"></i>-->
<!--        <p>返回顶部</p>-->
<!--      </div>-->
<!--      <div class="item">-->
<!--        <div class="app-code">-->
<!--          <img src="./images/u90.png"/>-->
<!--          <p>扫描二维码下载e农商城APP</p>-->
<!--        </div>-->
<!--        <i class="fa fa-mobile"></i>-->
<!--        <p>下载APP</p>-->
<!--      </div>-->
<!--    </div>-->
  </div>
</template>

<script>
const scrollToTop = () => {
  const y = document.documentElement.scrollTop || document.body.scrollTop;
  if (y > 0) {
    window.requestAnimationFrame(scrollToTop);
    window.scrollTo(0, y - y / 8);
  }
};
export default {
  methods: {
    backtopEvent(){
      scrollToTop();
    }
  }
}
</script>

<style lang="scss" scoped>
.footer-container{
  border-top: 1px #e4e4e4 solid;
  .top{
    display: flex;
    padding: 49px 0 0 0;
    height: 200px;
    .app{
      flex: 0 0 186px;
      padding:0 55px 0 191px;
      height: 186px;
      border-right: 1px #f2f2f2 solid;
      dl{
        dt{
          line-height: 25px;
          font-size: 16px;
          color: #999;
          padding-bottom: 17px;
          text-indent: 82px;
        }
        dd{
          display: flex;
          img{
            margin-right: 23px;
            width: 100px;
            height: 100px;
          }
          p{
            width: 85px;
            padding-top: 8px;
            line-height: 20px;
            font-size: 12px;
            color: #999999;
          }
        }
      }
    }
    .tal-wrapper{
      flex: 0 0 231px;
      width: 231px;
      padding-left: 349px;
      text-align: center;
      .title{
        font-size: 16px;
        color: #999;
        line-height: 24px;
        height: 25px;
      }
      p{
        font-size: 14px;
        color: #999999;
        line-height: 28px;
      }
      .tal{
        padding-top: 25px;
        font-size: 20px;
        font-weight: 700;
        color: #666666;
        font-family: 'Arial Negreta', 'Arial Normal', 'Arial';
      }
    }
  }
  .bottom{
    background:#333;
    height: 300px;
    ul{
      padding: 46px 0 46px 149px;
      display: flex;
      border-bottom: 1px #434343 solid;
      li{
        width: 323px;
        display:flex;
        align-items: center;
        font-size: 24px;
        color: #fff;
        img{
          margin-right: 14px;
        }
      }
    }
    .copyright{
      padding-top: 71px;
      font-size: 13px;
      color: #999999;
      text-align: center;
    }
  }
}
.suspension{
  position: fixed;
  right: 10px;
  bottom: 5px;
  z-index:22;
  .item{
    width: 78px;
    height: 78px;
    margin-bottom: 5px;
    font-size: 14px;
    padding-top: 14px;
    text-align: center;
    box-sizing: border-box;
    background: #fff;
    border:1px rgba(242, 242, 242, 1) solid;
    cursor: pointer;
    .app-code{
      display: none;
      position: absolute;
      right: 85px;
      bottom: 0px;
      width: 236px;
      height: 246px;
      background: url(./images/u169.png) no-repeat;
      img{
        margin:5px 0 0 8px;
        float: left;
        width: 205px;
        height: 205px;
      }
      p{
        clear: both;
        padding-left: 30px;
        font-size: 12px;
        color: #999999;
        text-align: left;
        line-height: 1;
        &:hover{
           color: rgb(204, 204, 204) !important;
        }
      }
      &:hover p{
        color: #999999;

      }
    }
    &:hover .app-code{
      display: block
    }
    &:hover .app-code p{
      color: #999999;
    }
    .fa{
      font-size: 36px;
      font-family: FontAwesome;
      font-weight: 400;
      color: rgb(204, 204, 204);
    }
    p{
      font-size: 12px;
      line-height: 20px;
      color: rgb(153, 153, 153);
    }
    &:hover{
      .fa,
      p{
        color: rgb(26, 188, 156);
      }
    }
  }
}
</style>
