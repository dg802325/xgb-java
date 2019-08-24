<template>
    <div>
        <glob-breadcrumb title="消息管理"/>
        <br/>
        <br/>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="meTitle" placeholder="消息标题" clearable></el-input>
                </el-form-item>
            </el-form>
        </glob-base-search>
        <br>
        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    消息管理
                </div>
                <div>
                </div>
            </div>
            <div class="table_border">
                <el-table
                        :data="list"
                        border
                        style="width: 100%">
                    <el-table-column prop="messageNo" align="center" label="编号" width="100px;"></el-table-column>
                    <el-table-column prop="title" align="center" label="消息标题" width="260px;"></el-table-column>
                    <el-table-column prop="isRead" align="center" label="状态" width="200px;">
                        <template slot-scope="{row}">
                            <p v-if="row.isRead=='0'">未读</p>
                            <p v-if="row.isRead=='1'">已读</p>
                        </template>
                    </el-table-column>
                    <el-table-column prop="publisher" align="center" label="发布人">
                    </el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建时间" width="200px;"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button type="text" @click="lookEvent(scope.row)">查看</el-button>
                            <el-button type="text" @click="delEvent(scope.row)">删除</el-button>
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
        <!-- 查看消息 -->
        <el-dialog title="系统消息" :visible.sync="lookVisible" width="700px" center>
            <div style="text-align: center;margin-bottom: 15px">
                <p style="font-size: 18px">{{sysNotice.noticeTitle}}</p>
                <br/>
                <p>{{sysNotice.createTime}}</p>
            </div>
            <hr/>
            <br/>
            <div v-html="sysNotice.noticeContent">
            </div>
        </el-dialog>
        <!-- 删除 -->
        <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
            <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
            <span slot="footer" class="dialog-footer">
            <el-button class="el-button_1" @click="delVisible = false">取 消</el-button>
            <el-button class="el-button_1" type="primary" @click="delMessage">确 定</el-button>
            </span>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                meTitle: '',
                pagination: [],
                lookVisible: false,
                delVisible: false,
                sysNotice: {},
                item: {},
                list: []
            }
        },
        created() {
            this.requestSearch()
        },
        methods: {
            reSearch() {
                this.requestSearch()
            },
            async getMessageInfo(noticeId, id) {
                let data = {
                    id: id,
                    noticeId: noticeId,
                }
                let res = await this.$post("/admin/getMessageInfo", data)
                if (res.code == 200) {
                    this.sysNotice = res.sysNotice
                    this.requestSearch()
                }
            },

            handleCurrentChange(page) {
                this.requestSearch(page)
            },

            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    currentPage,
                    messageType: 1,
                    noticeTitle: this.meTitle,
                }
                let res = await this.$get("/admin/getErpUserMessageForPage", data)
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
            async delMessage() {
                let res = await this.$post("/admin/delMessage", {id: this.item.id})
                if (res.code == 200) {
                    this.delVisible = false
                    this.$message.success(res.message)
                    this.requestSearch()
                } else {
                    this.$message.error(res.message)
                }
            },
            lookEvent(row) {
                this.getMessageInfo(row.noticeId, row.id)
                this.lookVisible = true
            },
            delEvent(row) {
                this.item = row
                this.delVisible = true
            },
        },
    }
</script>

<style>
    .el-button_1 {
        width: 85px;
        padding: 8px 20px;
        border-radius: 2px;
    }

    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>
