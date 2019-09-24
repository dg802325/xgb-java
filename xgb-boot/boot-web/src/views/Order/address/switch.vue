<template>
   <div class="switch-address-dialog">
      <div class="switch-address--wrapper">
        <span class="close" @click="handleClick"></span>
        <div class="dialog-title">
          选择收货地址
        </div>
        <div class="dialog-body">
         <div class="scroll">
          <div class="item "
            v-for="address in addresses"
            :key="address.id"
            :class="{'active':selected.id===address.id}"
            @click="changeEvent(address)"
            >
            <div class="default-address" v-if="address.isDefault">
              默认地址
            </div>
            <p><span class="label">收 货 人 :</span><span class="value"> {{address.receiveName}}</span></p>
            <p><span class="label">联系方式 :</span><span class="value"> {{address.receivePhone}}</span></p>
            <p><span class="label">收货地址 :</span><span class="value"> {{address.receiveProvince | formatCity(regionMap)}}{{address.receiveCity | formatCity(regionMap)}}{{address.receiveArea | formatCity(regionMap)}}{{address.detailAdd}}</span></p>
          </div>
         </div>
        </div>
        <div class="footer">
          <a href="javacript:;" class="btn default" @click="handleClick">取消</a>
          <a href="javacript:;" class="btn danger"  @click="handleOkClick">确定</a>
        </div>
      </div>
    </div>
</template>

<script>
import { getToken } from "../../../utils/auth";
import { mapGetters } from 'vuex';
export default {
  data(){
    return {
      addresses: [],
      selected: {}
    }
  },
  props: {
    item: Object
  },
  computed: {
    ...mapGetters(['regionMap'])
  },
  created(){
    this.getAddresses();
    this.selected = JSON.parse(JSON.stringify(this.item))
  },
  filters: {
    formatCity(val,map){
      if(map[val]){
          return map[val].divisionName;
       }
      return val
    }
  },
  methods:{
    changeEvent(item){
      this.selected = item;
    },
    handleOkClick(){
      this.$emit('close',this.selected)
    },
     // 获取地址列表
    async getAddresses(){
      let token = getToken();
      let res = await this.$get('/api/getAddresses',{
        token
      })
      if(res.code==='200'){
        this.addresses =  res.addresses.reverse()
      }
    },
    handleClick(){
      this.$emit('close')
    }
  }
}
</script>

<style lang="scss">
.switch-address-dialog{
  position: fixed;
  left:0;
  top: 0;
  bottom:0;
  right:0;
  z-index:9999;
  background: rgba(0,0,0,0.34);
  .switch-address--wrapper{
    position: fixed;
    left:50%;
    top: 50%;
    transform: translate(-50%,-50%);
    padding: 0 35px 35px;
    width: 530px;
    background:#fff;
    border-radius: 3px;
    .dialog-title{
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight: 700;
      font-size: 20px;
      text-align: center;
      height:50px;
      line-height: 50px;
    }
    .close{
      position: absolute;
      right: 20px;
      top: 20px;
      cursor: pointer;
      width: 13px;
      height: 13px;
      background: url(../images/u977.png);
      &:hover{
        background: url(../images/u978.png);
      }
    }
    .dialog-body{
      max-height: 450px;
      overflow: hidden;
      overflow-y: auto;
      .item{
        cursor: pointer;
        position: relative;
        margin-bottom: 10px;
        height: 112px;
        box-sizing: border-box;
        display: flex;
        flex-direction: column;
        justify-content: center;
        border:1px #e4e4e4 solid;
        .default-address{
          position: absolute;
          right: 25px;
          bottom:17px;
          font-size: 12px;
          color: #F04844;
        }
        p{
          display: flex;
          line-height: 28px;
          .label{
            flex: 0 0 97px;
            padding-right: 2px;
            text-align: right;
            font-size: 14px;
            color: rgb(153, 153, 153);
          }
          .value{
            font-size: 14px;
            color: #666666;
          }
        }
      }
      .active{
        border-color: rgba(240, 72, 68, 1);
      }
    }
    .footer {
      padding:20px 0 20px;
      display: flex;
      justify-content: center;
      .btn {
        margin: 0 6px;
        display: block;
        width: 150px;
        height: 45px;
        color: #ffffff;
        background-color: rgba(26, 188, 156, 1);
        line-height: 45px;
        text-align: center;
        font-size: 14px;
        &:hover {
          opacity: 0.9;
        }
      }
      .default{
        background:#f5f5f5;
        border:1px #e4e4e4 solid;
        color: #999999;
        &:hover{
          color:#333333
        }
      }
      .danger{
        background:#f04844;
        border:1px #f04844 solid;
        color: #fff;
        &:hover{
          color:#fff;
        }
      }
    }
  }
}
</style>
