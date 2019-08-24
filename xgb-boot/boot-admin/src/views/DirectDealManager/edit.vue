<template>
    <div>
        <div>
            <glob-breadcrumb title="直销单编辑"/>
            <br><br>
            <div class="container">
                <div class="content_b">
                    <div class="content_b_tx_3" >
                        <div style="padding-bottom: 20px;">
                            <table class="left-table2" style="width: 1042px;height: 90px;">
                                <tbody>
                                <tr>
                                    <td>直销物资</td>
                                    <td>
                                        <el-select v-model="spuId" clearable filterable>
                                            <el-option v-for="item in spuList"
                                                        :key="item.id"
                                                        :label="item.spuName"
                                                        :value="item.id"></el-option>
                                        </el-select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>数量</td>
                                    <td>
                                        <el-input v-model="directdealNum" style="width: 218px;">
                                            <el-button slot="append" v-if="metering=='1'">吨</el-button>
                                            <el-button slot="append" v-if="metering=='2'">袋</el-button>
                                        </el-input>
                                    </td>
                                </tr>
                                <tr>
                                    <td>单价</td>
                                    <td>
                                        <el-input v-model="directdealPrice" style="width: 218px;">
                                            <el-button slot="append" v-if="metering=='1'">元/吨</el-button>
                                            <el-button slot="append" v-if="metering=='2'">元/袋</el-button>
                                        </el-input>
                                    </td>
                                </tr>
                                <tr>
                                    <td>期限</td>
                                    <td>
                                        <el-date-picker
                                                v-model="validityDate"
                                                type="datetime"
                                                placeholder="选择时间">
                                        </el-date-picker>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <div>
                            <div style="font-size: 16px;color: #666666;padding-bottom: 20px;" class="el-icon-collection-tag">邀请列表</div>
                            <div class="table-title">
                                <el-button type="text" icon="icon-tianjia" class="orange dialog-btn" @click="addEvent">
                                    添加县域服务商
                                </el-button>
                            </div>
                            <div class="table_border" style="overflow-y: auto;height:393px;" >

                                <el-table
                                        :data="list"
                                        border
                                        style="width: 100%">
                                    <el-table-column prop="userName" align="center" label="县域服务商"></el-table-column>
                                    <el-table-column prop="companyName" align="center" label="公司名称" width="300px"></el-table-column>
                                    <el-table-column prop="userAccount" align="center" label="联系人电话" width="250px;"></el-table-column>
                                    <el-table-column align="center" label="操作" width="150px;">
                                        <template slot-scope="scope">
                                            <el-button type="text" @click="removeEvent(scope)">删除</el-button>
                                        </template>
                                    </el-table-column>
                                </el-table>
                            </div>
                            <br>
                            <div class="button_right" align="right">
                                <el-button class="el-button_right" @click="saveMethod('SAVE')">保存</el-button>
                                <el-button class="el-button_right" @click="saveMethod('SUBMIT')">邀请</el-button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <el-dialog title="县域服务商列表" :visible.sync="addShopVisible" width="800px">

            <div class="table_border" style="overflow-y: auto;height:393px;" >

                <el-table
                        ref="multipleTable"
                        @selection-change="handleSelectionChange"
                        :data="dealerList"
                        border
                        style="width: 100%">
                    <el-table-column type="selection" prop="check" align="center" width="55"></el-table-column>
                    <el-table-column prop="companyName" align="center" label="公司名称" width="300px"></el-table-column>
                    <el-table-column prop="userName" align="center" label="县域服务商名称"></el-table-column>
                    <el-table-column prop="userAccount" align="center" label="联系人电话" width="250px;"></el-table-column>
                </el-table>
            </div>
            <div align="right" style="border-top: 1px solid #e4e4e4;width: 800px;margin-left: -20px;">
                <div style="padding-right: 30px;padding-top: 30px;">
                    <el-button class="el-button_2" @click="addShopVisible=false">取 消</el-button>&nbsp;
                    <el-button class="el-button_2" type="primary" @click="addShopMethod">确 定</el-button>
                </div>
            </div>
        </el-dialog>

    </div>
