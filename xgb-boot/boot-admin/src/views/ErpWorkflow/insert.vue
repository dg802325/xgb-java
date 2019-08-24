<template>
    <div>
        <div>
            <div class="glob-breadcrumb">
                <div class="container">
                    <div class="title">
                        <span class="line"></span>添加工作流信息
                    </div>
                    <div>
                        <el-button @click="toEntry" size="mini" icon="el-icon-arrow-left">返回</el-button>
                    </div>
                </div>
            </div>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        添加工作流
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx_1">
                        <div style="min-height: 754px;">
                            <div style="padding-top: 49px;padding-left: 41px;">
                                <div style="font-size: 16px;color: #666666" class="el-icon-collection-tag">基本信息</div>
                                <div style="padding-top: 30px;padding-left: 60px">
                                    <el-form ref="form" label-width="100px" class="el-form-item_1">

                                        <el-form-item label="工作流编号:" required>
                                            <el-input v-model="wfNumber" size="1" style="width: 240px;"></el-input>
                                        </el-form-item>
                                        <el-form-item label="工作流名称:" required>
                                            <el-input v-model="wfName" size="1" style="width: 240px;"></el-input>
                                        </el-form-item>
                                        <el-form-item label="说明:" required>
                                            <el-input type="textarea" v-model="wfRemark" resize="none" rows="5" size="1" style="width: 549px;" placeholder="请输入内容"></el-input>
                                        </el-form-item>
                                    </el-form>
                                </div>
                            </div>

                            <div style="padding-top: 49px;padding-left: 41px;">
                                <div style="font-size: 16px;color: #666666;margin:0 10px 0 0;" class="el-icon-collection-tag">流程信息</div>
                                <el-button class="el-button_1" @click="addEvent" style="width: 95px;">添加节点</el-button>
                            <div class="table_border" style="width: 800px;">
                                <el-table
                                        :data="list"
                                        border
                                        style="margin-top: 10px;width: 800px;">
                                    <!--                                    <el-table-column prop="nodeProcess" align="center" label="流程节点" width="200px;"></el-table-column>-->
                                    <el-table-column prop="nodeCode" align="center" label="节点序号" width="200px;"></el-table-column>
                                    <el-table-column prop="nodeName" align="center" label="节点名称" width="210px;"></el-table-column>
                                    <el-table-column prop="erpDepartment" align="center" label="部门/岗位" width="200px;">
                                        <template slot-scope="{row}">
                                            <span v-if="row">{{row.departmentId | formatData(bmMap)}}/{{row.erpDepartment | formatData(gwMap)}}</span>

                                        </template>
                                    </el-table-column>
                                    <el-table-column label="操作" align="center"  width="190px;">
                                        <template slot-scope="scope">
                                            <el-button type="text" @click="toDelExpert(scope.$index)">删除</el-button>
                                        </template>
                                    </el-table-column>
                                </el-table>
                            </div>
                            </div>
                            <div class="dialog-footer" style="padding-top: 20px;padding-left: 41px">
                                <el-button class="el-button_2" type="primary" @click="saveJbpm">保存</el-button>
                            </div>
                        </div>
                        <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
                            <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
                            <span slot="footer" class="dialog-footer">
                            <el-button class="el-button_1" @click="delVisible = false">取 消</el-button>
                            <el-button class="el-button_1" type="primary" @click="delExpert">确 定</el-button>
                            </span>
                        </el-dialog>
<!--                        <div slot="footer" class="dialog-footer" style="padding-top: 44px;padding-left: 200px">-->

                    </div>
                </div>

                <el-dialog title="添加节点"  :visible.sync="addVisible" width="25%" :before-close="closeEvent">

                    <el-form ref="form"  label-width="100px">
                        <el-form-item label="节点序号:" required>
                            <el-input v-model="nodeCode" size="1" style="width: 200px;"></el-input>
                        </el-form-item>
                            <el-form-item label="节点名称:" required>
                                <el-input v-model="nodeName" size="1" style="width: 200px;"></el-input>
                            </el-form-item>
                        <el-form-item label="部门:"required >
                            <el-select v-model="bmId" placeholder="请选择" size="1" style="width: 200px;">
                                <el-option
                                        v-for="item in bmList"
                                        :key="item.id"
                                        :label="item.departmentName"
                                        :value="item.id">
                                </el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="岗位:"required >
                            <el-select v-model="gwId" placeholder="请选择" size="1" style="width: 200px;">
                                <el-option
                                        v-for="item in gwList"
                                        :key="item.id"
                                        :label="item.roleName"
                                        :value="item.id">
                                </el-option>
                            </el-select>
                        </el-form-item>
                    </el-form>
                    <span slot="footer" class="dialog-footer">
                <el-button @click="closeEvent">取 消</el-button>
                <el-button type="primary" @click="saveErpStorehouse">确 定</el-button>
            </span>
                </el-dialog>
<!--                <div class="v-cart-bottom">-->
<!--                    <div>-->
<!--                    </div>-->
<!--                    <el-pagination-->
<!--                            @current-change="handleCurrentChange"-->
<!--                            :pager-count="7"-->
<!--                            layout="total, prev, pager, next,jumper"-->
<!--                            :total="pagination.count"-->
<!--                            :page-count="pagination.pages"-->
<!--                            :current-page="pagination.pageNumber"-->
<!--                    ></el-pagination>-->
<!--                </div>-->

            </div>
        </div>
    </div>
