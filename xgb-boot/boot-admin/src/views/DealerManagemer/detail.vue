<template>
    <div>
        <div>
            <glob-breadcrumb title="县域服务商详情"/>
            <br><br>
            <div class="container">
                <div class="content_b">
                    <div class="content_b_tx_3" >
                        <div style="padding-bottom: 20px;">
                            <table class="left-table2" style="width: 1042px;height: 90px;">
                                <tbody>
                                <tr>
                                    <td>公司名称</td>
                                    <td>{{companyName}}</td>
                                    <td>公司法人</td>
                                    <td>{{legalPerson}}</td>
                                </tr>
                                <tr>
                                    <td>联系人名称</td>
                                    <td>{{userName}}</td>
                                    <td>联系人电话</td>
                                    <td>{{userAccount}}</td>
                                </tr>
                                <tr>
                                    <td>商务人员</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <div>
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">代理商品</div>
                            <div class="table_border" style="overflow-y: auto;height:393px;" >
                                <el-table
                                        ref="multipleTable"
                                        @selection-change="handleSelectionChange"
                                        :data="list"
                                        border
                                        style="width: 100%">
                                    <el-table-column type="selection" prop="check" align="center" width="55">
                                    </el-table-column>
                                    <el-table-column prop="spuNo" align="center" label="商品编号"></el-table-column>
                                    <el-table-column prop="spuName" align="center" label="商品名称"></el-table-column>
                                    <el-table-column align="center" label="商品图片">
                                        <template slot-scope="{row}">
                                            <img :src="row.imgUrl" style="width: 55px;height: 55px"/>
                                        </template>
                                    </el-table-column>
                                    <el-table-column align="center" label="商品规格" width="160">
                                        <template slot-scope="{row}">
                                            <p v-if="row.specList.length" v-for="item in row.specList">
                                                <span>{{item.specName}}&nbsp;(
                                                    <span v-for="values in item.keys">
                                                        {{values.value}}:{{values.Parameters}}
                                                    </span>)
                                                </span>
                                            </p>
                                        </template>
                                    </el-table-column>
                                </el-table>
                            </div>

                            <br>
                            <div class="button_right" align="right" v-if="auditeStatus!='1' && auditeStatus!='0' && relativeType!='0'">
                                <el-button class="el-button_right" @click="saveEvent">邀请他</el-button>
                            </div>
                            <div class="button_right" align="right" v-if="relativeType=='0'">
                                <el-button class="el-button_right" @click="toLookApply">已申请 去查看</el-button>
                            </div>
                            <div class="button_right" align="right" v-if="relativeType=='1' && auditeStatus!='2'">
                                <el-button class="el-button_right" @click="toLookInvitation">已邀请 去查看</el-button>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
        data() {
            return {
                id:'',
                legalPerson:'',
                companyName:'',
                list:[],
                companyId:'',
                dealerId:'',
                erpUserId:'',
                userName:'',
                userAccount:'',
                createTime:'',
                auditeStatus:'',
                relativeType:'',
                pagination: {},
                skuIds:[],
            }
        },
        created(){
            this.dealerId = this.$route.params.id
            this.backData(this.dealerId);
        },
        methods: {
            handleSelectionChange(list) {
                this.skuIds = [];
                list.forEach(item => {
                    this.skuIds.push(item.id)
                })
            },
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    currentPage,
                }
                let res = await this.$get("/supplier/getShpSkuForPage")
                if (res.code == 200) {
                    this.list= res.list
                    let specItems
                    this.list.forEach(spec=>{
                        specItems = []
                        let paramSpecList = spec.specList;
                        specItems = paramSpecList.map(item=>({
                            specName: item.specName,
                            keys: JSON.parse(item.paramName)
                        }));
                        spec.specList = specItems
                    })
                }
            },
            async saveEvent(){
                if (!this.skuIds.length) {
                    this.$message.warning('请选择代理商品!!')
                    return;
                }
                let data = {
                    id:this.id,
                    dealerId:this.dealerId,
                    skuIds:JSON.stringify(this.skuIds),
                }
                let res = await this.$post('/supplier/save_erpDealerSupplier',data)
                if (res.code==200) {
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }
                this.backData(this.dealerId)
            },
            //回显数据
            async backData(id){
                let result = await this.$get('/supplier/getDealerInfo',{dealerId:id})
                if (result.companyInfo) {
                    let res = result.companyInfo
                    this.companyName = res.companyName
                    this.legalPerson = res.legalPerson
                    this.requestSearch()
                }
                if (result.erpUserInfo) {
                    let res = result.erpUserInfo
                    this.erpUserId = res.id
                    this.userName = res.userName;
                    this.userAccount = res.userAccount
                    this.createTime = res.createTime
                }
                if (result.applyAgentInfo) {
                    let res = result.applyAgentInfo
                    this.auditeStatus = res.auditeStatus
                    this.relativeType = res.relativeType
                    this.id = res.id
                }
            },
            toLookApply(){
                this.$router.push({path:'/agent/applyAgentManament'})
            },
            toLookInvitation(){
                this.$router.push({path:'/agent/invitationManagement'})
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
