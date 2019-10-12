<template>
    <div>
        <div>
            <glob-breadcrumb title="银行卡查询"/>
            <br><br>
            <glob-base-search>
                <div slot="button">
                    <el-button class="el-button_1" @click="requestSearch()">查询结果</el-button>
                </div>
                <el-form label-width="130px" :inline="true">
                    <el-form-item label="输入银行卡号：">
                        <el-input style="width: 250px;" v-model="bankNo" placeholder="请输入银行卡号" clearable></el-input>
                    </el-form-item>
                </el-form>
            </glob-base-search>

            <div class="container" v-if="isShow">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        相关信息
                    </div>
                </div>
                <div class="content_u">
                    <div class="content_b_tx">
                        <table class="left-table">
                            <tbody>
                            <tr>
                                <td>银行卡号</td>
                                <td>{{bankCardNo}}</td>
                            </tr>
                            <tr>
                                <td>所属银行</td>
                                <td>{{bankName}}</td>
                            </tr>
                            </tbody>
                        </table>
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
                bankNo:'',
                bankCardNo:'',
                bankName:'',
                isShow:false,
            }
        },
        methods: {
            async requestSearch(page) {
                if(!this.bankNo){
                    this.$message.error("银行卡号不能为空");
                    return;
                }
                let data = {
                    bankCardNo : this.bankNo,
                }
                let res = await this.$get("/admin/getBankCardByNo", data)
                if(res.code=='200'){
                    this.isShow = true;
                    this.bankCardNo = res.bankCardNo;
                    this.bankName = res.bankName;
                    this.$message.success(res.message);
                }else {
                    this.$message.error(res.message);
                }
            }
        },
    }
</script>

<style>

    .content_b_tx_1 {
        width: 100%;
        margin: 0 auto;
    }
</style>
