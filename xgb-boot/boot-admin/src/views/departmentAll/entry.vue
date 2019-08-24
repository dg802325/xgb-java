<template>
    <div>
        <glob-breadcrumb title="部门管理"/>
        <br><br>
        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
                <div>
                    <el-button class="el-button_1" @click="addDepartment" >添加部门</el-button>
                    <!--                    <el-button class="el-button_1" @click="addStation" >添加岗位</el-button>-->
                </div>
            </div>
            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="departmentName" align="center" label="部门名称" width="250px;"></el-table-column>
                    <!--                    <el-table-column prop="roleName" align="center" label="岗位" width="320px"></el-table-column>-->
                    <!--                    <el-table-column prop="userCount" align="center" label="成员数量" width="200px">-->
                    <!--                    </el-table-column>-->
                    <el-table-column prop="createTime" align="center" label="添加时间" width="200px;"></el-table-column>
                    <el-table-column prop="isForbidden" align="center" label="是否启用" width="200px">
                        <template slot-scope="{row}">
                            <el-switch
                                    v-model="row.isForbidden"
                                    @change="switchChange(row)"
                                    :active-value="false"
                                    :inactive-value="true">
                            </el-switch>
                        </template>
                    </el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <!--                            <el-button type="text" @click="">权限设置</el-button>-->
                            <el-button type="text" @click="editDepartment(scope.$index)">编辑</el-button>
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
        <Insert v-if="addVisible" :addVisible="addVisible" @closeInsert="closeInsert"
                @addDepartmentSuccess="addDepartmentSuccess"/>
        <Edit v-if="editVisible" :editVisible="editVisible" @closeEdit="closeEdit"
              @editDepartmentSuccess="editDepartmentSuccess" :item="item"/>
        <InsertStation v-if="addStationVisible" :addStationVisible="addStationVisible" @closeInsertStation="closeInsertStation"
                       @addDepartmentSuccess="addStationSuccess"/>
    </div>
</template>

<script>
    import Insert from './insert'
    import InsertStation from './insertStation'
    import Edit from './edit'

    export default {
        name: 'dashboard',
        data() {
            return {
                addStationVisible:false,
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
                let res = await this.$post('/dealer/setIsForbiddenSupplier', data)
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
                let res = await this.$get("/dealer/getErpSupplierDepartmentForPage", data)
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
                let res = await this.$post("/dealer/remove_erpDeparment", data)
                if (res.code == 200) {
                    this.$message.success(res.message)
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message)
                }
            },

            async addDepartment() {
                //当前用户是否有认证企业
                let res = await this.$get('/dealer/checkedAuthen')
                if (res.code==200) {
                    this.addVisible = true
                }
                else {
                    this.$message.warning(res.message)
                }
            },
            async addStation() {
                //当前用户是否有认证企业
                let res = await this.$get('/dealer/checkedAuthen')
                if (res.code==200) {
                    this.addStationVisible = true
                }
                else {
                    this.$message.warning(res.message)
                }
            },
            closeInsertStation() {
                this.addStationVisible = false;
            },
            closeInsert() {
                this.addVisible = false;
            },
            closeInsertStation() {
                this.addStationVisible = false;
            },
            closeEdit() {
                this.editVisible = false;
            },
            addDepartmentSuccess() {
                this.requestSearch()
                this.closeInsert();
            },
            addStationSuccess() {
                this.requestSearch()
                this.closeInsertStation();
            },
            editDepartmentSuccess() {
                this.requestSearch()
                this.closeEdit();
            },
        },
        components: {
            Insert,
            Edit,
            InsertStation
        }
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
