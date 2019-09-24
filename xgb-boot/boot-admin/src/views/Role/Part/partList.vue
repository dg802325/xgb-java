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
                    <el-select v-model="deptId" clearable placeholder="全部">
                        <el-option
                                v-for="item in deptList"
                                :key="item.id"
                                :label="item.deptName"
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
                            <el-button size="mini" type="primary" @click="editUser(scope.$index)">编辑</el-button>
                            <el-button size="mini" type="danger" @click="toDelUser(scope.$index)">删除</el-button>
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

            <!-- 角色编辑框 -->
            <el-dialog title="修改角色" :visible.sync="isShowEdit" width="20%" :before-close="closeEdit">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="昵称:" required>
                        <el-input v-model="userInfo.nickName" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="账号:" required>
                        <el-input v-model="userInfo.userName" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="部门:" required>
                        <el-select  v-model="editDeptId" size="1" style="width: 200px;" placeholder="所属权限" >
                            <el-option
                                    v-for="item in deptList"
                                    :key="item.label"
                                    :label="item.deptName"
                                    :value="item.id"
                            ></el-option>
                        </el-select>
                    </el-form-item>
                    <el-form-item label="岗位:" required>
                        <el-select  v-model="editRoleId" size="1" style="width: 200px;" placeholder="所属权限" >
                            <el-option
                                    v-for="item in roleList"
                                    :key="item.label"
                                    :label="item.roleName"
                                    :value="item.id"
                            ></el-option>
                        </el-select>
                    </el-form-item>
                </el-form>
                <span slot="footer" class="dialog-footer">
                <el-button @click="closeEdit">取 消</el-button>
                <el-button type="primary" @click="saveEdit">确 定</el-button>
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
                pagination:{},
                list: [],
                userInfo:{},
                deptId: '',
                deptList: [],
                editRoleId:'',
                editDeptId:'',
                roleId:'',
                roleList:[],
                nickName:'',
                userName:'',
                delVisible:false,
                isShowEdit:false,
            }
        },
        watch:{
            editDeptId(val){
                this.getRoleBydeptId(val)
            }
        },
        created() {
            this.requestSearch()
            this.getDeptInfo()
            this.getRole()
        },
        methods: {
            //获得全部部门
            async getDeptInfo(){
                let res = await this.$get("/admin/getAllDept", {})
                this.deptList = res;
            },
            //获得全部岗位
            async getRole(){
                let res = await this.$get("/admin/getAllRole", {})
                this.roleList = res;
            },
            //根据部门id获取岗位
            async getRoleBydeptId(deptId){
                let res = await this.$get("/admin/getAllRole", {deptId:deptId})
                this.roleList = res;
            },
            //分页查询
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            //查询
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    begin:currentPage,
                    end:10
                }
                let res = await this.$get("/admin/getSysUserRoleForPage", data)
                if (res.code == 200) {
                    let list = res.roles
                    this.list = res.roles
                    this.pagination = {
                        count: res.count,
                        pageNumber: res.pageNumber,
                        pageSize: res.pageSize,
                        pages: res.pages
                    }
                }
            },
            //删除显示
            toDelUser(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            //修改
            async saveEdit(){
                let data= {
                    id:this.userInfo.id,
                    roleId:this.editRoleId,
                }
                let res = await this.$post("/admin/saveSysUserRole", data)
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.isShowEdit = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //删除
            async delUser() {
                let res = await this.$post("/admin/delSysUserRole", {userRoleId: this.item.userRoleId})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //修改
            editUser(index) {
                this.userInfo = this.list[index]
                this.editDeptId = this.userInfo.deptId
                this.editRoleId = this.userInfo.roleId
                this.isShowEdit = true
            },
            closeEdit(){
                this.isShowEdit = false
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
