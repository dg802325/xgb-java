<template>
    <div>
        <glob-breadcrumb title="常用银行列表"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="输入搜索：">
                    <el-input v-model="bankName" placeholder="银行名称" clearable></el-input>
                    <el-input v-model="bankCode" placeholder="银行编码" clearable></el-input>
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
                    <el-table-column prop="bankName" align="center" label="银行名称" width="120px;"></el-table-column>
                    <el-table-column prop="bankCode" align="center" label="银行编码" width="120px;"></el-table-column>
                    <el-table-column prop="createTime" align="center" label="创建时间" width="120px;"></el-table-column>
                    <el-table-column prop="bankColor" align="center" label="银行颜色" width="120px;"></el-table-column>
                    <el-table-column prop="bankIcon" align="center" label="银行图标" width="120px;"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button size="mini" type="primary" @click="editChinaBankCode(scope.$index)">编辑</el-button>
                            <el-button size="mini" type="danger" @click="toDelChinaBankCode(scope.$index)">删除</el-button>
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
                <el-button class="el-button_1" type="primary" @click="delChinaBankCode">确 定</el-button>
                </span>
            </el-dialog>

            <!-- 数据库连接新增框 -->
            <el-dialog title="添加" :visible.sync="isShowAdd" width="25%" :before-close="closeAdd">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="银行名称：" required>
                        <el-input v-model="addBankName" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="银行编码：" required>
                        <el-input v-model="addBankCode" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="银行颜色：" required>
                        <el-input v-model="addBankColor" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="银行图标：" required>
                        <el-upload
                                class="avatar-uploader"
                                action="http://localhost:10010/admin/upload/file"
                                :show-file-list="false"
                                :on-success="addAvatarSuccess">
                            <img v-if="addBankIcon" :src="addBankIcon" class="avatar">
                            <!--http://dealer.e-nongye.com.cn/group1/M00/00/00/rBEEQ11DrxKAdlyHAABpv4Ow2BU710.jpg-->
                            <i v-else class="el-icon-plus avatar-uploader-icon"></i>
                        </el-upload>
                        <p class="sc">(点击新增logo)</p>
                    </el-form-item>
                </el-form>
                <span slot="footer" class="dialog-footer">
                <el-button @click="closeAdd">取 消</el-button>
                <el-button type="primary" @click="saveAdd">确 定</el-button>
            </span>
            </el-dialog>

            <!-- 数据库编辑框 -->
            <el-dialog title="修改角色" :visible.sync="isShowEdit" width="25%" :before-close="closeEdit">
                <el-form ref="form"  label-width="100px">
                    <el-form-item label="银行名称：" required>
                        <el-input v-model="chinaBankCodeInfo.bankName" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="银行编码：" required>
                        <el-input v-model="chinaBankCodeInfo.bankCode" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="银行颜色：" required>
                        <el-input v-model="chinaBankCodeInfo.bankColor" size="1" style="width:200px;"></el-input>
                    </el-form-item>
                    <el-form-item label="银行图标：" required>
                        <el-upload
                                class="avatar-uploader"
                                action="http://localhost:10010/admin/upload/file"
                                :show-file-list="false"
                                :on-success="editAvatarSuccess">
                            <img v-if="chinaBankCodeInfo.bankIcon" :src="chinaBankCodeInfo.bankIcon" class="avatar">
                            <!--http://dealer.e-nongye.com.cn/group1/M00/00/00/rBEEQ11DrxKAdlyHAABpv4Ow2BU710.jpg-->
                            <i v-else class="el-icon-plus avatar-uploader-icon"></i>
                        </el-upload>
                        <p class="sc">(点击修改logo)</p>
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
                addBankName : '',
                addBankCode : '',
                addBankColor : '',
                addBankIcon : '',

                chinaBankCodeInfo : {},
                bankName : '',
                bankCode : '',
                bankColor : '',
                bankIcon : '',

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
            //上传图片
            addAvatarSuccess(res) {
                if (res.code == 200) {
                    this.addBankIcon = res.fileUrl
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }

            },
            //修改图片
            editAvatarSuccess(res) {
                if (res.code == 200) {
                    this.chinaBankCodeInfo.bankIcon = res.fileUrl
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }

            },
            //分页查询
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            //查询
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    bankName : this.bankName,
                    bankCode : this.bankCode,
                    begin:currentPage,
                    end:10
                }
                let res = await this.$get("/admin/getChinaBankCodeForPage", data)
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
            toDelChinaBankCode(index) {
                this.item = this.list[index]
                this.delVisible = true
            },
            async handleAdd() {
                this.isShowAdd = true;
            },
            async saveAdd(){
                let data= {
                    bankName : this.addBankName,
                    bankCode : this.addBankCode,
                    bankColor : this.addBankColor,
                    bankIcon : this.addBankIcon,

                }
                let res = await this.$post("/admin/saveChinaBankCode", data)
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
                    bankName : this.bankNameInfo.BankName,
                    bankCode : this.bankCodeInfo.BankCode,
                    bankColor : this.bankColorInfo.BankColor,
                    bankIcon : this.bankIconInfo.BankIcon,

                }
                let res = await this.$post("/admin/saveChinaBankCode", data)
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.isShowEdit = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //删除
            async delChinaBankCode() {
                let res = await this.$post("/admin/deleteChinaBankCode", {id: this.item.id})
                if (res.code == 200) {
                    this.$message.success(res.message);
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.$message.error(res.message);
                }
            },
            //修改
            editChinaBankCode(index) {
                console.log(index)
                this.chinaBankCodeInfo = this.list[index]
                console.log(this.chinaBankCodeInfo)
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
    .avatar-uploader .el-upload {
        border: 1px dashed #d9d9d9;
        border-radius: 6px;
        cursor: pointer;
        position: relative;
        overflow: hidden;
        margin-top: 8px;
    }

    .avatar-uploader .el-upload:hover {
        border-color: #409EFF;
    }

    .avatar-uploader-icon {
        font-size: 28px;
        color: #8c939d;
        width: 178px;
        height: 178px;
        line-height: 178px;
        text-align: center;
    }

    .avatar {
        width: 178px;
        height: 178px;
        display: block;
        margin-left: 5px;
    }

</style>
