<template>
    <el-dialog title="添加岗位"  width="600px" :visible.sync="addStationVisible" :before-close="closeEvent">
        <el-form ref="form"  label-width="100px" style="height: 180px;padding-left: 35px">
            <el-form-item label="岗位名称:" required>
                <el-input v-model="roleName" size="1" style="width: 358px"></el-input>
            </el-form-item>
            <el-form-item label="所属部门:" required>
                <el-select v-model="departmentId" placeholder="请选择" size="1" style="margin-top: -10px;width: 358px;" clearable>
                    <el-option
                            v-for="item in departmentList"
                            :key="item.id"
                            :label="item.departmentName"
                            :value="item.id">
                    </el-option>
                </el-select>
            </el-form-item>
        </el-form>
        <div align="right" style="border-top: 1px solid #e4e4e4;width: 600px;margin-left: -20px;">
            <div style="padding-right: 30px;padding-top: 30px;">
                <el-button class="z-el-syi el-button_1" @click="closeEvent">取 消</el-button>&nbsp;
                <el-button class="z-el-syi el-button_1" type="primary" @click="saveDepartment">确 定</el-button>
            </div>
        </div>
    </el-dialog>
</template>
<script>

    export default {
        data () {
            return {
                departmentId:'',
                departmentList:[],
                roleName: '',
                note: '',
            }
        },
        props: {
            addStationVisible: Boolean
        },
        created(){
            this.getDepartmentList();
        },
        methods: {
            async getDepartmentList() {
                let res = await this.$get("/dealer/getSupplierDepartments")
                this.departmentList = res.departments
            },
            closeEvent () {
                this.$emit('closeInsertStation')
            },
            async saveDepartment () {
                let data = {
                    id:'',
                    roleName: this.roleName,
                    departmentId:this.departmentId
                };
                if(!this.roleName) {
                    this.$message({
                        showClose: true,
                        message: '请输入岗位名称',
                        type: 'error'
                    });
                    return;
                }
                if(!this.departmentId) {
                    this.$message({
                        showClose: true,
                        message: '请选择部门',
                        type: 'error'
                    });
                    return;
                }
                let res = await this.$post("/dealer/save_erpRole",data);
                if (res.code==200){
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.$emit('addDepartmentSuccess')
                }else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
            }
        }
    }
</script>
<style>
    .z-el-syi{
        border-radius:2px;
        width: 79px;
        height: 34px;
    }
    .el-button_1{
        width: 85px;
        padding:8px 20px;
        border-radius: 2px;
    }
    .el-button--primary{
        background-color:#1abc9c;
        border-color:#1abc9c;
    }
</style>
