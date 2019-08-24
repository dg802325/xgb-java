<template>
    <div>
        <glob-breadcrumb title="仓库管理">
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
                <el-form-item label="仓库名称：">
                    <el-input v-model="storehouseName" placeholder="仓库名称"></el-input>
                </el-form-item>
            </el-form>
        </glob-base-search>

        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
                <el-button
                        style="width: 81px;height: 30px;text-align:center;padding:0px;vertical-align:middle ;line-height:22px;margin:0px;"
                        class="el-button_1"
                        @click="addStorehouse">新增仓库
                </el-button>
            </div>
            <div class="table_border" style="border-bottom: none">
                <el-table
                        ref="multipleTable"
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="storehouseNo" align="center" label="仓库编号"></el-table-column>
                    <el-table-column prop="storehouseName" align="center" label="仓库名称" width="160px"></el-table-column>
                    <el-table-column prop="storehouseAddress" align="center" label="仓库地址" width="160px"></el-table-column>
                    <el-table-column prop="storehouseContact" align="center" label="联系人"></el-table-column>
                    <el-table-column prop="storehouseMobile" align="center" label="联系人电话" width="160px"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建时间" width="180px"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button @click="lookEvent(scope.row)" type="text">查看</el-button>
                            <el-button @click="editEvent(scope.row)" type="text">编辑</el-button>
                            <el-button @click="deletes(scope.row)" type="text">删除</el-button>
                        </template>
                    </el-table-column>
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
                storehouseName: '',
                list: [],
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
            handleSearch(){
                this.requestSearch()
            },
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    storehouseName: this.storehouseName,
                    isDel: 0,
                    currentPage
                }
                let dataSet = await this.$get('/admin/getErpStorehouseForPage', data)
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
            //删除
            async deletes(row){
                let data = {
                    id : row.id
                }
                let res = await this.$post('/admin/removeStorehouse',data)
                if(res.code == 200){
                    this.requestSearch()
                }
                console.log(res)
            },

            addStorehouse() {
                this.$router.push('/stock/erpStorehouseList/insertStorehouse')
            },

            //跳转到用户详情页
            async lookEvent(row) {
                this.$router.push({path: '/stock/erpStorehouseList/lookStorehouse/' + row.id})
            },

            //编辑
            async editEvent(row){
                this.$router.push( '/stock/erpStorehouseList/erpEditStorehouse/'+row.id)
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
