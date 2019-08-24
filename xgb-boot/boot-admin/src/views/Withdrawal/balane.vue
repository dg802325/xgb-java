<template>
    <div>
        <div>
            <glob-breadcrumb title="账户余额"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        <span style="color: #666666">账户余额</span>
                    </div>
                </div>
                <div class="content-ev">
                    <div class="content-b-ev">
                        <br/>
                        <div style="padding-top: 10px">
                            <table class="left-table2">
                                <tbody>
                                <tr>
                                    <td>企业名称</td>
                                    <td>{{companyName}}</td>
                                </tr>
                                <tr>
                                    <td>账户余额</td>
                                    <td>{{companyBalance}}</td>
                                </tr>
                                <tr>
                                    <td>创建时间</td>
                                    <td>{{createDate}}</td>
                                </tr>
                                <tr>
                                    <td>币种</td>
                                    <td>{{currency}}</td>
                                </tr>
                                <tr>
                                    <td>账户状态</td>
                                    <td>{{accountStatus}}</td>
                                </tr>
                                <tr>
                                    <td>企业编号</td>
                                    <td>{{customerNumber}}</td>
                                </tr>
                                <tr>
                                    <td>可结算金额</td>
                                    <td>{{amountToBeSettled}}</td>
                                </tr>
                                </tbody>
                            </table>
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
                companyName:'',
                companyBalance:'',
                amountToBeSettled:'',
                createDate:'',
                currency:'',
                accountStatus:'',
                customerNumber:'',
            }
        },

        created() {
            this.getWithdrawalDetails();
        },
        methods: {
            //查询账户余额
            async getWithdrawalDetails(){
                let res = await this.$get("/api/getSupplierHeliBaoEntrty",{})
                console.log(res)
                this.companyName = res.companyName;
                this.companyBalance = res.companyBalance;
                this.amountToBeSettled = res.amountToBeSettled;
                this.createDate = res.createDate;
                this.currency = res.currency;
                this.accountStatus = res.accountStatus;
                this.customerNumber = res.customerNumber;
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
