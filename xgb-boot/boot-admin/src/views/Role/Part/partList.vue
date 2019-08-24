<template>
    <div>
        <glob-breadcrumb title="成员管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="queryUser" placeholder="成员账号/姓名" clearable></el-input>
                </el-form-item>
                <el-form-item label="所属部门：">
                    <el-select v-model="departmentId" clearable placeholder="全部">
                        <el-option
                                v-for="item in departmentList"
                                :key="item.id"
                                :label="item.departmentName"
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
                <div>
                    <el-button class="el-button_1" @click="addUser">添加</el-button>&nbsp;&nbsp;
                </div>
            </div>
            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="userName" align="center" label="成员账号" width="135px;"></el-table-column>
                    <el-table-column prop="nickName" align="center" label="姓名" width="135px"></el-table-column>
                    <el-table-column prop="roleName" align="center" label="所属岗位" width="135px;"></el-table-column>
                    <el-table-column prop="deptName" align="center" label="所属部门" width="135px;"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="添加时间" width="160px"></el-table-column>
                    <el-table-column prop="lastLogin" align="center" label="最后登录" width="160px"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button type="text" @click="toPermissions(scope.row)">权限设置</el-button>
                            <el-button type="text" @click="editUser(scope.$index)">编辑</el-button>
                            <el-button type="text" @click="toDelUser(scope.$index)">删除</el-button>
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
        <el-button class="el-button_1" type="primary" @click="delUser">确 定</el-button>
        </span>
            </el-dialog>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'dashboard',
        data() {
            return {
                queryUser:'',
                departmentId: '',
                departmentList: [],
                checkAll: false,
                addVisible: false,
                delVisible: false,
                pagination: [],
                list: []
            }
        },
        created() {
            this.requestSearch()
            this.getDepartmentList();
        },
        methods: {
            async switchChange(item) {
                let data = {
                    id: item.id,
                    isEnable: item.isEnable,
                }
                let res = await this.$post('/dealer/setErpUserEnable', data)
                if (res.code == 200) {
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }
                this.requestSearch()
            },
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    begin:currentPage
                }
                let res = await this.$get("/admin/getSysRoleForPage", data)
                console.log(res)
                if (res.code == 200) {
                    console.log("成功")
                    let list = dataSet.list;
                    this.list = res.roles
                    this.pagination = {
                        count: dataSet.count,
                        pageNumber: dataSet.pageNumber,
                        pageSize: dataSet.pageSize,
                        pages: dataSet.pages
                    }
                }
            },
            //获取公司下的所有部门
            async getDepartmentList() {
                let res = await this.$get("/dealer/getDepartments")
                this.departmentList = res.departments
            },
            toDelUser(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            toPermissions(row) {
                let name = '';
                this.departmentList.forEach(item => {
                    if (row.departmentId == item.id) {
                        name = item.departmentName
                    }
                })
                this.$router.push(`/system/userManagement/permissions?id=` + row.id + '&name=' + name+"&departmentId="+row.departmentId)
            },
            async delUser() {
                let res = await this.$post("/dealer/remove_erpUserRole", {userRoleId: this.item.userRoleId})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            async addUser() {
                //当前用户是否有认证企业
                let res = await this.$get('/dealer/checkedAuthen')
                if (res.code==200) {
                    this.$router.push(`/system/userManagement/userInsert`)
                }
                else {
                    this.$message.warning(res.message)
                }
            },
            editUser(index) {
                this.item = this.list[index]
                this.$router.push({path:'/system/userManagement/userEdit/' + this.item.userRoleId})
            },
            closeInsert() {
                this.addVisible = false
            }
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
