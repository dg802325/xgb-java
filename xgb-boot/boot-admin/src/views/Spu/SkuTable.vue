<template>
    <div>
        <glob-breadcrumb title="商品列表"/>
        <br><br>
        <div class="container">
            <el-button class="type-active">全部商品({{spuNum.allSpuCount}})</el-button>
            <el-button>已上架(<span class="red">{{spuNum.sjSpuCount}}</span>)</el-button>
            <el-button>未上架(<span class="red">{{spuNum.xjSpuCount}}</span>)</el-button>
        </div>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="spuName" placeholder="商品名称/商品货号"></el-input>
                </el-form-item>
<!--                <el-form-item label="商品分类：">-->
<!--                    <el-select v-model="categoryId" clearable placeholder="请选择商品分类">-->
<!--                        <el-option-->
<!--                                v-for="item in categoryTwoList"-->
<!--                                :key="item.id"-->
<!--                                :label="item.categoryName"-->
<!--                                :value="item.id">-->
<!--                        </el-option>-->
<!--                    </el-select>-->
<!--                </el-form-item>-->
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
                    <el-table-column prop="spuNo" align="center" label="编号"></el-table-column>
                    <el-table-column prop="name" align="center" label="商品图片">
                        <template slot-scope="{row}">
                            <img :src="row.imgUrl" style="width: 55px;height: 55px"/>
                        </template>
                    </el-table-column>
                    <el-table-column prop="spuName" align="center" label="商品名称" :show-overflow-tooltip="true" width="150">
                    </el-table-column>
                    <el-table-column prop="" align="center" label="价格/货号" width="160">
                        <template slot-scope="{row}">
                            <p>{{'日租金：'+'¥'+row.dailyRent+'/天'}}</p>
                            <p>{{'保证金：'+'¥'+row.bond}}</p>
                            <p>{{'市场价：'+'¥'+row.marketValue}}</p>
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
                            <el-button type="text" @click="editSpu(scope.$index)">编辑</el-button>
                            <el-button type="text" @click="delSpu(scope.$index)">删除</el-button>
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
        <!-- 删除提示框 -->
        <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
            <div class="del-dialog-cnt">删除放入商品回收站，是否确定删除？</div>
            <span slot="footer" class="dialog-footer">
        <el-button @click="delVisible = false">取 消</el-button>
        <el-button type="primary" @click="delBatch">确 定</el-button>
        </span>
        </el-dialog>

        <!-- 批量删除提示框 -->
        <el-dialog title="提示" :visible.sync="delBatchVisible" width="300px" center>
            <div class="del-dialog-cnt">批量删除放入商品回收站，是否确定删除？</div>
            <span slot="footer" class="dialog-footer">
        <el-button @click="delBatchVisible = false">取 消</el-button>
        <el-button type="primary" @click="delBatch">确 定</el-button>
        </span>
        </el-dialog>
    </div>
</template>

<script>

    export default {
        data() {
            return {
                checkType: '',
                checkAll: false,
                delData: {},
                spuIds: [],
                spuNum: {},
                categoryId: '',
                spuName: '',
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
            this.getCategoryTwoList()
            this.requestSearch()
            this.getSpuStatusNum()
            this.parentId = this.$route.params.parentId
        },

        methods: {
            handleSelectionChange(list) {
                this.spuIds = [];
                list.forEach(item => {
                    this.spuIds.push(item.id)
                })
            },
            async delBatch() {
                let res = await this.$post('/admin/SkuRecycle', this.delData)
                if (res.code == 200) {
                    this.$message.success(res.message)
                    this.requestSearch()
                    this.getSpuStatusNum()
                    this.checkAll = false
                    this.delBatchVisible = false
                } else {
                    this.$message.error(res.message)
                }
            },
            async switchChange(item) {
                console.log(item)
                let data = {
                    id: item.id,
                    isShelves: item.isShelves,
                }
                let res = await this.$post('/admin/UpdateState', data)
                if (res.code == 200) {
                    this.$message.success(res.message)
                   this.getSpuStatusNum()
                } else {
                    this.$message.error(res.message)
                }
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
                    spuName: this.spuName,
                    categoryId: this.categoryId,
                    currentPage,
                }
                let res = await this.$get("/admin/getSkuPage", data)
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
            async getSpuStatusNum() {
                let res = await this.$get("/admin/getSkuNum")
                this.spuNum = res
                console.log(res)
            },
            async getCategoryTwoList() {
                let res = await this.$get("/admin/categoryTwoList")
                this.categoryTwoList = res
                console.log(res)
            },
            skuInfo(index) {
                this.item = this.list[index];
            },
            editSku(index) {
                this.item = this.list[index]
                this.$router.push('/sku/addGoods/editAddGoodsInformation/' + this.list[index].categoryId+'/'+this.list[index].id)
                console.log(this.list[index])
            },
            toDelSku(index) {
                this.item = this.list[index]
                let skuIds =[]
                skuIds.push(this.item.id)
                console.log(skuIds)
                this.delData = {skuIds: JSON.stringify(skuIds)}
                this.delVisible = true
            },
            async delSku(index) {
                this.item = this.list[index]
                let res = await this.$post("/admin/remove_shpSkus", {id: this.list[index].id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                    this.getSpuStatusNum()
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

