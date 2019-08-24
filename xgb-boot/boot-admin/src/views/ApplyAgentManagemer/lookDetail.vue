<template>
    <div>
        <div>
            <glob-breadcrumb title="商品代理审核"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        代理申请单
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx_3">
                        <div>
                            <table class="left-table" style="width: 1042px;height: 90px;">
                                <tbody>
                                <tr>
                                    <td>代理申请单号</td>
                                    <td>{{applyNo}}</td>
                                </tr>
                                <tr>
                                    <td>申请状态</td>
                                    <td>
                                        <span v-if="auditeStatus=='0'">待审核</span>
                                        <span v-else-if="auditeStatus=='1'">审核通过</span>
                                        <span v-else-if="auditeStatus=='2'">审核未通过</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>县域服务商</td>
                                    <td>{{userName}}</td>
                                </tr>
                                <tr>
                                    <td>申请时间</td>
                                    <td>{{createTime}}</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div style="padding-top: 50px;">
                            <table class="left-table" style="width: 1042px;height: 90px;">
                                <tbody>
                                <tr>
                                    <td>公司名称</td>
                                    <td>{{companyName}}</td>
                                </tr>
                                <tr>
                                    <td>营业执照号</td>
                                    <td>{{businessLicense}}</td>
                                </tr>
                                <tr>
                                    <td>申请说明</td>
                                    <td>{{otherRemark}}</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div style="padding-top: 20px;">
                            <table class="left-table" style="width: 1042px;height: 111px;">
                                <tbody>
                                <tr>
                                    <td>处理备注</td>
                                    <td>
                                        <span v-if="auditeStatus=='0'">
                                            <el-input type="textarea" style="width: 860px;" rows="4" v-model="auditeNote" ></el-input>
                                        </span>
                                        <span  v-else>{{this.auditeNote}}</span>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <div style="padding-top: 20px;">
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">代理商品</div>
                            <div class="table_border" v-if="requestType=='0'" style="height:400px;overflow-y: auto">
                                <el-table
                                        ref="multipleTable"
                                        @selection-change="handleSelectionChange"
                                        :data="list"
                                        border
                                        style="width: 100%">
                                    <el-table-column type="selection" prop="check" align="center" width="55">
                                    </el-table-column>
                                    <el-table-column prop="spuNo" align="center" label="编号"></el-table-column>
                                    <el-table-column prop="spuName" align="center" label="商品名称" :show-overflow-tooltip="true"></el-table-column>
                                    <el-table-column align="center" label="商品图片">
                                        <template slot-scope="{row}">
                                            <img :src="row.imgUrl" width="80px;"/>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="" align="center" label="商品规格" width="160">
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
                            <div class="table_border" v-if="requestType=='1'">
                                <el-table
                                        ref="multipleTable"
                                        @selection-change="handleSelectionChange"
                                        :data="selectedList"
                                        border
                                        style="width: 100%">
                                    <el-table-column align="center" label="编号">
                                        <template slot-scope="{row}">
                                            <span v-if="row.skuVO">{{row.skuVO.spuNo}}</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column align="center" label="商品名称" :show-overflow-tooltip="true" width="150">
                                        <template slot-scope="{row}">
                                            <span v-if="row.skuVO">{{row.skuVO.spuName}}</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="name" align="center" label="商品图片">
                                        <template slot-scope="{row}">
                                            <span v-if="row.skuVO"><img :src="row.skuVO.imgUrl" width="80px;"/></span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column align="center" label="商品规格" width="160">
                                        <template slot-scope="{row}">
                                            <p v-if="row.skuVO.specList" v-for="item in row.skuVO.specList">
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
                            <div class="v-cart-bottom" v-if="requestType=='1'">
                                <div></div>
                                <el-pagination
                                        @current-change="handleCurrentChange"
                                        :pager-count="7"
                                        layout="total, prev, pager, next,jumper"
                                        :total="pagination.count"
                                        :page-count="pagination.pages"
                                        :current-page="pagination.pageNumber"
                                ></el-pagination>
                            </div>
                        </div>

                        <div class="button_bottom" align="center" v-if="auditeStatus=='0'">
                            <el-button class="el-button_2" style="width: 100px;background-color: #1abc9c;color: white" @click="passEvent">同意</el-button>
                            &nbsp;
                            <el-button class="el-button_2" style="width: 100px;background-color: red;color: white" @click="refuseEvent">拒绝</el-button>
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
                storeName:'',
                auditeNote:'',
                otherRemark:'',
                userName:'',
                applyNo:'',
                id:'',
                companyInfo:{},
                erpUserInfo:{},
                applyAgentInfo:{},
                auditeStatus:'',
                companyName:'',
                businessLicense:'',
                legalName:'',
                createTime:'',
                pagination: {},
                skuIds:[],
                list:[],
                companyId:'',
                requestType:'',
                selectedList:[],
            }
        },
        created(){
            this.id = this.$route.params.id
            this.backData(this.id);
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
                let res = {};
                let currentPage = page || 1;
                let data = {
                    currentPage,
                }
                if (this.requestType=='0') {
                    res = await this.$get("/supplier/getShpSkuForPage")
                    if (res.code == 200) {
                        this.list = res.list
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
                } else {
                    this.$set(data,"dealerSupplierId",this.id)
                    res = await this.$get("/supplier/getSelectedSkuForPage", data)
                    if (res.code == 200) {
                        let dataSet = res.dataSet
                        this.selectedList =dataSet.list
                        let specItems
                        this.selectedList.forEach(spec=>{
                            specItems = []
                            let paramSpecList = spec.skuVO.specList;
                            specItems = paramSpecList.map(item=>({
                                specName: item.specName,
                                keys: JSON.parse(item.paramName)
                            }));
                            spec.skuVO.specList = specItems
                        })

                        this.pagination = {
                            count: dataSet.count,
                            pageNumber: dataSet.pageNumber,
                            pageSize: dataSet.pageSize,
                            pages: dataSet.pages
                        }
                    }
                }
            },
            //回显数据
            async backData(id){
                let result = await this.$get('/supplier/getApplyInfo',{id:id})
                if (result.companyInfo) {
                    let res = result.companyInfo
                    this.companyName = res.companyName;
                    this.businessLicense = res.businessLicense;
                    this.legalName = res.legalName;
                    this.companyId = res.id
                }
                if (result.erpUserInfo) {
                    let res = result.erpUserInfo
                    this.userName = res.userName;
                }
                if (result.applyAgentInfo) {
                    let res = result.applyAgentInfo
                    this.auditeStatus = res.auditeStatus;
                    this.createTime = res.createTime
                    this.applyNo = res.applyNo
                    this.otherRemark = res.otherRemark
                    this.auditeNote = res.auditeNote
                    if (this.auditeStatus=='0') {
                        this.requestType = '0'
                        this.requestSearch()
                    } else {
                        this.requestType = '1'
                        this.requestSearch()
                    }
                }
                if (result.storeInfo) {
                    let res = result.storeInfo
                    this.storeName = res.storeName;
                }
            },
            //同意
            async passEvent(){
                if (!this.skuIds.length) {
                    this.$message.warning('请选择代理商品!!')
                    return;
                }
                let data = {
                    id:this.id,
                    auditeNote:this.auditeNote,
                    auditeStatus:'1',
                    skuIds:JSON.stringify(this.skuIds),
                }
                let res = await this.$post('/supplier/setAuditeStatus',data)
                if (res.code==200) {
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }
                // this.backData(this.id)
                this.$router.push({path:'/agent/invitationManagement/auditeDetail/'+this.id})
            },
            //拒绝
            async refuseEvent(){
                let data = {
                    id:this.id,
                    auditeNote:this.auditeNote,
                    auditeStatus:'2'
                }
                let res = await this.$post('/supplier/setAuditeStatus',data)
                if (res.code==200) {
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }
                this.backData(this.id)
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

    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }

</style>
