<template>
    <div>
        <glob-breadcrumb title="管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="classIfication" placeholder="分类名称" clearable></el-input>
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
                <el-button type="success" size="mini" @click="handleAdd()">添加</el-button>
            </div>
            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="classIfication" align="center" label="分类名称" width="120px;"></el-table-column>
                    <el-table-column prop="classType" align="center" label="分类类型" width="120px;"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建时间" width="240px;"></el-table-column>

                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button size="mini" type="primary" @click="editBlogClass(scope.$index)">编辑</el-button>
                            <el-button size="mini" type="danger" @click="toDelBlogClass(scope.$index)">删除</el-button>
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
                <el-button class="el-button_1" type="primary" @click="delBlogClass">确 定</el-button>
                </span>
            </el-dialog>

            <!-- 数据库连接新增框 -->
            <el-dialog title="添加" :visible.sync="isShowAdd" width="20%" :before-close="closeAdd">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="分类名称：" required>
                        <el-input v-model="addClassIfication" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="分类类型：" required>
                        <el-input v-model="addClassType" size="1" style="width:200px;"></el-input>
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
                    <el-form-item label="分类名称：" required>
                        <el-input v-model="blogClassInfo.ClassIfication" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="分类类型：" required>
                        <el-input v-model="blogClassInfo.ClassType" size="1" style="width:200px;"></el-input>
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
                addClassIfication : '',
                addClassType : '',
                blogClassInfo : {},
                ClassIfication : '',
                ClassType : '',
                pagination:{},
                list: [],
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
                    classIfication : this.classIfication,
                    classType : this.classType,

                    begin:currentPage,
                    end:10
                }
                let res = await this.$get("/admin/getBlogClassForPage", data)
                if (res.code == 200) {
                    console.log("成功")
                    let list = res.lists
                    this.list = res.lists
                    this.pagination = {
                        count: res.count,
                        pageNumber: res.pageNumber,
                        pageSize: res.pageSize,
                        pages: res.pages
                    }
                }
            },
            //删除显示
            toDelBlogClass(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            async handleAdd() {
                this.isShowAdd = true;
            },
            async saveAdd(){
                let data= {
                    classIfication : this.addClassIfication,
                    classType : this.addClassType,

                }
                let res = await this.$post("/admin/saveBlogClass", data)
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
                    classIfication : this.classIficationInfo.ClassIfication,
                    classType : this.classTypeInfo.ClassType,

                }
                let res = await this.$post("/admin/saveBlogClass", data)
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.isShowEdit = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //删除
            async delBlogClass() {
                let res = await this.$post("/admin/deleteBlogClass", {id: this.item.id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //修改
            editBlogClass(index) {
                this.blogClassInfo = this.list[index]
                console.log(this.blogClassInfo)
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
