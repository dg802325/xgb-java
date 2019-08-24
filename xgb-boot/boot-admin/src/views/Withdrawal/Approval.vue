<template>
    <div>
        <div>
            <glob-breadcrumb title="提现审批"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        <span style="color: #666666">提现审批</span>
                    </div>
                </div>
                <div class="content-ev">
                    <div class="content-b-ev">
                        <br/>
                        <div style="padding-top: 10px">
                            <table class="left-table2">
                                <tbody>
                                <tr>
                                    <td>申请单号</td>
                                    <td>{{Withdrawal.id}}</td>
                                </tr>
                                <tr>
                                    <td>申请状态</td>
                                    <td>
                                        <span v-if="Withdrawal.status=='1'">代处理</span>
                                        <span v-if="Withdrawal.status=='2'">已付款</span>
                                        <span v-if="Withdrawal.status=='3'">已拒绝</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>县域商服务ID</td>
                                    <td>{{Withdrawal.companyId}}</td>
                                </tr>
                                <tr>
                                    <td>县域服务商</td>
                                    <td>{{Dealer}}</td>
                                </tr>
                                <tr>
                                    <td>提现金额</td>
                                    <td>{{Withdrawal.withdrawalAmount}}</td>
                                </tr>
                                <tr>
                                    <td>银行卡号</td>
                                    <td>{{Withdrawal.bankNumber}}</td>
                                </tr>
                                <tr>
                                    <td>银行名称</td>
                                    <td>{{Withdrawal.bank}}</td>
                                </tr>
                                <tr>
                                    <td>申请时间</td>
                                    <td>{{Withdrawal.createTime}}</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div style="padding-top: 10px">
                            <table class="left-table3">
                                <tbody>
                                <tr>
                                    <td style="font-size: 16px;text-align: center">处理备注</td>
                                    <td>
                                        {{Withdrawal.withdrawalInstructions}}
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div v-if="Withdrawal.status==1" class="buttonAll">
                            <div class="submitAll">
                                <el-button @click="successFul"><span style="color:white;font-size: 14px;margin-left: -1px;">确认付款</span></el-button>
                            </div>
                            <div class="fail">
                                <el-button @click="failFul"><span style="color:white;font-size: 14px;margin-left: -1px;">拒绝提现</span></el-button>
                            </div>
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
                Withdrawal:'',
                Dealer:'',
                supplierList:{},
            }
        },

        created() {
            this.id = this.$route.params.id
            this.getWithdrawalDetails();
            this.getSupplier();
        },
        methods: {
            //查询所有县域商提现申请
            async getWithdrawalDetails(){
                let data = {
                    id:this.id
                }
                let res = await this.$get("/admin/getWithdrawalDetails",data)
                this.Withdrawal = res.Withdrawal

                //查询提现县域商信息
                let dealerData = {
                    companyId : res.Withdrawal.companyId
                }
                let Dealer = await this.$get("/admin/getErpUserByCompanyId",dealerData)
                    this.Dealer = Dealer.item.userName
            },

            //确认付款
            async successFul(){
                let status =  this.Withdrawal.status = '2'
                let data = {
                    id: this.id,
                    status : status,
                }
                let res = await this.$post("/admin/insertWithdrawal",data)
                if (res.code == 999){
                    this.$message.info("付款失败!")
                    return;
                }else {
                    this.$router.push({path: '/finance/withdrawalApplication'})
                }
            },

            //拒绝付款
            async failFul(){
                let status =  this.Withdrawal.status = '3'
                let data = {
                    id: this.id,
                    status : status,
                }
                let res = await this.$post("/admin/insertWithdrawal",data)
                if (res.code == 999){
                    this.$message.info("拒绝失败!")
                    return;
                }else {
                    this.$router.push({path: '/finance/withdrawalApplication'})
                }
            },


        }
    }
</script>

<style lang="scss" scoped>

    .content-ev {
        width: 99.8%;
        height: 650px;
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
        width: 730px;
        padding-left: 10px;
        vertical-align: middle;
        border: 1px #e4e4e4 solid;
        color: #666666;
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
