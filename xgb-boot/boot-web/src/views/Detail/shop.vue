<template>
  <div class="bj pt22">
    <div class="container">
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link>
        >
        <span>店铺详情</span>
      </div>
      <div class="shop-desc">
        <div class="l">
          <!--<div class="badge-group">
            <span class="badge-item">制造商直供</span>
          </div>-->
          <img :src="store.storeMain">
        </div>
        <div class="r">
          <div class="sku-info">
            <dl class="r-t">
              <dt>
                <img src="./images/h.jpg">
              </dt>
              <dd>
                <p>{{store.storeName}}</p>
                <p class="desc"></p>
              </dd>
            </dl>
            <div class="r-b">
              <p>
                <span style="font-family: '微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';">品牌故事：</span>{{store.storeStory}}
              </p>
            </div>
          </div>
        </div>
      </div>
      <div class="shop-intelligence" v-if="storeResources.length">
        <h2>相关资质</h2>
        <ul class="list">
          <li v-for="item in storeResources" :key="item.id">
            <img :src="item.imgResource">
          </li>
        </ul>
      </div>
      <div class="sku-items" v-if="skuList.length">
        <div class="t">
          <p>
            店铺商品
            <span>{{skuList.length}}</span>
          </p>
          <!--<router-link to="/list">查看全部 ></router-link>-->
        </div>
        <div class="c">
          <el-card class="sku-item-card" v-for="sku in skuList" :key="sku.id" shadow="hover">
            <div class="sku-cover-wrapper" @click="toDetail(sku.id)">
              <el-image class="sku-cover" :src="sku.imgUrl" fit="contain"></el-image>
            </div>
            <div class="sku-description" @click="toDetail(sku.id)">
              <p class="name">{{sku.skuName}} </p>
              <p class="purpose">{{sku.skuSharerDescribe}}</p>
              <p class="price">¥{{sku.skuPrice}}</p>
            </div>
          </el-card>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import skuImg from './images/sku.png';

  export default {
    data() {
      return {
        skuImg,
        store: {},
        storeResources: [],
        skuList: []
      }
    },
    created(){
      const {storeId} = this.$route.params;
      this.getStoresInfo(storeId);
      this.getStoresSku(storeId);
    },
    methods: {
      // 查询店铺详情
      async getStoresInfo(storeId) {
        let res = await this.$get('/api/getStoresInfo', {
          id: storeId
        });
        if(res.code==='200'){
          this.store = res.store[0];
          this.storeResources = res.storeResources
        }
      },
      toDetail(id) {
        this.$router.push('/detail/'+id)
      },
      // 获取所有店铺商品
      async getStoresSku(storeId){
        let res = await this.$get('/api/getStoresSku',{
          storeId
        });
        if(res.code==='200'){
          this.skuList = res.skuList;
        }
      }
    }
  };
</script>

<style lang="scss">
  .shop-desc {
    height: 329px;
    display: flex;

    .l {
      position: relative;
      flex: 0 0 600px;
      background: #fff;

      .badge-group {
        position: absolute;
        left: 24px;
        top: 20px;

        .badge-item {
          display: inline-block;
          background: #666666;
          color: #fff;
          padding: 0 7px;
          font-size: 11px;
          line-height: 20px;
          border-radius: 15px;
        }
      }

      img {
        width: 100%;
        height: 100%;
      }
    }

    .r {
      flex: 1;
      background: #fff;
      padding: 23px 30px 0 23px;

      .sku-info {
        .r-t {
          display: flex;
          height: 103px;

          img {
            width: 80px;
            height: 80px;
            border-radius: 50%;
            overflow: hidden;
          }

          dd {
            padding: 2px 0 0 28px;

            p {
              font-size: 14px;
              color: #999999;
              line-height: 25px;
            }

            .desc {
              font-size: 12px;
            }
          }
        }

        .r-b {
          padding-left: 7px;

          p {
            line-height: 28px;
            font-size: 14px;
            color: #999999;

            span {
              font-weight: 700;
              color: #999999;
            }
          }
        }
      }
    }
  }

  .shop-intelligence {
    margin: 32px 0 25px;
    border: 1px #e4e4e4 solid;
    background: #fff;
    padding: 0 48px;
    min-height: 313px;

    h2 {
      height: 52px;
      padding-top: 36px;
      font-size: 16px;
    }

    .list {
      overflow: hidden;

      li {
        float: left;
        padding: 0 35px 22px 0;
        width: 171px;
        height: 201px;

        img {
          display: block;
          width: 171px;
          height: 201px;
        }
      }
    }
  }

  .sku-items {
    border: 1px #e4e4e4 solid;
    background: #fff;

    .t {
      height: 94px;
      display: flex;
      justify-content: space-between;
      padding: 35px 51px 0 48px;
      box-sizing: border-box;

      p {
        font-size: 16px;
        color: #666666;

        span {
          color: #f04844;
        }
      }

      a {
        padding-top: 2px;
      }
    }

    .c {
      padding: 0 0 31px 64px;
      overflow: hidden;

      .sku-item-card {
        margin-right: 50px;
        margin-bottom: 20px;
      }
    }
  }
</style>
