<template>
    <div>
        <glob-breadcrumb title="商品评价"/>
        <!--        <br><br>-->
        <!--        <div class="container">-->
        <!--            <el-button class="type-active">全部商品({{skuNum.allSkuCount}})</el-button>-->
        <!--            <el-button>已上架(<span class="red">{{skuNum.sjSkuCount}}</span>)</el-button>-->
        <!--            <el-button>未上架(<span class="red">{{skuNum.xjSkuCount}}</span>)</el-button>-->
        <!--        </div>-->
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="reSearch">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">

                <el-form-item label="商品名称：">
                    <el-input v-model="skuName" placeholder="商品名称"></el-input>
                </el-form-item>

                <el-form-item label="商品分类：">
                    <el-select v-model="categoryIds" clearable placeholder="请选择商品分类">
                        <el-option
                                v-for="item in categoryTwoList"
                                :key="item.id"
                                :label="item.categoryName"
                                :value="item.id">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="用户昵称：">
                    <el-input v-model="memberId" placeholder="输入用户昵称"></el-input>
                </el-form-item>

            </el-form>
        </glob-base-search>

        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
                <!--                <div>-->
                <!--                    <el-button class="el-button_1" @click="inserts">新增</el-button>&nbsp;-->
                <!--                </div>-->
            </div>
            <div class="table_border">
                <el-table
                        ref="multipleTable"
                        @selection-change="handleSelectionChange"
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="evaluationNo" align="center" label="编号"></el-table-column>
                    <el-table-column prop="memberId" align="center" label="用户昵称" :show-overflow-tooltip="true" width="150"></el-table-column>
                    <el-table-column prop="skuName" align="center" label="商品名称" width="160">
                    </el-table-column>
                    <el-table-column prop="evaluation" align="center" label="评价">
                    </el-table-column>
                    <el-table-column prop="commentTime" align="center" label="评论时间"></el-table-column>
                    <el-table-column label="操作" align="center" width="150px">
                        <template slot-scope="scope">
                            <el-button type="text" @click="editSku(scope.row)">查看</el-button>
                            <!--                            <el-button type="text" @click="editExpert(scope.$index)">编辑</el-button>-->
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
    // import {setDictMap} from "../../utils/main";
    export default {
        data() {
            return {
                spuNo:'',
                spuName:'',
                list:[],
                categoryIds:'',
                categoryTwoList:[],
                skuName:'',
                pinMap:{},
                evaluationNo:'',
                memberId:'',
                evaluation: '',
                skuId:'',
                item: {},
                pagination: [],
            }
        },
        created() {
            this.selectCategoryTwoList()

            this.requestSearch()

        },

        methods: {
            async selectCategoryTwoList(){
                let resq = await this.$get("/admin/categoryAllTwoLists")
                this.categoryTwoList = resq;

            },
            handleSelectionChange(){

            },
            reSearch(){
                this.requestSearch()
            },
            handleCurrentChange(page){
                this.requestSearch(page)
            },

            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    size: this.size==''?'10':this.size,
                    skuName: this.skuName,
                    categoryId: this.categoryIds,
                    memberId: this.memberId,
                    currentPage
                }
                let res = await this.$get("/supplier/getShpSkuEvaluationForPage", data)
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


            editSku(index) {
                this.$router.push("/sku/elavaluation/detailElavaluation/"+index.id)
            },
        },
    }
</script>

<style>
    .el-button_1{
        width: 85px;
        padding:8px 20px;
        border-radius: 2px;
    }

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

