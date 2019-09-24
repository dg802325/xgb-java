<template>
  <div>
    <div class="container" >
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link>  >
        <span>{{sku.skuName}}</span>
      </div>
      <div class="sku-info">
        <div class="sku-banner">
          <div class="sku-banner-wrapper">
            <ul ref="skuBannerWrapper">
              <li v-for='url in skuResources' :key='url.ID'><img :src="url.resourcesUrl"/></li>
            </ul>
          </div>
          <div class="switch-button">
            <p
                v-for="(item,index) in skuResources"
                :key="item.ID"
                :class="{'active':index===currentIndex}"
                @mouseover="currentIndex=index"
            ><img :src="item.resourcesUrl" style='width:76px;height:76px'/></p>
          </div>
        </div>
        <div class="sku-info-r">
          <div class="t">
            <div class="t-l">
              <h1 style="font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';">{{sku.skuName}} {{sku.specification}}{{sku.dictName}} / {{sku.auxiliaryDictName}}</h1>
              <p>{{sku.skuSharerDescribe}}</p>
            </div>
            <div class="t-r">
              <div class="price new-price">
                <p v-if='sku.skuPrice' class="value" style="font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';">
                  <span>¥</span>{{sku.skuPrice.toFixed(2)}}
                </p>
                <p class="label">商品价格</p>
              </div>
              <!-- <div class="price old-price">
                <p class="value" style="font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';"><span>¥</span>249</p>
                <p class="label">商品价格</p>
              </div> -->
            </div>
          </div>
          <!--<div class="m">-->
          <!--<div class="item border">-->
          <!--<i class="fa fa-flag"></i>-->
          <!--<p class="label">销量人气</p>-->
          <!--<p class="value">9999+</p>-->
          <!--</div>-->
          <!--<div class="item" style="width:127px">-->
          <!--<i class="fa fa-commenting"></i>-->
          <!--<p class="label">商品评价</p>-->
          <!--<p class="value">9999+</p>-->
          <!--</div>-->
          <!--</div>-->
          <div class="b">
            <div class="item" v-if="sku.storeId">
              <p>店铺名称<p><p>{{sku.storeName}}</p><router-link :to="'/shop/'+sku.storeId">店铺详情</router-link>
            </div>
            <!--<div class="item">-->
            <!--<p>客服电话<p><p>13222051234</p>-->
            <!--</div>-->
            <div class="item">
              <p>购买数量</p><el-input-number   size="small" v-model="num" :min="1"></el-input-number>
            </div>
            <div class="sku-button">
              <button class="button join" @click="addCart">
                加入购物车
              </button>
              <button class="button buy" @click="buyEvent">
                立即购买
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="sku-descration">
      <div class="container">
        <div class="l">
          <div class="border">
            <div class="title-wrapper">
              <p class="title">商品详情</p>
              <!--<router-link to="/evaluate" class="evaluate">-->
                <!--<i class="fa fa-commenting"></i>-->
                <!--<p class="label">商品评价</p>-->
                <!--<p class="value">9999+</p>-->
              <!--</router-link>-->
            </div>
            <div class="desc">
              <ul class="types">
                <li v-for='(item,index) in paramenters' :key='index'><span class="label">{{item.key}}</span><span class="value">{{item.value}}</span></li>
                <!-- <li><span class="label">商品编号</span><span class="value">26968836871</span></li>
                <li><span class="label">商品毛重</span><span class="value">{{sku.weight}}g</span></li>
                <li><span class="label">货号</span><span class="value">548574458659</span></li>
                <li><span class="label">类型</span><span class="value">普通农膜</span></li>
                <li><span class="label">施用方法</span><span class="value">底施，追施，冲施</span></li>
                <li><span class="label">适用作物</span><span class="value">家庭园艺，粮食作物</span></li> -->
              </ul>
              <div class="image-wrapper" v-html='sku.skuExplain'>
              </div>
            </div>
          </div>
          <div class="border sku-tip-wrapper">
            <div class="title-wrapper">
              <p class="title">注意事项</p>
            </div>
            <div class="sku-tip-context">
              <p><b style="font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';">• 购买运费如何收取？</b></p>
              <p>单笔订单金额(不含运费)满88元免邮费；不满88元，每单收取10元运费。（港澳台地区需满500元免邮费；不满500元，每单收取30元运费)</p>
              <div class="empty"></div>
              <p><b style="font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';">• 使用什么快递发货?</b></p>
              <p>默认使用顺丰快递发货(个别商品使用其他快递）</p>
              <p>配送范围覆盖全国大部分地区(港澳台地区除外）。</p>
              <div  class="empty"></div>
              <p><b style="font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';">• 如何申请退货?</b></p>
              <p>1.自收到商品之日起30日内，顾客可申请无忧退货，退款将原路返还，不同的银行处理时间不同，预计1-5个工作日到账；</p>
              <p>2.内裤和食品等特殊商品无质量问题不支持退货；</p>
              <p>3.退货流程：</p>
              <p>确认收货-申请退货-客服审核通过-用户寄回商品-仓库签收验货-退款审核-退款完成；</p>
              <p>4.因e农商城产生的退货，如质量问题，退货邮费由e农商城承担，退款完成后会以现金券的形式报销。因客户个人原因产生的退货，购买和寄回运费由客户个人承担。</p>
            </div>
          </div>
        </div>
        <div class="r">
          <div class="border">
            <div class="title-wrapper">
              <p class="title">店铺其他商品</p>
            </div>
            <div class="items">
              <el-card class="sku-item-card" shadow="never">
                <div class="sku-cover-wrapper">
                  <div class="discount">享9折</div>
                  <el-image
                      class="sku-cover"
                      :src="skuImg"
                      fit="contain"
                  >
                  </el-image>
                </div>
                <div class="sku-description">
                  <p class="name">女式超柔软拉毛运动开衫</p>
                  <p class="purpose">匠心剪裁，垂感质地</p>
                  <p class="price">¥249</p>
                </div>
              </el-card>
              <el-card class="sku-item-card" shadow="never">
                <div class="sku-cover-wrapper">
                  <div class="discount">享9折</div>
                  <el-image
                      class="sku-cover"
                      :src="skuImg"
                      fit="contain"
                  >
                  </el-image>
                </div>
                <div class="sku-description">
                  <p class="name">女式超柔软拉毛运动开衫</p>
                  <p class="purpose">匠心剪裁，垂感质地</p>
                  <p class="price">¥249</p>
                </div>
              </el-card>
              <el-card class="sku-item-card" shadow="never">
                <div class="sku-cover-wrapper">
                  <div class="discount">享9折</div>
                  <el-image
                      class="sku-cover"
                      :src="skuImg"
                      fit="contain"
                  >
                  </el-image>
                </div>
                <div class="sku-description">
                  <p class="name">女式超柔软拉毛运动开衫</p>
                  <p class="purpose">匠心剪裁，垂感质地</p>
                  <p class="price">¥249</p>
                </div>
              </el-card>
              <el-card class="sku-item-card" shadow="never">
                <div class="sku-cover-wrapper">
                  <div class="discount">享9折</div>
                  <el-image
                      class="sku-cover"
                      :src="skuImg"
                      fit="contain"
                  >
                  </el-image>
                </div>
                <div class="sku-description">
                  <p class="name">女式超柔软拉毛运动开衫</p>
                  <p class="purpose">匠心剪裁，垂感质地</p>
                  <p class="price">¥249</p>
                </div>
              </el-card>

            </div>
          </div>
        </div>
        <div class="clear"></div>
      </div>
    </div>
  </div>

</template>

<script>
  import skuImg from './images/sku.png';
  import { getToken } from '../../utils/auth';
  import { mapActions } from 'vuex';
  export default {
    data(){
      return {
        num: 1,
        currentIndex: 0,
        skuImg,
        skuResources: [],
        sku: {},
        paramenters: []
      }
    },
    watch:{
      currentIndex(index){
        this.$refs.skuBannerWrapper.style.marginLeft= index*-430+'px';
      },
      $route(){
        this.getSkuInfo();
      }
    },
    mounted(){
      this.getSkuInfo();
    },
    methods: {
      buyEvent(){
        let token = getToken();
        if(!token){
          this.$router.push('/login')
          return;
        }
        this.$router.push(`/order/${this.sku.id}/${this.num}`)
      },
      // 添加到购物车
      async addCart(){
        let token = getToken();
        if(!token){
          this.$router.push('/login')
          return;
        }
        let res = await this.$post('/api/addCart',{
          token,
          skuId: this.sku.id,
          commonityCount: this.num
        })
        this.$$message(res.message,res.code);
        this.queryCartList();
      },
      // 获取商品信息
      async getSkuInfo(){
        let { id } = this.$route.params;
        let res = await this.$get('/api/getSkuInfo',{
          id
        });
        console.log(res);
        if(res.code==='200'){
          this.skuResources = res.SkuResources;
          this.sku = res.Sku;
          this.$refs.skuBannerWrapper.style.width= res.SkuResources.length*430+'px';
          let paramentersList = res.paramentersList || [];
          let paramenters = [];
          paramentersList.forEach(item=>{
            paramenters.push({
              key: item.paramName,
              value: item.parametersName
            })
          })
          this.paramenters = paramenters;
        }
      },
      ...mapActions(['queryCartList'])
    }
  }
</script>

<style lang="scss" >
  .sku-info{
    display: flex;
    padding-bottom: 35px;
    .sku-banner{
      flex: 0 0 520px;
      display: flex;
      .sku-banner-wrapper{
        flex: 0 0 430px;
        width: 430px;
        height: 430px;
        overflow: hidden;
      }
      ul{
        transition: all .5s;
        height: 430px;
        overflow: hidden;
        background:#e4e4e4;
        li{
          float: left;
          img{
            width: 430px;
            height: 430px;
          }
        }
      }
    }
    .switch-button{
      margin-left: 10px;
      flex: 0 0 80px;
      p{
        display: flex;
        align-items: center;
        justify-content: center;
        width: 80px;
        height: 80px;
        background:#e9e9e9;
        box-sizing: border-box;
        margin-bottom: 7px;
        .fa{
          font-size: 36px;
          color: #FFFFFF;
        }
        &.active{
          border: 2px #e67757 solid;
          background: #fff;
          .fa{
            color:#e67757;
          }
        }
      }
    }
    .sku-info-r{
      padding-left: 30px;
      flex:1;
      .t{
        height: 96px;
        display: flex;
        justify-content: space-between;
        .t-l{
          h1{
            font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';
            font-weight: 700;
            font-size: 18px;
            line-height: 37px;
          }
          p{
            width: 400px;
            font-size: 16px;
            color: #999999;
            line-height: 35px;
            white-space: nowrap;
            text-overflow: ellipsis;
            overflow: hidden;
          }
        }
        .t-r{
          display: flex;
          .price{
            width: 108px;
            padding-right: 11px;
            text-align: right;
            .value{
              line-height: 42px;
              font-weight: 700;
              color: #F04844;
              font-size: 28px;
              font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';
              span{
                font-family: '微软雅黑';
                font-weight: 400;
                font-size: 14px;
                color: #F04844;
              }
            }
            .label{
              font-family: '微软雅黑';
              color: #999999;
              font-size: 14px;
            }
          }
          .old-price{
            .value{
              position: relative;
              color: #666666;
              span{
                color: #666666;
              }
              &::after{
                position: absolute;
                right:-11px;
                top: 23px;
                content: '';
                width: 75px;
                height: 2px;
                background: url(./images/u1038.png) no-repeat;
              }
            }
          }
        }
      }
      .m{
        display: flex;
        background:#f9f9f9;
        padding: 11px 0 0 4px;
        height: 99px;
        border:1px #f2f2f2 solid;
        .item{
          width: 130px;
          text-align: center;
          i{
            font-family: 'FontAwesome';
            font-weight: 400;
            color: #F04844;
            font-size: 20px;
            line-height: 24px;
          }
          .label{
            line-height: 29px;
            color:#999;
          }
          .value{
            line-height: 19px;
            font-size: 14px;
          }
          &.border{
            border-right:1px #f2f2f2 solid
          }
        }
      }
      .b{
        padding: 12px 0 0;
        .item{
          /*padding-left: 30px;*/
          line-height: 50px;
          height: 50px;
          p{
            float: left;
            padding-right: 16px;
            font-size: 14px;
          }
          a{
            color: #1abc9c;
          }
          a:hover{
            text-decoration: underline;
          }
        }
        .sku-button{
          padding:20px 0 0 70px;
          .button{
            margin-right: 20px;
            border:1px #f04844 solid;
            width: 150px;
            height: 40px;
            background:none;
            box-sizing: border-box;
            cursor: pointer;
            font-size: 14px;
            &.join{
              background:#f04844;
              color:#fff;
            }
            &.buy{
              color:#f04844;
            }
            &:hover{
              opacity: 0.8;
            }
          }
        }
      }
    }
  }
  .sku-descration{
    padding:12px 0;
    background:#f5f5f5;
    .l{
      float: left;
      width: 910px;

    }
    .r{
      width: 270px;
      float: right;
      box-sizing: border-box;
      .title-wrapper{
        display:flex;
        justify-content: center;
        .title{
          padding-left:0;
        }

      }
      .items{
        background:#fff;
        padding: 20px 19px 0;
        overflow: hidden;
        .sku-item-card{
          margin-bottom: 20px;
        }
        .sku-cover-wrapper .sku-cover{
          width:47%;
        }
      }
    }
    .border{
      border:1px #e4e4e4 solid
    }
    .title-wrapper{
      display: flex;
      justify-content: space-between;
      align-items: center;
      height: 48px;
      background: #f9f9f9;
      border-bottom:1px #e4e4e4 solid;
      .title{
        padding-left: 19px;
        font-size: 16px;
        color: #999999;
      }
      .evaluate{
        display: flex;
        align-items: center;
        justify-content: center;
        height: 48px;
        width:172px;
        border-left:1px #e4e4e4 solid;
        cursor: pointer;
        .fa{
          font-family: 'FontAwesome';
          font-weight: 400;
          font-size: 14px;
          color: #999999;
        }
        .label{
          padding: 0 3px;
          font-weight: 400;
          font-size: 14px;
          color: #999999;
        }
        .value{
          font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';
          font-weight: 700;
          font-size: 14px;
          color: #F04844;
        }

      }

    }
    .desc{
      background:#fff;

      .types {
        padding: 20px 0 24px 19px;
        overflow: hidden;
        li{
          float: left;
          width: 283px;
          margin-right: 11px;
          line-height: 44px;
          border-bottom: 1px #f2f2f2 solid;
          font-size: 14px;
          .label{
            display: inline-block;
            padding-left: 10px;
            width: 85px;
            color: #999999;
          }
        }
      }
      .image-wrapper{
        padding: 0 19px 20px;
        img{
          width: 100%;
        }
      }

    }
    .sku-tip-wrapper{
      margin: 19px 0 0;
      .sku-tip-context{
        background:#fff;
        padding: 16px 19px 0;
        height: 440px;
        .empty{
          height: 27px;
        }
        p{
          font-size: 14px;
          line-height: 29px;
          height: 29px;
          color: #999999;
          b{
            font-size: 14px;
            font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';
            font-weight: 700;
            color: #999999;
          }
        }
      }
    }
  }
</style>
