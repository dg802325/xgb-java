<template>
    <div>
        <div>
            <glob-breadcrumb title="电子合同详情"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        电子合同详情
                    </div>
                </div>
                <div class="content-ev">
                    <div class="content-b-ev">
                        <br/>
                        <div style="padding-top: 10px">
                            <table class="left-table2">
                                <tbody>
                                <tr>
                                    <td>甲方</td>
                                    <td>{{item.firstParty}}</td>
                                    <td>乙方</td>
                                    <td>{{item.selectParty}}</td>
                                </tr>
                                <tr>
                                    <td>合同金额</td>
                                    <td>{{item.contractAmount}}</td>
                                    <td>合同名称</td>
                                    <td>{{item.contractName}}</td>
                                </tr>
                                <tr>
                                    <td>合同编号</td>
                                    <td>{{item.contractNo}}</td>
                                    <td>状态</td>
                                    <td v-if="item.status==0">正常</td>
                                    <td v-if="item.status==2">其他状态</td>
                                </tr>
                                <tr>
                                    <td>申请时间</td>
                                    <td>{{item.applyTime}}</td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div style="padding-top: 10px">
                            <table class="left-table3">
                                <tbody>
                                <tr>
                                    <td style="font-size: 19px;text-align: center">备注</td>
                                    <td>{{item.note}}</td>
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

    export default {
        data() {
            return {
                id: '',
                item: {},
            }
        },
        created() {
            this.id = this.$route.params.id
            this.getCategoryList()
        },
        methods: {
            async getCategoryList() {
                let res = await this.$get("/admin/view_bbiContract", {id: this.id});
                this.item = res.bbiContract
            }
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
        color: #666666;
        font-size: 13px;
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

</style>
