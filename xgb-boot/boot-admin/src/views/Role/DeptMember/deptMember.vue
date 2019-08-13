<template>
    <div>
        <glob-breadcrumb title="部门列表"/>
        <br><br>
        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
                <div>
                    <el-button @click="addDepartment">添加</el-button>&nbsp;&nbsp;
                    <el-select v-model="size" style="width: 95px;margin-right: 10px;" placeholder="显示条数">
                        <el-option label="10" value="10"></el-option>
                        <el-option label="20" value="20"></el-option>
                    </el-select>
                    <el-select v-model="size" style="width: 95px" placeholder="排序方式">
                        <el-option label="10" value="10"></el-option>
                        <el-option label="20" value="20"></el-option>
                    </el-select>
                </div>
            </div>
            <el-table
                    :data="list"
                    border
                    style="width: 100%">
                <el-table-column prop="departmentName" align="center" label="部门名称"></el-table-column>
                <el-table-column prop="note" align="center" label="职能描述"></el-table-column>
                <el-table-column prop="userCount" align="center" label="成员数量">
                </el-table-column>
                <el-table-column prop="createTime" align="center" label="添加时间"></el-table-column>
                <el-table-column prop="isForbidden" align="center" label="是否启用">
                    <template slot-scope="{row}">
                        <el-switch
                                v-model="row.isForbidden"
                                active-color="#ff4949"
                                inactive-color="#13ce66"
                                @change="switchChange(row)"
                                :active-value="true"
                                :inactive-value="false">
                        </el-switch>
                    </template>
                </el-table-column>
                <el-table-column label="操作" align="center">
                    <template slot-scope="scope">
                        <el-button type="text" @click="editDepartment(scope.$index)">编辑</el-button>
                        <el-button type="text" @click="toDeleteDepartment(scope.$index)">删除</el-button>
                    </template>
                </el-table-column>
            </el-table>
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
        <el-button type="primary" @click="deleteDepartment">确 定</el-button>
        </span>
        </el-dialog>
        <Insert v-if="addVisible" :addVisible="addVisible" @closeInsert="closeInsert"
                @addDepartmentSuccess="addDepartmentSuccess"/>
        <Edit v-if="editVisible" :editVisible="editVisible" @closeEdit="closeEdit"
              @editDepartmentSuccess="editDepartmentSuccess" :item="item"/>
    </div>
</template>

<script>
    export default {
        name: 'dashboard',
        data() {
            return {
                departmentCode:'',
                departmentId: '',
                departmentList: [],
                pagination: [],
                item: {},
                name: '',
                type: '',
                size: '',
                addVisible: false,
                editVisible: false,
                delVisible: false,
                checkAll: [],
                option: '',
                list: []
            }
        },
        created() {
            this.requestSearch()
        },
        methods: {
            async switchChange(item) {
                let data = {
                    id: item.id,
                    isForbidden: item.isForbidden,
                }
                let res = await this.$post('/admin/updateDepartment', data)
                if (res.code == 200) {
                    this.$message.success(res.message)
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
                    currentPage
                }
                let res = await this.$get("/admin/getDepartmentForPage", data)
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
            editDepartment(index) {
                this.item = this.list[index]
                this.editVisible = true
            },

            async toDeleteDepartment(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            async deleteDepartment() {
                let data = {
                    id: this.item.id,
                }
                let res = await this.$post("/admin/deleteDepartment", data)
                if (res>0) {

                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.requestSearch()
                }
            },

            addDepartment() {
                this.addVisible = true
            },
            closeInsert() {
                this.addVisible = false;
            },
            closeEdit() {
                this.editVisible = false;
            },
            addDepartmentSuccess() {
                this.requestSearch()
                this.closeInsert();
            },
            editDepartmentSuccess() {
                this.requestSearch()
                this.closeEdit();
            },
        },
        components: {
            Insert,
            Edit
        }
    }
</script>

<style>

</style>
