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
                    <el-input v-model="blogTaitl" placeholder="博客标题" clearable></el-input>
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
                    <el-table-column prop="blogTaitl" align="center" label="博客标题" width="120px;"></el-table-column>
                    <el-table-column prop="blogAbout" align="center" label="博客简介" width="120px;"></el-table-column>
                    <el-table-column prop="volume" align="center" label="浏览量" width="120px;"></el-table-column>
                    <el-table-column prop="support" align="center" label="支持" width="120px;"></el-table-column>
                    <el-table-column prop="opposition" align="center" label="反对" width="120px;"></el-table-column>
                    <el-table-column prop="classificationId" align="center" label="分类id" width="120px;"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建时间" width="120px;"></el-table-column>
                    <el-table-column prop="keyWord" align="center" label="关键词" width="120px;"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button size="mini" type="primary" @click="editBlogGarden(scope.$index)">编辑</el-button>
                            <el-button size="mini" type="danger" @click="toDelBlogGarden(scope.$index)">删除</el-button>
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
                <el-button class="el-button_1" type="primary" @click="delBlogGarden">确 定</el-button>
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
                addBlogTaitl : '',
                addBlogAbout : '',
                addVolume : '',
                addSupport : '',
                addOpposition : '',
                addClassificationId : '',
                addKeyWord : '',
                blogGardenInfo : {},
                blogTaitl : '',
                BlogAbout : '',
                Volume : '',
                Support : '',
                Opposition : '',
                ClassificationId : '',
                KeyWord : '',
                pagination:{},
                list: [],
                delVisible:false,
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
                    blogTaitl : this.blogTaitl,
                    blogAbout : this.blogAbout,
                    volume : this.volume,
                    support : this.support,
                    opposition : this.opposition,
                    classificationId : this.classificationId,
                    keyWord : this.keyWord,

                    begin:currentPage,
                    end:10
                }
                let res = await this.$get("/admin/getBlogGardenForPage", data)
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
            async delBlogGarden() {
                let res = await this.$post("/admin/delBlogGarden", {blogGardenId: this.item.id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
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
