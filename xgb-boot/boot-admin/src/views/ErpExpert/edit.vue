<template>
    <div>
        <div>
            <glob-breadcrumb title="编辑专家"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        编辑专家
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx">
                        <br/>
                        <div style="height: 702px;padding-left: 15px;padding-top: 39px">
                            <el-form ref="form" label-width="100px" class="el-form-item_1">
                                <el-form-item label="专家账号:" required>
                                    <el-input v-model="item.expertAccount" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="专家名称:" required>
                                    <el-input v-model="item.expertName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
<!--                                <el-form-item label="所属供应商:" required >-->
<!--                                    <el-select v-model="item.erpUserId" placeholder="请选择" size="1" style="width: 240px;">-->
<!--                                        <el-option-->
<!--                                                v-for="item in departmentList"-->
<!--                                                :key="item.id"-->
<!--                                                :label="item.userName"-->
<!--                                                :value="item.id">-->
<!--                                        </el-option>-->
<!--                                    </el-select>-->
<!--                                </el-form-item>-->
                                <el-form-item label="专家姓名:" required>
                                    <el-input v-model="item.expertRealName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="联系电话:" required>
                                    <el-input v-model="item.mobile" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="专家简介:" required>
                                    <el-input v-model="item.expertBrief" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="技能专长:" required>
                                    <el-input v-model="item.expertise" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="技能描述:" required>
                                    <el-input v-model="item.expertiseBrief" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="工作年限:" required>
                                    <el-input v-model="item.workingLife" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="擅长领域:" required>
                                    <el-input v-model="item.areasExpertise" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="所在位置:" required>
                                    <el-input v-model="item.expertAddress" size="1" style="width: 240px;"></el-input>
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
                id:'',
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
                item:{},
            }
        },
        created(){
            this.id = this.$route.params.id;
            this.getUserById();
            this.getDepartmentList()
        },
        methods: {
            async getUserById() {
                let res = await this.$get("/supplier/getSupplierOne",{id:this.id})
                this.item = res.erpExpert
            },
            async getDepartmentList() {
                let res = await this.$get("/supplier/getSupplierList")
                this.departmentList = res.erpUserList
            },
            async saveUser() {
                let data = {
                    id:this.id,
                    expertAccount:this.item.expertAccount,
                    expertName: this.item.expertName,
                    erpUserId: this.item.erpUserId,
                    expertRealName: this.item.expertRealName,
                    mobile: this.item.mobile,
                    expertBrief: this.item.expertBrief,
                    expertise: this.item.expertise,
                    expertiseBrief: this.item.expertiseBrief,
                    workingLife: this.item.workingLife,
                    areasExpertise: this.item.areasExpertise,
                    expertAddress: this.item.expertAddress
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
