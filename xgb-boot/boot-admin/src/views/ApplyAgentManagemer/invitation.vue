<template>
  <div>
    <glob-breadcrumb title="代理邀请管理"/><br><br>
    <glob-base-search>
      <div slot="button">
        <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
      </div>
      <el-form label-width="130px" :inline="true">
        <el-form-item label="邀请状态：">
          <el-select v-model="queryStatus"  placeholder="请选择" clearable>
            <el-option label="待接受" value="0"></el-option>
            <el-option label="已接受" value="1"></el-option>
            <el-option label="已拒绝" value="2"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="县域服务商名称：">
          <el-input v-model="queryName"  placeholder="县域服务商名称"></el-input>
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
          <el-table-column prop="" align="center" label="序号" width="80px" type="index"></el-table-column>
          <el-table-column prop="userName" align="center" label="县域服务商名称" width="200px"></el-table-column>
          <el-table-column prop="companyName" align="center" label="公司名称" width="200px"></el-table-column>
          <el-table-column prop="createTime" align="center" label="邀请时间" width="170px"></el-table-column>
          <el-table-column align="center" label="邀请状态" width="100px">
            <template slot-scope="{row}">
              <span v-if="row.auditeStatus=='0'">待接受</span>
              <span v-else-if="row.auditeStatus=='1'">已接受</span>
              <span v-else-if="row.auditeStatus=='2'">已拒绝</span>
            </template>
          </el-table-column>
          <el-table-column align="center" label="公司管理员" width="229px;">
            <template slot-scope="scope">
              <span>{{scope.row.userName}} / {{scope.row.userAccount}}</span>
            </template>
          </el-table-column>
          <el-table-column label="操作" align="center">
            <template slot-scope="scope">
              <el-button v-if="scope.row.auditeStatus=='2'" @click="toInvitePage(scope.row)" type="text">去邀请</el-button>
              <el-button v-else @click="toEditUserPage(scope.row)" type="text">查看</el-button>
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
        name: 'dashboard',
        data(){
            return {
                queryName:'',
                queryStatus:'',
                list: [],
                pagination: {
                    count: 0,
                    pageNumber: 0,
                    pageSize: 0,
                    pages: 1
                },
            }
        },
        created(){
            this.requestSearch()
        },
        methods: {
            handleCurrentChange (page) {
                this.requestSearch(page)
            },

            async requestSearch(page){
                let currentPage = page || 1;
                let data = {
                    userName:this.queryName,
                    auditeStatus:this.queryStatus,
                    currentPage
                }
                let dataSet = await this.$get('/supplier/getSupplierForPage',data)
                if (dataSet.code==200) {
                    let res = dataSet.dataSet
                    this.list  = res.list;
                    this.pagination = {
                        count: res.count,
                        pageNumber: res.pageNumber,
                        pageSize: res.pageSize,
                        pages: res.pages
                    }
                }
            },
            //跳转到申请单详情页
            toEditUserPage(row){
                this.$router.push({path:'/agent/invitationManagement/auditeDetail/'+row.id})
            },
            toInvitePage(row){
                this.$router.push({path:'/agent/dealerManament/lookDetail/'+row.dealerId})
            },
        },components: {
        }
    }
</script>

<style>
  .el-button_1{
    width: 85px;
    padding:8px 20px;
    border-radius: 2px;
  }

  .el-table--enable-row-transition .el-table__body td{
    height:40px;
  }
  .el-table--fit {
    border-left: none;
    border-right: none;
    border-bottom: none;
  }
</style>
