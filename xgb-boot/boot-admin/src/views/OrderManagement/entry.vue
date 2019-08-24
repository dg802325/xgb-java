<template>
    <div>
        <glob-breadcrumb title="订单管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="订单编号：">
                    <el-input v-model="orderNo" placeholder="订单编号"></el-input>
                </el-form-item>
                <el-form-item label="县域服务商名称：">
                    <el-input v-model="dealerName" placeholder="县域服务商名称"></el-input>
                </el-form-item>
                <el-form-item label="提交日期：">
                    <el-date-picker
                            v-model="queryKeyDate"
                            type="date"
                            placeholder="请选择日期">
                    </el-date-picker>
                </el-form-item>
                <el-form-item label="订单状态：">
                    <el-select v-model="orderStatus" clearable placeholder="全部">
                        <el-option label="待提交" value="0"></el-option>
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
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="orderNo" align="center" label="订单编号" width="200px"></el-table-column>
                    <el-table-column prop="submitTime" align="center" label="提交时间" width="200px"></el-table-column>
                    <el-table-column prop="orderTotalAmount" align="center" label="订单总额" :show-overflow-tooltip="true" width="150px"></el-table-column>
                    <el-table-column prop="userName" align="center" label="县域服务商名称" :show-overflow-tooltip="true" width="250px"></el-table-column>
                    <el-table-column prop="orderStatus" align="center" label="订单状态" :show-overflow-tooltip="true" width="150px">
                        <template slot-scope="{row}">
                            <span v-if="row.orderStatus=='0'">待提交</span>
                            <span v-else-if="row.orderStatus=='1'">待县域服务商审核</span>
                            <span v-else-if="row.orderStatus=='2'">待供应商审核</span>
                            <span v-else-if="row.orderStatus=='4'">待收款</span>
                            <span v-else-if="row.orderStatus=='5'">待发货</span>
                            <span v-else-if="row.orderStatus=='7'">待核算</span>
                            <span v-else-if="row.orderStatus=='8'">已完结</span>
                            <span v-else-if="row.orderStatus=='9'">审核未通过</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button v-if="scope.row.orderStatus=='5'" type="text" @click="detailEvent(scope.row)">去发货</el-button>
                            <el-button v-else type="text" @click="detailEvent(scope.row)">查看订单</el-button>
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
                priceType:'',
                orderStatus:'',
                queryKeyDate:'',
                orderNo:'',
                dealerName:'',
                pagination: [],
                list: [],
            }
        },
        created() {
            this.requestSearch()
        },

        methods: {
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    orderNo: this.orderNo,
                    supplierName:this.supplierName,
                    submitTime:this.submitTime,
                    orderStatus: this.orderStatus,
                    priceType:this.priceType,
                    currentPage,
                }
                let res = await this.$get("/supplier/getOcErpOrderForPage", data)
                if (res.code == 200) {
                    let dataSet = res.dataSet
                    this.list = dataSet.list;
                    this.pagination = {
                        count: dataSet.count,
                        pageNumber: dataSet.pageNumber,
                        pageSize: dataSet.pageSize,
                        pages: dataSet.pages
                    }
                }
            },
            detailEvent(row){
                if (row.orderStatus=='5') {
                    this.$router.push({path:'/sale/orderManagement/sendGoods/'+row.id})
                } else {
                    this.$router.push({path:'/sale/orderManagement/audite/'+row.id})
                }
            },
        },
    }
</script>

<style>

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
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>

