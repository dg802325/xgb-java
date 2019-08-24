<template>
    <div>
        <div>
            <glob-breadcrumb v-if="Contract.status == 1" title="合同详情-待甲方审核"/>
            <glob-breadcrumb v-if="Contract.status == 2" title="合同详情-待法大大审核"/>
            <glob-breadcrumb v-if="Contract.status == 3" title="合同详情-已完成"/>
            <glob-breadcrumb v-if="Contract.status == 4" title="合同详情-审核不通过"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        <span style="color: #666666">合同签约详情</span>
                    </div>
                </div>
                <div class="content-ev">
                    <div class="content-b-ev">
                        <br/>
                        <div style="padding-top: 10px">
                            <table class="left-table2">
                                <tbody>
                                <tr>
                                    <td>合同名称</td>
                                    <td>{{Contract.contractName}}</td>
                                    <td>合同编号</td>
                                    <td>{{Contract.contractNo}}</td>
                                </tr>
                                <tr>
                                    <td>供应商名称</td>
                                    <td>{{Contract.firstParty | formatData(supplierList)}}</td>
                                    <td>签约人</td>
                                    <td>{{Contract.selectParty}}</td>
                                </tr>
                                <tr>
                                    <td>签订人联系方式</td>
                                    <td>{{Contract.selectPartyIphone}}</td>
                                    <td>合同签约日期</td>
                                    <td>{{Contract.applyTime}}</td>
                                </tr>
                                <tr>
                                    <td>合同到期日期</td>
                                    <td>{{Contract.dueTime}}</td>
                                    <td>申请时间</td>
                                    <td>{{Contract.createTime}}</td>
                                </tr>
                                <tr>
                                    <td>上传合同</td>
                                    <td>{{Contract.contractFileName}}&nbsp;&nbsp;<span style="color:rgba(26, 188, 156, 1);">下载</span></td>
                                    <td>签订状态</td>
                                    <td>
                                        <span v-if="Contract.status=='1'">待甲方签约</span>
                                        <span v-if="Contract.status=='2'">待乙方签约</span>
                                        <span v-if="Contract.status=='3'">归档中</span>
                                        <span v-if="Contract.status=='4'">签约完成</span>
                                    </td>
                                </tr>
                                <!--<tr v-if="Contract.status == 3">-->
                                    <!--<td>最终合同</td>-->
                                    <!--<td>{{Contract.contractFileName}}&nbsp;&nbsp;<span style="color:rgba(26, 188, 156, 1);">下载</span></td>-->
                                    <!--<td>签章时间</td>-->
                                    <!--<td>{{Contract.modifyTime}}</td>-->
                                <!--</tr>-->

                                <!--<tr v-if="Contract.status == 4">-->
                                    <!--<td>驳回时间</td>-->
                                    <!--<td>{{Contract.modifyTime}}</td>-->
                                    <!--<td></td>-->
                                    <!--<td></td>-->
                                <!--</tr>-->
                                </tbody>
                            </table>
                        </div>
                        <div style="padding-top: 10px">
                            <table class="left-table3">
                                <tbody>
                                <tr>
                                    <td style="font-size: 16px;text-align: center">备注</td>
                                    <td>
                                        {{Contract.contractNote}}
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <!--<div v-if="Contract.status==1" class="buttonAll">-->
                            <!--<div class="submitAll">-->
                                <!--<el-button @click="successFul"><span style="color:white;font-size: 14px;margin-left: -5px;">通过</span></el-button>-->
                            <!--</div>-->
                            <!--<div class="fail">-->
                                <!--<el-button @click="failFul"><span style="color:white;font-size: 14px;margin-left: -5px;">驳回</span></el-button>-->
                            <!--</div>-->
                        <!--</div>-->
                        <div class="submit" v-if="Contract.status=='2'">
                            <el-row>
                                <el-button type="primary" @click="submitContract"><span style="font-size: 14px">去签约</span></el-button>
                            </el-row>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import {quillRedefine} from 'vue-quill-editor-upload';
    import {Base_url} from '../../config/index';
    import {setDictMap} from "../../utils/main";
    export default {
        data() {
            return {
                Contract:'',
                supplierList:{},
            }
        },

        created() {
            this.Base_url = Base_url
            this.contractId = this.$route.params.contractId
            this.getContract();
            this.getSupplier();
        },
        methods: {
            async submitContract(){
                this.openEvent(Base_url+"/admin/extsign?id="+this.contractId);
            },
            openEvent(url){
                var oLink = document.createElement('a');+
                    oLink.setAttribute('href',url);
                oLink.setAttribute('target','_blank');
                oLink.style.display='block';
                oLink.click();
                oLink.style.display= 'none'
                document.body.appendChild(oLink)
            },

            //    查询所有待甲方审核的合同
            async getContract(){
                let data = {
                  id:this.contractId
                }
                let res = await this.$get("/admin/getContract",data)
                this.Contract = res.Contract;
            },

        //    甲方审核合同通过
           async successFul(){
               let status =  this.Contract.status = '2'
                let data = {
                    id: this.contractId,
                    status : status,
                }
               let res = await this.$post("/admin/insertContract",data)
               if (res.code == 999){
                   this.$message.info("通过失败!")
                   return;
               }else {
                   this.$router.push({path: '/contract/contractManagement'})
               }
            },

        //    甲方审核不通过
            async failFul(){
                let status =  this.Contract.status = '4'
                let data = {
                    id: this.contractId,
                    status : status,
                }
                let res = await this.$post("/admin/insertContract",data)
                if (res.code == 999){
                    this.$message.info("通过失败!")
                    return;
                }else {
                    this.$router.push({path: '/contract/contractManagement'})
                }
            },

        //    //  查询县域商所属供应商
            async getSupplier(){
                let res = await this.$get("/dealer/getAgentSupplier")
                this.supplierList = setDictMap(res.list,'id','userName')
            },
        }
    }
