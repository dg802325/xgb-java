<template>
    <el-dialog title="发货信息" :visible.sync="sendAddressVisible"  width="1040px" :before-close="closeEvent">

        <div style="padding-bottom: 20px;">
            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">收货信息</div>
            <table class="left-table5" style="width: 1000px;">
                <tbody>
                <tr>
                    <td>收货地址</td>
                    <td>
                        <span>{{receiveItem.receivePro | formatData(provinceMap)}}</span>
                        &nbsp;
                        <span>{{receiveItem.receiveCity | formatData(cityMap)}}</span>
                        &nbsp;
                        <span>{{receiveItem.receiveArea | formatData(areaMap)}}</span>
                        &nbsp;
                        <span>{{receiveItem.receiveAddress}}</span>
                    </td>
                    <td>商品名称</td>
                    <td><span>{{receiveItem.orderSkuId | formatData(skuMap)}}</span></td>
                </tr>
                <tr>
                    <td>申请数量</td>
                    <td>
                        <span>{{receiveItem.receiveNum}}</span>
                        <span v-if="receiveItem.metering">{{receiveItem.metering | formatData(shpMeteringMap)}}</span>
                    </td>
                    <td>收货人</td>
                    <td>{{receiveItem.receivePerson}}</td>
                </tr>
                <tr>
                    <td>收货人电话</td>
                    <td>{{receiveItem.receivePhone}}</td>
                    <td></td>
                    <td></td>
                </tr>
                </tbody>
            </table>
        </div>

        <div style="padding-bottom: 30px;">
            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">发货信息</div>
            <table class="left-table5" style="width: 1000px;">
                <tbody>
                <tr>
                    <td>发货仓库</td>
                    <td>
                        <el-select v-model="storehouseId" style="width: 200px;" v-if="receiveItem.receiveStatus=='0'">
                            <el-option v-for="item in storehouseList"
                                :key="item.id"
                                :label="item.storehouseName"
                                :value="item.id"></el-option>
                        </el-select>
                        <span v-else>{{storehouseId | formatData(storehouseMap)}}</span>
                    </td>
                    <td>发货数量</td>
                    <td>
                        <span>
                           <el-input v-model="sendNum" style="width: 200px;" v-if="receiveItem.receiveStatus=='0'"></el-input>
                            <span v-else>{{sendNum}}</span>
                        </span>
                        <span v-if="receiveItem.metering">&nbsp;{{receiveItem.metering | formatData(shpMeteringMap)}}</span>
                    </td>
                </tr>
                <tr>
                    <td>发货地址</td>
                    <td>
                        <span v-if="receiveItem.receiveStatus=='0'">
                             <el-select
                                     style="width: 100px;" filterable clearable v-model="sendPro" placeholder="请选择省" >
                            <el-option v-for="item in provinceList"
                                       :key="item.id"
                                       :label="item.divisionName"
                                       :value="item.id"></el-option>
                            </el-select>
                            &nbsp;
                            <el-select
                                    style="width: 100px;" filterable clearable v-model="sendCity" placeholder="请选择市">
                                <el-option v-for="item in cityList"
                                           :key="item.id"
                                           :label="item.divisionName"
                                           :value="item.id"></el-option>
                            </el-select>
                            &nbsp;
                            <el-select
                                    style="width: 100px;" filterable clearable v-model="sendArea" placeholder="请选择区">
                                <el-option v-for="item in areaList"
                                           :key="item.id"
                                           :label="item.divisionName"
                                           :value="item.id"></el-option>
                            </el-select>
                        </span>
                        <span v-else>
                            {{sendPro | formatData(provinceMap)}}&nbsp;
                            {{sendCity | formatData(cityMap)}}&nbsp;
                            {{sendArea | formatData(areaMap)}}
                        </span>
                    </td>
                    <td>发货人</td>
                    <td>
                        <el-input v-model="sendPerson" style="width: 200px;" v-if="receiveItem.receiveStatus=='0'"></el-input>
                        <span v-else>{{sendPerson}}</span>
                    </td>
                </tr>
                <tr>
                    <td>发货人电话</td>
                    <td>
                        <el-input v-model="sendPhone" style="width: 200px;" v-if="receiveItem.receiveStatus=='0'"></el-input>
                        <span v-else>{{sendPhone}}</span>
                    </td>
                    <td>车号</td>
                    <td>
                        <el-input v-model="cartCode" style="width: 200px;" v-if="receiveItem.receiveStatus=='0'"></el-input>
                        <span v-else>{{cartCode}}</span>
                    </td>
                </tr>
                <tr>
                    <td>驾驶员电话</td>
                    <td>
                        <el-input v-model="cartPhone" style="width: 200px;" v-if="receiveItem.receiveStatus=='0'"></el-input>
                        <span v-else>{{cartPhone}}</span>
                    </td>
                    <td></td>
                    <td></td>
                </tr>
                <tr style="height: 90px;">
                    <td>发货说明</td>
                    <td colspan="3">
                        <el-input type="textarea" rows="3" v-model="sendRemark" style="width: 800px;" v-if="receiveItem.receiveStatus=='0'"></el-input>
                        <span v-else>{{sendRemark}}</span>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>

        <div align="right" v-if="receiveItem.receiveStatus=='0'">
            <el-button class="el-button_2" type="primary" style="width: 90px;" @click="trueMethod">确定发货</el-button>&nbsp;
            <el-button class="el-button_2" type="primary" style="width: 90px;" @click="closeEvent">取消</el-button>
        </div>
    </el-dialog>
