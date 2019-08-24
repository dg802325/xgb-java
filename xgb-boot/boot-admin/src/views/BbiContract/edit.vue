<template>
    <div>
        <glob-breadcrumb title="电子合同管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="searchEvent">查询结果</el-button>
            </div>
            <el-form label-width="130px" :inline="true">
                <el-form-item label="甲方：">
                    <el-input v-model="noticeTitle" placeholder="甲方"></el-input>
                </el-form-item>
                <el-form-item label="乙方：">
                    <el-input v-model="creatorId" placeholder="乙方"></el-input>
                </el-form-item>
                <el-form-item label="状态：">
                    <el-input v-model="creatorId" placeholder="请选择状态"></el-input>
                </el-form-item>
                <el-form-item label="申请时间：">
                    <el-input v-model="createTime" placeholder="时间"></el-input>
                </el-form-item>
            </el-form>
        </glob-base-search>
        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
<!--                <div>-->
<!--                    <el-button class="el-button_1" @click="addEvent">发布消息</el-button>&nbsp;&nbsp;-->
<!--                </div>-->
            </div>
            <el-table
                    :data="list"
                    border
                    style="width: 100%">
                <el-table-column prop="noticeNo" align="center" label="甲方" width="187px;"></el-table-column>
                <el-table-column prop="noticeTitle" align="center" label="乙方" width="301px;"></el-table-column>
                <el-table-column prop="createTime" align="center" label="合同金额" width="210px"></el-table-column>
                <el-table-column prop="userName" align="center" label="合同名称" width="200px"></el-table-column>
                <el-table-column prop="createTime" align="center" label="合同编号" width="210px"></el-table-column>
                <el-table-column prop="userName" align="center" label="状态" width="200px"></el-table-column>
                <el-table-column prop="createTime" align="center" label="申请时间" width="210px"></el-table-column>
                <el-table-column label="操作" align="center" width="200px">
                    <template slot-scope="scope">
                        <el-button type="text" @click="editEvent(scope.$index)">查看</el-button>
                    </template>
                </el-table-column>
            </el-table>
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

            <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
                <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
                <span slot="footer" class="dialog-footer">
        <el-button class="el-button_1" @click="delVisible = false">取 消</el-button>
        <el-button class="el-button_1" type="primary" @click="delExpert">确 定</el-button>
        </span>
            </el-dialog>
        </div>
    </div>
</template>

<script>
    import {saveBbiContract} from 'api/bbiContract'
    export default {
        data () {
            return {
                show: false,
                item: this.editItem,
                seaportId:this.editItem.seaportId
            }
        },
        props: {
            editItem: Object,
            seaportItem: Array,
            editVisible: Boolean
        },
        methods: {
            closeEvent () {
                this.$emit('closeEdit')
            },
            async saveBbiContract() {
                let data = {
                    id: this.item.id,
                    wharfChn: this.item.wharfChn,
                    wharfEng: this.item.wharfEng,
                    seaportId: this.seaportId
                };
                if(!this.item.bbiContractChn) {
                    this.$message({
                        showClose: true,
                        message: '请输入BbiContract名称',
                        type: 'error'
                    });
                    return
                }

                let res = await saveBbiContract(data);
                if (res.isSuccess){
                    this.$message({
                        showClose: true,
                        message: res.content,
                        type: 'success'
                    });
                    this.$emit('editBbiContractSuccess')
                }else{
                    this.$message({
                        showClose: true,
                        message: res.content,
                        type: 'error'
                    });
                }
            }
        }
    }
</script>
