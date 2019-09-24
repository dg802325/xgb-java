<template>
  <div class="bj pt50">
    <div class="container">
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link>>
        <span v-if="firstMap[parentId]">{{firstMap[parentId].categoryName}}</span>
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
        </div>
      </div>

      <div class="sku-list-container" v-else>
        <div class="empty">
          <img src="./images/u806.svg" />
          <p>对不起，对应商品分类或筛选组合下没有商品</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex';
import Cookies from 'js-cookie';

export default {
  data() {
    return {
      parentId: '',
      twoId: '',
      menuId: '',
      categoryThreeList: [],
      tab: 0,
      firstMap: {},
      twoMap: {},
      shopList: [],
      pagination: {
        count: 0,
        pageNumber: 0,
        pageSize: 0,
        pages: 1
      },
      categoryTwoList: []
    };
  },
  computed: {
   ...mapGetters(['firstMenu','twoMenu'])
  },
  watch: {
    $route(){
      this.getData();
    },
    firstMenu(val){
      this.getBreadcrumb(val);
    }
  },
  async mounted(){
    this.getData();
  },
  methods: {
    async getData(){
      const { id } = this.$route.params;
      this.parentId = id;
      this.getRegionCategorySku(id);
      this.getBreadcrumb(this.firstMenu);
    },
    handleCurrentChange(page){
      this.getCategoryTwoSku(page);
    },
    // 根据一级分类ID和省市区ID获取所有商品
    async getRegionCategorySku(categoryId){
      let code = Cookies.get('code');
      let params ={
        categoryId
      };
      if(code){
        params.bbiChinaId = code;
      }
      let res = await this.$get('/api/getRegionCategorySku',params);
      if(res.code==='200'){
        this.shopList = res.shopList;
      }
    },
    // 设置面包屑
    getBreadcrumb(items){
      if(items.length){
        let firstMap = JSON.parse(JSON.stringify(this.firstMap));
        items.forEach(item => {
          if(!firstMap[item.id]) firstMap[item.id] = item;
        });
        let twoMap = JSON.parse(JSON.stringify(this.twoMap));
        let all = [];
        for(let key in this.twoMenu){
          all.push(this.twoMenu[key])
        }
        all = all.flat();
        all.forEach(item=>{
          if(!twoMap[item.id]) twoMap[item.id] = item;
        });
        this.firstMap = firstMap;
        this.twoMap = twoMap;
      }
    },
    toDetail(sku) {
      this.$router.push("/detail/"+sku.id);
    }
  }
};
</script>

<style lang="scss" scpoped>
.empty{
  padding: 200px 0;
  text-align: center;
  img{
    width: 115px;
    height: 115px;
  }
  p{
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
    .sku-group{
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
