<template>
  <div style="background: #f5f5f5;">
    <div class="container my-cart-container" :class="{'no-sku-container':cartLists.length==0}">
      <div class="title">我的购物车</div>
      <table class="v-sku-info-table" v-if="cartLists.length">
        <thead>
          <tr>
            <td width="80">
              <!--<p>-->
                <!--<el-checkbox v-model="checkedAll" @change="handleCheckedAllSkuChange" style="margin:0"></el-checkbox>-->
                <!--<span style="margin-left:5px;color: #999999;">全选</span>-->
              <!--</p>-->
            </td>
            <td width="403" align="left" style="text-indent: 80px">商品信息</td>
            <td width="150">单价</td>
            <td width="150">数量</td>
            <td width="110">小计</td>
            <td width="150">操作</td>
          </tr>
        </thead>
        <tbody>
          <template v-for="(store,i) in cartLists" >
            <tr>
              <td class="store-name" colspan="6"><el-checkbox style="margin-right:8px" v-model="store.checked" @change="handleStoreChange(i)"></el-checkbox>{{store.storeName}}</td>
            </tr>
            <tr v-for="sku in store.lists" :key="sku.id">
              <td align="left">
                <p style="padding:20px 0 0 21px;">
                  <el-checkbox v-model="sku.checked" @change="handleCheckedSkuChange(i)"></el-checkbox>
                </p>
              </td>
              <td align="left">
                <div class="t-sku-info">
                  <div class="t-cover">
                    <router-link :to="'/detail/'+sku.skuId">
                      <img :src="sku.resourcesUrl" />
                    </router-link>
                  </div>
                  <div class="info">
                    <p class="name">
                      <router-link :to="'/detail/'+sku.skuId">{{sku.skuName}}</router-link>
                    </p>
                    <!-- <p class="type">适合种玉米、黄瓜</p>
                    <p class="type green">拼团</p>-->
                  </div>
                </div>
              </td>
              <td>¥{{sku.skuPrice.toFixed(2)}}</td>
              <td>
                <el-input-number :min="1" size="medium" @change="handleNumberChange(i,sku.skuId)" style="width:130px;" v-model="sku.commonityCount"></el-input-number>
              </td>
              <td>
                <span class="red">¥{{ (sku.commonityCount*sku.skuPrice).toFixed(2) }}</span>
              </td>
              <td>
                <a href="javascript:;" @click="deleteEvent(sku.id)">删除</a>
              </td>
            </tr>
          </template>

        </tbody>
      </table>
      <!-- <table class="v-sku-info-table" style="margin-top:40px;">
      <thead class="write">
        <tr>
          <td width="80" align="left" >
            <p style="padding-left:20px;">已失效商品</p>
          </td>
          <td width="403"></td>
          <td width="150"></td>
          <td width="150"></td>
          <td width="110"></td>
          <td width="150"></td>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td align="left">
            <p style="padding:20px 0 0 21px;">
              <el-checkbox v-model="checked"></el-checkbox>
            </p>
          </td>
          <td align="left">
            <div class="t-sku-info">
              <div class="t-cover">
                <img src="./images/sku.png" />
              </div>
              <div class="info">
                <p class="name">
                  <a href="/detail" class>心连心氮肥 5KG/袋</a>
                </p>
                <p class="type">适合种玉米、黄瓜</p>
                <p class="type red">已售磬</p>
              </div>
            </div>
          </td>
          <td>¥249</td>
          <td>
            <el-input-number size="medium" style="width:130px;" v-model="num"></el-input-number>
          </td>
          <td>
            <span class="red">¥249</span>
          </td>
          <td>
            <a href="javascript:;" @click="deleteEvent">删除</a>
          </td>
        </tr>
      </tbody>
      </table>-->
      <div class="c-border cart-bar-wrapper" v-if="cartLists.length">
        <div class="l">
          <p>
            <!--<el-checkbox v-model="checkedAll" @change="handleCheckedAllSkuChange" style="margin-right: 10px;"></el-checkbox>全选-->
          </p>
          <!--<a href="javascript:;">删除选择的商品</a>-->

        </div>
        <div class="r">
          <p class="total">
            共
            <span class="red">{{statistics.length}}</span> 件商品，已选择
            <span class="red">{{statistics.checkeds}}</span> 件 | 商品合计 :
            <span class="gray">¥{{statistics.price.toFixed(2)}}</span> | 应付总额：
            <span class="red">
              <b>¥{{statistics.price.toFixed(2)}}</b>
            </span>
          </p>
          <div class="v-tooltip" v-show="disabled">请勾选需要结算的商品</div>
          <el-button
            type="danger"
            class="settlement"
            :disabled="disabled"
            @click="handleSubmit"
          >下单结算</el-button>
        </div>
      </div>

      <div class="no-sku" v-if="!cartLists.length">
        <img src="./images/u1810.svg" />
        <p class="label">购物车内暂时没有商品</p>
        <router-link to="/home" tag="div" class="btn">继续逛逛</router-link>
      </div>
    </div>
  </div>
