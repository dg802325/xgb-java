<template>
  <div class="bj pt50">
    <div class="container">
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link>
        > <span>{{shpName}}</span>
      </div>
      <div class="sku-list-container" v-if="shopList.length">
        <div class="sku-item-wrapper">
          <div class="sku-group">
            <el-card class="sku-item-card" shadow="hover" v-for="sku in shopList" :key='sku.id'>
              <div class="sku-cover-wrapper sku-cover-list-wrapper" @click="toDetail(sku)">
                <el-image class="sku-cover" :src="sku.imgUrl" fit="contain"></el-image>
              </div>
              <div class="sku-description" @click="toDetail(sku)">
                <p class="name">{{sku.skuName}}</p>
                <p class="purpose">{{sku.skuSharerDescribe}}</p>
                <p class="price">¥{{sku.skuPrice}}</p>
              </div>
            </el-card>
          </div>
          <div class="pagination-wrapper">
            <el-pagination
                prev-text="上一页"
                next-text="下一页"
                background
                @current-change="handleCurrentChange"
                :pager-count="7"
                layout="total, prev, pager, next,jumper"
                :total="pagination.count"
                :page-count="pagination.pages"
                :current-page="pagination.pageNumber"
            ></el-pagination>
          </div>
        </div>
      </div>

      <div class="sku-list-container" v-else>
        <div class="empty">
          <img src="./images/u806.svg"/>
          <p>对不起，没有对应商品</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        shopList: [],
        shpName: '',
        pagination: {
          count: 0,
          pageNumber: 0,
          pageSize: 0,
          pages: 1
        }
      };
    },

    watch: {
      $route() {
        this.getAllSkuPage();
      }
    },
    async mounted() {
      this.getAllSkuPage();
    },
    methods: {
      // // 获取商品
      async getAllSkuPage(page = 1) {
        let shpName = this.shpName =  this.$route.query.val || '';
        let res = await this.$get('/api/getAllSkuPage', {
          shpName,
          currentPage: page
        });
        if (res.code === '200') {
          let shopList = res.shopList;
          this.shopList = shopList.list;
          this.pagination = {
            count: shopList.count,
            pageNumber: shopList.pageNumber,
            pageSize: shopList.pageSize,
            pages: shopList.pages
          }
        } else {
          this.shopList = [];
        }
      },
      handleCurrentChange(page) {
        this.getAllSkuPage(page);
      },
      toDetail(sku) {
        this.$router.push("/detail/" + sku.id);
      }
    }
  };
</script>

<style lang="scss" scpoped>
  .empty {
    padding: 200px 0;
    text-align: center;

    img {
      width: 115px;
      height: 115px;
    }

    p {
      font-size: 20px;
      color: #999999;
      line-height: 42px;
    }
  }

  .sku-types {
    padding: 11px 64px 0;
    margin-bottom: 9px;
    // height: 158px;
    min-height: 58px;
    padding-bottom: 20px;
    //border: 1px #e4e4e4 solid;
    background: #fff;

    dl {
      display: flex;
      line-height: 48px;
      min-height: 48px;
      border-bottom: 1px #ededed solid;
      overflow: hidden;

      dt {
        flex: 0 0 50px;
        padding-left: 11px;
        width: 55px;
        font-size: 12px;
        color: #999999;
      }

      p {
        float: left;
        min-width: 45px;
        padding: 0 10px;
        font-size: 12px;
        text-align: center;

        span {
          cursor: pointer;

          &:hover,
          &.cur {
            color: rgb(26, 188, 156);
          }
        }
      }
    }
  }

  .sku-list-container {
    border: 1px #e4e4e4 solid;
    padding: 32px 64px 40px;
    background: #fff;

    .sort-wrapper {
      height: 60px;

      button {
        margin-right: 10px;
        width: 78px;
        height: 28px;
        border: 1px #e4e4e4 solid;
        background: none;
        cursor: pointer;
        font-size: 12px;
        color: #999999;

        .fa {
          font-size: 14px;
          font-family: FontAwesome;
          color: #999;
        }

        &:hover {
          color: #1abc9c;
          border-color: #1abc9c;

          .fa {
            color: #1abc9c;
          }
        }

        &.cur {
          color: #fff;
          border-color: #1abc9c;
          background: #1abc9c;

          .fa {
            color: #fff;
          }
        }
      }
    }

    .sku-item-wrapper {
      overflow: hidden;

      .sku-group {
        width: 1120px;
        overflow: hidden;
      }

      .sku-item-card {
        margin-right: 50px;
        margin-bottom: 20px;
      }
    }
  }

</style>
