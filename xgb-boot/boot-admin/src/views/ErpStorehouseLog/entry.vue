<template>
    <div>
        <glob-breadcrumb title="库存变动明细">
            <div>
                <el-button   size="mini">刷新</el-button>
            </div>
        </glob-breadcrumb>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="handleSearch">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="spuName" placeholder="商品名称/商品货号"></el-input>
                </el-form-item>

                <el-form-item label="操作类型：">
                    <el-select v-model="operationType" clearable placeholder="全部">
                        <el-option
                                v-for="item in options"
                                :key="item.value"
                                :label="item.label"
                                :value="item.value">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="日期：">
                    <el-date-picker
                            v-model="dateTime"
                            type="date"
                            placeholder="选择日期">
                    </el-date-picker>
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
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="logNo" align="center" label="编号"></el-table-column>
                    <el-table-column prop="spuName" align="center" label="商品名称" width="160px"></el-table-column>
                    <el-table-column prop="brandName" align="center" label="品牌" ></el-table-column>
                    <el-table-column prop="spuNo" align="center" label="货号"></el-table-column>
                    <el-table-column prop="qty" align="center" label="变动数量">
                        <template slot-scope="{row}">
                            <p v-if="row.operationType==0">{{'-'+row.qty}}</p>
                            <p v-if="row.operationType==1">{{'+'+row.qty}}</p>
                        </template>
                    </el-table-column>
                    <el-table-column prop="createTime" align="center" label="操作类型" >
                        <template slot-scope="{row}">
                            <p v-if="row.operationType==0">其它出库</p>
                            <p v-if="row.operationType==1">其它入库</p>
                        </template>
                    </el-table-column>
                    <el-table-column prop="userName" align="center" label="操作人"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="操作时间" width="180px"></el-table-column>
                </el-table>
            </div>
            <div class="v-cart-bottom">
                <div>
                </div>
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
        name: 'dashboard',
        data() {
            return {
                spuName:'',
                operationType: '',
                dateTime: '',
                list: [],
                options: [{
                    value: '1',
                    label: '其它入库'
                }, {
                    value: '0',
                    label: '其它出库'
                }],
                pagination: {
                    count: 0,
                    pageNumber: 0,
                    pageSize: 0,
                    pages: 1
                },
            }
        },
        created() {
            this.requestSearch()
        },
        methods: {
            handleSearch() {
                this.requestSearch()
            },
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    operationType: this.operationType,
                    spuName: this.spuName,
                    dateTime: this.dateTime,
                    currentPage
                }
                console.log(this.spuName)
                let dataSet = await this.$get('/admin/getErpStorehouseLogForPage', data)
                console.log(dataSet)
                if (dataSet.code == 200) {
                    let res = dataSet.dataSet
                    let list = res.list;
                    this.list = list;
                    this.pagination = {
                        count: res.count,
                        pageNumber: res.pageNumber,
                        pageSize: res.pageSize,
                        pages: res.pages
                    }
                }
            },
        }
    }
</script>

<style>
    .el-table--enable-row-transition .el-table__body td {
        height: 40px;
    }
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>
