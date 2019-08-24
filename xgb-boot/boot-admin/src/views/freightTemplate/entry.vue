<template>
    <div>
        <glob-breadcrumb title="运费模板"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="searchEvent ">搜索</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="模板名称：">
                    <el-input v-model="templateName" placeholder="模板名称"></el-input>
                </el-form-item>
            </el-form>
        </glob-base-search>
        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
                <div>
                    <el-button class="el-button_1" @click="addEvent">新增</el-button>&nbsp;&nbsp;
                </div>
            </div>

            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
<!--            <el-table :data="list" border stripe width="100%" ref="multipleTable">-->
                <el-table-column prop="templateName" label="模板名称" align="center"></el-table-column>

                <el-table-column prop="address" label="货物地址" align="center">
                    <template slot-scope="{row}">
                    {{row.province+"-"+row.city+"-"+row.area}}
                    </template>
                </el-table-column>

                <el-table-column prop="isFreeShipping" label="是否包邮" align="center">
                    <template slot-scope="{row}">
                        {{row.isFreeShipping | formatData(isFreeShipping)}}
                    </template>
                </el-table-column>
                <el-table-column prop="valuationMethod" label="计价方式" align="center">
                    <template slot-scope="{row}">
                        {{row.valuationMethod | formatData(valuationMethod)}}
                    </template>
                </el-table-column>
                <el-table-column label="操作" width="300" align="center">
                    <template slot-scope="scope">
                        <el-button type="text" @click="editEvent(scope.row)">编辑</el-button>
                        <el-button type="text"  @click="removeEvent(scope.$index)">
                            删除
                        </el-button>
                    </template>
                </el-table-column>
            </el-table>
            </div>
<!--            <div class="pagination">-->
<!--                <el-pagination background layout="prev, pager, next" :total="1">-->
<!--                </el-pagination>-->
<!--            </div>-->
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


        <!-- 删除提示框 -->
        <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
        <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
        <span slot="footer" class="dialog-footer">
        <el-button @click="delVisible = false">取 消</el-button>
        <el-button type="primary" @click="delErpFreightTemplate">确 定</el-button>
        </span>
        </el-dialog>

    </div>
</template>

<script>
    import {setDictMap} from '../../utils/main'
    // import {getErpFreightTemplateList, deleteErpFreightTemplate,getIsFreeShippingList,getValuationMethodList} from 'api/freightTemplate/erpFreightTemplate'

    export default {
        data() {
            return {
                id: '',
                templateName: '',
                forbidden: '',
                list: [],
                pagination: {
                    count: 0,
                    pageNumber: 0,
                    pageSize: 0,
                    pages: 1
                },
                addVisible: false,
                editVisible: false,
                delVisible: false,
                enableVisible: false,
                prohibitVisible: false,
                // selItem: {},
                // editItem: {},
                // seaportItem: [],



                isFreeShipping: {},
                valuationMethod: [],
                options: [{
                    value: '1',
                    label: '是'
                }, {
                    value: '0',
                    label: '否'
                }]
            }
        },
        created() {
            this.searchEvent();
            this.isFreeShippingList()
            this.valuationMethodList()
            this.requestSearch()
        },
        methods: {
            async isFreeShippingList(){

                let res = await this.$get("/admin/getDictDetailList/IS_FREE_SHIPPING/Math.random()/")


                let map = setDictMap(res,'dictValue','name')
                this.isFreeShipping = map;
            },
            async valuationMethodList(){
               let res= await  this.$get("/admin/getDictDetailList/VALUATION_METHOD/Math.randow()/")
                let map = setDictMap(res,'dictValue','name')
                this.valuationMethod = map;
            },

            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            searchEvent() {
                this.requestSearch()
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    templateName: this.templateName,
                    // wfName: this.wfName,
                    // userName: this.userName,
                    currentPage
                }
                let res = await this.$get("/supplier/getErpFreightTemplateForPage" ,data)
                    // let res = await getErpFreightTemplateList(this.templateName, page)
                this.list = res.dataSet.list;
                // console.log(this.list)
                // this.pagination = {
                //     count: res.count,
                //     pageNumber: res.pageNumber,
                //     pageSize: res.pageSize,
                //     pages: res.pages
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
            // statusEvent(index) {
            //     this.selItem = this.list[index]
            //     if (!this.selItem.isForbidden) {
            //         this.prohibitVisible = true
            //     } else {
            //         this.enableVisible = true
            //     }
            // },
            addEvent() {
                // this.addVisible = true;
                // this.$router.push(`/freightTemplate/freightTemplates/insert`)
                this.$router.push({path:'/system/template/addFreight'})
            },

            editEvent(row) {
                // this.id = this.list[index].id
                // this.$router.push(`/freightTemplate/freightTemplates/edit/`+this.id);
                this.$router.push({path:'/system/template/editFreight/'+row.id})
                console.log(row.id)
            },

            removeEvent(index) {
                this.Item = this.list[index]
                this.delVisible = true;
            },

            //删除ErpFreightTemplate
            async delErpFreightTemplate() {
                console.log(111111111111111)
                let res = await this.$post("/admin/remove_erpFreightTemplate",{id:this.Item.id})
                if (res.code == 200) {

                        this.$message.success(res.message);
                        this.delVisible = false
                        this.searchEvent()
                    } else {
                        this.$message.error(res.message);
                    }
                //     this.$message({
                //         showClose: true,
                //         message: res.message,
                //         type: 'success'
                //     });
                //     this.delVisible = false;
                // } else {
                //     this.$message({
                //         showClose: true,
                //         message: res.message,
                //         type: 'error'
                //     });

            },

            closeInsert() {
                this.addVisible = false;
            },

            closeEdit() {
                this.editVisible = false;
            },

            addErpFreightTemplateSuccess() {
                this.closeInsert();
                this.searchEvent();
            },

            editErpFreightTemplateSuccess() {
                this.closeEdit();
                this.searchEvent();
            }
        },
    }

</script>

<style scoped>
    .el-button_1{
        width: 85px;
        padding:8px 20px;
        border-radius: 2px;
    }
</style>
