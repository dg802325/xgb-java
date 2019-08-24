<template>
    <el-dialog title="编辑岗位"  width="600px" :visible.sync="editVisible" :before-close="closeEvent">
        <el-form ref="form"  label-width="100px" style="height: 180px;padding-left: 35px">
            <el-form-item label="岗位名称:" required>
                <el-input v-model="editItem.roleName" size="1" style="width: 358px"></el-input>
            </el-form-item>
            <el-form-item label="所属部门:" required>
                <el-select v-model="editItem.departmentId" placeholder="请选择" size="1" style="margin-top: -10px;width: 358px;">
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
                <el-button class="z-el-syi el-button_1" type="primary" @click="editDepartment">确 定</el-button>
            </div>
        </div>
    </el-dialog>
</template>
<script>
    export default {
        data () {
            return {
                editItem: this.item,
                departmentList:[],
            }
        },
        props: {
            item: Object,
            editVisible: Boolean
        },
        created(){
            this.getDepartmentList();
        },
        methods: {
            async getDepartmentList() {
                let res = await this.$get("/supplier/getDepartments")
                this.departmentList = res.departments
            },
            closeEvent () {
                this.$emit('closeEdit')
            },
            async editDepartment() {
                let data = {
                    id:this.editItem.id,
                    roleName: this.editItem.roleName,
                    departmentId:this.editItem.departmentId
                };
                if(!this.editItem.departmentName) {
                    this.$message({
                        showClose: true,
                        message: '请输入岗位名称',
                        type: 'error'
                    });
                    return;
                }
                if(!this.editItem.departmentId) {
                    this.$message({
                        showClose: true,
                        message: '请选择部门',
                        type: 'error'
                    });
                    return;
                }
                let res = await this.$post("/supplier/save_erpRole",data);
                if (res.code==200){
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.$emit('editDepartmentSuccess')
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
