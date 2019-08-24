<template>
  <div>
    <glob-breadcrumb title="厂家直销单列表"/><br><br>
    <glob-base-search>
      <div slot="button">
        <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
      </div>
      <el-form label-width="130px" :inline="true">
        <!--<el-form-item label="直销物资：">-->
          <!--<el-select v-model="queryUser" clearable filterable placeholder="直销物资"></el-select>-->
        <!--</el-form-item>-->
        <el-form-item label="直销单状态：">
          <el-select v-model="queryStatus" clearable placeholder="直销单状态">
            <el-option label="未邀请" value="0"></el-option>
            <el-option label="已邀请" value="1"></el-option>
            <el-option label="已发布" value="2"></el-option>
            <el-option label="已过期" value="3"></el-option>
            <el-option label="已撤销" value="4"></el-option>
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
        <div>
          <el-button class="el-button_3" @click="addEvent">新增直销单</el-button>
        </div>
      </div>
      <div class="table_border">
        <el-table
              :data="list"
              border
              style="width: 100%">
          <el-table-column prop="" align="center" label="序号" width="110px" type="index"></el-table-column>
          <el-table-column prop="spuName" align="center" label="物资名称" width="180px"></el-table-column>
          <el-table-column align="center" label="数量" width="120px">
            <template slot-scope="{row}">
              <span>{{row.directdealNum}}</span>
              <span v-if="row.spuMetering=='1'">吨</span>
              <span v-if="row.spuMetering=='2'">袋</span>
            </template>
          </el-table-column>
          <el-table-column align="center" label="价格" width="120px">
            <template slot-scope="{row}">
              <span>{{row.directdealPrice}}</span>
              <span v-if="row.spuMetering=='1'">元/吨</span>
              <span v-if="row.spuMetering=='2'">元/袋</span>
            </template>
          </el-table-column>
          <el-table-column prop="validityDate" align="center" label="有效期" width="200px;"></el-table-column>
          <el-table-column align="center" label="状态" width="200px">
              <template slot-scope="{row}">
                  <span v-if="row.directdealStatus=='0'">未发送</span>
                  <span v-if="row.directdealStatus=='1'">已邀请</span>
                  <span v-if="row.directdealStatus=='2'">已发布</span>
                  <span v-if="row.directdealStatus=='3'">已过期</span>
                  <span v-if="row.directdealStatus=='4'">已撤销</span>
              </template>
          </el-table-column>
          <el-table-column label="操作" align="center">
            <template slot-scope="scope">
              <el-button @click="toEditUserPage(scope.row)" type="text" v-if="scope.row.directdealStatus=='0'">编辑</el-button>
              <el-button @click="deleteEvent(scope.row)" type="text" v-if="scope.row.directdealStatus=='0'">删除</el-button>
              <el-button @click="toEditUserPage(scope.row)" type="text" v-else>查看</el-button>
              <el-button @click="revokeEvent(scope.row)" type="text" v-if="scope.row.directdealStatus=='1'">撤销</el-button>
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

    <el-dialog
            title="删除提示"
            :visible.sync="deleteVisiable"
            width="30%">
      <span style="font-size: 18px;">是否确定删除!</span>
      <span slot="footer" class="dialog-footer">
          <el-button @click="deleteVisiable = false">取 消</el-button>
          <el-button type="primary" @click="deleteMethod">确 定</el-button>
      </span>
    </el-dialog>

    <el-dialog
            title="撤销提示"
            :visible.sync="revokeVisiable"
            width="30%">
      <span style="font-size: 18px;">是否撤销此直销单!</span>
      <span slot="footer" class="dialog-footer">
          <el-button @click="revokeVisiable = false">取 消</el-button>
          <el-button type="primary" @click="revokeMethod">确 定</el-button>
      </span>
    </el-dialog>

  </div>
</template>

<script>

export default {
  name: 'dashboard',
  data(){
    return {
        deleteId:'',
        revokeId:'',
        deleteVisiable:false,
        revokeVisiable:false,
        queryStatus:'',
        queryStoreAddress:'',
        queryUser:'',
        provinceMap:{},
        cityMap:{},
        areaMap:{},
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
      revokeEvent(row){
          this.revokeId = row.id
          this.revokeVisiable = true
      },
      async deleteMethod(){
          let res = await this.$post('/supplier/remove_shpDirectdeal',{id:this.deleteId})
          if (res.code==200) {
              this.$message.success(res.message)
          } else {
              this.$message.success(res.message)
          }
          this.deleteVisiable = false
          this.requestSearch()
      },
      async revokeMethod(){
          let res = await this.$post('/supplier/updateDirectdeal',{id:this.revokeId})
          if (res.code==200) {
              this.$message.success(res.message)
          } else {
              this.$message.success(res.message)
          }
          this.revokeVisiable = false
          this.requestSearch()
      },
      deleteEvent(row){
          this.deleteId = row.id
          this.deleteVisiable = true
      },
      addEvent(){
          this.$router.push({path:'/sale/directDealManagement/insert'})
      },
      handleCurrentChange (page) {
          this.requestSearch(page)
      },

      async requestSearch(page){
          let currentPage = page || 1;
          let data = {
              directdealStatus:this.queryStatus,
              currentPage
          }
          let dataSet = await this.$get('/supplier/getShpDirectdealForPage',data)
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
      //跳转到详情页
      toEditUserPage(row){
          if (row.directdealStatus=='0') {
              this.$router.push({path:'/sale/directDealManagement/edit/'+row.id})
          } else {
              this.$router.push({path:'/sale/directDealManagement/lookDetail/'+row.id})
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

  .el-table--enable-row-transition .el-table__body td{
    height:40px;
  }
  .el-table--fit {
    border-left: none;
    border-right: none;
    border-bottom: none;
  }
</style>
