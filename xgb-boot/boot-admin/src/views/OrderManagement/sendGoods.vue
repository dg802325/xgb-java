<template>
    <div>
        <div>
            <glob-breadcrumb title="订单发货"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        订单发货
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx_3">
                        <div>
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">基本信息</div>
                            <table class="glob-table" cellspacing="0" cellpadding="0" style="width: 1043px;">
                                <col width="250px">
                                <col width="250px">
                                <col width="250px">
                                <col width="250px">
                                <thead>
                                <th>订单编号</th>
                                <th>订单状态</th>
                                <th>采购方</th>
                                <th>下单时间</th>
                                </thead>
                                <tbody>
                                <td>{{orderNo}}</td>
                                <td>
                                    <span v-if="orderStatus=='5'">待发货</span>
                                </td>
                                <td>{{purchaseUser}}</td>
                                <td>{{createTime}}</td>
                                </tbody>
                            </table>
                        </div>

                        <div style="padding-top: 50px;">
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">收货信息</div>
                            <table class="glob-table" cellspacing="0" cellpadding="0" border="0" width="100%">
                                <col width="200">
                                <col width="150">
                                <col width="80">
                                <col width="100">
                                <thead>
                                <th>收货地址</th>
                                <th>商品名称</th>
                                <th>申请数量</th>
                                <th>操作</th>
                                </thead>
                                <tbody>
                                <template v-if="addressList.length" v-for="(row,index) in addressList">
                                    <tr>
                                        <td>
                                            <span>{{row.receivePro | formatData(provinceMap)}}</span>
                                            &nbsp;
                                            <span>{{row.receiveCity | formatData(cityMap)}}</span>
                                            &nbsp;
                                            <span>{{row.receiveArea | formatData(areaMap)}}</span>
                                            &nbsp;
                                            <span>{{row.receiveAddress}}</span>
                                        </td>
                                        <td>
                                            <span>{{row.orderSkuId | formatData(skuMap)}}</span>
                                        </td>
                                        <td>
                                            <span>{{row.receiveNum}}</span>
                                            <span v-if="meteringMap[row.orderSkuId]">{{meteringMap[row.orderSkuId] | formatData(shpMeteringMap)}}</span>
                                        </td>
                                        <td>
                                            <el-button v-if="row.receiveStatus=='0'" type="text" @click="toSendEvent(row)">去发货</el-button>
                                            <el-button v-else type="text" @click="toSendEvent(row)">查看发货信息</el-button>
                                        </td>
                                    </tr>
                                </template>
                                <template v-if="!addressList.length">
                                    <tr>
                                        <td colspan="7">
                                            <span>
                                                暂无收货地址
                                            </span>
                                        </td>
                                    </tr>
                                </template>
                                </tbody>
                            </table>
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <SendAddress v-if="sendAddressVisible" :sendAddressVisible="sendAddressVisible" @closeSendAddress="closeSendAddress"
                        :receiveItem="receiveItem" :cityMap="cityMap" :provinceMap="provinceMap" :areaMap="areaMap"
                        :skuMap="skuMap" :provinceList="provinceList" :id="id" :shpMeteringMap="shpMeteringMap"></SendAddress>

    </div>
</template>
<script>
    import {setDictMap} from "../../utils/main";
    import SendAddress from "./insertSend.vue";
    export default {
        data() {
            return {
                purchaseUser:'',
                sendAddressVisible:false,
                skuMap:{},
                provinceMap:{},
                meteringMap:{},
                addressList:[],
                provinceList:[],
                createTime:'',
                orderStatus:'',
                orderNo:'',
                id:'',
                cityMap:{},
                areaMap:{},
                receiveItem:{},
                shpMeteringMap:{},
            }
        },
        created(){
            this.getProvinceList()
            this.getAllCity()
            this.getAllArea()
            this.getMeteringMap()
            this.id = this.$route.params.id
            this.purchaseSkuList(this.id)
            this.backData(this.id);
        },
        methods: {
            getMeteringMap(){
                this.$get('/admin/getSpuDict').then(res=>{
                    this.shpMeteringMap = setDictMap(res.DictList,'dictValue','name')
                })
            },
            closeSendAddress(){
                this.sendAddressVisible = false
                this.backData(this.id);
            },
            toSendEvent(row){
                this.receiveItem = row
                this.$set(this.receiveItem,'metering',this.meteringMap[row.orderSkuId])
                this.sendAddressVisible = true
            },
            //获得省
            getProvinceList() {
                this.$get("/admin/getAllProvince").then(res=>{
                    this.provinceList = res
                    this.provinceMap = setDictMap(res,'id','divisionName')
                })
            },
            //获得所有的市
            getAllCity(){
              this.$get('/admin/getAllCityList').then(res=>{
                  this.cityMap = setDictMap(res,'id','divisionName')
              })
            },
            //获得所有的区
            getAllArea(){
                this.$get('/admin/getAllAreaList').then(res=>{
                    this.areaMap = setDictMap(res,'id','divisionName')
                })
            },

            //回显数据
            async backData(id){
                //订单基本信息
                let sale = await this.$get('/supplier/getOrderById',{id:id})
                if (sale.saleOrder) {
                    let res = sale.saleOrder
                    this.orderNo = res.orderNo
                    this.orderStatus = res.orderStatus
                    this.createTime = res.createTime
                }
                //采购方信息
                if (sale.purchaseUser) {
                    this.purchaseUser = sale.purchaseUser.userName
                }
                //收货地址
                let addresses = await this.$get('/supplier/getAddressByOrderId',{erpOrderId:id})
                if (addresses.code==200) {
                    this.addressList = addresses.list
                }
            },
            //获取采购订单商品list
            async purchaseSkuList(id){
                let res = await this.$get('/supplier/getOrderShop',{erpOrderId:id})
                let list = res.list
                let skuList = []
                list.forEach(item=>{
                    skuList.push({'id':item.id,'skuName':item.skuVO.spuName,'metering':item.skuVO.spuMetering})
                })
                this.skuMap = setDictMap(skuList,'id','skuName')
                this.meteringMap = setDictMap(skuList,'id','metering')
            },
        },
        components:{
            SendAddress,
        }
    }
</script>

<style>
    .content_b {
        width: 99.8%;
        height: auto;
        background-color: #fff;
        border:1px #e4e4e4 solid;
    }
    .content_b_tx_3 {
        padding-top: 50px;
        padding-bottom: 100px;
        width: 95%;
        margin: 0 auto;
    }

    .el-button_2{
        width:80px;
        height: 35px;
        padding:10px 20px;
        border-radius: 2px;
    }

    .el-button--primary{
        background-color:#1abc9c;
        border-color:#1abc9c;
    }

    .button_bottom{
        padding-top: 50px;
        width: 1042px;
    }

    .bottom_div {
        border: solid;
        border-width: 1px;
        border-color: #e4e4e4;
        background-color: #F9FAFC;
        width: 1040px;
        height: 120px;
    }
    .el-form-item_2 .el-form-item {
        padding-left: 880px;
        margin-bottom: 0px;
    }

    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }

</style>
