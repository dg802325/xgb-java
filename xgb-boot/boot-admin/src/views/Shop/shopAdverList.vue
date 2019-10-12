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
                    <el-input v-model="adverName" placeholder="名称" clearable></el-input>
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
                    <el-table-column prop="adverName" align="center" label="名称" width="120px;"></el-table-column>
                    <el-table-column prop="adverImage" align="center" label="地址" width="120px;"></el-table-column>
                    <el-table-column prop="adverLink" align="center" label="链接" width="120px;"></el-table-column>
                    <el-table-column prop="upTop" align="center" label="置顶" width="120px;"></el-table-column>
                    <el-table-column prop="startTime" align="center" label="开始日期" width="120px;"></el-table-column>
                    <el-table-column prop="endTime" align="center" label="结束日期" width="120px;"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button size="mini" type="primary" @click="editShopAdver(scope.$index)">编辑</el-button>
                            <el-button size="mini" type="danger" @click="toDelShopAdver(scope.$index)">删除</el-button>
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
                <el-button class="el-button_1" type="primary" @click="delShopAdver">确 定</el-button>
                </span>
            </el-dialog>

            <!-- 数据库连接新增框 -->
            <el-dialog title="添加" :visible.sync="isShowAdd" width="30%" :before-close="closeAdd">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="名称：" required>
                        <el-input v-model="addAdverName" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="显示位置" required>
                        <template>
                            <el-radio style="margin-left: 80px;" v-model="addAdverLocation" label="0">首页</el-radio>
                            <el-radio v-model="addAdverLocation" label="1">社区</el-radio>
                        </template>
                    </el-form-item>
                    <el-form-item label="地址：" required>
                        <el-input v-model="addAdverImage" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="链接：" required>
                        <el-input v-model="addAdverLink" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="备注：" required>
                        <el-input v-model="addAdverRemark" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="置顶：" required>
                        <el-input v-model="addUpTop" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="展示日期：" required>
                        <el-date-picker
                                v-model="showTime"
                                type="daterange"
                                align="right"
                                unlink-panels
                                range-separator="至"
                                start-placeholder="开始日期"
                                end-placeholder="结束日期"
                                :picker-options="pickerOptions">
                        </el-date-picker>
                    </el-form-item>
                </el-form>
                <span slot="footer" class="dialog-footer">
                <el-button @click="closeAdd">取 消</el-button>
                <el-button type="primary" @click="saveAdd">确 定</el-button>
            </span>
            </el-dialog>

            <!-- 数据库编辑框 -->
            <el-dialog title="修改" :visible.sync="isShowEdit" width="30%" :before-close="closeEdit">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="名称：" required>
                        <el-input v-model="shopAdverInfo.adverName" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="位置 0首页 1社区：" required>
                        <el-input v-model="shopAdverInfo.adverLocation" size="1" style="width:350px;"></el-input>
                        <template>
                            <el-radio style="margin-left: 80px;" v-model="addAdverLocation" label="0">首页</el-radio>
                            <el-radio v-model="addAdverLocation" label="1">社区</el-radio>
                        </template>
                    </el-form-item>
                    <el-form-item label="地址：" required>
                        <el-input v-model="shopAdverInfo.adverImage" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="链接：" required>
                        <el-input v-model="shopAdverInfo.adverLink" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="备注：" required>
                        <el-input v-model="shopAdverInfo.adverRemark" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="置顶：" required>
                        <el-input v-model="shopAdverInfo.upTop" size="1" style="width:350px;"></el-input>
                    </el-form-item>
                    <el-form-item label="展示日期：" required>
                        <el-date-picker
                                v-model="shopAdverInfo.showTime"
                                type="daterange"
                                align="right"
                                unlink-panels
                                range-separator="至"
                                start-placeholder="开始日期"
                                end-placeholder="结束日期"
                                :picker-options="pickerOptions">
                        </el-date-picker>
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
                addAdverName : '',
                addAdverLocation : '0',
                addAdverImage : '',
                addAdverLink : '',
                addAdverRemark : '',
                addCreatorId : '',
                addUpTop : '',
                addSttusTime : '',
                addEndTime : '',

                shopAdverInfo : {},
                adverName : '',
                pagination:{},
                list: [],
                delVisible:false,
                isShowEdit:false,
                isShowAdd:false,
                showTime:[],
                pickerOptions: {
                    shortcuts: [{
                        text: '最近一周',
                        onClick(picker) {
                            const end = new Date();
                            const start = new Date();
                            start.setTime(start.getTime() - 3600 * 1000 * 24 * 7);
                            picker.$emit('pick', [start, end]);
                        }
                    }, {
                        text: '最近一个月',
                        onClick(picker) {
                            const end = new Date();
                            const start = new Date();
                            start.setTime(start.getTime() - 3600 * 1000 * 24 * 30);
                            picker.$emit('pick', [start, end]);
                        }
                    }, {
                        text: '最近三个月',
                        onClick(picker) {
                            const end = new Date();
                            const start = new Date();
                            start.setTime(start.getTime() - 3600 * 1000 * 24 * 90);
                            picker.$emit('pick', [start, end]);
                        }
                    }]
                },
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
                    adverName : this.adverName,
                    begin:currentPage,
                    end:10
                }
                let res = await this.$get("/admin/getShopAdverForPage", data)
                if (res.code == 200) {
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
            toDelShopAdver(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            async handleAdd() {
                this.isShowAdd = true;
            },
            async saveAdd(){
                console.log(this.showTime[0])
                let data= {
                    adverName : this.addAdverName,
                    adverLocation : this.addAdverLocation,
                    adverImage : this.addAdverImage,
                    adverLink : this.addAdverLink,
                    adverRemark : this.addAdverRemark,
                    creatorId : this.addCreatorId,
                    upTop : this.addUpTop,
                    astartTime:new Date(this.showTime[0]),
                    aendTime:new Date(this.showTime[1]),
                }
                let res = await this.$post("/admin/addShopAdver", data)
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
                    adverName : this.shopAdverInfo.AdverName,
                    adverLocation : this.shopAdverInfo.AdverLocation,
                    adverImage : this.shopAdverInfo.AdverImage,
                    adverLink : this.shopAdverInfo.AdverLink,
                    adverRemark : this.shopAdverInfo.AdverRemark,
                    creatorId : this.shopAdverInfo.CreatorId,
                    upTop : this.shopAdverInfo.UpTop,
                    astartTime:new Date(this.shopAdverInfo.showTime[0]),
                    aendTime:new Date(this.shopAdverInfo.showTime[1]),
                }
                let res = await this.$post("/admin/saveShopAdver", data)
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.isShowEdit = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //删除
            async delShopAdver() {
                let res = await this.$post("/admin/deleteShopAdver", {id: this.item.id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //修改
            editShopAdver(index) {
                this.shopAdverInfo = this.list[index]
                this.shopAdverInfo.showTime = [this.list[index].startTime,this.list[index].endTime];
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