</template>

<script>
import { getToken } from "../../utils/auth";
import { mapActions, mapGetters } from "vuex";
import {Base64} from 'js-base64';
export default {
  data() {
    return {
      disabled: false,
      checked: false,
      num: 1,
      cartLists: [],
      checkedSkus: [],
      checkedAll: false,
      statistics: {
        length: 0,
        checkeds:0,
        price: 0
      }
    };
  },
  computed: {
    ...mapGetters(["cartList"])
  },
  watch: {
    cartList(){
      this.formatCartList();
    }
  },
  mounted(){
    this.formatCartList();
  },
  methods: {
    // 全选事件
    handleCheckedAllSkuChange(checked){
      this.cartLists.forEach(sku=>{
        sku['checked'] = checked;
      });
      this.checkedSkus =  checked ? this.cartLists : [];
      this.handleStatistics();
      this.disabled = false;
    },
    // 商品复选框选中事件
    handleCheckedSkuChange(index){
      let cartLists = JSON.parse(JSON.stringify(this.cartLists));
      let current = cartLists[index];
      let checkeds = current.lists.filter(item=>item.checked);
      for(let i=0;i<cartLists.length;i++){
        let store = cartLists[i];
        if(store.id!==current.id){
          store['checked'] = false;
          store.lists.forEach(item=>{
            item['checked'] = false;
          })
        }
      }
      if(checkeds.length===current.lists.length){
        current.checked = true;
      }else{
        current.checked = false;
      }
      this.checkedSkus = checkeds;
      this.cartLists = cartLists;
      this.handleStatistics();

    },
    // 格式化购物车数据
    formatCartList() {
      let cartLists = JSON.parse(JSON.stringify(this.cartList));
      let length = 0;
      cartLists.forEach(store => {
        store["checked"] = false;
        store.lists.forEach(sku=>{
          sku["checked"] = false;
          sku.skuPrice = sku.skuPrice || 0;
          length += sku.commonityCount;
        })
      });
      this.statistics.length = length;
      this.cartLists = cartLists;
    },
    // 购物车数量更改
    handleNumberChange(index,id){
      let node = this.cartLists[index].lists.filter(item=>item.skuId==id);
      this.updateCarNum(node[0]);
      this.handleStatistics();
    },
    // 修改购物车数量
    async updateCarNum({skuId,commonityCount}){
      let token = getToken();
      await this.$post('/api/updateCarNum',{
        token,
        skuId,
        commonityCount
      })
    },
    // 选中统计
    handleStatistics(){
      let checkeds = 0;
      let price = 0;
      let length = 0;
      this.checkedSkus.forEach(sku => {
        length += sku.commonityCount;
        checkeds += sku.commonityCount;
        price += sku.commonityCount * sku.skuPrice;
      });
      this.statistics.length = length;
      this.statistics.checkeds = checkeds;
      this.statistics.price = price;
    },
    // 店铺选择
    handleStoreChange(index){
      let cartLists = JSON.parse(JSON.stringify(this.cartLists));
      let current = cartLists[index];
      if(current.checked){
        current.lists.forEach(item=>{
          item['checked'] = true;
        });
        for(let i=0;i<cartLists.length;i++){
            let store = cartLists[i];
            if(store.id!==current.id){
              store['checked'] = false;
              store.lists.forEach(item=>{
                item['checked'] = false;
              })
            }
        }
        this.checkedSkus = current.lists;
      }else{
        current.lists.forEach(item=>{
          item['checked'] = false;
        })
        this.checkedSkus = [];
      }
      this.handleStatistics();
      this.cartLists = cartLists;
    },
    handleSubmit() {
      //this.$router.push("/order");
      const checkedSkus = this.checkedSkus;
      if(checkedSkus.length===0){
        this.disabled = true;
        setTimeout(() => {
          this.disabled = false
        },2000);
        return;
      }
      let carts = checkedSkus.map(sku=>({
          id: sku.skuId,
          skuNum: sku.commonityCount
      }));
      this.$router.push('/cart/order?carts='+Base64.encode(JSON.stringify(carts)));
    },
    // 删除商品
    deleteEvent(id) {
      this.$$confirm("确定删除此商品吗？").then(async () => {
        let res = await this.$post("/api/deleteShoppingCart", {
          id
        });
        this.$$message(res.message, res.code);
        this.queryCartList();
      }).catch(e=>{

      });
    },
    ...mapActions(["queryCartList"])
  }
};
</script>

