<template>
  <div class="home-container">
    <div class="container banner-container">
      <el-carousel :interval="5000" arrow="always" >
        <el-carousel-item v-for="item in bannerList" :key="item.id">
          <img :src="item.adverImage" style="width:1200px;height: 430px"/>
        </el-carousel-item>
      </el-carousel>
    </div>
     <div class="container" v-if="shpSkuRecommendList.length">
       <div class="title-container">
         <div class="title">
           <p>热销商品</p>
         </div>
       </div>
     </div>
     <div class="container special-offer">
       <el-card class="sku-item-card" shadow="hover" v-for="sku in shpSkuRecommendList" :key="sku.id">
         <div class="sku-cover-wrapper" @click="toDetail(sku.skuId)">
           <el-image
             class="sku-cover"
             :src="sku.skuImg"
             fit="contain"
           >
           </el-image>
         </div>
         <div class="sku-description" @click="toDetail(sku.skuId)">
           <p class="name">{{sku.skuName}}</p>
           <p class="purpose">{{sku.skuSharerDescribe}}</p>
           <p class="price">¥{{sku.skuPrice}}</p>
         </div>
       </el-card>

     </div>
    <div  v-for='first in goodsList' :key="first.id">
      <div class="container">
        <div class="title-container">
          <div class="title">
            <p>{{first.categoryName}}</p>
          </div>
          <div class="switch-button-wrapper">
            <router-link :to="'/classify/'+first.id" class="check-more">查看更多<i class="fa fa-chevron-right"></i></router-link>
          </div>
        </div>
      </div>
      <div class="container recommend-container">
        <div class="recommend-wrapper">
          <el-card class="sku-item-card" shadow="hover" v-for='(sku,index) in first.shopList' :key="sku.id" v-if="index<4">
            <router-link :to="'/detail/'+sku.id">
              <div class="sku-cover-wrapper"  >
                <el-image
                    class="sku-cover"
                    :src="sku.imgUrl"
                    fit="contain"
                >
                </el-image>
              </div>
              <div class="sku-description">
                <p class="name">{{sku.skuName}}</p>
                <p class="purpose">{{sku.skuSharerDescribe}}</p>
                 <p class="price">¥{{sku.skuPrice}}</p>
              </div>
            </router-link>
          </el-card>
          <div class="type-no-sku" v-if="!first.shopList.length">
              暂无商品
          </div>
        </div>
      </div>
    </div>
    <!-- <div class="empty-wrapper">
    </div> -->
  </div>
</template>

<script>
  import skuImg from './images/sku.png';
  import { mapGetters } from 'vuex';
  import Cookies from 'js-cookie';

  export default {
    data(){
      return {
        bannerList: [],
        skuImg,
        goodsList: [],
        shpSkuRecommendList: []
      }
    },
    created(){
      this.getAdResources();
      this.getSkuRecommendList();
      let defaultCity = Cookies.get('defaultCity');
      // 如果有默认城市
      if(defaultCity) {
        defaultCity = JSON.parse(defaultCity);
      }
      this.getRegionCategorySku(defaultCity);

    },
    watch: {
      twoMenu(val){
        // console.log(val)
      },
      location(val){
        this.getRegionCategorySku(val);
      },
      code(){
        this.getRegionCategorySku();
      }
    },
    computed: {
      ...mapGetters(['firstMenu','twoMenu','location','code'])
    },
    methods:{
      // 推荐商品
      async getSkuRecommendList(){
        let res = await this.$get('/api/getSkuRecommendList');
        if(res.code==='200'){
          this.shpSkuRecommendList = res.shpSkuRecommendList
        }
      },
      // 获取一级分类
      async getCategoryList(){
        let res = await this.$get('/api/getCategoryList');
        if(res.code==='200'){
          return res.categoryList
        }
        return []
      },
      // 根据一级分类ID和省市区ID获取所有商品
      async getRegionCategorySku(){
        let categoryList = await this.getCategoryList();
        let goodsList = [];
        let code = Cookies.get('code');
        for(let i=0;i<categoryList.length;i++){
          let item = categoryList[i];
          let params = {
            categoryId: item.id
          };
          if(code){
            params.bbiChinaId = code;
          }
          let res = await this.$get('/api/getRegionCategorySku',params);
          if(res.code==='200'){
            goodsList.push({
              id: item.id,
              categoryName: item.categoryName,
              shopList: res.shopList
            })
          }else{
            goodsList.push({
              id: item.id,
              categoryName: item.categoryName,
              shopList: []
            })
          }
        }
        this.goodsList = goodsList;
      },
      /* async getRegionCategorySku(categoryId,bbiChinaId){
         let res = await this.$get('/api/getRegionCategorySku',{
           categoryId,
           bbiChinaId
         })
         console.log(res)
       },*/
      // 获取轮播图
      async getAdResources(){
        let res = await this.$get('/api/getAdResources',{
          origin: 'pc'
        });
        if(res.code==='200'){
          this.bannerList = res.resources;
        }
      },
      // 跳转商品详情页
      toDetail(id){
        this.$router.push('/detail/'+id)
      }
    }
  }
</script>

<style lang="scss">
  .banner-container{
    height: 430px;
    .el-carousel__container{
      height: 430px;
    }
    img{
      height: 430px;
    }
  }

  .special-offer{
    overflow: hidden;
  }
  .recommend-container{
    overflow: hidden;
    .recommend-wrapper{
      width: 1204px;
      overflow: hidden;
      .sku-item-card{
        margin-right: 12px;
        margin-bottom: 20px;
        width: 287px;
      }
    }
  }
  .empty-wrapper{
    margin-top: -20px;
    height: 12px;
    background:#f5f5f5;
  }
  .type-no-sku{
    height: 150px;
    text-align: center;
    line-height: 150px;
    font-size: 16px;
  }
</style>
