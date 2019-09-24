<template>
  <div class="c-border service-container">
    <div class="center-tab">
      <div class="tab-item" :class="{'active':tab==0}" @click="tab=0">售后申请</div>
      <div class="tab-item" :class="{'active':tab==1}" @click="tab=1">申请记录</div>
    </div>
    <div class="c-order-group order-list" v-if="tab==0">
      <div class="c-order-item">
        <div class="c-order-header">
          <div class="l">
            <p>下单时间：2018-01-08 15:02:00</p>
            <p>订单编号：62205697599</p>
          </div>
          <div class="r">
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <a href="javacript:;" class="img">
                <img src="../../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-option">
              <el-button class="red" type="danger" @click="()=>{
                this.$router.push('/center/service/apply/222')  
              }">申请退货</el-button>
            </div>
          </div>
        </div>
      </div>
      <div class="c-order-item">
        <div class="c-order-header">
          <div class="l">
            <p>下单时间：2018-01-08 15:02:00</p>
            <p>订单编号：62205697599</p>
          </div>
          <div class="r">
            <p>
              <i class="fa fa-exclamation-circle"></i> 该商品已超过售后期
            </p>
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <a href="javacript:;" class="img">
                <img src="../../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-option">
              <el-button class="disabled" :disabled="true" type="danger">申请退货</el-button>
            </div>
          </div>
        </div>
      </div>
    
      <div class="pagination-wrapper">
        <el-pagination
          prev-text="上一页"
          next-text="下一页"
          background
          layout="prev, pager, next"
          :total="50"
        ></el-pagination>
      </div>
    </div>
    <div class="c-order-group order-list" v-if="tab==1">
      <div class="c-order-item">
        <div class="c-order-header">
          <div class="l">
            <p>下单时间：2018-01-08 15:02:00</p>
            <p>订单编号：62205697599</p>
          </div>
          <div class="r">
            <p class="done">
              <i class="fa fa-clock-o"></i> 已完成
            </p>
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <a href="javacript:;" class="img">
                <img src="../../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-num-date">
              <p>服务单号：198014266</p>
              <p>申请时间：2017-05-01 16:00</p>
            </div>
            <div class="order-option">
              <router-link to="/center/service/123456">查看详情</router-link>
            </div>
          </div>
        </div>
      </div>
      <div class="c-order-item">
        <div class="c-order-header">
          <div class="l">
            <p>下单时间：2018-01-08 15:02:00</p>
            <p>订单编号：62205697599</p>
          </div>
          <div class="r">
            <p class="done">
              <i class="fa fa-clock-o"></i> 已完成
            </p>
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <a href="javacript:;" class="img">
                <img src="../../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-num-date">
              <p>服务单号：198014266</p>
              <p>申请时间：2017-05-01 16:00</p>
            </div>
            <div class="order-option">
              <router-link to="/center/service/123456">查看详情</router-link>
            </div>
          </div>
        </div>
      </div>
      <div class="c-order-item">
        <div class="c-order-header">
          <div class="l">
            <p>下单时间：2018-01-08 15:02:00</p>
            <p>订单编号：62205697599</p>
          </div>
          <div class="r">
            <p class="done">
              <i class="fa fa-clock-o"></i> 已完成
            </p>
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <a href="javacript:;" class="img">
                <img src="../../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-num-date">
              <p>服务单号：198014266</p>
              <p>申请时间：2017-05-01 16:00</p>
            </div>
            <div class="order-option">
              <router-link to="/center/service/123456">查看详情</router-link>
            </div>
          </div>
        </div>
      </div>
      <div class="pagination-wrapper">
        <el-pagination
          prev-text="上一页"
          next-text="下一页"
          background
          layout="prev, pager, next"
          :total="50"
        ></el-pagination>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tab: 0
    };
  }
};
</script>

<style lang="scss">
.service-container {
  padding-bottom: 40px;
  min-height: 533px;
  background: #fff;
  .order-list {
    padding-top: 20px;
  }
  .order-item {
    .sku-info {
      flex: 1;
    }
    .order-option {
      flex: 0 0 199px;
    }
  }
  .pagination-wrapper {
    padding-top: 10px;
  }
}
</style>
