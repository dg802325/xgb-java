<template>
  <div class="c-border v-order-container">
    <div class="center-tab">
      <div class="tab-item" :class="{'active':status==0}" @click="status=0">全部订单</div>
      <div class="tab-item" :class="{'active':status==1}" @click="status=1">待付款</div>
      <div class="tab-item" :class="{'active':status==2}" @click="status=2">待发货</div>
      <div class="tab-item" :class="{'active':status==3}" @click="status=3">待收货</div>
      <div class="tab-item" :class="{'active':status==5}" @click="status=5">已完成</div>
      <div class="tab-item" :class="{'active':status==6}" @click="status=6">已取消</div>
    </div>
    <div class="c-order-group order-list">
      <div class="c-order-item"  v-for="order in ocOrderList" :key="order.id">
        <div class="c-order-header">
          <div class="l">
            <p>下单时间：{{order.createTime}}</p>
            <p>订单编号：{{order.orderNo}}</p>
          </div>
          <div class="r">
            <p>
              <!--<i class="fa fa-clock-o"></i> 付款截止：剩余22时33分-->
            </p>
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <div class="order-sku" v-for="sku in order.orderCommodity" :key="sku.id">
                  <router-link :to="'/detail/'+sku.skuId" class="img">
                    <img :src="sku.skuImg">
                  </router-link >
                  <p class="name">{{sku.skuName}}</p>
                  <p class="num">数量：{{sku.orderBuyNumber}}</p>
              </div>
            </div>
            <div class="order-status">
              <p class="status">{{userStateMap[order.orderState]}}</p>
            </div>
            <div class="order-info">
              <p>¥{{order.orderActualAmount}}</p>
              <!--<p>（含运费：¥10.00元）</p>-->
              <p>在线支付</p>
            </div>
            <div class="order-option" v-if='order.orderState==1'>
              <el-button class="red" type="danger" @click="toPay(order)">立即付款</el-button>
              <!--<router-link to="/center/order/11">查看详情</router-link>-->
              <a href="javascript:;" @click="cancelOrder(order)">取消订单</a>
            </div>
            <div class="order-option" v-if='order.orderState==2'>
              <a href="javascript:;" @click="cancelVisible=true">取消订单</a>
            </div>
            <div class="order-option" v-if='order.orderState==3'>
              <el-button class="red" @click="confirmReceipt(order.id)" type="danger">确认收货</el-button>
              <!--<router-link to="/center/order/11">查看详情</router-link>-->
            </div>
            <div class="order-option" v-if='order.orderState==5'>
              <!--<router-link to="/center/order/11">查看详情</router-link>-->
              <router-link to="/">重新购买</router-link>
            </div>
            <div class="order-option" v-if='order.orderState==6'>
              <a href="javascript:;" @click="deleteMemberOrder(order.id)">删除订单</a>
              <router-link to="/">重新购买</router-link>
            </div>
          </div>
        </div>
      </div>

     <!-- <div class="c-order-item">
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
                <img src="../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-status">
              <p class="status">待收货</p>
              <a href="javascript:;">查看物流</a>
            </div>
            <div class="order-info">
              <p>¥29.00</p>
              <p>（含运费：¥10.00元）</p>
              <p>在线支付</p>
            </div>
            <div class="order-option">
              <el-button class="red" type="danger">确认收货</el-button>
              <router-link to="/center/order/11">查看详情</router-link>
              <a href="javascript:;">再次购买</a>
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
            <a href="javascript:;" @click="deleteEvent">删除</a>
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <a href="javacript:;" class="img">
                <img src="../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-status">
              <p class="status">已完成</p>
              <a href="javascript:;">评价商品</a>
            </div>
            <div class="order-info">
              <p>¥29.00</p>
              <p>（含运费：¥10.00元）</p>
              <p>在线支付</p>
            </div>
            <div class="order-option">
              <router-link to="/center/order/11">查看详情</router-link>
              <a href="javascript:;">再次购买</a>
              <a href="javascript:;">申请售后</a>
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
            <a href="javascript:;" @click="deleteEvent">删除</a>
          </div>
        </div>
        <div class="c-order-body">
          <div class="order-item">
            <div class="sku-info">
              <a href="javacript:;" class="img">
                <img src="../images/sku.jpg">
              </a>
              <p class="name">心连心氮肥 5KG/袋</p>
              <p class="num">数量：1</p>
            </div>
            <div class="order-status">
              <p class="status">已取消</p>
            </div>
            <div class="order-info">
              <p>¥29.00</p>
              <p>（含运费：¥10.00元）</p>
              <p>在线支付</p>
            </div>
            <div class="order-option">
              <a href="javascript:;">查看详情</a>
              <a href="javascript:;">再次购买</a>
            </div>
          </div>
        </div>
      </div>-->

      <div class="empty" v-if="ocOrderList.length==0">
        <img src="./images/u806.svg" />
        <p>暂无相关订单</p>
      </div>
    </div>
    <!--<div class="pagination-wrapper">-->
    <!--<el-pagination-->
    <!--prev-text="上一页"-->
    <!--next-text="下一页"-->
    <!--background-->
    <!--layout="prev, pager, next"-->
    <!--:total="50">-->
    <!--</el-pagination>-->
    <!--</div>-->
    <v-cancel-order v-if="cancelVisible" @close="cancelCallback"/>

  </div>
