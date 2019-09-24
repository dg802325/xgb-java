<template>
  <div style="background: rgb(245, 245, 245);">
    <div class="container c-order-container">
      <div class="title">填写订单信息</div>
      <div class="c-border c-order-wrapper">
        <div class="c-title">收货地址</div>
        <div class="c-border c-address-wrapper">
          <div v-if="currentAddress.receiveProvince" class="current-address">
            <div class="l">
              <p>
                <span class="label">收 货 人 :</span>
                <span class="value">{{currentAddress.receiveName}}</span>
              </p>
              <p>
                <span class="label">联系方式 :</span>
                <span class="value">{{currentAddress.receivePhone | formatMobile}}</span>
              </p>
              <p>
                <span class="label">收货地址 :</span>
                <span class="value">{{currentAddress | setDetailAdd}}</span>
              </p>
            </div>
            <div class="r">
              <a href="javascript:;" @click="editVisible=true">修改地址</a>
            </div>
          </div>
          <div class="handle-address" :class="{'no-address':addresses.length==0}">
            <a href="javascript:;" v-if="addresses.length" class="change" @click="switchVisible=true">
              <i class="fa fa-map-marker"></i>切换地址
            </a>
            <a href="javascript:;" @click="plusVisible=true">
              <i class="fa fa-plus-circle"></i>添加地址
            </a>
          </div>
        </div>
        <div class="c-title">支付方式</div>
        <div class="c-border pay-type">
          <a href="javascript:;" :class="{'active':orderType===0}" @click="orderType=0">在线支付</a>
          <!--<a href="javascript:;" :class="{'active':orderType===1}" @click="orderType=1">货到付款</a>-->
        </div>
        <div class="c-title">商品信息</div>
        <div>
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
            <tr v-for="sku in skus" :key="sku.id">
              <td align="left">
                <div class="t-sku-info">
                  <div class="t-cover">
                    <img :src="sku.imgUrl"/>
                  </div>
                  <div class="info">
                    <p class="name">
                      <router-link :to="'/detail/'+sku.skuId">{{sku.skuName}}</router-link>
                    </p>
                    <!--<p class="type">适合种玉米、黄瓜</p>-->
                  </div>
                </div>
              </td>
              <td>¥{{sku.skuPrice}}</td>
              <td>x{{sku.skuNum}}</td>
              <td>¥{{sku.skuPrice*sku.skuNum}}</td>
              <td>¥{{sku.skuPrice*sku.skuNum}}</td>
            </tr>
            </tbody>
          </table>
        </div>
        <div>
          <div class="c-title summary-title">金额明细</div>
          <div class="order-summary">
            <p>
              <span class="label">商品件数：</span>
              <span class="value">{{skuSum}}件</span>
            </p>
            <p v-if="freight">
              <span class="label">运费：</span>
              <span class="value">¥{{freight}}</span>
            </p>
            <p>
              <span class="label">商品总价：</span>
              <span class="value">¥{{amountPayable}}</span>
            </p>
            <p style="padding-top: 10px;">
              <span class="label">应付总额：</span>
              <span class="value">
                <b>¥{{totalPrice}}</b>
              </span>
            </p>
          </div>
        </div>
      </div>
      <div class="submit-wrapper c-border">
        <a href="javascript:;" @click="handleSubmit">提交订单</a>
      </div>
    </div>
    <vSwitch v-if="switchVisible" :item='currentAddress' @close="switchChange"/>
    <vPlus v-if="plusVisible" @close="plusChange"/>
    <vEdit v-if="editVisible" :item='currentAddress' @close="editChange"/>
  </div>
</template>

