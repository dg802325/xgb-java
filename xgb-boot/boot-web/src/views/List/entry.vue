<template>
  <div class="bj pt50">
    <div class="container">
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link>>
        <span v-if="firstMap[parentId]">{{firstMap[parentId].categoryName}}</span> >
        <span v-if="twoMap[twoId]">{{twoMap[twoId].categoryName}}</span>
      </div>
      <div class="sku-types">
        <dl>
          <dt>分类：</dt>
          <dd >
             <!--<p>-->
              <!--<span :class="{'cur':twoId=='-1'}" @click="menuClick('-1')">全部</span>-->
            <!--</p>-->
            <p v-for='menu in categoryTwoList' :key='menu.id'>
              <span :class="{'cur':twoId==menu.id}" @click='menuClick(menu.id)'>{{menu.categoryName}}</span>
            </p>
          </dd>
        </dl>
      </div>
      <div class="sku-list-container" v-if="shopList.length">
        <div class="sort-wrapper">
          <button :class="{'cur':tab==0}" @click="tab=0">最新商品</button>
          <button :class="{'cur':tab==1}" @click="tab=1">最高人气</button>
          <button :class="{'cur':tab==2}" @click="tab=2">
            价格排序
            <span class="arrow fa fa-sort"></span>
          </button>
        </div>
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
      twoId: '-1',
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
      const { parentId, id } = this.$route.params;
      this.twoId = id;
      if(parentId!==this.parentId){
        this.parentId = parentId;
        await this.getCategoryTwoList(parentId);
      }
    /*  if(id === '-1'){
        this.getRegionCategorySku(parentId);
      }else{
        this.getCategoryTwoSku();
      }*/
      this.getCategoryTwoSku();
      this.getBreadcrumb(this.firstMenu);
    },
    // 根据一级分类ID和省市区ID获取所有商品
    async getRegionCategorySku(categoryId){
      let res = await this.$get('/api/getRegionCategorySku',{
        categoryId
      });
      if(res.code==='200'){
        this.shopList = res.shopList;
      }
    },
    //  获取二级分类
    async getCategoryTwoList(parentId){
      let res = await this.$get('/api/getCategoryTwoList',{
        parentId
      });
      if(res.code==='200'){
        this.categoryTwoList = res.categoryTwoList;
      }
    },
    // 根据二级分类ID获取所有商品
    async getCategoryTwoSku(currentPage=1){
      let params = {
        currentPage,
        categoryId: this.twoId
      };
      let code = Cookies.get('code');
      if(code){
        params.divisionCode = code;
      }
      let res = await this.$get('/api/getCategoryTwoSku',params);
      if(res.code==='200'){
        const shopList = res.shopList
        this.shopList = shopList.list;
        this.pagination = {
          count: shopList.count,
          pageNumber: shopList.pageNumber,
          pageSize: shopList.pageSize,
          pages: shopList.pages
        }
      }else{
        this.shopList = [];
      }
    },
    handleCurrentChange(page){
      this.getCategoryTwoSku(page);
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
    menuClick(id){
      this.$router.push(`/list/${this.parentId}/${id}`);
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
