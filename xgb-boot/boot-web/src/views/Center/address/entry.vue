<template>
  <div class="c-border address-container">
    <p class="title">
      <span>收货地址</span>
      <el-button type="text" class="add-button" @click="plusEvent">添加地址</el-button>
    </p>
    <div class="address-items">
      <div class="address-item" v-for="address in addresses" :key="address.id">
        <div class="l">
          <div class="row">
            <span class="label">收 货 人 :</span>
            <span class="value">{{address.receiveName}}</span>
          </div>
          <div class="row">
            <span class="label">联系方式 :</span>
            <span class="value">{{address.receivePhone}}</span>
          </div>
          <div class="row">
            <span class="label">收货地址 :</span>
            <span
              class="value"
            >{{address.receiveProvince | formatCity(regionMap)}}{{address.receiveCity | formatCity(regionMap)}}{{address.receiveArea | formatCity(regionMap)}}{{address.detailAdd}}</span>
          </div>
        </div>
        <div class="r">
          <p class="default" v-if="address.isDefault">默认地址</p>
          <button class="btn" @click="setDefault(address)" v-if="!address.isDefault">设为默认</button>
          <el-button type="text" @click="editAddress(address)" class="edit">编辑</el-button>
          <a href="javascript:;"  @click="deleteAddress(address)" class="delete">删除</a>
        </div>
      </div>
    </div>
    <vPlus v-if="plusVisible" @close="plusChange"/>
    <vEdit v-if="editVisible" :item='currentAddress' @close="editChange"/>
  </div>
</template>

<script>
import { getToken } from '../../../utils/auth'
import { mapGetters } from 'vuex';
import vPlus from "../../Order/address/plus";
import vEdit from "../../Order/address/edit";

export default {
  data(){
    return {
      plusVisible:false,
      editVisible: false,
      currentAddress: {},
      addresses: []
    }
  },
  computed: {
    ...mapGetters(['regionMap'])
  },
  filters: {
    formatCity(val,map){
      if(map[val]){
        return map[val].divisionName;
      }
      return val
    }
  },
  created(){
    this.getAddresses();
  },
  methods: {
    plusEvent() {
      this.plusVisible = true;
    },
    plusChange(){
      this.plusVisible = false;
      this.getAddresses();
    },

    // 获取地址列表
    async getAddresses(){
      let token = getToken();
      let res = await this.$get('/api/getAddresses',{
        token
      });
      if(res.code==='200'){
        this.addresses =  res.addresses.reverse();
      }else{
        this.addresses = [];
      }
    },
    // 编辑地址
    editAddress(val){
      this.currentAddress = val;
      this.editVisible = true;
    },
    editChange(){
      this.editVisible = false;
      this.getAddresses();
    },
    // 设为默认
    async setDefault(address){
      let { id } = address;
      let token = getToken();
      let res = await this.$get('/api/setDefault',{
        id,
        token
      });
      this.Message(res.message,res.code)
      this.getAddresses();
    },
    Message(mes,code){
      if(code==='200'){
        this.$message.success(mes)
      }else{
        this.$message.error(mes)
      }
    },
    // 删除地址
    async deleteAddress(address){
      let { id } = address;
       this.$$confirm("确定删除次条数据吗？")
        .then( async () => {
           let res = await this.$post('/api/deleteMemberAddress',{
              id
            });
            this.Message(res.message,res.code);
            this.getAddresses();
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: "已取消删除"
          });
        });
    },
  },
  components: {
    vPlus,
    vEdit
  }
}
</script>

<style lang="scss">
.address-container {
  background: #fff;
  padding: 0 39px 50px;
  min-height: 533px;
  box-sizing: border-box;
  .title {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 51px 0 0 10px;
    height: 98px;
    font-size: 16px;
    box-sizing: border-box;
    .add-button{
      span{
        font-size: 14px;
        color:#1abc9c;
      }
    }
  }
  .address-items {
    .address-item {
      margin-bottom: 20px;
      display: flex;
      height: 148px;
      border: 1px #e4e4e4 solid;
      .l {
        padding-top: 26px;
        flex: 1;
        .row {
          display: flex;
          line-height: 32px;
          .label {
            padding-left: 30px;
            width: 73px;
            padding-right: 4px;
            font-size: 14px;
            color: #999999;
          }
          .value {
            width: 400px;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
            display: inline-block;
            font-size: 14px;
          }
        }
      }
      .r {
        flex: 0 0 90px;
        padding-right: 34px;
        text-align: center;
        display: flex;
        flex-direction: column;
        justify-content: center;
        .btn,
        .default {
          margin: 9px 0 0;
          width: 90px;
          height: 30px;
          line-height: 30px;
          text-align: center;
          background: #1abc9c;
          color: #fff;
          box-sizing: border-box;
        }
        .btn {
          border: 1px #e4e4e4 solid;
          background: #f5f5f5;
          color: #999999;
          cursor: pointer;
          &:hover {
            color: rgb(51, 51, 51);
          }
        }
        .delete {
          font-size: 12px;
          color: #1abc9c;
        }
        .edit{
          font-size: 12px;
          color: #666;
        }
      }
    }
  }
}
</style>
