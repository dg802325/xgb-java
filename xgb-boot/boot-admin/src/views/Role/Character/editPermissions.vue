<template>
    <div>
        <div>
            <glob-breadcrumb title="权限设置"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title" style="font-size: 15px">
                        当前部门 : {{departmentName}}
                    </div>
                </div>
                <div class="content_b_pe">
                    <br/>
                    <div class="content_b_tx_pe">
                        <table class="glob-table" style=" margin-bottom:20px;" v-for="item in permission"
                               :key="item.id">
                            <thead>
                            <th class="permission-th" colspan="6">
                                <label>
                                    <el-checkbox v-model="item.checkAll" @change="checkAllChild(item)"/>
                                    {{item.permissionName}}</label>
                            </th>
                            </thead>
                            <tbody class="permission-tbody">
                            <tr v-for="(sub,index) in item.chunk" :key="index">
                                <td v-for="node in sub">
                                    <label v-if="node">
                                        <el-checkbox v-model="node.checked" @change="childPerChange(node.parentId)"
                                                     style="margin-right:5px;"/>
                                        {{node.permissionName}}</label></td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="check-all-button" @click="selectAll">
                            选择全部
                        </div>
                        <span slot="footer" class="dialog-footer">
                        <el-button type="primary" @click="saveUserPermissions"
                                   style="height: 35px;width: 100px;margin-left: 445px;margin-top: 25px">保  存</el-button>
                    </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import _ from 'lodash'
    export default {
        data() {
            return {
                userId: '',
                departmentName: '',
                list: [],
                defaultCkeckId: [],
                permission: [],
                map: {},
                allCheckedId: [],
                checkAll:false
            }
        },
        async mounted() {
            this.userId = this.$route.query.id
            this.departmentId = this.$route.query.departmentId
            this.departmentName = this.$route.query.name
            this.getUserPermissions()
            this.getPermissions()
        },
        methods: {

            async getUserPermissions() {
                // let res = await this.$get("/admin/getUserPermissions", {userId: this.userId})
                // if (res.userPermissionList != null && res.userPermissionList.length > 0) {
                //     res.userPermissionList.forEach(item => {
                //         this.defaultCkeckId.push(item.permissionId)
                //     })
                // }
            },
            async saveUserPermissions() {
                if (this.allCheckedId.length == 0) {
                    this.$message.info("请选择权限!")
                    return;
                }
                // let name = 'AF721A7151FC4BB2848626F7171CAA25'
                let data = {
                    userId: this.userId,
                    // userId:name,
                    ids: JSON.stringify(this.allCheckedId)
                    
                }
                let res = await this.$post("/admin/saveErpUserPermissions", data)
                if (res.code == 200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.$router.push('/system/userManagement/')
                } else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
            },
            selectAll() {
                let checked = !this.checkAll;
                for (let i = 0; i < this.permission.length; i++) {
                    let item = this.permission[i];
                    item.checkAll = checked;
                    item.children.forEach(el => {
                        el.checked = checked
                    })
                }
                this.checkAll = checked;
                this.getAllCheckId();
            },
            getAllCheckId() {
                let allCheckedId = [];
                for (let i = 0; i < this.permission.length; i++) {
                    let item = this.permission[i];
                    if (item.checkAll) {
                        allCheckedId.push(item.id)
                    }
                    item.children.forEach(el => {
                        if (el.checked) {
                            allCheckedId.push(el.id)
                        }
                    })
                }
                this.allCheckedId = allCheckedId
            },
            checkAllChild(item) {
                let check = item.checkAll;
                item.children.forEach(el => {
                    el.checked = check
                })
                this.getAllCheckId();
            },
            childPerChange(parentId) {
                let parentNode = this.map[parentId];
                console.log(parentNode)
                let check = parentNode.children.every(item => item.checked);
                parentNode.checkAll = check;
                this.getAllCheckId();
            },

            async getPermissions() {
                let res = await this.$get("/admin/getAllSysPermission")
                console.log(res)
                let map = {};
                let permission = [];
                res.forEach(item => {
                    map[item.id] = item;
                })
                console.log(map)
                for (let key in map) {
                    console.log(map[key].parentId)
                    if (map[key].parentId!='0'&&map[key].permissionType!='1') {
                        map[key]['checked'] = this.defaultCkeckId.includes(map[key].id);
                        if (!map[map[map[key].parentId].parentId].children) map[map[map[key].parentId].parentId].children = [];
                        map[map[map[key].parentId].parentId].children.push(map[key])
                    } else if(map[key].parentId=='0') {
                        map[key]['checkAll'] = this.defaultCkeckId.includes(map[key].id);
                        permission.push(map[key])
                    }
                }
                permission.forEach(item => {
                    item['chunk'] = _.chunk(item.children, 6)
                    item['chunk'].forEach(el => {
                        if (el.length < 6) el.length = 6;
                    })
                })
                this.map = map;
                this.permission = permission;
            },
        }
    }
</script>

<style>
    .content_b_pe {
        width: 100%;
        height: auto;
        background-color: #fff;
    }

    .content_b_tx_pe {
        padding-bottom: 20px;
        width: 90%;
        margin: 0 auto;
    }

    .permission-th {
        font-weight: normal;
        text-align: left;
        padding-left: 20px;
    }

    .permission-th label {
        font-size: 14px;
    }

    .permission-th .el-checkbox {
        margin-right: 5px;
    }

    .permission-tbody td {
        width: 200px;
    }

    .check-all-button {
        height: 44px;
        line-height: 44px;
        font-size: 14px;
        text-align: center;
        color: #666;
        background: #f9fafc;
        border: 1px #e4e4e4 solid;
        cursor: pointer;
    }
</style>
