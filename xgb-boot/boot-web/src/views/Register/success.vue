<template>
  <v-init-view class="bj">
    <router-link slot="right" to="/" class="link link-success">进入网站首页 </router-link>
    <div class="container">
      <div class="success-wrapper">
        <div class="info">
          <i class="fa fa-check-circle-o"></i>
          <p class="value">恭喜注册成功</p>
          <p class="label">请妥善保管您的账户信息</p>
        </div>
        <div class="btn">
          <router-link to="/" class="to-home">进入首页</router-link>
          <a href="javascript:;" class="cart">
            <i class="fa fa-shopping-cart"></i>
            查看购物车
          </a>
        </div>
      </div>
    </div>
  </v-init-view>
</template>

<script>
    export default {
    }
</script>

<style lang="scss" scoped>
.link-success{
  margin-top: 19px;
}
</style>
