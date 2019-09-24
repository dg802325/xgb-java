<template>
  <div class="c-border v-service-details">
    <div class="v-service-status">
      <div class="status">
        <p class="icon">
          <img src="../images/u5070.png" />
        </p>
        <p class="txt">等待付款</p>
      </div>
      <dl class="number">
        <dt>订单编号</dt>
        <dd>62205697599</dd>
      </dl>
      <dl class="time">
        <dt>下单时间</dt>
        <dd>2018-01-06 17:09:35</dd>
      </dl>
      <dl class="number">
        <dt>付款截止</dt>
        <dd>剩余22时33分</dd>
      </dl>
      <div class="opt-button">
        <p class="btn red">立即付款</p>
        <p class="btn" @click="cancelVisibile=true">取消订单</p>
      </div>
    </div>
    <div class="v-service-status">
      <div class="status">
        <p class="icon">
          <img src="../images/u5310.png" />
        </p>
        <p class="txt">等待收货</p>
      </div>
      <dl class="number">
        <dt>订单编号</dt>
        <dd>62205697599</dd>
      </dl>
      <dl class="time">
        <dt>下单时间</dt>
        <dd>2018-01-06 17:09:35</dd>
      </dl>
      <div class="opt-button">
        <p class="btn red">确认收货</p>
        <p class="btn">再次购买</p>
      </div>
    </div>
    <div class="v-service-status">
      <div class="status">
        <p class="icon">
          <img src="../images/u5752.png" />
        </p>
        <p class="txt">交易完成</p>
      </div>
      <dl class="number">
        <dt>订单编号</dt>
        <dd>62205697599</dd>
      </dl>
      <dl class="time">
        <dt>下单时间</dt>
        <dd>2018-01-06 17:09:35</dd>
      </dl>
      <div class="opt-button">
        <p class="btn">申请售后</p>
        <p class="btn">评价商品</p>
        <p class="btn">再次购买</p>
      </div>
    </div>
    <div class="v-service-status">
      <div class="status">
        <p class="icon">
          <img src="../images/u4079.png" />
        </p>
        <p class="txt">交易关闭</p>
      </div>
      <dl class="number">
        <dt>订单编号</dt>
        <dd>62205697599</dd>
      </dl>
      <dl class="time">
        <dt>下单时间</dt>
        <dd>2018-01-06 17:09:35</dd>
      </dl>
    </div>
    <div class="v-service-step">
      <div class="line">
        <div class="status-line" style="width:100%"></div>
      </div>
      <div class="step-item active">
        <div class="status-text">提交订单</div>
        <div class="status-icon">
          <span>1</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
      <div class="step-item active">
        <div class="status-text">付款成功</div>
        <div class="status-icon">
          <span>2</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
      <div class="step-item active">
        <div class="status-text">商品出库</div>
        <div class="status-icon">
          <span>3</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
      <div class="step-item active">
        <div class="status-text">等待收货</div>
        <div class="status-icon">
          <span>4</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
      <div class="step-item active">
        <div class="status-text">交易完成</div>
        <div class="status-icon">
          <span>5</span>
          <i class="fa fa-check"></i>
        </div>
        <div class="status-time">2018-01-06 17:09:35</div>
      </div>
    </div>
    
    <div style="padding:15px 39px;">
      <div class="orider-new-msg">
        <div class="msg">
          <div class="time">2018-01-06 17:09:35</div>
          <div class="val"> 到达目的地网点广东深圳公司，快件将很快进行派送</div>
        </div>
        <div class="opt">
          <a href="javascript:;" @click="visibile=true">查看物流</a>
        </div>
      </div>
      <div class="title">商品信息</div>
      <table class="v-sku-info-table">
        <thead>
          <tr>
            <td width="413">商品信息</td>
            <td width="100">单价</td>
            <td width="130">数量</td>
            <td width="110">小计</td>
            <td>实付</td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td align="left">
              <div class="t-sku-info">
                <div class="t-cover">
                  <img src="../images/sku.jpg" />
                </div>
                <div class="info">
                  <p class="name">
                    <router-link to="/detail">心连心氮肥 5KG/袋</router-link>
                  </p>
                  <p class="type">适合种玉米、黄瓜</p>
                </div>
              </div>
            </td>
            <td>¥249</td>
            <td>1</td>
            <td>¥249</td>
            <td>¥249</td>
          </tr>
           <tr>
            <td align="left">
              <div class="t-sku-info">
                <div class="t-cover">
                  <img src="../images/sku.jpg" />
                </div>
                <div class="info">
                  <p class="name">
                    <router-link to="/detail">心连心氮肥 5KG/袋</router-link>
                  </p>
                  <p class="type">适合种玉米、黄瓜</p>
                </div>
              </div>
            </td>
            <td>¥249</td>
            <td>1</td>
            <td>¥249</td>
            <td>¥249</td>
          </tr>
           <tr>
            <td align="left">
              <div class="t-sku-info">
                <div class="t-cover">
                  <img src="../images/sku.jpg" />
                </div>
                <div class="info">
                  <p class="name">
                    <router-link to="/detail">心连心氮肥 5KG/袋</router-link>
                  </p>
                  <p class="type">适合种玉米、黄瓜</p>
                </div>
              </div>
            </td>
            <td>¥249</td>
            <td>1</td>
            <td>¥249</td>
            <td>¥249</td>
          </tr>
           <tr>
            <td align="left">
              <div class="t-sku-info">
                <div class="t-cover">
                  <img src="../images/sku.jpg" />
                </div>
                <div class="info">
                  <p class="name">
                    <router-link to="/detail">心连心氮肥 5KG/袋</router-link>
                  </p>
                  <p class="type">适合种玉米、黄瓜</p>
                </div>
              </div>
            </td>
            <td>¥249</td>
            <td>1</td>
            <td>¥249</td>
            <td>¥249</td>
          </tr>
        </tbody>
      </table>
      <div class="title">收货信息</div>
      <div class="msg-lit">
        <div class="row">
          <div class="label">收 货 人 :</div>
          <div class="value">Windir</div>
        </div>
        <div class="row">
          <div class="label">联系方式 :</div>
          <div class="value">180****1849</div>
        </div>
        <div class="row">
          <div class="label">收货地址 :</div>
          <div class="value">广东深圳市罗湖区清水河街道泥岗东路</div>
        </div>
      </div>
      <div class="title">支付方式</div>
      <div class="msg-lit">
        <div class="row">
          <div class="label">支付方式 :</div>
          <div class="value">在线支付</div>
        </div>
      </div>
      <div class="title">订单信息</div>
      <div class="msg-lit">
        <div class="row">
          <div class="label">订单编号 :</div>
          <div class="value">62205697599</div>
        </div>
        <div class="row">
          <div class="label">下单时间 :</div>
          <div class="value">2018-01-06 17:09:35</div>
        </div>
      </div>

      <div class="order-summary">
        <p>
          <span class="label">商品件数：</span>
          <span class="value">5件</span>
        </p>
        <p>
          <span class="label">运费：</span>
          <span class="value">包邮</span>
        </p>
        <p>
          <span class="label">商品总价：</span>
          <span class="value">¥1245.00</span>
        </p>
        <p style="padding-top:10px;">
          <span class="label">应付总额：</span>
          <span class="value">
            <b>¥1245.00</b>
          </span>
        </p>
      </div>
    </div>
    <v-logistics v-if="visibile" @close="visibile=false"/>
    <v-cancel-oorder v-if="cancelVisibile" @close="cancelVisibile=false"/>
  </div>
