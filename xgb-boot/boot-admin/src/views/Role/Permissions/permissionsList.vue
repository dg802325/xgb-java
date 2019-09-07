<template>
    <div>
        <div>
            <glob-breadcrumb title="权限管理"/>
            <br><br>
            <div class="container">
                <glob-base-search>
                    <div slot="button">
                        <el-button @click="selectRole">查询结果</el-button>
                    </div>
                    <el-form label-width="90px" :inline="true">
                        <el-form-item label="权限名称：">
                            <el-input></el-input>
                        </el-form-item>
                    </el-form>
                </glob-base-search>
                <div class="v-cart-title">
                    <el-button type="success" size="mini" @click="handleAdd('', '')">添加主权限</el-button>
                </div>
                <div>
                    <el-table
                            :data="tableData"
                            style="width: 100%;margin-bottom: 20px;"
                            row-key="id"
                            border
                            default-expand-all
                            :tree-props="{children: 'children', hasChildren: 'hasChildren'}">
                        <el-table-column
                                prop="permissionName"
                                label="权限名称"
                                width="220">
                        </el-table-column>
                        <el-table-column
                                prop="remark"
                                label="备注"
                                width="200">
                        </el-table-column>
                        <el-table-column
                                prop="permissionKey"
                                label="权限值"
                                width="200">
                        </el-table-column>
                        <el-table-column
                                prop="permissionType"
                                label="标签"
                                width="80">
                            <template slot-scope="scope">
                                 <el-tag v-if="scope.row.permissionType==='0'">主权限</el-tag>
                                 <el-tag v-if="scope.row.permissionType==='1'">子权限</el-tag>
                                 <el-tag v-if="scope.row.permissionType==='2'">附权限</el-tag>
                                 <el-tag v-if="scope.row.permissionType==='3'">按钮</el-tag>
                            </template>
                        </el-table-column>
                        <el-table-column
                                label="操作"
                                align="right">
                            <template slot-scope="scope">
                                <el-button
                                        size="mini"
                                        type="success"
                                        @click="handleAdd(scope.$index, scope.row)">Add</el-button>
                                <el-button
                                        size="mini"
                                        type="primary"
                                        @click="handleEdit(scope.$index, scope.row)">Edit</el-button>
                                <el-button
                                        size="mini"
                                        type="danger"
                                        @click="handleDelete(scope.$index, scope.row)">Delete</el-button>
                            </template>
                        </el-table-column>
                    </el-table>
                </div>
            </div>
        </div>

        <el-dialog title="添加权限" :visible.sync="isShowAdd" width="20%" :before-close="closeInsert">
            <el-form ref="form"  label-width="100px">
                <el-input v-if="notShow" v-model="addParentId"></el-input>
                <el-form-item label="权限名称:" required>
                    <el-input v-model="addPermissionName" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item label="备注:" required>
                    <el-input v-model="addRemark" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item label="权限值:" required>
                    <el-input v-model="addPsermissionKey" size="1" style="width: 200px;"></el-input>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="closeInsert">取 消</el-button>
                <el-button type="primary" @click="addSysPermission">确 定</el-button>
            </span>
        </el-dialog>

        <el-dialog title="编辑权限" :visible.sync="isShowEdit" width="20%" :before-close="closeEdit">
            <el-form ref="form"  label-width="100px">
                <el-input v-if="notShow" v-model="editPermissionId"></el-input>
                <el-form-item label="权限名称:" required>
                    <el-input v-model="editPermissionName" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item label="备注:" required>
                    <el-input v-model="editRemark" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item label="备注:" required>
                    <el-input v-model="editPermissionKey" size="1" style="width: 200px;"></el-input>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="closeEdit">取 消</el-button>
                <el-button type="primary" @click="editPermission">确 定</el-button>
            </span>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                notShow:false,
                tableData: [],
                isShowAdd:false,
                isShowEdit:false,
                isShowDelete:false,
                addParentId:'',
                addPermissionName:'',
                addRemark:'',
                addPsermissionKey:'',
                addPermissionType:'',
                editPermissionId:'',
                editPermissionName:'',
                editPermissionKey:'',
                editRemark:'',
            }
        },
        created() {
            this.selectRole();
        },
        methods: {
            async handleAdd(index, row) {
                if(!row.permissionType){
                    this.addPermissionType = '0'
                    this.addParentId='0';
                }else if(row.permissionType=='0'){
                    this.addPermissionType = '1'
                    this.addParentId=row.id;
                }else if(row.permissionType=='1'){
                    this.addPermissionType = '2'
                    this.addParentId=row.id;
                }else if(row.permissionType=='2'){
                    this.addPermissionType = '3'
                    this.addParentId=row.id;
                }else{
                    this.$message({
                        type: 'warning',
                        message: '不能添加5级目录!'
                    });
                    return
                }
                this.addPermissionName = '',
                this.addRemark = '',
                this.isShowAdd = true;
            },
            async handleEdit(index, row) {
                this.editPermissionId=row.id
                this.editPermissionName = row.permissionName
                this.editRemark = row.remark
                this.editPermissionKey = row.permissionKey
                this.isShowEdit = true;
            },
            //删除权限
            async handleDelete(index, row) {
                console.log(index, row);
                this.$confirm('此操作将永久删除, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(async () => {
                    //删除逻辑
                    let res = await this.$post('/admin/deleteSysPermission', {id: row.id});
                    console.log(res)
                    if (res.code == '200') {
                        this.$message({
                            type: 'success',
                            message: '删除成功!'
                        });
                    } else {
                        this.$message({
                            type: 'error',
                            message: '删除失败!'
                        });
                    }
                    this.selectRole()
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '取消删除'
                    });
                });
            },
            //新增权限
            async addSysPermission(){
                let data = {
                    addParentId:this.addParentId,
                    addPermissionName: this.addPermissionName,
                    addRemark: this.addRemark,
                    addPermissionKey: this.addPermissionKey,
                    addPermissionType: this.addPermissionType,
                }
                console.log(data);
                let res = await this.$post('/admin/addSysPermission', data);
                console.log(res);
                if(res.code=='200'){
                    this.$message({
                        type: 'success',
                        message: '添加成功!'
                    });
                    this.selectRole()
                    this.closeInsert()
                }else {
                    this.$message({
                        type: 'error',
                        message: '添加失败!'
                    });
                }
            },
            //编辑权限
            async editPermission(){
                let data = {
                    editPermissionId:this.editPermissionId,
                    editPermissionName: this.editPermissionName,
                    editRemark: this.editRemark
                }
                console.log(data)
                let res = await this.$post('/admin/editSysPermission', data)
                console.log(res);
                if(res.code=='200'){
                    this.$message({
                        type: 'success',
                        message: '编辑成功!'
                    });
                    this.selectRole()
                }else {
                    this.$message({
                        type: 'error',
                        message: '编辑失败!'
                    });
                }
            },
            closeInsert() {
                this.isShowAdd = false;
            },
            closeEdit() {
                this.isShowEdit = false;
            },
            async selectRole() {
                let data = {
                    id:'0',
                }
                let res = await this.$get('/admin/getSysPermission', {id:'0'})
                console.log(res)
                this.tableData = res;
            },
        },
    }
</script>

<style scoped>

</style>