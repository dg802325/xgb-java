<template>
    <el-dialog title="添加部门"  width="600px" :visible.sync="addVisible" :before-close="closeEvent">
        <el-form ref="form"  label-width="100px" style="height: 180px;padding-left: 35px">
            <el-form-item label="部门名称:" required>
                <el-input v-model="departmentName" size="1" style="width: 358px"></el-input>
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
                departmentName: '',
                note: '',
            }
        },
        props: {
            addVisible: Boolean
        },
        methods: {
            closeEvent () {
                this.$emit('closeInsert')
            },
            async saveDepartment () {
                let data = {
                    departmentName: this.departmentName,
                };
                if(!this.departmentName) {
                    this.$message({
                        showClose: true,
                        message: '请输入部门名称',
                        type: 'warning'
                    });
                    return;
                }
                let res = await this.$post("/dealer/save_erpDepartmentSupplier",data);
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