</script>

<style  lang="scss">

    .content-ev {
        width: 99.8%;
        height: 600px;
        background-color: #fff;
        border: 1px #e4e4e4 solid;
    }

    .content-b-ev {
        width: 98%;
        margin: 0 auto;
    }

    .left-table2 {
        width: 100%;
        height: 180px;
    }

    .left-table2 td {
        height: 45px;
        width: 350px;
        padding-left: 10px;
        vertical-align: middle;
        border: 1px #e4e4e4 solid;
        color: #000000;
        font-size: 12px;
        background: #fff;
    }

    .left-table2 td:first-child {
        padding-right: 15px;
        width: 120px;
        text-align: right;
        background: #f9fafc;
    }

    .left-table2 td:nth-child(3) {
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background: #f9fafc;
    }

    .left-table3 {
        width: 100%;
        height: 137px;
    }

    .left-table3 td {
        height: 45px;
        width: 350px;
        padding-left: 10px;
        vertical-align: middle;
        border: 1px #e4e4e4 solid;
        color: #666666;
        font-size: 13px;
        background: #fff;
    }

    .left-table3 td:first-child {
        padding-right: 15px;
        width: 34.5px;
        text-align: right;
        background: #f9fafc;
    }

    .el-form-item_1 .el-form-item__label {
        font-size: 12px;
    }

    .el-form-item_1 .el-form-item {
        margin-bottom: 10px;
    }

    .submit{
        float: right;
        padding-top: 30px;
        .el-row{
            .el-button{
                background-color: rgba(26, 188, 156, 1);
                border-color: rgba(26, 188, 156, 1);
            }

        }

    }

    .upload_Contract{
        .el-button{
            /*background-color: rgba(26, 188, 156, 1);*/
            /*border-color: rgba(26, 188, 156, 1);*/
            width: 90px;
            box-sizing: border-box;
            border-width: 1px;
            border-style: solid;
            border-color: rgba(102, 102, 102, 1);
            border-radius: 3px;

        }
    }

    .submitAll{
            .el-button{
                width: 100px;
                height: 35px;
                line-height: 7px;
                background-color: rgba(26, 188, 156, 1);
                border-color: rgba(26, 188, 156, 1);
            }
    }
    .fail{
        padding-left: 20px;
        .el-button{
            width: 100px;
            height: 35px;
            line-height: 7px;
            background-color: rgba(240, 72, 68, 1);
            border-color: rgba(240, 72, 68, 1);
        }
    }
    .buttonAll{
        display: flex;
        margin-left: 430px;
        margin-top: 50px;
    }
</style>
