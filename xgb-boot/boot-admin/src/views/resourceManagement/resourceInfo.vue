<template>
    <div>
        <div>
            <glob-breadcrumb title="物资详情"/>
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
                                    <td>货号</td>
                                    <td>{{supplierList.spuNo}}</td>
                                    <td>物资名称</td>
                                    <td>{{supplierList.spuName}}</td>
                                </tr>
                                <tr>
                                    <td>品牌</td>
                                    <td>{{supplierList.brandId | formatData(pinMap) }}
                                    <td>单位</td>
                                    <td>{{supplierList.spuMetering| formatData(jilMap)}}</td>
                                </tr>
                                <tr>
                                    <td>分类</td>
                                    <td>{{supplierList.categoryId| formatData(flMap)  }}
                                    <td>创建时间</td>
                                    <td>{{supplierList.createTime}}</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div style="padding-top: 10px">
                            <table class="left-table3">
                                <tbody>
                                <tr>
                                    <td style="font-size: 16px;text-align: center">备注</td>
                                    <td>
                                        {{supplierList.spuExplain}}
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                            <div class="submitAll">
<!--                                <el-button @click="successFul"><span style="color:white;font-size: 14px;margin-left: -5px;">保存</span></el-button>-->
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
                jilMap:{},
                flMap:{},
                supplierList:{},
                pinMap:{},
                DictList:[],
            }
        },

        created() {
            this.getCategoryTwoList()
            this.getBrand()
            this.Base_url = Base_url
            this.spuId = this.$route.params.id
            this.getContract();
            this.getDict()
        },
        methods: {
            //    查询所有待甲方审核的合同
            async getContract(){
                let data = {
                    id:this.spuId
                }
                let res = await this.$get("/admin/getSpuShop",data)
                this.supplierList = res.item
            },
            async getDict(){
                let res = await this.$get("/admin/getSpuDict");
                this.DictList = res.DictList
                console.log(this.DictList)
                this.jilMap = setDictMap(this.DictList,"dictValue","name")
            },
            //获取品牌
            async getBrand() {
                let res = await this.$get("/admin/getBrandByCompanyId")
                this.brandId = res.item
                this.pinMap = setDictMap(this.brandId,"id","brandName")
            },
            //获取商品三级分类
            async getCategoryTwoList() {
                let res = await this.$get("/admin/categoryAllTwoLists")
                this.categoryId = res
                this.flMap = setDictMap(this.categoryId,"id","categoryName")
            },
        }
    }
</script>

<style  lang="scss">

    .content-ev {
        width: 99.8%;
        height: 500px;
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
        float: right;
        margin-top: 50px;
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
