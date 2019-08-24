<template>
    <div>
        <div>
            <glob-breadcrumb title="仓库详情"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        仓库详情
                    </div>
                </div>
                <div class="content-ev">
                    <div class="content-b-ev">
                        <br/>
                        <div style="padding-top: 10px">
                            <table class="left-table2">
                                <tbody>
                                <tr>
                                    <td>仓库编号</td>
                                    <td>{{item.storehouseNo}}</td>
                                    <td>仓库名称</td>
                                    <td>{{item.storehouseName}}</td>
                                </tr>
                                <tr>
                                    <td>仓库地址</td>
                                    <td>{{item.storehouseAddress}}</td>
                                    <td>联系人</td>
                                    <td>{{item.storehouseContact}}</td>
                                </tr>
                                <tr>
                                    <td>联系人电话</td>
                                    <td>{{item.storehouseMobile}}</td>
                                    <td>有效状态</td>
                                    <td v-if="item.isDel==0">正常</td>
                                    <td v-if="item.isDel==2">其他状态</td>
                                </tr>
                                <tr>
                                    <td>创建时间</td>
                                    <td>{{item.createTime}}</td>
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
            this.getErpStorehouse()
        },
        methods: {
            async getErpStorehouse() {
                let res = await this.$get("/admin/getErpStorehouse", {id: this.id});
                this.item = res.erpStorehouse
            }
        }
    }
</script>

<style>

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
