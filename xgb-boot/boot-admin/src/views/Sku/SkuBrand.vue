<template>
    <div>
        <glob-breadcrumb title="商品日志"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="skuName" placeholder="商品名称/商品货号"></el-input>
                </el-form-item>
                <el-form-item label="商品分类：">
                    <el-select v-model="categoryId" clearable placeholder="请选择商品分类">
                        <el-option
                                v-for="item in categoryTwoList"
                                :key="item.id"
                                :label="item.categoryName"
                                :value="item.id">
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
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="logNo" align="center" label="编号"></el-table-column>
                    <el-table-column prop="marketValue" align="center" label="品牌名称">
                    </el-table-column>
                    <el-table-column prop="dailyRent" align="center" label="品牌类型">
                    </el-table-column>
                    <el-table-column prop="bond" align="center" label="品牌制造商">
                    </el-table-column>
                    <el-table-column prop="auditStatus" align="center" label="审核状态">
                        <template slot-scope="{row}">
                            <p v-if="row.auditStatus==0">通过</p>
                            <p v-if="row.auditStatus==1">未通过</p>
                        </template>
                    </el-table-column>
                    <el-table-column label="操作" align="center" width="200">
                        <template slot-scope="{row}">
                            <p>{{row.userName}}</p>
                            <p>{{row.createTime}}</p>
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
                pagination: [],
                list: []
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
                    currentPage,
                }
                let res = await this.$get("/admin/getShpGoodsLogForPage", data)
                this.list = res.dataSet.list
                if (res.code == 200) {
                    let dataSet = res.dataSet
                    let list = dataSet.list;
                    this.list = list;
                    this.pagination = {
                        count: dataSet.count,
                        pageNumber: dataSet.pageNumber,
                        pageSize: dataSet.pageSize,
                        pages: dataSet.pages
                    }
                }
            },
        },
    }
</script>

<style>
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }

</style>

