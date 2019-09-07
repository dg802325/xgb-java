<template>
    <div>
        <div>
            <glob-breadcrumb title="权限设置"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title" style="font-size: 15px">
                        <!--当前部门 : {{departmentName}}-->
                    </div>
                </div>
                <el-tree
                        :data="data"
                        @check="bindOnClick"
                        :default-checked-keys="selected"
                        show-checkbox
                        default-expand-all
                        node-key="id"
                        ref="tree"
                        highlight-current
                        :props="defaultProps">
                </el-tree>
            </div>

        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                roleId:'',
                selected:[],
                data: [],
                permissionMap: {},
                defaultProps: {
                    children: 'children',
                    label: 'permissionName'
                }
            };
        },
        created() {
            this.roleId = this.$route.params.sysRoleId
            this.getAllPermission()
            this.getSysRolePermission()
        },
        methods: {

            async getAllPermission(){
                let res = await this.$get("/admin/getAllSysPermission")
                this.data = res.lists;
            },
            async getSysRolePermission(){
                let data = {
                    roleId:this.roleId,
                }
                let res = await this.$get("/admin/getSysRolePermission",data)
                this.selected = res;
            },

            async bindOnClick(node){
                let data = {
                    roleId:this.roleId,
                    id:node.id,
                    permissionType:node.permissionType,
                }
                let res = await this.$post("/admin/saveSysRolePermission",data)
                if(res.code=='200'){
                    this.getSysRolePermission()
                }else {

                }
            },
        },
    };
</script>