</template>
<script>
    import {setDictMap} from "../../utils/main";

    export default {
        data() {
            return {
                id:'',
                selectedMap:{},
                addShopVisible:false,
                selectedList:[],
                validityDate:'',
                directdealPrice:'',
                directdealNum:'',
                spuId:'',
                list:[],
                dealerList:[],
                spuList:[],
                meteringMap:{},
                metering:'',
            }
        },
        watch:{
            spuId(val){
                this.metering = ''
                this.metering = this.meteringMap[val]
            }
        },
        created(){
            this.id = this.$route.params.id
            this.getSpuList()

        },
        methods: {
            removeEvent(index){
                this.list.splice(index,1)
            },
            //获取供应商物资
            async getSpuList(){
                let res = await this.$get('/supplier/getNotUpperSpuList')
                if (res.SpuList) {
                    this.spuList = res.SpuList
                    this.meteringMap = setDictMap(res.SpuList,'id','spuMetering')
                }
                this.backData(this.id )
            },
            async addShopMethod(){
                //判断是否重复选择
                if (this.list.length) {
                    this.list.forEach(res=>{
                        this.$set(this.selectedMap,res.id,true)
                    })
                } else {
                    this.selectedMap = {}
                }
                for (let i=0;i<this.selectedList.length;i++) {
                    if (this.selectedMap[this.selectedList[i].id]) {
                        this.$message.warning(this.selectedList[i].userName+"已被选择")
                        return;
                    }
                    this.list.push(this.selectedList[i])
                }
                this.addShopVisible = false
            },
            //添加县域服务商邀请
            async addEvent(){
                this.selectedList = []
                this.dealerList = []
                this.addShopVisible = true
                let res = await this.$get('/supplier/getDealerList')
                if (res.list) {
                    this.dealerList= res.list
                }
            },
            handleSelectionChange(list) {
                this.selectedList = list
            },
            async saveMethod(val){
                if (!this.list.length) {
                    this.$message.warning('未添加县域服务商')
                    returnl;
                }
                let data = {
                    id:this.id,
                    shpSpuId:this.spuId,
                    directdealNum:this.directdealNum,
                    directdealPrice:this.directdealPrice,
                    validityDate:new Date(this.validityDate).toString(),
                    listStr:JSON.stringify(this.list)
                }
                if (val=='SUBMIT') {
                    this.$set(data,'isSubmit',true)
                } else {
                    this.$set(data,'isSubmit',false)
                }
                let res = await this.$post('/admin/save_shpDirectdeal',data)
                if (res.code==200) {
                    this.$message.success(res.message)
                    if (val=='SUBMIT') {
                        this.$router.push({path:'/sale/directDealManagement/lookDetail/'+res.id})
                    }
                } else {
                    this.$message.error(res.message)
                }
            },
            //回显数据
            async backData(id){
                let res = await this.$get('/supplier/getDirectDealBack',{id:id})
                if (res.directdeal) {
                    let directDealItem = res.directdeal
                    this.spuId = directDealItem.shpSpuId
                    this.directdealNum = directDealItem.directdealNum
                    this.directdealPrice = directDealItem.directdealPrice
                    this.validityDate = new Date(directDealItem.validityDate)
                    this.metering = this.meteringMap[directDealItem.shpSpuId]
                }
                if (res.dealerList) {
                    this.list = res.dealerList
                }
            },

        }
    }
</script>

<style>
    .content_b {
        width: 99.8%;
        height: auto;
        background-color: #fff;
        border:1px #e4e4e4 solid;
    }
    .content_b_tx_3 {
        padding-top: 50px;
        padding-bottom: 100px;
        width: 95%;
        margin: 0 auto;
    }
    .left-table2{
        width: 859px;
        height:180px;
    }
    .left-table2 td{
        height: 45px;
        width: 307px;
        padding-left: 10px;
        vertical-align: middle;
        border:1px #e4e4e4 solid;
        color: #666666;
        font-size: 12px;
        background:#fff;
    }

    .left-table2 td:first-child{
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background:#f9fafc;
    }

    .left-table2 td:nth-child(3){
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background:#f9fafc;
    }

    .el-button_right{
        width:140px;
        height: 40px;
        padding:10px 20px;
        border-radius: 5px;
        background-color:rgba(22, 155, 213, 1);
        color: white;
    }

    .el-button--primary{
        background-color:#1abc9c;
        border-color:#1abc9c;
    }

    .button_right{
        padding-top: 10px;
        width: 1042px;
    }

    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }

</style>
