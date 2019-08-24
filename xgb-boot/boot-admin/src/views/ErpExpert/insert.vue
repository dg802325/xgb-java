<template>
    <div>
        <div>
            <glob-breadcrumb title="添加专家"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        添加专家
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx">
                        <br/>
                        <div style="height: 702px;padding-left: 15px;padding-top: 39px">
                            <el-form ref="form" label-width="100px" class="el-form-item_1">
                                <el-form-item label="专家账号:" required>
                                    <el-input v-model="expertAccount" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="专家名称:" required>
                                    <el-input v-model="expertName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
<!--                                <el-form-item label="所属供应商:" required >-->
<!--                                    <el-select v-model="erpUserId" placeholder="请选择" size="1" style="width: 240px;">-->
<!--                                        <el-option-->
<!--                                                v-for="item in departmentList"-->
<!--                                                :key="item.id"-->
<!--                                                :label="item.userName"-->
<!--                                                :value="item.id">-->
<!--                                        </el-option>-->
<!--                                    </el-select>-->
<!--                                </el-form-item>-->
                                <el-form-item label="专家姓名:" required>
                                    <el-input v-model="expertRealName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="联系电话:" required>
                                    <el-input v-model="mobile" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="专家简介:" required>
                                    <el-input v-model="expertBrief" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="技能专长:" required>
                                    <el-input v-model="expertise" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="技能描述:" required>
                                    <el-input v-model="expertiseBrief" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="工作年限:" required>
                                    <el-input v-model="workingLife" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="擅长领域:" required>
                                    <el-input v-model="areasExpertise" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="所在位置:" required>
                                    <el-input v-model="expertAddress" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
<!--                                <el-form-item label="专家证件:" required>-->
<!--                                    <el-input v-model="pwd" size="1" style="width: 240px;"></el-input>-->
<!--                                </el-form-item>-->
                            </el-form>
                            <div slot="footer" class="dialog-footer" style="padding-top: 37px;padding-left: 100px">
                                <el-button class="el-button_2" type="primary" @click="saveUser">确 定</el-button>
                            </div>
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
                expertAccount:'',
                expertName: '',
                erpUserId: '',
                expertRealName: '',
                mobile: '',
                expertBrief: '',
                expertise: '',
                expertiseBrief:'',
                workingLife:'',
                areasExpertise:'',
                expertAddress:'',
               departmentList:[],
            }
        },
        created(){
            this.getDepartmentList()
        },
        methods: {
            async getDepartmentList() {
                let res = await this.$get("/supplier/getSupplierList")
                // console(res)
                this.departmentList = res.erpUserList
            },
            async saveUser() {
                let data = {
                    expertAccount:this.expertAccount,
                    expertName: this.expertName,
                    erpUserId: this.erpUserId,
                    expertRealName: this.expertRealName,
                    mobile: this.mobile,
                    expertBrief: this.expertBrief,
                    expertise: this.expertise,
                    expertiseBrief: this.expertiseBrief,
                    workingLife: this.workingLife,
                    areasExpertise: this.areasExpertise,
                    expertAddress: this.expertAddress
                };
                let res = await this.$post("/supplier/save_erpExpert",data);
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
            },
        }
    }
</script>
<style lang="scss" scoped>

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
