<template>
    <div>
        <div>
            <glob-breadcrumb v-if="orderStatus=='1'" title="订单详情-待县域服务商审核"/>
            <glob-breadcrumb v-else-if="orderStatus=='2'" title="订单详情-待供应商审核"/>
            <glob-breadcrumb v-else title="订单详情"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        订单详情
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
                                    <span v-if="orderStatus=='0'">待提交</span>
                                    <span v-else-if="auditeStatus=='2'">审核未通过</span>
                                    <span v-else-if="orderStatus=='1'">待县域服务商审核</span>
                                    <span v-else-if="orderStatus=='2'">待供应商审核</span>
                                    <span v-else-if="orderStatus=='4'">待收款</span>
                                    <span v-else-if="orderStatus=='5'">待发货</span>
                                    <span v-else-if="orderStatus=='7'">待核算</span>
                                    <span v-else-if="orderStatus=='8'">已完结</span>
                                </td>
                                <td>{{purchaseUser}}</td>
                                <td>{{createTime}}</td>
                                </tbody>
                            </table>
                        </div>

                        <div style="padding-top: 50px;">
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">价格条款</div>

                            <table class="left-table" style="width: 1042px;height: 90px;">
                                <tbody>
                                <tr>
                                    <td>价格条款</td>
                                    <td>
                                        <span v-if="priceProvisions=='0'">出厂价</span>
                                        <span v-if="priceProvisions=='1'">火车车板价</span>
                                        <span v-if="priceProvisions=='2'">到站价</span>
                                        <span v-if="priceProvisions=='3'">送到价</span>
                                        <span v-if="priceProvisions=='4'">出库价</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>运输方式</td>
                                    <td>
                                        <span v-if="deliverWay=='0'">汽运</span>
                                        <span v-if="deliverWay=='1'">海运</span>
                                        <span v-if="deliverWay=='2'">空运</span>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <div style="padding-top: 50px;">
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">商品明细</div>
                            <div class="table_border">
                                <el-table
                                        :data="list"
                                        border
                                        style="width: 100%">
                                    <el-table-column align="center" label="编号">
                                        <template slot-scope="{row}" v-if="row.skuVO">
                                            <span v-if="row.skuVO.spuNo">{{row.skuVO.spuNo}}</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column align="center" label="商品名称" :show-overflow-tooltip="true" width="150">
                                        <template slot-scope="{row}" v-if="row.skuVO">
                                            <span v-if="row.skuVO.spuName">{{row.skuVO.spuName}}</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="name" align="center" label="商品图片">
                                        <template slot-scope="{row}" v-if="row.skuVO">
                                            <span v-if="row.skuVO.imgUrl"><img :src="row.skuVO.imgUrl" width="80px;"/></span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="" align="center" label="商品价格" width="160">
                                        <template slot-scope="{row}" v-if="row.skuVO">
                                            <span v-if="row.spuPrice">{{'¥'+row.spuPrice}}</span>
                                            <span v-if="row.skuVO.spuMetering">/{{row.skuVO.spuMetering | formatData(shpMeteringMap)}}</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column align="center" label="数量" :show-overflow-tooltip="true" width="150">
                                        <template slot-scope="{row}" v-if="row.skuVO">
                                            <span v-if="row.skuNumber">{{row.skuNumber}}</span>
                                            <span v-if="row.skuVO.spuMetering">{{row.skuVO.spuMetering | formatData(shpMeteringMap)}}</span>
                                        </template>
                                    </el-table-column>
                                </el-table>
                            </div>
                        </div>

                        <div style="padding-top: 50px;">
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">收货地址</div>
                            <table class="glob-table" cellspacing="0" cellpadding="0" border="0" width="100%">
                                <col width="300">
                                <col width="200">
                                <col width="140">
                                <col width="80">
                                <thead>
                                <th>所在省、市、区</th>
                                <th>详细地址</th>
                                <th>选择商品</th>
                                <th>数量</th>
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
                                        </td>
                                        <td>
                                            <span>{{row.receiveAddress}}</span>
                                        </td>
                                        <td>
                                            <span>{{row.orderSkuId | formatData(skuMap)}}</span>
                                        </td>
                                        <td>
                                            <span>{{row.receiveNum}}</span>
                                            <span v-if="meteringMap[row.orderSkuId]">{{meteringMap[row.orderSkuId] | formatData(shpMeteringMap)}}</span>
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
                        <div style="padding-top: 50px;">
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">总计</div>
                            <div class="bottom_div">
                                <el-form label-position="right" label-width="100px" class="el-form-item_2">
                                    <el-form-item label="运费：">
                                        <span>{{'¥'+freightFee}}</span>
                                    </el-form-item>
                                    <el-form-item label="商品总价：">
                                        <span>{{'¥'+totalAmount}}</span>
                                    </el-form-item>
                                    <el-form-item label="合计：">
                                        <span>{{'¥'+(freightFee+totalAmount)}}</span>
                                    </el-form-item>
                                </el-form>
                            </div>
                        </div>

                        <div class="button_bottom" align="center" v-if="isAudite && orderStatus=='2'">
                            <el-button class="el-button_2" type="primary" @click="passEvent">通过</el-button>
                            <el-button class="el-button_2" type="primary" @click="refuseEvent">拒绝</el-button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import {setDictMap} from "../../utils/main";

    export default {
        data() {
            return {
                purchaseUser:'',
                isAudite:false,
                skuMap:{},
                provinceMap:{},
                meteringMap:{},
                shpMeteringMap:{},
                addressList:[],
                createTime:'',
                orderStatus:'',
                orderNo:'',
                auditeFlow:'',
                deliverWay:'',
                priceProvisions:'',
                id:'',
                list:[],
                pagination:[],
                totalAmount:0,
                freightFee:0,
                cityMap:{},
                areaMap:{},
                auditeStatus:'',
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

            //获得省
            async getProvinceList() {
                let res = await this.$get("/admin/getAllProvince")
                this.provinceList = res
                this.provinceMap = setDictMap(res,'id','divisionName')
            },
            //获得所有的市
            async getAllCity(){
              let res = await this.$get('/admin/getAllCityList')
                this.cityMap = setDictMap(res,'id','divisionName')
            },
            //获得所有的区
            async getAllArea(){
                let res = await this.$get('/admin/getAllAreaList')
                this.areaMap = setDictMap(res,'id','divisionName')
            },

            //回显数据
            async backData(id){
                //订单基本信息
                let sale = await this.$get('/supplier/getOrderById',{id:id})
                //销售订单信息
                if (sale.saleOrder) {
                    let res = sale.saleOrder
                    this.orderNo = res.orderNo
                    this.orderStatus = res.orderStatus
                    this.auditeStatus = res.auditeStatus
                    this.createTime = res.createTime
                    this.priceProvisions = res.priceProvisions
                    this.deliverWay = res.deliverWay
                    this.auditeFlow = res.auditeFlow
                    this.isAudite = true
                    // if (res.orderStatus=='2') {
                    //     //当前账户是否是订单审核人
                    //     let isAudite = await this.$get('/dealer/isAuditePerson',{supplierAuditeId:res.supplierAuditeId})
                    //     if (isAudite.code==200) {
                    //         this.isAudite = true
                    //     }
                    // }
                }
                //采购方信息
                if (sale.purchaseUser) {
                    this.purchaseUser = sale.purchaseUser.userName
                }
                //商品信息
                let sku = await this.$get('/dealer/getOrderShop',{erpOrderId:id})
                if (sku.code==200) {
                    this.list = sku.list
                    let totalAmoun = 0
                    let freightFee = 0
                    this.list.forEach(item=>{
                        totalAmoun += item.spuPrice * item.skuNumber
                        freightFee += item.skuVO.spuExpressPrice
                    })
                    this.totalAmount = totalAmoun
                    this.freightFee = freightFee
                }
                //收货地址
                let addresses = await this.$get('/supplier/getAddressByOrderId',{erpOrderId:id})
                if (addresses.code==200) {
                    let list = addresses.list
                    list.forEach(async item=>{
                        this.$set(item,'edit',false)
                    })
                    this.addressList = list
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
            //审核通过
            async passEvent(){
                let res = await this.$post('/supplier/supplierAudite',{id:this.id,auditeValue:'4'})
                if (res.code==200) {
                    this.$message.success(res.message)
                    this.backData(this.id);
                } else {
                    this.$message.success(res.message)
                }
            },
            //审核拒绝
            async refuseEvent(){
                let res = await this.$post('/supplier/supplierAudite',{id:this.id,auditeValue:'9'})
                if (res.code==200) {
                    this.$message.success(res.message)
                } else {
                    this.$message.success(res.message)
                }
            },
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