<style lang="scss">
.my-cart-container {
  padding: 0 0 30px;
  .title {
    font-size: 16px;
    color: #999999;
    line-height: 80px;
  }
  .v-sku-info-table {
    .write td {
      height: 48px;
      line-height: 48px;
      background: #fff;
    }
    thead td {
      height: 78px;
      line-height: 78px;
    }
    tbody {
      background: #fff;
      .red {
        padding-top: 10px;
        color: #f04844;
      }
      .green {
        padding-top: 10px;
        color: #42b197;
      }
      td {
        font-size: 16px;
        line-height: 36px;
        padding-top: 20px;
        vertical-align: top;
        height: 120px;
      }
      .store-name{
        padding: 10px 20px;
        height: 30px;
        text-align: left;
        background: #fbfbfb;
      }
      .t-cover {
        margin-right: 10px;
      }
      .t-sku-info .type {
        line-height: 1;
        font-size: 14px;
      }
      .t-sku-info img {
        width: 100px;
        height: 100px;
      }
    }
  }
  .cart-bar-wrapper {
    padding-left: 20px;
    display: flex;
    align-items: center;
    justify-content: space-between;
    margin-top: 20px;
    height: 78px;
    background: #fff;
    .l {
      display: flex;
      p {
        font-size: 14px;
        color: #999999;
      }
      a {
        margin-left: 20px;
        font-size: 14px;
        &:hover {
          color: rgb(26, 188, 156);
        }
      }
    }
    .total {
      margin-right: 20px;
      font-size: 14px;
      color: #999;
      .red {
        color: #f04844;
      }
      .gray {
        color: #999999;
      }
      b {
        font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
        font-weight: 700;
        font-size: 20px;
        color: #f04844;
      }
    }
    .r {
      position: relative;
      display: flex;
      align-items: center;

      .settlement {
        width: 200px;
        height: 78px;
        border-radius: 0;
        background: #f04844;
        span {
          color: #fff;
          font-size: 18px;
        }
        &.is-disabled {
          border: 1px rgb(204, 204, 204) solid;
          background: rgb(204, 204, 204);
        }
      }
      .v-tooltip {
        padding: 13px 2px 0;
        text-align: center;
        line-height: 20px;
        position: absolute;
        right: 2px;
        top: -65px;
        width: 200px;
        height: 60px;
        box-sizing: border-box;
        background: url(./images/u1616.png) no-repeat;
        font-size: 16px;
        color: #f04844;
        &:hover {
          background-image: url(./images/u1617.png);
          color: #fff;
        }
      }
    }
  }
}
.no-sku-container {
  padding-bottom: 20px;
}
.no-sku {
  padding-top: 118px;
  height: 330px;
  background: #fff;
  border: 1px #e4e4e4 solid;
  text-align: center;
  img {
    width: 115px;
    height: 115px;
  }
  .label {
    padding: 19px 0 30px;
    font-size: 20px;
    color: #999999;
  }
  .btn {
    margin: 0 auto;
    width: 149px;
    height: 45px;
    background-color: rgba(245, 245, 245, 1);
    box-sizing: border-box;
    border-width: 1px;
    border-style: solid;
    border-color: rgba(228, 228, 228, 1);
    color: #999999;
    font-size: 14px;
    display: flex;
    align-items: center;
    justify-content: center;
    cursor: pointer;
  }
  .btn:hover {
    color: rgb(51, 51, 51);
  }
}
</style>
