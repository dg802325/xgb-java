<template>
    <div>
        <glob-breadcrumb title="物资管理"/>

        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="reSearch">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">

                <el-form-item label="物资名称：">
                    <el-input v-model="spuName" placeholder="物资名称/物资货号"></el-input>
                </el-form-item>

                <el-form-item label="物资分类：" >
                    <el-select  v-model="storePro" clearable size="1" style="width: 120px;"  >
                        <el-option
                                v-for="item in categoryList"
                                :key="item.id"
                                :label="item.categoryName"
                                :value="item.id"
                        ></el-option>
                    </el-select>&nbsp;&nbsp;
                    <el-select  v-model="storeCity" clearable size="1" style="width: 120px;margin-left: 50px;"  >
                        <el-option
                                v-for="item in twoCategoryList"
                                :key="item.id"
                                :label="item.categoryName"
                                :value="item.id"
                        ></el-option>
                    </el-select>

                    <el-select  v-model="storeArea" clearable size="1" style="width: 120px;margin-left: 62px;"  >
                        <el-option
                                v-for="item in threeCategoryList"
                                :key="item.id"
                                :label="item.categoryName"
                                :value="item.id"
                        ></el-option>
                    </el-select>
                </el-form-item>

                <el-form-item label="物资品牌：">
                    <el-select v-model="brandIds" clearable placeholder="请选择物资品牌">
                        <el-option
                                v-for="item in options"
                                :key="item.id"
                                :label="item.brandName"
                                :value="item.id">
                        </el-option>
                    </el-select>
                </el-form-item>

                <!--                <el-form-item label="供应商名称：">-->
                <!--                    <el-input v-model="spuName" placeholder="商品名称/商品货号"></el-input>-->
                <!--                </el-form-item>-->
            </el-form>
        </glob-base-search>

        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
                <div>
                    <el-button class="el-button_1" @click="inserts">新增</el-button>&nbsp;
                </div>
            </div>
            <div class="table_border">
                <el-table
                        ref="multipleTable"
                        @selection-change="handleSelectionChange"
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="spuNo" align="center" label="货号"></el-table-column>
                    <el-table-column prop="spuName" align="center" label="物资名称" :show-overflow-tooltip="true" width="150"></el-table-column>
                    <el-table-column prop="brandId" align="center" label="品牌" width="160">
                        <template slot-scope="{row}">
                            <span v-if="row">{{row.brandId | formatData(pinMap)}}</span>
                            <!--                            {{row.brandId}}-->
                        </template>
                    </el-table-column>
                    {{list.categoryName}}
                    <el-table-column prop="categoryId" align="center" label="分类">
                        <template slot-scope="{row}">
                            <span v-if="row">{{row.categoryName2 }}>{{row.categoryName }}>{{row.categoryName1 }}</span>
                        </template>
                    </el-table-column>
