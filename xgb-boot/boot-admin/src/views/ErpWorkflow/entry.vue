<template>
    <div>
        <glob-breadcrumb title="工作流管理"/>
        <br><br>
        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    工作流管理
                </div>
                <div>
                    <el-button class="el-button_1" @click="addEvent" style="width: 95px;">添加工作流</el-button>
                </div>
            </div>
            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="wfNumber" align="center" label="工作流编号" width="260px;"></el-table-column>
                    <el-table-column prop="wfName" align="center" label="工作流名称" width="238px;"></el-table-column>
                    <el-table-column prop="userName" align="center" label="操作员" width="200px;">
                    </el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建时间" width="200px;"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button type="text" @click="editEvent(scope.row)">编辑</el-button>
                            <el-button type="text" @click="toDeleteDepartment(scope.$index)">删除</el-button>
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
        <!-- 删除提示框 -->
        <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
            <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
            <span slot="footer" class="dialog-footer">
        <el-button class="el-button_1" @click="delVisible = false">取 消</el-button>
        <el-button class="el-button_1" type="primary" @click="deleteDepartment">确 定</el-button>
        </span>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                wfNumber: '',
                wfName: '',
                userName: '',
                createTime: '',
                pagination: [],
                delVisible: false,
                list: []
            }
        },
        created() {
            this.requestSearch()
        },
        methods: {
            reSearch(){
                this.requestSearch()
            },

            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    wfNumber: this.wfNumber,
                    wfName: this.wfName,
                    userName: this.userName,
                    currentPage
                }
                let res = await this.$get("/supplier/getErpWorkflowForPage" ,data)
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
            editEvent(row) {
                this.$router.push({path:'/system/erpWorkflow/editWorkflow/'+row.id})
            },

            toDeleteDepartment(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            async deleteDepartment() {
                let res = await this.$post("/admin/remove_erpWorkflow",{id: this.item.id})
                if (res.code == 200) {
                    this.$message.success(res.message)
                    this.delVisible = false
                    this.reSearch()
                } else {
                    this.$message.error(res.message)
                }
            },

            async addEvent() {
                this.$router.push({path:'/system/erpWorkflow/addWorkflow'})
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
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>
