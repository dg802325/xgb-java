<template>
    <div>
        <glob-breadcrumb title="电子合同管理"/>
        <br><br>
        <glob-base-search>
            <div slot="button">
                <el-button @click="searchEvent">查询结果</el-button>
            </div>
            <el-form label-width="90px" :inline="true">
                <!--<el-form-item label="县域服务商：">-->
                    <!--<el-input v-model="firstParty" placeholder="甲方" style="width: 140px"></el-input>-->
                <!--</el-form-item>-->
                <el-form-item label="状态：">
                    <el-select  v-model="isStatus" style="width: 350px" placeholder="请选择">
                    <el-option
                            v-for="item in options"
                            :key="item.status"
                            :label="item.label"
                            :value="item.status">
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
                    <el-table-column prop="companyId" align="center" label="县域服务商" width="150px;">
                        <template slot-scope="{row}">
                            <span>{{row.companyId | formatData(companyMap)}}</span>
                        </template>
                    </el-table-column>
                    <el-table-column prop="contractAmount" align="center" label="合同金额" width="130px"></el-table-column>
                    <el-table-column prop="contractName" align="center" label="合同名称" width="200px"></el-table-column>
                    <el-table-column prop="contractNo" align="center" label="合同编号" width="150px"></el-table-column>
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

    import {setDictMap} from "../../utils/main";

    export default {
        data() {
            return {
                options: [{
                    label: '待甲方审核',
                    status: '1'
                },{
                    label: '待法大大审核',
                    status: '2'
                },{
                    label:'已通过',
                    status: '3'
                },{
                    label:'审核不通过',
                    status:'4'
                },{
                    label:'全部',
                    status:''
                }],
                isStatus:'',
                firstParty: '',
                selectParty: '',
                status: '',
                applyTime:'',
                pagination: [],
                list:[],
                supplierList:{},
                companyMap:{},
                companyIdAll:[],
            }
        },
       created () {
            this.requestSearch()
        },
        methods: {
            //查询所有合同
            async requestSearch(page){
                let currentPage = page || 1;
                let data = {
                    firstParty: this.firstParty,
                    selectParty: this.selectParty,
                    status: this.isStatus,
                    applyTime: this.applyTime,
                    currentPage
                }
                let res = await this.$get("/admin/getBbiSpulileForPage", data)
                if (res.code == 200) {
                    let list = res.dataSet.list
                    //查询提现县域商信息
                    let companyIdList = [];
                    companyIdList = list.map(item => item.companyId);
                    companyIdList = Array.from(new Set(companyIdList))
                    this.companyIdAll = companyIdList.join();
                    let dealerData = {
                        companyId: this.companyIdAll
                    };
                    console.log(this.companyIdAll)
                    let Dealer = await this.$get("/admin/getErpUserByCompanyIdList", dealerData)
                    if (Dealer.code === '200') {
                        Dealer.CompandyId.forEach(item => {
                            this.companyMap[item.companyId] = item.userName
                        })
                    }
                    console.log(Dealer)
                    this.list = list
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
                }
            },


            //查看
            lookEvent(row) {
                this.$router.push({path: '/contract/contractManagement/partyContract/' + row.id})
            },


            //查询按钮
            searchEvent() {
                this.requestSearch()
            },

            closeInsert() {
                this.addVisible = false;
            },
            addBbiContractSuccess() {
                this.closeInsert();
                this.searchEvent();
            },

            //分页查询
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
        },

    }

</script>

<style>
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
</style>
