<template>
    <div>
        <glob-breadcrumb title="专家管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="reSearch">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="专家姓名：">
                    <el-input v-model="expertRealName" placeholder="用户名/姓名"></el-input>
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
                    <el-button class="el-button_1" @click="addExpert">新增</el-button>&nbsp;&nbsp;
                </div>
            </div>
            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="expertNo" align="center" label="编号" width="180px;"></el-table-column>
                    <el-table-column prop="expertRealName" align="center" label="专家姓名" width="178px"></el-table-column>
                    <el-table-column prop="useName" align="center" label="所属供应商" width="180px;"></el-table-column>
                    <el-table-column prop="expertAccount" align="center" label="专家账号" width="180px;"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建日期" width="200px"></el-table-column>

                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">

                            <el-button type="text" @click="editExpert(scope.$index)">编辑</el-button>
                            <el-button type="text" @click="toDelExpert(scope.$index)">删除</el-button>
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
            <!-- 删除提示框 -->
            <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
                <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
                <span slot="footer" class="dialog-footer">
        <el-button class="el-button_1" @click="delVisible = false">取 消</el-button>
        <el-button class="el-button_1" type="primary" @click="delExpert">确 定</el-button>
        </span>
            </el-dialog>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                list:[],
                expertRealName:'',
                delVisible: false,
                pagination: [],
            }
        },
        created() {
            this.requestSearch()
        },
        methods: {
            reSearch(){
                this.requestSearch()
            },
            handleCurrentChange(){

            },

            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    expertRealName: this.expertRealName,
                    currentPage
                }
                let res = await this.$get("/supplier/getErpExpertForPage", data)
                console.log(res,11111111111)
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

            toDelExpert(index) {
                this.item = this.list[index]
                this.delVisible = true
            },

            async delExpert() {
                let res = await this.$post("/supplier/deleteSupplier", {id: this.item.id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.reSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            async addExpert() {
                //当前用户是否已认证企业
                let res = await this.$get('/supplier/checkedAuthen')
                if (res.code==200) {
                    this.$router.push(`/system/erpExpert/addExpert`)
                }
                else {
                    this.$message.warning(res.message)
                    return;
                }
            },
            editExpert(index) {
                this.item = this.list[index]
                this.$router.push(`/system/erpExpert/editExpert/` + this.item.id)
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
    .el-button--primary{
        background-color:#1abc9c;
        border-color:#1abc9c;
    }
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>
