<template>
    <div>
        <glob-breadcrumb title="部门管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="queryUser" placeholder="成员账号/姓名" clearable></el-input>
                </el-form-item>
                <el-form-item label="部门名称：">
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
                        :header-cell-style="{'text-align':'center'}"
                        :cell-style="{'text-align':'center'}"
                        border
                        style="width: 100%">
                    <el-table-column prop="deptName" align="center" label="部门名称" width="160px;"></el-table-column>
                    <el-table-column prop="deptCount" align="center" label="部门人数" width="135px;"></el-table-column>
                    <el-table-column prop="remark" align="center" label="部门说明" width="135px;"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建时间" width="200px"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button size="mini" v-if="checkPermission('SYS:DEPT:SAVE')" type="primary" @click="editUser(scope.$index)">编辑</el-button>
                            <el-button size="mini" v-if="checkPermission('SYS:DEPT:DELETE')" type="danger" @click="toDelUser(scope.$index)">删除</el-button>
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
            <el-dialog title="修改部门" :visible.sync="isShowEdit" width="20%" :before-close="closeEdit">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="部门名称:" required>
                        <el-input v-model="deptInfo.deptName" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="说明:" required>
                        <el-input type="textarea" v-model="deptInfo.remark"></el-input>
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
                deptInfo:{},
                deptId: '',
                deptList: [],
                editDeptName:'',
                editRemark:'',
                delVisible:false,
                isShowEdit:false,
            }
        },
        created() {
            this.requestSearch()
            this.getDeptInfo()
        },
        methods: {
            //获得全部部门
            async getDeptInfo(){
                let res = await this.$get("/admin/getAllDept", {})
                this.deptList = res;
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
                let res = await this.$get("/admin/getSysDeptForPage", data)
                console.log(res)
                if (res.code == 200) {
                    console.log("成功")
                    let list = res.databases
                    this.list = res.databases
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
                    id:this.deptInfo.id,
                    deptName:this.deptInfo.deptName,
                    remark:this.deptInfo.remark,
                }
                let res = await this.$post("/admin/saveSysDept", data)
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
                let res = await this.$post("/admin/delSysDept", {userRoleId: this.item.id})
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
                this.deptInfo = this.list[index]
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
