<template>
  <div class="bj">
    <div class="container">
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link> > <span>帮助中心</span >
      </div>
      <div class="c-border help-container">
        <h2 class="title">帮助中心</h2>
        <p>1.对商品金额大于20元商品(虚拟商品除外)进行评价并通过审核后，根据商品价格和您的评价内容为您发放优币。</p>
        <p>2.只能对90天内购买的订单进行商品评价。</p>
        <p>3.同一订单和相隔15日内不同订单中的相同商品，只能评价一次。</p>
        <p>4.退换货订单产生的商品评价将会被删除，且会扣除相应的优币。</p>
        <p>5.鼓励发表原创、有价值的评价;杜绝剽窃、发表无意义、违反法律法规的评价内容，如果您发布的无效评价超过(包含)5条，则一年内您发表的商品评价都不会获得优币奖励。</p>
        <p>6.晒单发表成功后会对晒图进行审核，审核过程中，心得文字会先展示出来，审核通过后，晒图会一起进行展示。</p>
        <p>7.对于审核不通过的评价晒单，不能获得优币奖励，且文字、晒图均不能被展示出来，有下列情形之一的，审核不予通过：</p>
        <p>• 评价心得文字与商品无关，且出现言辞露骨的情况;</p>
        <p>• 图片与所购商品不一致;</p>
        <p>• 晒单为截屏图片;</p>
        <p>• 图片不清晰，不能达到晒单目的;</p>
        <p>• 图片中涉及淫秽、色情等违法不良信息;</p>
        <p>• 未经过他人同意，涉及使用他人图片或将他人图片进行编辑后发布;</p>
        <p>• 盗用他人图片经举报、诉讼情况属实;</p>
        <p>• 图片中涉及敏感词汇(如：曝光，315，假二水，翻新等);</p>
        <p>• 图片涉及与客服聊天记录;</p>
        <p>• 对于成人用品晒单，未对特殊部位进行遮掩或打马赛克。</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="scss">
.help-container{
  background:#fff;
  padding: 0 32px;
  padding-bottom: 80px;
  .title{
    font-size: 20px;
    height: 99px;
    padding-left:9px;
    margin-bottom: 32px;
    padding-top: 49px;
    font-weight: normal;
    border-bottom: 1px rgb(228,228,228) solid;
    box-sizing: border-box;
  }
  p{
    padding-left: 1px;
    line-height: 28px;
    font-size: 14px;
    color: #999999;
  }
}
</style>
