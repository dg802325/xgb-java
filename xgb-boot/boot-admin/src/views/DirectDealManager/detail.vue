<template>
    <div>
        <div>
            <glob-breadcrumb title="直销单详情"/>
            <br><br>
            <div class="container">
                <div class="content_b">
                    <div class="content_b_tx_3" >
                        <div style="padding-bottom: 20px;">
                            <table class="left-table2" style="width: 1042px;height: 90px;">
                                <tbody>
                                <tr>
                                    <td>直销物资</td>
                                    <td>
                                        <span>{{spuId | formatData(spuMap)}}</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>数量</td>
                                    <td>
                                        <span>{{directdealNum}}</span>
                                        <span v-if="metering=='1'"> 吨</span>
                                        <span v-if="metering=='2'"> 袋</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>单价</td>
                                    <td>
                                        <span>{{directdealPrice}}</span>
                                        <span v-if="metering=='1'"> 元/吨</span>
                                        <span v-if="metering=='2'"> 元/袋</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>期限</td>
                                    <td>
                                        <span>{{validityDate}}</span>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <div>
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">邀请列表</div>
                            <div class="table_border" style="overflow-y: auto;height:393px;" >

                                <el-table
                                        :data="list"
                                        border
                                        style="width: 100%">
                                    <el-table-column prop="userName" align="center" label="县域服务商"></el-table-column>
                                    <el-table-column prop="companyName" align="center" label="公司名称" width="300px"></el-table-column>
                                    <el-table-column prop="receiveStatus" align="center" label="状态" width="100px;">
                                        <template slot-scope="{row}">
                                            <span v-if="row.receiveStatus=='0'">待接受</span>
                                            <span v-if="row.receiveStatus=='1'">已接受</span>
                                            <span v-if="row.receiveStatus=='2'">被拒绝</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="receiveTime" align="center" label="接收时间" width="180px;"></el-table-column>
                                    <el-table-column align="center" label="数量" width="150px;">
                                        <template slot-scope="{row}">
                                            <span v-if="row.ratioNum">
                                                {{row.ratioNum}}
                                                <span v-if="metering=='1'"> 吨</span>
                                                <span v-if="metering=='2'"> 袋</span>
                                            </span>
                                        </template>
                                    </el-table-column>
                                </el-table>
                            </div>
                            <br>
                            <div class="button_right" align="right" v-if="directdealStatus=='1'">
                                <el-button class="el-button_right" @click="saveMethod()">商品上架</el-button>
                            </div>
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
                id:'',
                validityDate:'',
                directdealPrice:'',
                directdealNum:'',
                spuId:'',
                list:[],
                spuMap:{},
                meteringMap:{},
                metering:'',
                directdealStatus:'',
            }
        },
        created(){
            this.id = this.$route.params.id
            this.getSpuList()
        },
        methods: {
            //获取供应商物资
            async getSpuList(){
                let res = await this.$get('/supplier/getNotUpperSpuList')
                if (res.SpuList) {
                    this.spuMap = setDictMap(res.SpuList,'id','spuName')
                    this.meteringMap = setDictMap(res.SpuList,'id','spuMetering')
                }
                this.backData(this.id )
            },
            async saveMethod(){
                let data = {
                    id:this.id,
                    shpSpuId:this.spuId,
                }
                //是否已上架
                this.$message.error('该商品已上架')
            },
            //回显数据
            async backData(id){
                let res = await this.$get('/supplier/getDirectDealBack',{id:id})
                if (res.directdeal) {
                    let directDealItem = res.directdeal
                    this.spuId = directDealItem.shpSpuId
                    this.directdealNum = directDealItem.directdealNum
                    this.directdealPrice = directDealItem.directdealPrice
                    this.validityDate = new Date(directDealItem.validityDate)
                    this.metering = this.meteringMap[directDealItem.shpSpuId]
                    this.directdealStatus = directDealItem.directdealStatus
                }
                if (res.directdealInvites) {
                    this.list = res.directdealInvites
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
    .left-table2{
        width: 859px;
        height:180px;
    }
    .left-table2 td{
        height: 45px;
        width: 307px;
        padding-left: 10px;
        vertical-align: middle;
        border:1px #e4e4e4 solid;
        color: #666666;
        font-size: 12px;
        background:#fff;
    }

    .left-table2 td:first-child{
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background:#f9fafc;
    }

    .left-table2 td:nth-child(3){
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background:#f9fafc;
    }

    .el-button_right{
        width:140px;
        height: 40px;
        padding:10px 20px;
        border-radius: 5px;
        background-color:rgba(22, 155, 213, 1);
        color: white;
    }

    .el-button--primary{
        background-color:#1abc9c;
        border-color:#1abc9c;
    }

    .button_right{
        padding-top: 10px;
        width: 1042px;
    }

    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }

</style>