<script>
  import vSwitch from "./address/switch";
  import vPlus from "./address/plus";
  import vEdit from "./address/edit";
  import {getToken} from '../../utils/auth';
  import { mapGetters } from 'vuex';
  export default {
    data() {
      return {
        switchVisible: false,
        plusVisible: false,
        editVisible: false,
        orderType: 0,
        addresses: [],
        currentAddress: {},
        sku: {},
        skuSum: '',
        skuId: '',
        skuSumSparce: 0,
        amountPayable: 0,
        skus: [],
        carts: [],
        freight: 0,
        totalPrice: 0
      };
    },
    computed: {
      ...mapGetters(['regionMap'])
    },
    async created() {
      let { carts } = this.$route.query;
      if(!carts){
        return;
      }
      this.carts = carts;
      //carts = JSON.parse(carts);
      const token = getToken();
      if (!token) {
        this.$router.push('/login');
        return;
      }
      await this.shoppingCartOrder(carts,token);
      // await this.getSku({skuId, skuSum, token});
      await this.getAddresses(token);
    },
    filters: {
      formatCity(val,map){
        if(map[val]){
          return map[val].divisionName;
        }
        return val
      },
      formatMobile(receivePhone){
        if (!receivePhone) return '';
        return receivePhone.substring(0, 3) + '****' + receivePhone.substring(receivePhone.length - 4)
      },
      setDetailAdd (address) {
        if (!address) return '';
        return address.divisionNameProvince + address.divisionNameCity + address.divisionNameArea + address.detailAdd
      }
    },
    methods: {
      async shoppingCartOrder(carts,token){
        let res = await this.$post('/api/shoppingCartOrder',{
          carts:carts,
          token
        });
        if(res.code==='200'){
          let skuSum = 0;
          res.skus.forEach(item=>{
            skuSum+=Number(item.skuNum);
          });
          this.skuSum = skuSum;
          this.skus = res.skus;
          this.freight = res.Freight;
          this.totalPrice = res.totalPrice;
          this.currentAddress = res.address || {};
          this.skuSumSparce = res.skuSumSparce;
          this.amountPayable = res.amountPayable
        }else{
          this.$message.warning(res.message)
        }
        console.log(res);
      },
      // 提交订单
      async handleSubmit() {
        const token = getToken();
        if(!token){
          this.$router.push('/login');
          return;
        }
        if(!this.currentAddress){
          this.$message.warning('收货地址不能为空！');
          return;
        }

        let params = {
          token,
          carts: this.carts,
          addressId: this.currentAddress.id,
          orderType: this.orderType,
          origin: 0,
          //skuSum: this.skuSum
        };
        let res = await this.$post('/api/shoppingCartSettlement',params);
        if(res.code==='200'){
          console.log(res)
          let {orderId,amountPayable,orderCancelTime} = res;
          this.$router.push(`/order/pay/${orderId}/${amountPayable}/${orderCancelTime}`);
        }else{
          this.$message.warning(res.message);
        }

        // if (this.orderType === 0) {
        //   this.$router.push('/order/pay/123');
        // }
        // else {
        //   this.$router.push('/order/success');
        // }
      },
      // 切换地址
      switchChange(current) {
        if (current) {
          this.currentAddress = current;
        }
        this.switchVisible = false;
      },
      plusChange() {
        this.plusVisible = false;
        this.getAddresses();
      },
      async editChange(save) {
        if (save) {
          await this.getAddresses();
          if(this.addresses.length){
            for(let i=0;i<this.addresses.length;i++){
              let item = this.addresses[i];
              if(this.currentAddress.id===item.id){
                this.currentAddress = item
              }
            }
          }
        }
        this.editVisible = false;
      },
      // 获取地址列表
      async getAddresses() {
        let token = getToken();
        let res = await this.$get('/api/getAddresses', {
          token
        });
        if (res.code === '200') {
          this.addresses = res.addresses.reverse();
          if(!Object.keys(this.currentAddress).length){
            if(res.addresses.length){
              this.currentAddress = res.addresses[0]
            }
          }
        }
      },
    },
    components: {
      vSwitch,
      vPlus,
      vEdit
    }
  };
</script>

<style lang="scss">
  .c-order-container {
    padding-bottom: 20px;

    .title {
      height: 79px;
      line-height: 79px;
      font-size: 16px;
      color: #999999;
    }

    .c-order-wrapper {
      padding: 0 49px;
      background: #fff;
      padding-bottom: 20px;

      .c-title {
        padding-top: 27px;
        font-size: 16px;
        height: 58px;
        box-sizing: border-box;
      }

      .c-address-wrapper {
        display: flex;
        align-items: center;
        height: 148px;
        padding: 0 34px 0 29px;

        .current-address {
          flex: 0 0 618px;
          padding-right: 57px;
          display: flex;
          justify-content: space-between;
          align-items: center;
          border-right: 1px #e4e4e4 solid;
          .l {
            p {
              line-height: 32px;
              display: flex;
              align-items: center;
              .label {
                padding-right: 5px;
                color: #999999;
                font-size: 14px;
              }

              .value {
                 line-height: 32px;
                display: inline-block;
                max-width: 400px;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
                font-size: 14px;
                color: #666666;
              }
            }
          }

          .r {
            a {
              display: inline-block;
              font-size: 14px;
              color: #1abc9c;

              &:hover {
                color: rgb(51, 51, 51);
              }
            }
          }
        }

        .handle-address {

          height: 82px;
          display: flex;
          align-items: center;

          &.no-address {
            flex: 1;
            border: none;
            justify-content: flex-end;
          }

          a {
            display: inline-block;
            line-height: 43px;
            text-align: center;
            width: 149px;
            height: 45px;
            font-size: 14px;
            color: #999999;
            background-color: rgba(245, 245, 245, 1);
            box-sizing: border-box;
            border: 1px rgba(228, 228, 228, 1) solid;

            .fa {
              margin-right: 5px;
              font-size: 20px;
              color: #999999;
            }
          }

          a:hover {
            color: rgb(51, 51, 51);

            .fa {
              color: rgb(51, 51, 51);
            }
          }

          .change {
            margin: 0 10px 0 51px;
          }
        }
      }

      .pay-type {
        height: 88px;
        display: flex;
        align-items: center;

        a {
          margin: 0 1px 0 29px;
          display: inline-block;
          width: 227px;
          height: 50px;
          line-height: 48px;
          text-align: center;
          background-color: rgba(249, 249, 249, 1);
          box-sizing: border-box;
          font-size: 14px;
          border: 1px rgba(228, 228, 228, 1) solid;
          color: #999999;

          &:hover {
            color: rgb(102, 102, 102);
          }

          &.active {
            border-color: rgba(240, 72, 68, 1);
            color: rgb(240, 72, 68);
          }
        }
      }
    }

    .summary-title {
      margin-top: 13px;
      border-bottom: 1px #e4e4e4 solid;
    }

    .order-summary {
      p .label {
        flex: 0 0 965px;
      }
    }

    .submit-wrapper {
      display: flex;
      align-items: center;
      justify-content: flex-end;
      padding-right: 48px;
      height: 100px;
      background-color: rgba(249, 249, 249, 1);

      a {
        display: inline-block;
        text-align: center;
        line-height: 45px;
        font-size: 14px;
        color: #fff;
        width: 150px;
        height: 45px;
        background-color: rgba(240, 72, 68, 1);

        &:hover {
          opacity: 0.9;
        }
      }
    }
  }
</style>
