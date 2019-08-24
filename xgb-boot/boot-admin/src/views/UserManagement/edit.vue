<template>
    <div>
        <div>
            <glob-breadcrumb title="编辑成员"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        <i class="el-icon-s-grid"></i>
                        编辑成员
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx">
                        <br/>
                        <div style="height: 702px;padding-left: 15px;padding-top: 39px">
                            <el-form ref="form" label-width="100px" class="el-form-item_1">
                                <el-form-item label="成员电话:" required>
                                    <el-input v-model="phoneNo" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="成员姓名:" required>
                                    <el-input v-model="userName" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="所属部门:" required >
                                    <el-select v-model="departmentId" placeholder="请选择" size="1" style="width: 240px;" clearable>
                                        <el-option
                                                v-for="item in departmentList"
                                                :key="item.id"
                                                :label="item.departmentName"
                                                :value="item.id">
                                        </el-option>
                                    </el-select>
                                </el-form-item><el-form-item label="所属岗位:" required >
                                <el-select v-model="roleId" placeholder="请选择" size="1" style="width: 240px;" clearable>
                                    <el-option
                                            v-for="item in roleList"
                                            :key="item.id"
                                            :label="item.roleName"
                                            :value="item.id">
                                    </el-option>
                                </el-select>
                            </el-form-item>
                                <el-form-item label="登录密码:" required>
                                    <el-input type="password" v-model="password" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="确认密码:" required>
                                    <el-input type="password" v-model="cpassword" size="1" style="width: 240px;"></el-input>
                                </el-form-item>
                                <el-form-item label="备注信息:" required>
                                    <el-input type="textarea" v-model="userSign" resize="none" rows="9" size="1" style="width: 450px;" placeholder="请输入内容"></el-input>
                                </el-form-item>
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
                editItem:{},
                userRoleId:'',
                departmentId: '',
                phoneNo: '',
                userName: '',
                password: '',
                cpassword: '',
                userSign: '',
                departmentList:[],
                roleId:'',
                roleList:[],
            }
        },
        watch:{
            departmentId(val){
                this.getRoleList(val)
            }
        },
        created(){
            this.userRoleId = this.$route.params.userRoleId
            this.backend(this.userRoleId)
            this.getDepartmentList()
        },
        methods: {
            //回显数据
            async backend(userRoleId){
                let res = await this.$get('/supplier/getEditData',{userRoleId:userRoleId})
                if (res.user) {
                    this.userItem = res.user
                    this.phoneNo = this.userItem.phoneNo
                    this.userAccount = this.userItem.userAccount
                    this.userName = this.userItem.userName
                    this.userSign = this.userItem.userSign
                    this.id = this.userItem.id
                }
                if (res.role) {
                    this.roleItem = res.role
                    this.departmentId = this.roleItem.departmentId
                    this.roleId = this.roleItem.id
                }
            },
            //获取公司下的所有部门
            async getDepartmentList() {
                let res = await this.$get("/supplier/getDepartments")
                this.departmentList = res.departments
            },
            //获取选择部门下岗位
            async getRoleList(departmentId){
                let res = await this.$get('/supplier/getRoles',{departmentId:departmentId})
                if (res.code==200) {
                    this.roleList = res.roles
                } else {
                    this.roleList = []
                }
            },
            async saveUser() {
                let data = {
                    id:this.id,
                    userRoleId:this.userRoleId,
                    roleId: this.roleId,
                    phoneNo: this.phoneNo,
                    userAccount: this.phoneNo,
                    password: this.password,
                    userName: this.userName,
                    userSign: this.userSign
                };
                let res = await this.$post("/supplier/save_erpUserRole",data);
                if (res.code==200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.$router.push('/system/userManagement')
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
        width: 100%;
        height: auto;
        background-color: #fff;
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