</template>
<script>

    import {setDictMap} from "../../utils/main";

    export default {
        data() {
            return {
                // id:'',
                wfNumber:'',
                editItem:{},
                wfName:'',
                wfRemark:'',
                erpDepartment:'',
                nodeName:'',
                nodeProcess:'',
                nodeCode:'',
                bmId:'',
                gwId:'',
                list:[],
                delVisible: false,
                addVisible:false,
                pagination: [],
                bmList:[

                ],
                bmMap:{},
                gwList:[

                ],
                gwMap:{},
            }
        },
        watch:{
            bmId(val){
                if (val!=null && val!='') {
                    this.getDepartmentRole(val)
                }

            },
        },
        created(){
            this.getDepartment()
            this.getRoleList()
            // this.id = this.$route.params.id
            // this.backData(this.id)
            // this.requestSearch()
        },
        methods: {
            async getRoleList(){

                let res = await this.$get('/supplier/getAllRoles')
                if (res.roles) {
                    this.gwMap = setDictMap(res.roles,'id','roleName')
                }
            },
            handleCurrentChange(){

            },
            reSearch(){
                this.requestSearch()
            },

            //添加节点
            async addEvent(){
                this.addVisible=true;
            },
            closeEvent(){
                this.nodeName='',
                    this.nodeProcess='',
                    this.nodeCode='',
                    this.bmId='',
                    this.gwId='',
                    this.addVisible=false
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    nodeCode:this.nodeCode,
                    nodeProcess:this.nodeProcess,
                    // nodeName:this.bmId,
                    nodeName: this.nodeName,
                    erpDepartment: this.gwId,
                    currentPage
                }
                console.log(data)
                let res = await this.$get("/supplier/getErpWorkflowNodeForPage", data)
                this.list = res.dataSet.list
                console.log(this.list)
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
            },

            async saveErpStorehouse() {
                this.list.push(
                    {nodeCode:this.nodeCode,nodeName: this.nodeName,departmentId:this.bmId,erpDepartment: this.gwId},
                )
                this.closeEvent()

                return;
                let data = {
                    nodeCode: this.nodeCode,
                    nodeProcess: this.nodeProcess,
                    // nodeName:this.bmId,
                    nodeName: this.nodeName,
                    erpDepartment: this.gwId,

                };
                let res = await this.$post("/supplier/save_erpWorkflowNode", data);
                if (res.code == 200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.id = res.id
                    this.closeEvent()
                    this.requestSearch()
                } else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
            },

            toEntry(){
                this.$router.push('/system/erpWorkflow')
            },
            toDelExpert(index) {
                this.list.splice(index,1)

            },
            async delExpert() {
                let data = {
                    id: this.item.id,
                }
                let res = await this.$post("/admin/remove_erpWorkflowNode", data)
                if (res>0) {
                    this.delVisible = false
                    this.requestSearch()
                } else {
                    this.requestSearch()
                }
            },

            toDeleteDepartment(row){

            },
            async saveJbpm() {
                let data = {
                    // id:this.id,
                    wfNumber:this.wfNumber,
                    wfName:this.wfName,
                    wfRemark:this.wfRemark,
                    nodeName:this.nodeName,
                    nodeCode:this.nodeCode,
                    erpDepartment:this.erpDepartment,
                    nodeList:JSON.stringify(this.list)
                };
                let res = await this.$post("/supplier/save_erpWorkflow",data);
                console.log(res)
                if (res.code==200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.id=res.id
                }else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
                // this.backData(this.id);
            },
            //获得部门
            async getDepartment() {
                let res = await this.$get("/supplier/getDepartments")
                this.bmList = res.departments
                this.bmMap = setDictMap(this.bmList,"id","departmentName")
            },
            //获得岗位
            async getDepartmentRole(val) {
                let data = {
                    departmentId:val,
                }
                let res = await this.$get("/dealer/getDepartmentRole",data)
                console.log(res)
                this.gwList = res
            },
        }
    }
</script>

<style lang="scss" scoped>
    @import "../../assets/scss/common";

    .glob-breadcrumb {
        height: 48px;
        background: #f3f3f3;
        border-bottom: 1px #e4e4e4 solid;
        .container {
            display: flex;
            align-items: center;
            justify-content: space-between;
            height: 100%;
            .title {
                display: flex;
                align-items: center;
                font-size: 12px;
                color: #999;
                .line {
                    margin-right: 5px;
                    width: 5px;
                    height: 18px;
                    background: #1abc9c;
                }
            }
        }
    }

    .content_b {
        width: 1098px;
        height: auto;
        background-color: #fff;
        border: 1px #e4e4e4 solid;
    }

    .el-form-item_1 .el-form-item__label {
        font-size: 12px;
    }
    .el-form-item_1 .el-form-item {
        margin-bottom: 10px;
    }

    .content_b_tx {
        width: 50%;
        margin: 0 auto;
    }

    .el-button_2{
        width:80px;
        height: 35px;
        padding:10px 20px;
        border-radius: 2px;
    }

    .el-button--primary{
        background-color:#1abc9c;
        border-color:#1abc9c;
    }
</style>
