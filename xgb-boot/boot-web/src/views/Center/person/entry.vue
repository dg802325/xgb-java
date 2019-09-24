<template>
  <div>
    <div class="c-border person-set">
      <div class="set">
        <div class="cover">
          <img v-if="member.headProtrait" :src="member.headProtrait"/>
          <img v-else src="../images/cover.jpg"/>
        </div>
        <div>
          <p
            class="name"
            style="font-family:'微软雅黑 Bold', '微软雅黑 Regular', '微软雅黑';font-weight:700;"
          >{{member.memberName}}</p>
          <div class="link-group">
            <router-link to="/center/security">安全设置</router-link>
            <router-link to="/center/address">地址管理</router-link>
          </div>
        </div>
      </div>
    </div>
    <div class="c-border my-order">
      <div class="title">
        <p>我的订单</p>
        <router-link to="/center/order">查看全部</router-link>
      </div>
      <div class="order-list">
        <div class="c-order-item"  v-for="(order,index) in ocOrderList" :key="order.id" v-if="index<2">
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
                <router-link to="/center/order/11">查看详情</router-link>
                <a href="javascript:;" @click="cancelOrder(order)">取消订单</a>
              </div>
              <div class="order-option" v-if='order.orderState==2'>
                <a href="javascript:;" @click="cancelVisible=true">取消订单</a>
              </div>
              <div class="order-option" v-if='order.orderState==3'>
                <el-button class="red" type="danger">确认收货</el-button>
                <router-link to="/center/order/11">查看详情</router-link>
              </div>
              <div class="order-option" v-if='order.orderState==5'>
                <router-link to="/center/order/11">查看详情</router-link>
                <router-link to="/">重新购买</router-link>
              </div>
              <div class="order-option" v-if='order.orderState==6'>
                <a href="javascript:;" @click="deleteMemberOrder(order.id)">删除订单</a>
                <router-link to="/">重新购买</router-link>
              </div>
            </div>
          </div>
        </div>

        <!--<div class="order-item">
          <div class="sku-info">
            <a href="javacript:;" class="img">
              <img src="../images/sku.jpg" />
            </a>
            <p class="name">心连心氮肥 5KG/袋</p>
            <p class="num">数量：1</p>
          </div>
           <div class="order-status">
             <p class="status">待付款</p>
           </div>
          <div class="order-info">
             <p>¥29.00</p>
             <p>（含运费：¥10.00元）</p>
             <p>在线支付</p>
           </div>
           <div class="order-option">
              <el-button class="red" type="danger">立即付款</el-button>
              <a href="javascript:;">查看详情</a>
              <a href="javascript:;">取消订单</a>
           </div>
        </div>
        <div class="order-item">
          <div class="sku-info">
            <a href="javacript:;" class="img">
              <img src="../images/sku.jpg" />
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
              <a href="javascript:;">查看详情</a>
              <a href="javascript:;">再次购买</a>
           </div>
        </div>-->
      </div>
    </div>
    <v-cancel-order v-if="cancelVisible" @close="cancelCallback"/>
  </div>
</template>

<script>
import {getToken} from "../../../utils/auth";
export default {
  data(){
    return {
      member: {},
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
    }
  },
  mounted(){
    this.getMemInfo();
    this.getMyOrderList();
  },
  methods:{
    // 获取用户信息
    async getMemInfo(){
      let token = getToken();
      let res = await this.$post('/api/getMemInfo',{
        token
      });
      if(res.code==='200'){
        this.member = res.member;
      }
    },
    // 取消订单
    cancelOrder(order){
      this.selectOrder = order;
      this.cancelVisible = true;
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
      this.cancelVisible = false;
    },
    // 删除订单
    async deleteMemberOrder(orderId){
      let res = await  this.$post('/api/deleteMemberOrder',{
        orderId
      });
      console.log(res);
      if(res.code==='200'){
        this.getMyOrderList();
        this.$message.success(res.message)
      }else{
        this.$message.error(res.message)
      }
    },
    toPay(order){
      this.$router.push(`/order/pay/${order.id}/${order.orderActualAmount}/-1`);
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
.person-set {
  padding-top: 34px;
  margin-bottom: 20px;
  height: 114px;
  background: #f9f9f9;
  .set {
    width: 438px;
    padding-top: 9px;
    display: flex;
    border-right: 1px #f2f2f2 solid;
    .cover {
      padding: 0 22px 0 45px;
      cursor: pointer;
      img{
        width: 73px;
        height: 73px;
      }
    }
    .name {
      padding: 9px 0 19px;
      font-weight: 700;
      font-size: 16px;
      color: #999999;
    }
    .link-group {
      a {
        margin: 0 31px 0 1.3px;
        font-size: 14px;
        color: #666666;
        &:hover {
          color: rgb(26, 188, 156);
        }
      }
    }
  }
}
.order-list .order-item .sku-info .img img{
  width: 80px;
  height: 80px;
}
.my-order{
  background: #fff;
  .title{
    padding:0 15px 0 19px;
    display:flex;
    justify-content:space-between;
    height: 48px;
    align-items: center;
    background: #f9f9f9;
    border-bottom: 1px #e4e4e4 solid;
    p{
      font-size: 16px;
      color: #999999;
    }
    a{
      &:hover{
        color: rgb(26, 188, 156);
      }
    }
  }

}
</style>