</template>
<script>
    import {setDictMap} from "../../utils/main";

    export default {
        data() {
            return {
                addressList:[],
                cityList:[],
                areaList:[],
                createTime:'',
                orderStatus:'',
                orderNo:'',
                sendNum:'',
                sendPro:'',
                sendCity:'',
                sendArea:'',
                sendPerson:'',
                sendPhone:'',
                storehouseId:'',
                storehouseList:[],
                sendRemark:'',
                cartCode:'',
                cartPhone:'',
                storehouseMap:{},
            }
        },
        props:{
            sendAddressVisible:Boolean,
            receiveItem:Object,
            provinceMap:Object,
            cityMap:Object,
            areaMap:Object,
            skuMap:Object,
            provinceList:Array,
            id:String,
            shpMeteringMap:Object,
        },
        watch:{
            sendPro(val){
                this.getCityList(val)
            },
            sendCity(val){
                this.getAreaList(val)
            }
        },
        created(){
            this.getStorehouse()
            if (this.receiveItem.receiveStatus!='0') {
                this.backData()
            }
        },
        methods: {
            //回显发货信息
            async backData(){
                let res = await this.$get('/supplier/getSendAddress',{id:this.receiveItem.sendId})
                if (res.sendInfo) {
                    let send = res.sendInfo
                    this.storehouseId = send.storehouseId
                    this.sendNum = send.sendNum
                    this.sendPro = send.sendPro
                    this.sendCity = send.sendCity
                    this.sendArea = send.sendArea
                    this.sendPerson = send.sendPerson
                    this.sendPhone = send.sendPhone
                    this.cartCode = send.cartCode
                    this.cartPhone = send.cartPhone
                    this.sendRemark = send.sendRemark
                }
            },
            //获得所有仓库
            getStorehouse(){
                this.$get('/admin/getErpStorehouseName').then(res=>{
                    this.storehouseList = res.dataSet
                    this.storehouseMap = setDictMap(res.dataSet,'id','storehouseName')
                })
            },
            //获得市
            async getCityList(val) {
                this.cityList = []
                let data = {
                    id:val,
                }
                let res = await this.$get("/admin/getAllCityOrArea",data)
                this.cityList = res
            },
            //获得区
            async getAreaList(val) {
                this.areaList = []
                let data = {
                    id:val,
                }
                let res = await this.$get("/admin/getAllCityOrArea",data)
                this.areaList = res
            },
            closeEvent(){
                this.$emit('closeSendAddress')
            },
            //确认发货
            async trueMethod(){
                if (this.sendNum!=this.receiveItem.receiveNum) {
                    this.$message.warning('发货与申请数量不一致')
                    return;
                }
                let data={
                    id:this.receiveItem.sendId,
                    receiveId:this.receiveItem.id,
                    orderSkuId:this.receiveItem.orderSkuId,
                    orderId:this.id,
                    storehouseId:this.storehouseId,
                    sendNum:this.sendNum,
                    sendPro:this.sendPro,
                    sendCity:this.sendCity,
                    sendArea:this.sendArea,
                    sendPerson:this.sendPerson,
                    sendPhone:this.sendPhone,
                    sendRemark:this.sendRemark,
                    cartCode:this.cartCode,
                    cartPhone:this.cartPhone,
                }
                let res = await this.$post('/supplier/save_ocSendAddress',data)
                if (res.code==200) {
                    this.$message.success(res.message)
                    this.closeEvent()
                } else {
                    this.$message.error(res.message)
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

    .left-table5{
        width: 859px;
        height:180px;
    }
    .left-table5 td{
        height: 60px;
        width: 307px;
        padding-left: 10px;
        vertical-align: middle;
        border:1px #e4e4e4 solid;
        color: #666666;
        font-size: 12px;
        background:#fff;
    }

    .left-table5 td:first-child{
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background:#f9fafc;
    }

    .left-table5 td:nth-child(3){
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background:#f9fafc;
    }

</style>
