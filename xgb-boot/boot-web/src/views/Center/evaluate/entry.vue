<template>
  <div class="c-border v-evaluate-container">
    <div class="center-tab">
      <div class="tab-item" :class="{'active':tab==0}" @click="tab=0">待评价</div>
      <div class="tab-item" :class="{'active':tab==1}" @click="tab=1">已评价</div>
    </div>
    <div v-if="tab==0" class="v-evaluate-list">
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <router-link to="/publishevaluate" tag="button">发布评价</router-link>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>发布评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>发布评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>发布评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>发布评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>发布评价</button>
        </div>
      </el-card>
    </div>
     <div v-if="tab==1"  class="v-evaluate-list">
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>查看评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>查看评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>查看评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>查看评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>查看评价</button>
        </div>
      </el-card>
      <el-card class="v-evaluate-item sku-item-card" shadow="never">
        <div class="sku-cover-wrapper">
          <el-image class="sku-cover" :src="skuImg" fit="contain"></el-image>
        </div>
        <div class="sku-description">
          <p class="name">心连心氮肥 5KG/袋</p>
          <p class="price">¥249</p>
          <p class="evaluate-num">9978人评价</p>
        </div>
        <div class="sku-btn">
          <button>查看评价</button>
        </div>
      </el-card>
    </div>
  </div>
</template>

<script>
import skuImg from '../images/sku.png'

export default {
  data() {
    return {
      skuImg,
      tab: 0
    };
  }
};
</script>

<style lang="scss">
.v-evaluate-container {
  background: #fff;
  overflow: hidden;
  padding-bottom: 50px;
  .v-evaluate-list{
    padding: 41px 0 0 77px;
  }
  .sku-item-card {
    margin-right: 50px;
    margin-bottom: 20px;
    .sku-cover-wrapper .sku-cover{
      width: 47%;
      height: 140px;
    }
    .sku-description{
      padding-top: 6px;
      .price{
        line-height: 32px;
      }
    }
  }
  
}
</style>
