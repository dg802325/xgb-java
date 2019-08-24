<template>
    <div>
        <glob-breadcrumb title="电子合同管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="searchEvent">查询结果</el-button>
            </div>
            <el-form label-width="90px" :inline="true">
                <el-form-item label="甲方：">
                    <el-input v-model="firstParty" placeholder="甲方" style="width: 140px"></el-input>
                </el-form-item>
                <el-form-item label="乙方：">
                    <el-input v-model="selectParty" placeholder="乙方" style="width: 140px"></el-input>
                </el-form-item>
                <el-form-item label="状态：">
                    <el-input v-model="status" placeholder="请选择状态"></el-input>
                    <el-option
                            v-for="item in departmentList"
                            :key="item.id"
                            :label="item.userName"
                            :value="item.id">
                    </el-option>
                </el-form-item>
                <el-form-item  label="申请时间：">
                    <el-date-picker
                            style="width: 140px"
                            v-model="applyTime"
                            type="date"
                            placeholder="请选择时间">
                    </el-date-picker>
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
                    <el-table-column prop="firstParty" align="center" label="甲方" width="110px;"></el-table-column>
                    <el-table-column prop="selectParty" align="center" label="乙方" width="110px;"></el-table-column>
                    <el-table-column prop="contractAmount" align="center" label="合同金额" width="110px"></el-table-column>
                    <el-table-column prop="contractName" align="center" label="合同名称" width="200px"></el-table-column>
                    <el-table-column prop="contractNo" align="center" label="合同编号" width="140px"></el-table-column>
                    <el-table-column prop="status" align="center" label="状态" width="120px">
                        <template slot-scope="{row}">
                            <span v-if="row.status=='1'">待甲方审核</span>
                            <span v-if="row.status=='2'">待法大大审核</span>
                            <span v-if="row.status=='3'">已完成</span>
                            <span v-if="row.status=='4'">审核不通过</span>
                        </template>
                    </el-table-column>
                    <el-table-column prop="applyTime" align="center" label="申请时间" width="200px"></el-table-column>
                    <el-table-column label="操作" align="center">
                        <template slot-scope="scope">
                            <el-button type="text" @click="lookEvent(scope.row)">查看</el-button>
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
    </div>
</template>


<script>

    export default {
        data() {
            return {
                firstParty: '',
                selectParty: '',
                status: '',
                applyTime:'',
                pagination: [],
                list: []
            }
        },
       created () {
            this.requestSearch()
        },
        methods: {
            searchEvent() {
                this.requestSearch()
               // // handleCurrentChange(page) {
               //      this.requestSearch(page)
            },

            async requestSearch(page){
                let currentPage = page || 1;
                let data = {
                    firstParty: this.firstParty,
                    selectParty: this.selectParty,
                    status: this.status,
                    applyTime: this.applyTime,
                    currentPage
                }
                let res = await this.$get("/admin/getBbiContractForPage", data)
                this.list = res.dataSet.list
                if (res.code == 200) {
                    let dataSet = res.dataSet
                    let list = dataSet.list;
                    console.log(list)
                    this.list = list;
                    this.pagination = {
                        count: dataSet.count,
                        pageNumber: dataSet.pageNumber,
                        pageSize: dataSet.pageSize,
                        pages: dataSet.pages
                    }
                }
            },

            async delBbiContract() {
                let res = await deleteBbiContract(this.selItem.id)
                if (res.isSuccess){
                    this.searchEvent();
                    this.$message({
                        showClose: true,
                        message: res.content,
                        type: 'success'
                    });
                    this.delVisible = false;
                }else{
                    this.$message({
                        showClose: true,
                        message: res.content,
                        type: 'error'
                    });
                }
            },

            closeInsert() {
                this.addVisible = false;
            },
            lookEvent(row) {
                this.$router.push({path: '/partyContract/' + row.id})
            },

            closeEdit() {
                this.editVisible = false;
            },

            addBbiContractSuccess() {
                this.closeInsert();
                this.searchEvent();
            },

            editBbiContractSuccess() {
                this.closeEdit();
                this.searchEvent();
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
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>
