<template>
  <div class="c-border v-service-details">
    <div class="v-service-status">
      <div class="status">
        <p class="icon">
          <img src="../../images/u5752.png" />
        </p>
        <p class="txt">已完成</p>
      </div>
      <dl class="number">
        <dt>服务单号</dt>
        <dd>198014266</dd>
      </dl>
      <dl class="time">
        <dt>申请时间</dt>
        <dd>2018-01-06 17:09:35</dd>
      </dl>
    </div>
    <div class="v-service-step">
      <div class="line">
        <div class="status-line" style="width:100%"></div>
      </div>
      <div class="step-item active">
        <div class="status-text">提交申请</div>
        <div class="status-icon">
          <span>1</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
      <div class="step-item active">
        <div class="status-text">申请审核</div>
        <div class="status-icon">
          <span>2</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
      <div class="step-item active">
        <div class="status-text">售后收货</div>
        <div class="status-icon">
          <span>3</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>

      <div class="step-item active">
        <div class="status-text">进行退款</div>
        <div class="status-icon">
          <span>4</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
      <div class="step-item active">
        <div class="status-text">处理完成</div>
        <div class="status-icon">
          <span>5</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
    </div>
    <div style="padding:15px 39px;">
      <div class="new-msg">
        <div class="time">2018-01-06 17:09:35</div>
        <div class="msg">您的服务单财务已退款，请您注意查收</div>
      </div>
      <div class="title">服务单信息</div>
      <div class="list">
        <div class="row">
          <div class="label">服务单号</div>
          <div class="value">198014266</div>
        </div>
        <div class="row">
          <div class="label">申请时间</div>
          <div class="value">2018-01-06 17:09:35</div>
        </div>
        <div class="row">
          <div class="label">服务类型</div>
          <div class="value">退货</div>
        </div>
        <div class="row">
          <div class="label">退货原因</div>
          <div class="value">质量问题</div>
        </div>
        <div class="row">
          <div class="label">提交数量</div>
          <div class="value">1</div>
        </div>
        <div class="row">
          <div class="label">联系人</div>
          <div class="value">Windir</div>
        </div>
        <div class="row">
          <div class="label">联系电话</div>
          <div class="value">180****1849</div>
        </div>
        <div class="row">
          <div class="label">退款方式</div>
          <div class="value">退回至原支付卡</div>
        </div>
        <div class="row">
          <div class="label">退款金额</div>
          <div class="value">¥249</div>
        </div>
        <div class="row">
          <div class="label">退款状态</div>
          <div class="value">退款完成 &nbsp; <span style="color:#999">预计最晚到账1-15个工作日</span></div>
        </div>
      </div>
      <div class="title">问题描述</div>
      <div class="problem-desc">
        <p>拿来看也没看就洗了，发现有些不对劲，吊牌都没有，洗的时候还有泡沫，细看领口有一处缝补的痕迹，虽然是特价买的但是还是感觉很不爽。</p>
      </div>
       <div class="title">审核留言</div>
      <div class="problem-desc">
        <p>亲爱的客户，很抱歉您的商品出现这样的问题。请准备好商品全套（商品、附件、发票原件、包装）按以下地址寄往e农商城售后部，不支持到付及平邮。如收到商品后情况属实，我们会尽快为您办理。感谢您对的支持。（注：电子发票及换货发票无需退回）。提示：为避免数据遗失或泄露，请您提前做好数据备份，e农商城将不承担相应责任。</p>
        <p style="height:15px;"></p>
        <p>• 收货地址：广东省深圳市e农商城售后服务部</p>
        <p>• 联系姓名：e农商城</p>
        <p>• 邮政编码：518000</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style lang="scss">
.v-service-details {
  background: #fff;
  min-height: 493px;
  padding-bottom: 40px;
  .v-service-status {
    height: 149px;
    background: rgb(249, 249, 249);
    border-bottom: 1px #e4e4e4 solid;
    .status {
      float: left;
      text-align: center;
      width: 198px;
      .icon {
        padding: 34px 0 9px 0;
      }
      .txt {
        font-size: 16px;
        color: #1abc9c;
      }
    }
    dl {
      float: left;
      text-align: center;
      dt {
        padding: 52px 0 13px;
        color: #999999;
        font-size: 16px;
      }
      dd {
        font-size: 14px;
      }
    }
    .number {
      width: 150px;
    }
    .time {
      width: 172px;
    }
  }
  
  .new-msg {
    display: flex;
    padding: 10px 20px;
    line-height: 26px;
    background: #f9f9f9;
    border: 1px #e4e4e4 solid;
    .time {
      flex: 0 0 125px;
      color: #999;
    }
  }
  .title {
    height: 70px;
    padding-top: 37px;
    font-size: 16px;
    color: #999999;
    box-sizing: border-box;
  }
  .list{
    border-bottom:1px #e4e4e4 solid;
    .row{
      display: flex;
      border: 1px #e4e4e4 solid;
      border-bottom:none;
      .label{
        font-size: 14px;
        line-height: 39px;
        flex: 0 0 177px;
        text-align: center;
        background: #f9f9f9;
        border-right:1px #e4e4e4 solid;
      }
      .value{
        flex: 1;
        padding-left: 19px;
        font-size: 14px;
        line-height: 39px;
      }
    }
  }
  .problem-desc{
    border:1px #e4e4e4 solid;
    padding: 18px 28px 20px 19px;
    p{
      line-height: 33px;
      font-size: 14px;
    }
  }
}
</style>