<!--                    <el-table-column label="计量单位"align="center">-->
<!--                        <template slot-scope="{row}">-->
<!--                            <span v-if="row">{{row.spuMetering | formatData(jilMap)}}</span>-->
<!--                            &lt;!&ndash;                            {{row.brandId}}&ndash;&gt;-->
<!--                        </template>-->
<!--                    </el-table-column>-->
                    <!--                    <el-table-column prop="spuMetering" align="center" label="单位"></el-table-column>-->
                    <el-table-column prop="createTime" align="center" label="创建时间"></el-table-column>
                    <el-table-column label="操作" align="center" width="150px">
                        <template slot-scope="scope">
                            <el-button type="text" @click="editSku(scope.row)">查看</el-button>
                            <el-button type="text" @click="editExpert(scope.$index)">编辑</el-button>
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
    import {setDictMap} from "../../utils/main";
    export default {
        data() {
            return {
                oneCategoryId: '',
                twoCategoryId: '',
                threeCategoryId:'',
                jsonMap: {},
                DictList:[],
                spuMetering:'',
                specItems:'',
                list:[],
                options:[],
                brandIds:'',
                brandId:'',
                pinMap:{},
                jilMap:{},
                flMap:{},
                categoryId: '',
                categoryIds:'',
                spuName: '',
                categoryTwoList: [],
                item: {},
                pagination: {
                    count: 0,
                    pageNumber: 0,
                    pageSize: 0,
                    pages: 1
                },
                storePro:'',
                categoryList:[],
                storeCity:'',
                twoCategoryList:[],
                storeArea:'',
                threeCategoryList:[],
            }
        },
        created() {
            this.selectCategoryTwoList()
            this.getCategoryTwoList()
            this.requestSearch()
            this.selectBrand()
            this.getBrand()
            this.getCategoryList()
            this.getDict()
        },
        watch:{
            oneCategoryId(id) {
                this.parentId = id;

                this.getTwoCategoryList()

            },

            storePro (val) {
                if (val!=null && val!='') {
                    this.getTwoCategoryList(val)
                    this.storeCity ='';
                    this.twoCategoryList = [];
                    this.storeArea = '';
                    this.threeCategoryList = []
                    // this.getCategoryList(val)
                }
            },
            storeCity (val) {
                if (val!=null && val!='') {
                    this.twoCategoryIdClick(val)
                    this.storeArea = '';
                    this.threeCategoryList = []
                    // this.getTwoCategoryList(val)
                }
            },
            storeArea (val) {
                if (val!=null && val!='') {
                    // this.twoCategoryIdClick(val)
                }
            }
        },

        methods: {

            async selectCategoryTwoList(){
                let resq = await this.$get("/admin/categoryAllTwoLists")
                this.categoryTwoList = resq;

            },




            async selectBrand(){
                let resq = await this.$get("/admin/getBrandList")

                    this.options = resq.list


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
                    spuName: this.spuName,
                    categoryId: this.categoryIds,
                    categoryName2: this.storePro,
                    categoryName: this.storeCity,
                    categoryName1: this.storeArea,
                    brandId: this.brandIds,
                    currentPage
                }
                let res = await this.$get("/admin/getSpuPage", data)
                console.log(res)
                if (res.code == 200) {
                    let page = res.list
                    let dataSet = res.list.list
                    this.list = dataSet;
                    // this.threeid = dataSet.creatorId
                    this.pagination = {
                        count: page.count,
                        pageNumber: page.pageNumber,
                        pageSize: page.pageSize,
                        pages: page.pages
                    }
                }
            },
            async getDict(){
                let res = await this.$get("/admin/getSpuDict");
                this.DictList = res.DictList
                console.log(this.DictList)
                this.jilMap = setDictMap(this.DictList,"dictValue","name")
            },

            //获取品牌
                async getBrand() {
                    let res = await this.$get("/admin/getBrandByCompanyId")
                    this.brandId = res.item
                    this.pinMap = setDictMap(this.brandId,"id","brandName")

                },
            //获取商品三级分类
            async getCategoryTwoList() {
                let res = await this.$get("/admin/categoryAllTwoLists")
                this.categoryId = res
                this.flMap = setDictMap(this.categoryId,"id","categoryName")

            },
            inserts(){
                this.$router.push('/stock/resourceManagement/addGoods')
            },
            editExpert(index) {

                this.item = this.list[index]

                this.$router.push(`/stock/resourceManagement/editGoodsClass/` +this.item.categoryId+'/'+ this.item.id)
            },
            //获得省
            async getCategoryList() {
                let res = await this.$get("/admin/getCategoryList")
                this.categoryList = res

            },
            //获得市
            async getTwoCategoryList(val) {
                let data = {
                    parentId:val,
                }
                let res = await this.$get("/admin/getTwoCategoryList",data)
                this.twoCategoryList = res

            },
            //获得区
            async twoCategoryIdClick(val) {
                let data = {
                    parentId:val,
                }
                let res = await this.$get("/admin/getTwoCategoryList",data)
                this.threeCategoryList = res

            },
            editSku(row) {
                this.$router.push("/stock/resourceManagement/resourceInfo/"+row.id)
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

