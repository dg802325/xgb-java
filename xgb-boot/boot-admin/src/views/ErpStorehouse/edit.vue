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
                                    <td><el-input v-model="item.storehouseName" size="1" style="width: 240px;"></el-input></td>
                                </tr>
                                <tr>
                                    <td>仓库地址</td>
                                    <td><el-input v-model="item.storehouseAddress" size="1" style="width: 240px;"></el-input></td>
                                    <td>联系人</td>
                                    <td><el-input v-model="item.storehouseContact" size="1" style="width: 240px;"></el-input></td>
                                </tr>
                                <tr>
                                    <td>联系人电话</td>
                                    <td><el-input v-model="item.storehouseMobile" size="1" style="width: 240px;"></el-input></td>
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

                        <div class="saves" style="width: 66px;height: 40px;float: right;padding-top: 20px">
                            <el-button  type="success" @click="saves">保存</el-button>
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
       async created() {
           this.id = this.$route.params.id
           await this.getErpStorehouse()
        },
        methods: {
            async getErpStorehouse() {
                let res = await this.$get("/admin/getErpStorehouse", {id: this.id});
                this.item = res.erpStorehouse
            },
            //编辑保存
            async saves(){
                let data = {
                    id : this.id,
                    storehouseName : this.item.storehouseName,
                    storehouseAddress :this.item.storehouseAddress,
                    storehouseMobile : this.item.storehouseMobile,
                    storehouseContact : this.item.storehouseContact
                }
                let res = await this.$post("/admin/save_erpStorehouse",data)
                if(res.code == 200){
                    this.$router.push('/stock/erpStorehouseList')
                }
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
