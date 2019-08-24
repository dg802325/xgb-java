<template>
    <div>
        <div>
            <glob-breadcrumb title="菜单管理"/>
            <br><br>
            <div class="container">
                <glob-base-search>
                    <div slot="button">
                        <el-button @click="selectRole">查询结果</el-button>
                    </div>
                    <el-form label-width="90px" :inline="true">
                        <el-form-item label="菜单名称：">
                            <el-input></el-input>
                        </el-form-item>
                    </el-form>
                </glob-base-search>
                <div class="v-cart-title">
                    <el-button type="success" size="mini" @click="handleAdd('', '')">添加主菜单</el-button>
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
                                prop="menuName"
                                label="菜单名称"
                                width="160">
                        </el-table-column>
                        <el-table-column
                                prop="menuUrl"
                                label="菜单地址"
                                width="160">
                        </el-table-column>
                        <el-table-column
                                prop="permissionName"
                                label="所属权限"
                                width="160">
                        </el-table-column>
                        <el-table-column
                                prop="sort"
                                label="排序"
                                width="50">
                        </el-table-column>
                        <el-table-column
                                prop="permissionType"
                                label="标签"
                                width="100">
                            <template slot-scope="scope">
                                 <el-tag v-if="scope.row.menuType==='0'">目录</el-tag>
                                 <el-tag v-if="scope.row.menuType==='1'">主菜单</el-tag>
                                 <el-tag v-if="scope.row.menuType==='2'">子菜单</el-tag>
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

        <el-dialog title="添加菜单" :visible.sync="isShowAdd" width="20%" :before-close="closeInsert">
            <el-form ref="form"  label-width="100px">
                <el-input v-if="notShow" v-model="addParentId"></el-input>
                <el-form-item label="菜单名称:" required>
                    <el-input v-model="addMenuName" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item label="菜单地址:" required>
                    <el-input v-model="addMenuUrl" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item label="所属权限:" required>
                    <el-select ref="addPermissionId"  v-model="addPermissionId" size="1" style="width: 200px;" placeholder="所属权限" >
                        <el-option
                                v-for="item in permissionList"
                                :key="item.label"
                                :label="item.permissionName"
                                :value="item.id"
                        ></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="排序:" required>
                    <el-input v-model="addSort" size="1" style="width: 200px;"></el-input>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="closeInsert">取 消</el-button>
                <el-button type="primary" @click="addSysMenu">确 定</el-button>
            </span>
        </el-dialog>

        <el-dialog title="编辑权限" :visible.sync="isShowEdit" width="20%" :before-close="closeEdit">
            <el-form ref="form"  label-width="100px">
                <el-input v-if="notShow" v-model="editMenuId"></el-input>
                <el-form-item label="菜单名称:" required>
                    <el-input v-model="editMenuName" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item v-if="!editMenuType==1" label="菜单地址:" required>
                    <el-input v-model="editMenuUrl" size="1" style="width: 200px;"></el-input>
                </el-form-item>
                <el-form-item label="所属权限:" required>
                    <el-select ref="editPermissionId"  v-model="editPermissionId" size="1" style="width: 200px;" placeholder="所属权限" >
                        <el-option
                                v-for="item in permissionList"
                                :key="item.label"
                                :label="item.permissionName"
                                :value="item.id"
                        ></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="排序:" required>
                    <el-input v-model="editSort" size="1" style="width: 200px;"></el-input>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="closeEdit">取 消</el-button>
                <el-button type="primary" @click="editMenu">确 定</el-button>
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
                addMenuUrl:'',
                addMenuName:'',
                addPermissionId:'',
                addMenuType:'',
                addSort:'',
                permissionList:[],
                editMenuId:'',
                editParentId:'',
                editMenuType:'',
                editMenuName:'',
                editMenuUrl:'',
                editPermissionId:'',
                editSort:'',
            }
        },
        created() {
            this.selectRole();
        },
        methods: {
            //查询一级权限列表
            async getInsPermission(){
                let res = await this.$post('/admin/getSysPermissionByMenuId', {parentId:this.addParentId})
                console.log(res)
                this.permissionList = res;
            },
            async handleAdd(index, row) {
                if(!row.menuType){
                    this.addMenuType = '0'
                    this.addParentId='0';
                }else if(row.menuType=='0'){
                    this.addMenuType = '1'
                    this.addParentId=row.id;
                }else if(row.menuType=='1') {
                    this.addMenuType = '2'
                    this.addParentId=row.id;
                }else{
                    this.$message({
                        type: 'warning',
                        message: '不能添加4级目录!'
                    });
                    return
                }
                this.getInsPermission();
                this.addMenuName = '';
                this.addMenuUrl = '';
                this.addPermissionId = '';
                this.addSort = '';
                this.isShowAdd = true;
            },
            async getEditPermission(){
                let res = await this.$post('/admin/getSysPermissionByMenuId', {parentId:this.editParentId})
                console.log(res)
                this.permissionList = res;
            },
            async handleEdit(index, row) {
                if(!row.menuType){
                    this.editMenuType = '0'
                    this.editParentId='0';
                }else if(row.menuType=='0'){
                    this.editMenuType = '1'
                    this.editParentId=row.id;
                }else if(row.menuType=='1') {
                    this.editMenuType = '2'
                    this.editParentId=row.id;
                }
                this.editMenuId=row.id
                this.editMenuName = row.menuName
                this.editParentId = row.parentId
                this.editPermissionId = row.permissionId
                this.editMenuUrl = row.menuUrl
                this.editSort = row.sort
                this.getEditPermission();
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
                    let res = await this.$post('/admin/deleteSysMenu', {id: row.id});
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
            async addSysMenu(){
                let data = {
                    parentId:this.addParentId,
                    menuName: this.addMenuName,
                    menuUrl: this.addMenuUrl,
                    menuType:this.addMenuType,
                    permissionId: this.addPermissionId,
                    sort:this.addSort,
                }
                console.log(data);
                let res = await this.$post('/admin/addSysMenu', data);
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
            async editMenu(){
                let data = {
                    id:this.editMenuId,
                    menuName: this.editMenuName,
                    menuUrl: this.editMenuUrl,
                    menuType:this.editMenuType,
                    permissionId: this.editPermissionId,
                    sort:this.editSort,
                }
                console.log(data)
                let res = await this.$post('/admin/editSysMenu', data)
                console.log(res);
                if(res.code=='200'){
                    this.$message({
                        type: 'success',
                        message: '编辑成功!'
                    });
                    this.closeEdit()
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
                let res = await this.$post('/admin/getSysMenuList', {id:'0'})
                console.log(res)
                this.tableData = res;
            },
        },
    }
</script>

<style scoped>

</style>