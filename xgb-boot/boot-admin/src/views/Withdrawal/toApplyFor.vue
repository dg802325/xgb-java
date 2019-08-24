<template>
    <div>
        <glob-breadcrumb title="提现管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="状态：">
                    <el-select  v-model="isStatus" style="width: 350px" placeholder="请选择">
                        <el-option
                                v-for="item in options"
                                :key="item.status"
                                :label="item.label"
                                :value="item.status">
                        </el-option>
                    </el-select>
                </el-form-item>
            </el-form>
        </glob-base-search>

        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
            </div>
            <div class="table_border">
                <el-table
                        ref="multipleTable"
                        @selection-change="handleSelectionChange"
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="companyId" align="center" label="县域商">
                        <template slot-scope="{row}">
                            {{row.companyId | formatData(companyMap)}}
                        </template>
                    </el-table-column>
                    <el-table-column prop="withdrawalAmount" align="center" label="提现金额"></el-table-column>
                    <el-table-column prop="bankNumber" align="center" label="银行卡号"></el-table-column>
                    <el-table-column prop="bank" align="center" label="银行"></el-table-column>
                    <el-table-column prop="status" align="center" label="状态">
                        <template slot-scope="{row}">
                            <span v-if="row.status=='1'">代处理</span>
                            <span v-if="row.status=='2'">已付款</span>
                            <span v-if="row.status=='3'">已拒绝</span>
                        </template>
                    </el-table-column>
                    <el-table-column prop="createTime" align="center" label="申请时间"></el-table-column>
                    <el-table-column label="操作" align="center" width="130px">
                        <template slot-scope="scope">
                            <el-button type="text" @click="lookEvent(scope.row)">查看</el-button>
                        </template>
                    </el-table-column>
                </el-table>
            </div>

            <div class="v-cart-bottom">
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
</template>

<script>

    export default {
        data() {
            return {
                options: [{
                    label: '待处理',
                    status: '1'
                },{
                    label: '已付款',
                    status: '2'
                },{
                    label:'已拒绝',
                    status: '3'
                },{
                    label:'全部',
                    status:''
                }],
                isStatus:'',
                skuNum: {},
                item: {},
                type: '',
                size: '',
                px: '',
                pagination: [],
                list: [],
                companyIdAll:[],
                DealerList:[],
                companyMap: {}
            }
        },
        created() {
            this.requestSearch()
            // this.getSkuStatusNum()
        },

        methods: {
            //分页查询所有提现申请
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    size: this.size==''?'10':this.size,
                    px: this.px,
                    isDel: 0,
                    status: this.isStatus,
                    currentPage,
                }
                let res = await this.$get("/admin/getBbiWithdrawalPage", data)
                console.log(res)
                if (res.code == 200) {
                    let list = res.list.list;
                    //查询提现县域商信息
                    let companyIdList = [];
                    companyIdList = list.map(item=> item.companyId);
                    companyIdList = Array.from(new Set(companyIdList))
                    this.companyIdAll = companyIdList.join();
                    let dealerData = {
                        companyId : this.companyIdAll
                    };
                    let Dealer = await this.$get("/admin/getErpUserByCompanyIdList",dealerData)
                    if(Dealer.code==='200'){
                        Dealer.CompandyId.forEach(item=>{
                            this.companyMap[item.companyId] = item.userName
                        })

                    }

                    this.list = list;
                    this.pagination = {
                        count: res.list.count,
                        pageNumber: res.list.pageNumber,
                        pageSize: res.list.pageSize,
                        pages: res.list.pages
                    }
                }


            },

            //分页
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            handleSelectionChange(list) {
                this.skuIds = [];
                list.forEach(item => {
                    this.skuIds.push(item.id)
                })
            },

            //查看
            lookEvent(row) {
                this.$router.push({path: '/finance/withdrawalApplication/withdrawalApproval/' + row.id})
            },

            // async switchChange(item) {
            //     console.log(item)
            //     let data = {
            //         id: item.id,
            //         isShelves: item.isShelves,
            //     }
            //     let res = await this.$post('/admin/UpdateCountyState', data)
            //     if (res.code == 200) {
            //         this.$message.success(res.message)
            //         this.getSkuStatusNum()
            //     } else {
            //         this.$message.error(res.message)
            //     }
            // },


            // async getSkuStatusNum() {
            //     let res = await this.$get("/admin/getCountySkuNum")
            //     this.skuNum = res
            //     console.log(res)
            // },
            //

        },
    }
</script>

<style lang="scss" scoped>

    .type-active {
        color: #fff;
        background: #17a98c
    }

    .type-active .red {
        color: rgb(255, 255, 255);
    }

    .red {
        color: rgb(240, 72, 68)
    }

    .withdrawal{
        width: 80px;
        height: 30px;
        .el-button{
            width: 100%;
            height: 100%;
            line-height: 0;
        }
    }
    .submit{
        z-index: 10;
        width: 600px;
        height: 550px;
        position: absolute;
        top: 150px;
        left: 300px;
        border: 1px solid #e4e4e4;
        background-color: white;
        margin:0 auto;

        .top{
            width: 600px;
            height: 50px;
            border-bottom: 1px solid #e4e4e4;
            background-color: #F2F2F2;
        }
        .middle{
            width: 600px;
            height: 365px;
        }
    }
    .Xian{
        border-bottom:1px solid #e4e4e4;
        padding-top: 20px;
    }
    .submitAll{
        .el-button{
            width: 100px;
            height: 35px;
            line-height: 7px;
            margin-right: 30px;
            background-color: rgba(26, 188, 156, 1);
            border-color: rgba(26, 188, 156, 1);
        }
    }
    .fail{
        padding-left: 20px;
        .el-button{
            width: 100px;
            height: 35px;
            line-height: 7px;
            margin-right: 20px;
            background-color: rgba(240, 72, 68, 1);
            border-color: rgba(240, 72, 68, 1);
        }
    }
    .buttonAll{
        display: flex;
        float: right;
        line-height: 100px;
    }
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>

