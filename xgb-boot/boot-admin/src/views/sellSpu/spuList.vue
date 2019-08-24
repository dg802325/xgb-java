<template>
    <div>
        <glob-breadcrumb title="商品列表">
            <div>
                <el-button   size="mini">刷新</el-button>
            </div>
        </glob-breadcrumb>
        <br><br>

        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="skuName" placeholder="商品名称/商品货号"></el-input>
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
                        @click="addStorehouse">新增商品
                </el-button>
            </div>
            <div class="table_border">
                <el-table
                        ref="multipleTable"
                        @selection-change="handleSelectionChange"
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="skuNo" align="center" label="编号"></el-table-column>
                    <el-table-column prop="brandName" align="center" label="品牌"></el-table-column>
                    <el-table-column prop="name" align="center" label="商品图片">
                        <template slot-scope="{row}">
                            <img :src="row.imgUrl" style="width: 55px;height: 55px"/>
                        </template>
                    </el-table-column>
                    <el-table-column prop="skuName" align="center" label="商品名称" :show-overflow-tooltip="true" width="150">
                    </el-table-column>
                    <el-table-column prop="" align="center" label="价格/货号" width="160">
                        <template slot-scope="{row}">
                            <p>{{'价格：'+'¥'+row.skuPrice+'/'+row.dictName}}</p>
                            <p>{{'货号：'+row.skuNo}}</p>
                        </template>
                    </el-table-column>
                    <el-table-column prop="isForbidden" align="center" label="上/下架">
                        <template slot-scope="{row}">
                            <el-switch
                                    v-model="row.isShelves"
                                    active-color="#ff4949"
                                    inactive-color="#13ce66"
                                    @change="switchChange(row)"
                                    :active-value="1"
                                    :inactive-value="0">
                            </el-switch>
                        </template>
                    </el-table-column>
                    <el-table-column label="操作" align="center" width="150px">
                        <template slot-scope="scope">
                            <el-button @click="editEvent(scope.row)" type="text">编辑</el-button>
                            <el-button type="text" @click="delSku(scope.$index)">删除</el-button>
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
                checkType: '',
                checkAll: false,
                delData: {},
                skuIds: [],
                skuNum: {},
                categoryId: '',
                skuName: '',
                categoryTwoList: [],
                item: {},
                type: '',
                size: '',
                px: '',
                delVisible: false,
                delBatchVisible: false,
                pagination: [],
                list: [],
                threeid:''
            }
        },
        created() {
            this.requestSearch()
            this.parentId = this.$route.params.parentId
        },

        methods: {
            addStorehouse(){
                this.$router.push('/sku/selectFl')
            },

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
                    size: this.size==''?'10':this.size,
                    px: this.px,
                    isDel: 0,
                    spuName: this.skuName,
                    categoryId: this.categoryId,
                    currentPage,
                }
                let res = await this.$get("/admin/getSkuPageAll", data)
                console.log(res)
                this.list = res.list
                if (res.code == 200) {
                    let dataSet = res.list
                    let list = dataSet.list;
                    this.list = list;
                    this.threeid = list.creatorId
                    this.pagination = {
                        count: dataSet.count,
                        pageNumber: dataSet.pageNumber,
                        pageSize: dataSet.pageSize,
                        pages: dataSet.pages
                    }
                }
            },
            async switchChange(item) {
                console.log(item)
                let data = {
                    id: item.id,
                    isShelves: item.isShelves,
                }
                if (item.disable ==1){
                    this.$message.success("暂时不能上架该商品")
                    return
                }
                let res = await this.$post('/admin/UpdateCountyState', data)
                if (res.code == 200) {
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }
            },

            //編輯
            async editEvent(row){
                console.log(row)
                this.$router.push('/sku/selectTable/editSkuInfo/'+row.categoryId+'/'+row.spuId+'/'+row.id)
            },

            async delSku(index) {
                this.item = this.list[index]
                console.log(this.list[index])
                let res = await this.$post("/admin/removeShpSkuS", {spuId: this.list[index].spuId,id:this.list[index].id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            closeInsert() {
                this.addVisible = false
            }
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

