<template>
    <div>
        <div>
            <glob-breadcrumb title="代理详情"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        代理详情
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx_3">
                        <div style="padding-bottom: 20px;">
                            <table class="left-table2" style="width: 1042px;height: 90px;">
                                <tbody>
                                <tr>
                                    <td>代理状态</td>
                                    <td>
                                        <span v-if="applyStatus==''">未提交</span>
                                        <span v-else-if="applyStatus=='0'">待接受</span>
                                        <span v-else-if="applyStatus=='1'">已代理</span>
                                        <span v-else-if="applyStatus=='2'">已拒绝</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td v-if="relativeType=='1'">邀请时间</td>
                                    <td v-else-if="relativeType=='0'">申请时间</td>
                                    <td>{{createTime}}</td>
                                </tr>
                                <tr>
                                    <td>企业名称</td>
                                    <td>{{companyName}}</td>
                                </tr>
                                <tr>
                                    <td>营业执照注册号</td>
                                    <td>{{businessLicense}}</td>
                                </tr>
                                <tr>
                                    <td>法定代表人姓名</td>
                                    <td>{{legalName}}</td>
                                </tr>
                                <tr>
                                    <td>管理人姓名</td>
                                    <td>{{userName}}</td>
                                </tr>
                                <tr>
                                    <td>管理人账号</td>
                                    <td>{{userAccount}}</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <div >
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">代理商品</div>
                            <div class="table-title" v-if="enableAdd">
                                <el-button type="text" icon="icon-tianjia" class="orange dialog-btn" @click="addEvent">
                                    添加商品
                                </el-button>
                            </div>
                            <div class="table_border">
                                <el-table
                                        ref="multipleTable"
                                        :data="list"
                                        border
                                        style="width: 100%">
                                    <el-table-column align="center" label="编号">
                                        <template slot-scope="{row}">
                                            <span v-if="row.skuVO">{{row.skuVO.spuNo}}</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="name" align="center" label="商品图片">
                                        <template slot-scope="{row}">
                                            <span v-if="row.skuVO"><img :src="row.skuVO.imgUrl" style="width: 55px;height: 55px"/></span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="skuName" align="center" label="商品名称" :show-overflow-tooltip="true" width="150">
                                        <template slot-scope="{row}">
                                            <span v-if="row.skuVO">{{row.skuVO.spuName}}</span>
                                        </template>
                                    </el-table-column>
                                    <el-table-column prop="" align="center" label="商品规格" width="160">
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
                                    <el-table-column prop="modifyTime" align="center" label="代理时间" width="170px;"></el-table-column>
                                    <el-table-column align="center" label="状态" width="150">
                                        <template slot-scope="{row}">
                                            <span v-if="row.agentStatus=='1'">已代理</span>
                                            <span v-else>未代理</span>
                                        </template>
                                    </el-table-column>
                                </el-table>
                            </div>
                            <div class="v-cart-bottom">
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

                    </div>
                </div>
            </div>
        </div>

        <el-dialog title="选择添加商品" :visible.sync="addVisible" width="800px">
            <div class="table_border" style="overflow-y: auto;height:393px;">
                <el-table
                        ref="multipleTable"
                        @selection-change="handleSelectionChange"
                        :data="shopList"
                        border
                        style="width: 100%">
                    <el-table-column type="selection" prop="check" align="center" width="55">
                    </el-table-column>
                    <el-table-column align="center" label="商品编号">
                        <template slot-scope="{row}">
                            <span>{{row.spuNo}}</span>
                        </template>
                    </el-table-column>
                    <el-table-column align="center" label="商品名称">
                        <template slot-scope="{row}">
                            <span>{{row.spuName}}</span>
                        </template>
                    </el-table-column>
                    <el-table-column align="center" label="商品图片">
                        <template slot-scope="{row}">
                            <span><img :src="row.imgUrl" width="80px;"/></span>
                        </template>
                    </el-table-column>
                    <el-table-column align="center" label="状态">未代理</el-table-column>
                </el-table>
            </div>

            <div align="right" style="border-top: 1px solid #e4e4e4;width: 800px;margin-left: -20px;">
                <div style="padding-right: 30px;padding-top: 30px;">
                    <el-button class="el-button_2" @click="addVisible=false">取 消</el-button>&nbsp;
                    <el-button class="el-button_2" type="primary" @click="addMethod">确 定</el-button>
                </div>
            </div>
        </el-dialog>

    </div>
</template>
<script>
export default {
        data() {
            return {
                relativeType:'',
                shopList:[],
                addVisible:false,
                enableAdd:false,
                supplierId:'',
                companyInfo:{},
                erpUserInfo:{},
                applyAgentInfo:{},
                applyStatus:'',
                companyName:'',
                businessLicense:'',
                legalName:'',
                userName:'',
                userAccount:'',
                createTime:'',
                list:[],
                pagination: {},
                selectedSpuList:[],
            }
        },
        created(){
            this.id = this.$route.params.id
            this.backData(this.id);
            this.isEnableAdd(this.id)
        },
        methods: {
           async addMethod(){
               if (!this.selectedSpuList.length) {
                   this.$message.warning('请选择要追加的物资')
               }
               console.log(this.selectedSpuList)
               let data = {
                   dealerSupplierId:this.id,
                   spuListStr:JSON.stringify(this.selectedSpuList)
               }
               let res = await this.$post('/supplier/addAgentSpu',data)
               if (res.code==200) {
                   this.$message.success(res.message)
                   this.backData(this.id);
                   this.isEnableAdd(this.id)
               } else {
                   this.$message.error(res.message)
               }

               this.addVisible = false
            },
            //选择添加的物资
            handleSelectionChange(list) {
                this.selectedSpuList = []
                this.selectedSpuList = list
            },
            async addEvent(){
                //未代理的物资
                let res = await this.$get('/supplier/getNoAgentList',{dealerSupplierId:this.id})
                if (res.spuList) {
                    this.shopList = res.spuList
                    this.addVisible = true
                } else {
                    this.$message.warning('已全部代理!')
                }
            },
            //是否能追加代理物资
            async isEnableAdd(id){
                let res = await this.$get('/supplier/isEnableAdd',{id:this.id})
                if (res.code==200) {
                    this.enableAdd = true
                } else {
                    this.enableAdd = false
                }
            },
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    dealerSupplierId:this.id,
                    currentPage,
                }
                let res = await this.$get("/supplier/getSelectedSkuForPage", data)
                if (res.code == 200) {
                    let dataSet = res.dataSet
                    this.list =dataSet .list
                    let specItems
                    this.list.forEach(spec=>{
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
            },

            //回显数据
            async backData(id){
                let result = await this.$get('/supplier/getApplyInfo',{id:id})
                if (result.companyInfo) {
                    let res = result.companyInfo
                    this.companyName = res.companyName;
                    this.businessLicense = res.businessLicense;
                    this.legalName = res.legalName;
                    this.requestSearch()
                }
                if (result.erpUserInfo) {
                    let res = result.erpUserInfo
                    this.userName = res.userName;
                    this.userAccount = res.userAccount
                }
                if (result.applyAgentInfo) {
                    let res = result.applyAgentInfo
                    this.applyStatus = res.auditeStatus;
                    this.relativeType = res.relativeType
                    this.createTime = res.createTime
                }
                if (result.storeInfo) {
                    let res = result.storeInfo
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
        height: 60px;
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
