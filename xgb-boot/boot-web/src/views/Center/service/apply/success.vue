<template>
  <div class="c-border service-success-container">
    <div class="title">
      申请退货
    </div>
     <div class="success-wrapper">
        <div class="info">
          <i class="fa fa-check-circle-o"></i>
          <p class="value">售后申请提交成功</p>
          <p class="label">售后专员可能与您电话沟通，请保持手机畅通</p>
        </div>
        <div class="btn">
          <router-link to="/center/service" class="to-home">返回</router-link>
        </div>
      </div>
      <dl class="tips">
      <dt><i class="fa fa-exclamation-circle"></i>温馨提示：</dt>
      <dd>• 商品寄回地址将在审核通过后以短信形式告知，或在申请记录中查询。</dd>
      <dd>• 提交服务单后，售后专员可能与您电话沟通，请保持手机畅通。</dd>
      <dd>• 退货处理成功后退款金额将原路返回到您的支持账户中；</dd>
    </dl>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="scss">
.service-success-container{
  padding: 0 39px 150px;
  background:#fff;
  .title{
    padding: 51px 0 0 11px;
    height:99px;
    box-sizing: border-box;
    font-size: 16px;
    border-bottom: 1px rgba(228, 228, 228, 1) solid;
  }
  .success-wrapper{
    padding-top: 58px;
    padding-bottom: 50px;
    border:none;
  }
  .tips{
    padding-left: 19px;
    padding-bottom:20px;
    margin-top: 50px;
    border:1px #e4e4e4 solid;
    background:#f2f2f2;
    .fa{
      margin-right:2px;
      color: #999999;
    }
    dt{
      font-family:微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight:700;
      font-size: 14px;
      color: #999999;
      padding-top: 25px;
      padding-bottom: 6px;
    }
    dd{
      line-height: 28px;
      color: #999999;
      font-size: 14px;
    }
  }
}
</style>