</template>

<script>
  import {getToken} from "../../../utils/auth";

  export default {
    data() {
      return {
        status: 0,
        cancelVisible: false,
        ocOrderList: [],
        orderStateMap: {
          "1": "已提交",
          "2": "已支付",
          "3": "已发货",
          "5":"已完成",
          "6":"已关闭"
        },
        userStateMap: {
          "1": "待付款",
          "2": "待发货",
          "3": "待收货",
          "5": "已完成",
          "6": "已取消"
        },
        selectOrder: {}
      };
    },
    watch: {
      status(val){
        if(val==0){
          this.getMyOrderList();
        }else if(val==1){
          this.getMyOrderList(1);
        }else if(val==2){
          this.getMyOrderList(2);
        }else if(val==5){
          this.getMyOrderList(5);
        }else if(val==6){
          this.getMyOrderList(6);
        }
      }
    },
    mounted() {
      this.getMyOrderList();
    },
    methods: {
      // 取消订单
      cancelOrder(order){
        this.selectOrder = order;
        //this.cancelVisible = true;
        this.$$confirm('确定取消该订单？').then(()=>{
          this.cancelCallback(false)
        }).catch(e=>{})
      },
      // 取消订单回调
      async cancelCallback(status){
        if(status){
          let res = await this.$post('/api/cancelMemberOrder',{
            orderId: this.selectOrder.id
          });
          if(res.code==='200'){
            this.getMyOrderList();
          }else{
            this.$message.error(res.message)
          }
        }
        // this.cancelVisible = false;
      },
      // 删除订单
      async deleteMemberOrder(orderId){
        let res = await  this.$post('/api/deleteMemberOrder',{
          orderId
        });
        if(res.code==='200'){
          this.getMyOrderList();
          this.$message.success(res.message)
        }else{
          this.$message.error(res.message)
        }
      },
      toPay(order){
        this.$router.push(`/order/pay/${order.id}/${order.orderActualAmount}/${order.failureTime}`);
      },
      // 确认收货
      async confirmReceipt(orderId){
        this.$$confirm('是否确认收货？').then(async ()=>{
          let res = await this.$post('/api/confirmReceipt',{
            orderId
          });
          this.$$message(res.message,res.code);
          this.getMyOrderList();
        }).catch(e=>{})
      },
      // 订单状态（订单状态 1提交 2已支付 3已发货 5已完成 6关闭）
      async getMyOrderList(status) {
        this.ocOrderList = [];
        let token = getToken();
        let res = await this.$get('/api/getMyOrderList', {
          token,
          status
        });
        if (res.code === '200') {
          this.ocOrderList = res.ocOrderList;
        }
      },
      deleteEvent() {
        this.$$confirm('是否删除该订单？').then(() => {
          this.$message({
            type: 'success',
            message: '删除成功!'
          });
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除'
          });
        });
      }
    }
  };
</script>

<style lang="scss">
  .empty{
    padding: 100px 0;
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
  .v-order-container {
    padding-bottom: 40px;
    background: #fff;

    .c-order-group {
      padding-top: 20px;
    }

    .pagination-wrapper {
      padding-top: 0;
    }
  }
  .order-list .order-item{
    height: auto;
    min-height: 118px;
  }
  .order-list .order-item .sku-info{
    padding: 10px 19px;
    display: flex;
    flex-direction: column;
  }
  .order-list .order-item .sku-info .order-sku{
    padding: 5px 0;
    img{
      width: 80px;
      height: 80px;
    }
  }
</style>
