<template>
  <div>
    <glob-breadcrumb title="县域服务商列表"/><br><br>
    <glob-base-search>
      <div slot="button">
        <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
      </div>
      <el-form label-width="130px" :inline="true">
        <el-form-item label="请选择省：">
          <el-select v-model="companyPro"  placeholder="请选择" clearable filterable>
            <el-option v-for="item in provinceList"
                       :key="item.id"
                       :label="item.divisionName"
                       :value="item.id">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="请选择市：">
          <el-select v-model="companyCity"  placeholder="请选择" clearable filterable>
            <el-option v-for="item in cityList"
                       :key="item.id"
                       :label="item.divisionName"
                       :value="item.id">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="供应商名称：">
          <el-input v-model="queryName"  placeholder="供应商名称"></el-input>
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
          <el-table-column prop="" align="center" label="序号" width="110px" type="index"></el-table-column>
          <el-table-column prop="companyName" align="center" label="公司名称" width="250px"></el-table-column>
          <el-table-column prop="userName" align="center" label="县域服务商名称" width="174px"></el-table-column>
          <el-table-column prop="storeName" align="center" label="公司地址" width="174px">
            <template slot-scope="{row}">
              <span>{{row.companyPro | formatData(provinceMap)}} {{row.companyCity| formatData(cityMap)}} {{row.companyArea | formatData(areaMap)}}</span>
            </template>
          </el-table-column>
          <el-table-column prop="userAccount" align="center" label="联系人电话" width="250px;"></el-table-column>
          <el-table-column label="操作" align="center">
            <template slot-scope="scope">
              <el-button @click="toEditUserPage(scope.row)" type="text" v-if="">去邀请</el-button>
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
  name: 'dashboard',
  data(){
    return {
        provinceList:[],
        cityList:[],
        queryName:'',
        companyPro:'',
        companyCity:'',
        queryStoreName:'',
        queryStoreAddress:'',
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
    watch:{
        companyPro (val) {
            this.companyCity = ''
            this.getCityList(val)
        },
    },
    created(){
        this.getProvinceList()
    },
  methods: {
      //获得省
      async getProvinceList() {
          let res = await this.$get("/admin/getAllProvince")
          this.provinceList = res
      },
      //获得所有的市
      //获得市
      async getCityList(val) {
          let data = {
              id:val,
          }
          let res = await this.$get("/admin/getAllCityOrArea",data)
          this.cityList = res
      },
      handleCurrentChange (page) {
          this.requestSearch(page)
      },

      async requestSearch(page){
          let currentPage = page || 1;
          let data = {
              queryName:this.queryName,
              companyPro:this.companyPro,
              companyCity:this.companyCity,
              currentPage
          }
          let dataSet = await this.$get('/supplier/getShpStoreForPage',data)
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
      toEditUserPage(row){
          this.$router.push({path:'/agent/dealerManament/lookDetail/'+row.id})
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