</template>

<script>
export default {
  data(){
    return{
      visibile: false,
      cancelVisibile: false,
    }
  }
};
</script>

<style lang="scss">
.v-service-details {
  background: #fff;
  min-height: 493px;
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
    .opt-button{
      padding: 54px 18px 0 0;
      float:right;
      .btn{
        float:left;
        margin-right: 10px;
        width: 100px;
        height: 40px;
        line-height: 38px;
        text-align: center;
        color: #1ABC9C;
        font-size: 14px;
        background-color: rgba(255, 255, 255, 0);
        box-sizing: border-box;
        border:1px rgba(26, 188, 156, 1) solid;
        border-radius: 3px;
        cursor: pointer;
        &:hover{
          background-color: rgba(26, 188, 156, 1);
          color:#fff;
        }
        &.red{
          background-color: rgba(240, 72, 68, 1);
          border:1px rgba(240, 72, 68, 1) solid;
          color:#fff;
          &:hover{
            opacity: 0.8;
          }
        }
      }
    }
  }
  .orider-new-msg{
    display: flex;
    align-items: center;
    justify-content: space-between;
    height: 46px;
    padding: 0 18px;
    background: #f9f9f9;
    border:1px #e4e4e4 solid;
    .msg{
      display: flex;
      height:30px;
      line-height: 30px;
      .time{
        margin-right: 10px;
        color:#999999
      }
    }
    .opt{
      display: flex;
      a{
        width: 100px;
        height: 30px;
        border:1px #1abc9c solid;
        color: #1ABC9C;
        text-align: center;
        line-height: 28px;
        box-sizing: border-box;
        &:hover{
          background: #1abc9c;
          color:#fff;
        }
      }
    }
  }
  .msg-lit {
    padding: 18px 20px;
    border: 1px #e4e4e4 solid;
    .row {
      display: flex;
      line-height: 32px;
      .label {
        font-size: 14px;
        color: #999999;
      }
      .value {
        padding-left: 5px;
        font-size: 14px;
      }
    }
  }
  .title {
    height: 70px;
    padding-top: 37px;
    font-size: 16px;
    color: #999999;
    box-sizing: border-box;
  }
  .problem-desc {
    border: 1px #e4e4e4 solid;
    padding: 18px 28px 20px 19px;
    p {
      line-height: 33px;
      font-size: 14px;
    }
  }
  
  
}
</style>
