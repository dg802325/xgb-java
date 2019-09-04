<template>
    <div>
        <glob-breadcrumb title="数据库管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="queryUser" placeholder="成员账号/姓名" clearable></el-input>
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
            <div class="v-cart-title">
                <el-button type="success" size="mini" @click="handleAdd()">添加数据库连接</el-button>
            </div>
            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="databaseUrl" align="center" label="数据库连接地址" width="135px;"></el-table-column>
                    <el-table-column prop="databasePortNumber" align="center" label="数据库端口号" width="135px"></el-table-column>
                    <el-table-column prop="databaseType" align="center" label="数据库类型" width="135px;"></el-table-column>
                    <el-table-column prop="databaseName" align="center" label="数据库名称" width="135px;"></el-table-column>
                    <el-table-column prop="databaseLoginName" align="center" label="账号" width="160px"></el-table-column>
                    <el-table-column prop="databaseLoginPassword" align="center" label="密码" width="160px"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button size="mini" type="primary" @click="editDatabase(scope.$index)">编辑</el-button>
                            <el-button size="mini" type="danger" @click="toDelDatabase(scope.$index)">删除</el-button>
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
                <el-button class="el-button_1" type="primary" @click="delDatabase">确 定</el-button>
                </span>
            </el-dialog>

            <!-- 数据库连接新增框 -->
            <el-dialog title="新增数据库连接" :visible.sync="isShowAdd" width="20%" :before-close="closeAdd">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="地址:" required>
                        <el-input v-model="addDatabaseUrl" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="端口号:" required>
                        <el-input v-model="addDatabasePortNumber" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="类型:" required>
                        <el-select  v-model="addDatabaseType" size="1" style="width: 200px;" placeholder="数据库类型" >
                            <el-option
                                    v-for="item in databaseTypeList"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <el-form-item label="名称:" required>
                        <el-input v-model="addDatabaseName" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="账号:" required>
                        <el-input v-model="addDatabaseLoginName" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="密码:" required>
                        <el-input v-model="addDatabaseLoginPassword" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="生成包类型:" required>
                        <el-select  v-model="addPackageType" size="1" style="width: 200px;" placeholder="生成包类型" >
                            <el-option
                                    v-for="item in packageTypeList"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <el-form-item label="目录路径:" required>
                        <el-input v-model="addDirectoryPrefix" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="工具包路径:" required>
                        <el-input v-model="addCommonPath" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                </el-form>
                <span slot="footer" class="dialog-footer">
                <el-button @click="closeAdd">取 消</el-button>
                <el-button type="primary" @click="saveAdd">确 定</el-button>
            </span>
            </el-dialog>


            <!-- 数据库编辑框 -->
            <el-dialog title="修改角色" :visible.sync="isShowEdit" width="20%" :before-close="closeEdit">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="地址:" required>
                        <el-input v-model="databaseInfo.databaseUrl" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="端口号:" required>
                        <el-input v-model="databaseInfo.databasePortNumber" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="类型:" required>
                        <el-select  v-model="databaseInfo.databaseType" size="1" style="width: 200px;" placeholder="数据库类型" >
                            <el-option
                                    v-for="item in databaseTypeList"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <el-form-item label="名称:" required>
                        <el-input v-model="databaseInfo.databaseName" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="账号:" required>
                        <el-input v-model="databaseInfo.databaseLoginName" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="密码:" required>
                        <el-input v-model="databaseInfo.databaseLoginPassword" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="生成包类型:" required>
                        <el-select  v-model="databaseInfo.packageType" size="1" style="width: 200px;" placeholder="生成包类型" >
                            <el-option
                                    v-for="item in packageTypeList"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <el-form-item label="目录路径:" required>
                        <el-input v-model="databaseInfo.directoryPrefix" size="1" style="width: 200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="工具包路径:" required>
                        <el-input v-model="databaseInfo.commonPath" size="1" style="width: 200px;"></el-input>
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
                databaseTypeList:[
                    {
                        value: 'MYSQL',
                        label: 'Mysql'
                    },
                    {
                        value:'ORACLE',
                        label:'Oracle',
                    },
                ],
                packageTypeList:[
                    {
                        value: '原文件',
                        label: 'Original'
                    },
                    {
                        value:'ZIP',
                        label:'Zip',
                    },
                ],
                addDatabaseUrl:'',
                addDatabasePortNumber:'',
                addDatabaseType:'',
                addDatabaseName:'',
                addDatabaseLoginName:'',
                addDatabaseLoginPassword:'',
                addPackageType:'',
                addDirectoryPrefix:'',
                addCommonPath:'',
                queryUser:'',
                pagination:{},
                list: [],
                databaseInfo:{},
                delVisible:false,
                isShowEdit:false,
                isShowAdd:false,
            }
        },

        created() {
            this.requestSearch()
        },
        methods: {
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
                let res = await this.$get("/admin/getSysDatabaseForPage", data)
                console.log(res)
                if (res.code == 200) {
                    console.log("成功")
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
            toDelDatabase(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            async handleAdd() {
                this.isShowAdd = true;
            },
            async saveAdd(){
                let data= {
                    databaseUrl:this.addDatabaseUrl,
                    databasePortNumber:this.addDatabasePortNumber,
                    databaseType:this.addDatabaseType,
                    databaseName:this.addDatabaseName,
                    databaseLoginName:this.addDatabaseLoginName,
                    databaseLoginPassword:this.addDatabaseLoginPassword,
                    packageType:this.addPackageType,
                    directoryPrefix:this.addDirectoryPrefix,
                    commonPath:this.addCommonPath,
                }
                let res = await this.$post("/admin/saveSysDatabase", data)
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.isShowAdd = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //修改
            async saveEdit(){
                let data= {
                    id:this.databaseInfo.id,
                    databaseUrl:this.databaseInfo.databaseUrl,
                    databasePortNumber:this.databaseInfo.databasePortNumber,
                    databaseType:this.databaseInfo.databaseType,
                    databaseName:this.databaseInfo.databaseName,
                    databaseLoginName:this.databaseInfo.databaseLoginName,
                    databaseLoginPassword:this.databaseInfo.databaseLoginPassword,
                    packageType:this.databaseInfo.packageType,
                    directoryPrefix:this.databaseInfo.directoryPrefix,
                    commonPath:this.databaseInfo.commonPath,
                }
                let res = await this.$post("/admin/saveSysDatabase", data)
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.isShowEdit = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //删除
            async delDatabase() {
                let res = await this.$post("/admin/delSysDatabase", {databaseId: this.item.id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //修改
            editDatabase(index) {
                this.databaseInfo = this.list[index]
                console.log(this.databaseInfo)
                this.isShowEdit = true
            },
            closeAdd(){
              this.isShowAdd = false
            },
            closeEdit(){
                this.isShowEdit = false
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
