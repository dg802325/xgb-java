<template>
  <div class="container business-wrapper">
    <div class="btn-list">
      <a href="http://supplier.e-nongye.com.cn/login" target="_blank"><span><img src="images/web-logo.png" /></span>供应商</a>
      <a href="http://dealer.e-nongye.com.cn/login" target="_blank"><span><img src="images/web-logo.png" /></span>县域服务商</a>
      <a href="javascript:;" @click="noOpen"><span><img src="images/web-logo.png" /></span>金融服务商</a>
    </div>
  </div>
</template>

<script>
  export default {
    methods:{
      noOpen(){
        this.$message.warning('暂未开放')
      }
    }
  }
</script>

<style lang="scss" scoped>
.business-wrapper{
  padding: 25px 0 80px;
  .btn-list{
    padding:0 120px;
    display: flex;
    align-items: center;
    height: 330px;
    a{
      margin: 0 30px;
      flex:1;
      display: flex;
      align-items: center;
      justify-content: center;
      white-space: nowrap;
      cursor: pointer;
      background: #fff;
      border: 1px solid #dcdfe6;
      color: #606266;
      -webkit-appearance: none;
      text-align: center;
      box-sizing: border-box;
      transition: .1s;
      font-weight: 500;
      -moz-user-select: none;
      -webkit-user-select: none;
      -ms-user-select: none;
      padding: 12px 20px;
      font-size: 22px;
      border-radius: 10px;
      height: 120px;
      span{
        margin-right: 6px;
        display: flex;
        align-items: center;
        justify-content: center;
        float: left;
        width: 40px;
        height: 40px;
        background: url(./images/u147.png) no-repeat left bottom;
        background-size: 40px 40px;
        img{
          margin-left: 2px;
          width: 25px;
          height: 25px;
        }
      }
    }
  }

}
</style>
