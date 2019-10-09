<template>
    <div>
        <div>
            <glob-breadcrumb title="银行卡查询"/>
            <br><br>
            <glob-base-search>
                <el-form label-width="130px" :inline="true">
                    <el-form-item label="输入银行卡号：">
                        <el-input v-model="bankCardNo" placeholder="请输入银行卡号" clearable></el-input>
                    </el-form-item>
                </el-form>
            </glob-base-search>

            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        银行信息
                    </div>
                </div>
                <div class="content_u">
                    <div class="content_b_tx">
                        <div style="padding-top: 70px">
                            信息
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
                bankCardNo:'',
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
