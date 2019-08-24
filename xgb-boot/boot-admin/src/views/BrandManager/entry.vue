<template>
  <div>
    <glob-breadcrumb title="品牌管理"/><br><br>
    <glob-base-search>
      <div slot="button">
        <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
      </div>
      <el-form label-width="130px" :inline="true">
        <el-form-item label="品牌名称：">
          <el-input v-model="queryName"  placeholder="品牌名称"></el-input>
        </el-form-item>
        <el-form-item label="提交用户：">
          <el-input v-model="queryUser"  placeholder="用户名称"></el-input>
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
          <el-button class="el-button_1" @click="toAddEvent" >添加</el-button>
        </div>
      </div>
      <div class="table_border">
        <el-table
                :data="list"
                border
                style="width: 100%">
          <el-table-column type="index" align="center" label="序号" width="110px"></el-table-column>
          <el-table-column prop="brandName" align="center" label="品牌名称" width="208px"></el-table-column>
          <el-table-column prop="isManufacturer" align="center" label="品牌制造商" width="208px">
            <template slot-scope="{row}">
              <span v-if="row.isManufacturer=='0'">是</span>
              <span v-else-if="row.isManufacturer=='1'">否</span>
            </template>
          </el-table-column>
          <el-table-column align="center" label="审核状态" width="115px">
            <template slot-scope="{row}">
              <span v-if="row.auditStatus=='0'">待审核</span>
              <span v-else-if="row.auditStatus=='1'">审核通过</span>
              <span v-else-if="row.auditStatus=='2'">审核未通过</span>
            </template>
          </el-table-column>
          <el-table-column prop="submitUser" align="center" label="提交用户" width="208px"></el-table-column>
          <el-table-column label="操作" align="center">
            <template slot-scope="scope">
              <el-button @click="lookEvent(scope.row)" type="text">查看</el-button>
              <el-button @click="toDelete(scope.row)" type="text">删除</el-button>
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

    <!-- 删除提示框 -->
    <el-dialog title="提示" :visible.sync="removeVisible" width="300px" center>
      <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
      <span slot="footer" class="dialog-footer">
        <el-button class="el-button_1" @click="removeVisible = false">取 消</el-button>
        <el-button class="el-button_1" type="primary" @click="deleteEvent">确 定</el-button>
        </span>
    </el-dialog>
  </div>
</template>

<script>
    export default {
        name: 'dashboard',
        data(){
            return {
                id:'',
                removeVisible:false,
                queryKeyDate:'',
                queryName:'',
                data:'',
                queryUser: '',
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
            toAddEvent(){
                this.$router.push({path:'/sku/brandManager/brandAdd'})
            },
            async requestSearch(page){
                let currentPage = page || 1;
                let data = {
                    brandName:this.queryName,
                    userName:this.queryUser,
                    currentPage
                }
                let dataSet = await this.$get('/supplier/getErpBrandForPage',data)
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
            //跳转到品牌详情页
            lookEvent(row){
                this.$router.push({path:'/sku/brandManager/brandDetail/'+row.id})
            },
            toDelete(row){
                this.id = row.id;
                this.removeVisible = true
            },
            async deleteEvent(){
                let res = await this.$post('/supplier/remove_erpBrand',{id:this.id})
                if (res.code==200) {
                    this.$message.success(res.message)
                } else {
                    this.$message.error(res.message)
                }
                this.removeVisible = false
                this.requestSearch()
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
