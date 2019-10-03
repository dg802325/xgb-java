<template>
    <div>
        <glob-breadcrumb title="通用字典设置"/>
        <br><br>
        <!--内容-->
        <div class="content-cc container">
            <!--右侧栏-->
            <div class="content_r">
                <div class="center_r_t">
                    <div class="top">
                        <!--专题标题-->
                        <div class="zt_title">
                            <el-form ref="form" label-width="200px;">
                                <div style="display: flex">
                                    <div class="v-transfer-wrapper wrapper1"style="margin-top: 10px">
                                        <div class="title" >
                                            <span>一级字典   <el-button class="addButton1" type="success" size="mini" @click="addOne('')">添加</el-button></span>
                                        </div>
                                        <div class="v-transfer-item has-arrow" >
                                            <ul>
                                                <li v-for="item in oneDictList"
                                                    :key="item.id"
                                                    :class="{'active':oneDictId===item.id}"
                                                    @click="oneDictId = item.id"
                                                >
                                                    <div>
                                                        {{item.dictName}}
                                                        <el-button
                                                                v-if="checkPermission('SYS:PERMISSION:DELETE')"
                                                                size="mini"
                                                                type="danger"
                                                                class="itemButton1"
                                                                @click="delOneDict(item)">D</el-button>
                                                        <el-button style="margin-right: 10px" class="itemButton1" size="mini" type="success" @click="editOneDict(item)">E</el-button>
                                                    </div>

                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div style="display: flex;padding:0 20px;align-items: center">
                                        <span>
                                            <img src="./images/u2017.png"/>
                                        </span>
                                    </div>
                                    <div class="v-transfer-wrapper wrapper2" style="margin-top: 10px">
                                        <div class="title">
                                            二级字典 <el-button v-if="this.oneDictId" class="addButton2" type="success" size="mini" @click="addTwo('')">添加</el-button>
                                        </div>
                                        <div class="v-transfer-item">
                                            <ul>
                                                <li v-for="item in twoDictList"
                                                    :key="item.id"
                                                    :class="{'active':twoDictId===item.id}"
                                                    @click="twoDictId = item.id"
                                                >
                                                    <div>
                                                        名称：{{item.dictName}}
                                                        | 值：{{item.dictValue}} | 排序：{{item.sort}} |
                                                        <el-button
                                                                v-if="checkPermission('SYS:PERMISSION:DELETE')"
                                                                size="mini"
                                                                type="danger"
                                                                style="margin-right: 8px;"
                                                                class="itemButton1"
                                                                @click="delTwoDict(item)">D</el-button>
                                                        <el-button class="itemButton2" size="mini" type="success" @click="editTwoDict(item)">E</el-button>
                                                    </div>

                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </el-form>

                            <el-dialog title="添加一级字典" :visible.sync="isShowAddOne" width="35%" :before-close="closeOne">
                                <el-form ref="form"  label-width="150">
                                    <el-form-item label="数据类型名称:" required>
                                        <el-input v-model="addDictName" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="数据唯一标识:" required>
                                        <el-input v-model="addDictCode" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="数据值:" required>
                                        <el-input v-model="addDictValue" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="排序:" required>
                                        <el-input v-model="addDictSort" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="备注:" required>
                                        <el-input type="textarea" v-model="addDictRemark" size="1" style="width: 275px;" rows="5" placeholder="请输入内容"></el-input>
                                    </el-form-item>
                                </el-form>
                                <span slot="footer" class="dialog-footer">
                                    <el-button @click="closeOne">取 消</el-button>
                                    <el-button type="primary" @click="addDictOne">确 定</el-button>
                                </span>
                            </el-dialog>

                            <el-dialog title="添加二级字典" :visible.sync="isShowAddTwo" width="35%" :before-close="closeTwo">
                                <el-form ref="form"  label-width="150">
                                    <el-form-item label="数据类型名称:" required>
                                        <el-input v-model="addDictName" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="数据唯一标识:" required>
                                        <el-input v-model="addDictCode" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="数据值:" required>
                                        <el-input v-model="addDictValue" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="排序:" required>
                                        <el-input v-model="addDictSort" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="备注:" required>
                                        <el-input type="textarea" v-model="addDictRemark" size="1" style="width: 275px;" rows="5" placeholder="请输入内容"></el-input>
                                    </el-form-item>
                                </el-form>
                                <span slot="footer" class="dialog-footer">
                                    <el-button @click="closeTwo">取 消</el-button>
                                    <el-button type="primary" @click="addDictTwo">确 定</el-button>
                                </span>
                            </el-dialog>

                            <el-dialog title="编辑字典" :visible.sync="isShowEdit" width="35%" :before-close="closeEdit">
                                <el-form ref="form"  label-width="150">
                                    <el-input v-if="notShow" v-model="editId"></el-input>
                                    <el-form-item label="数据类型名称:" required>
                                        <el-input v-model="editDictName" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="数据唯一标识:" required>
                                        <el-input v-model="editDictCode" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="数据值:" required>
                                        <el-input v-model="editDictValue" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="排序:" required>
                                        <el-input v-model="editDictSort" size="1" style="width: 200px;"></el-input>
                                    </el-form-item>
                                    <el-form-item label="备注:" required>
                                        <el-input type="textarea" v-model="editDictRemark" size="1" style="width: 275px;" rows="5" placeholder="请输入内容"></el-input>
                                    </el-form-item>
                                </el-form>
                                <span slot="footer" class="dialog-footer">
                                    <el-button @click="closeEdit">取 消</el-button>
                                    <el-button type="primary" @click="eidtDict">确 定</el-button>
                                </span>
                            </el-dialog>
                        </div>
                    </div>
                    <br/>
                </div>
            </div>
        </div>
    </div>
</template>
<script>

    export default {
        data() {
            return {
                oneDictList: [],
                twoDictList: [],
                oneDictId: '',
                twoDictId: '',
                isShowAddOne:false,
                isShowAddTwo:false,
                isShowEdit:false,
                addDictName:'',
                addDictCode:'',
                addDictValue:'',
                addDictSort:'',
                addDictRemark:'',
                editId:'',
                editDictName:'',
                editDictCode:'',
                editDictValue:'',
                editDictSort:'',
                editDictRemark:'',
                editParentId:'',
                notShow:false,
            }
        },
        watch: {
            oneDictId() {
                this.getTwoDictList()
            },
        },
        created() {
            this.getOneDictList()
        },

        methods: {

            //查询一级字典
            async getOneDictList() {
                let res = await this.$get("/admin/getOneDictList")
                console.log(res)
                this.oneDictList = res.lists
            },
            //查询二级字典
            async getTwoDictList() {
                let res = await this.$get("/admin/getTwoDictList", {parentId: this.oneDictId})
                this.twoDictList = res.lists
            },

            async addOne(row) {
                this.addDictName = '',
                this.addDictCode = '',
                this.addDictValue = '',
                this.addDictSort = '',
                this.addDictRemark = '',
                this.isShowAddOne = true
            },
            async addTwo(row) {
                this.addDictName = '',
                this.addDictCode = '',
                this.addDictValue = '',
                this.addDictSort = '',
                this.addDictRemark = '',
                this.isShowAddTwo = true
            },
            async closeOne(){
                this.isShowAddOne = false
            },
            async closeTwo(){
                this.isShowAddTwo = false
            },
            async closeEdit(){
                this.isShowEdit = false
            },
            async addDictOne(){
                let data = {
                    dictName:this.addDictName,
                    dictCode:this.addDictCode,
                    dictValue:this.addDictValue,
                    sort:this.addDictSort,
                    remark:this.addDictRemark,
                }
                console.log(data)
                let res = await this.$post("/admin/saveOneSysDict", data)
                if(res.code=='200'){
                    this.$message({
                        type: 'success',
                        message: res.message,
                    });
                    this.isShowAddOne = false
                    this.getOneDictList()
                }else {
                    this.$message({
                        type: 'error',
                        message: res.message,
                    });
                }

            },
            async addDictTwo(){
                let data = {
                    parentId :this.oneDictId,
                    dictName:this.addDictName,
                    dictCode:this.addDictCode,
                    dictValue:this.addDictValue,
                    sort:this.addDictSort,
                    remark:this.addDictRemark,
                }
                console.log(data)
                let res = await this.$post("/admin/saveTwoSysDict", data)
                if(res.code=='200'){
                    this.$message({
                        type: 'success',
                        message: res.message,
                    });
                    this.isShowAddTwo = false
                    this.getTwoDictList()
                }else {
                    this.$message({
                        type: 'error',
                        message: res.message,
                    });
                }
            },
            async eidtDict(){
                let data = {
                    id : this.editId,
                    dictName : this.editDictName,
                    dictCode : this.editDictCode,
                    dictValue : this.editDictValue,
                    sort : this.editDictSort,
                    remark : this.editDictRemark,
                }
                let res = await this.$post("/admin/saveEditSysDict", data)
                if(res.code=='200'){
                    this.$message({
                        type: 'success',
                        message: res.message,
                    });
                    this.isShowEdit = false
                    console.log(this.editParentId)
                    if(this.editParentId){
                        this.getTwoDictList()
                    }else {
                        this.getOneDictList()
                    }
                }else {
                    this.$message({
                        type: 'error',
                        message: res.message,
                    });
                }
            },
            async editTwoDict(item){
                this.editId = item.id
                this.editDictName = item.dictName
                this.editDictValue = item.dictValue
                this.editDictCode = item.dictCode
                this.editDictSort = item.sort
                this.editParentId = item.parentId
                this.editDictRemark = item.remark
                this.isShowEdit = true
            },
            async editOneDict(item){
                this.editId = item.id
                this.editDictName = item.dictName
                this.editDictValue = item.dictValue
                this.editDictCode = item.dictCode
                this.editParentId = item.parentId
                this.editDictSort = item.sort
                this.editDictRemark = item.remark
                this.isShowEdit = true
            },
            //删除一级
            async delOneDict(item) {
                console.log(item)
                this.$confirm('此操作将永久删除, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(async () => {
                    //删除逻辑
                    let res = await this.$post('/admin/deleteSysDict', {id: item.id});
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
                    this.getOneDictList()
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '取消删除'
                    });
                });
            },
            //删除二级
            async delTwoDict(item) {
                console.log(item)
                this.$confirm('此操作将永久删除, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(async () => {
                    //删除逻辑
                    let res = await this.$post('/admin/deleteSysDict', {id: item.id});
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
                    this.getTwoDictList()
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '取消删除'
                    });
                });
            },
        }

    }
</script>

<style>

    .content-cc {
        height: auto;
        margin: 0 auto;
        display: flex;
        background: #fff;
        border: 1px rgba(228, 228, 228, 1) solid;
    }

    .content_r {
        width: 95%;
        height: auto;
        justify-content: space-around;
    }

    .center_r_t {
        width: 95%;
        height: auto;
        margin: 0 auto;
        margin-top: 30px;
    }

    .top {
        width: 100%;
        height: auto;
        margin-top: 40px;
    }
    .wrapper1{
        width:300px !important;
    }
    .wrapper2{
        width:600px !important;
    }
    .el-form-item__label{
        width: 120px !important;
    }
    .addButton1{
        float: right;
        margin-top: 7px;
        margin-right: 10px;
    }
    .addButton2{
        float: right;
        margin-top: 7px;
        margin-right: 10px;
    }
    .itemButton1{
        float: right;
        margin-top: 5px;
        margin-right: 40px;
    }
    .itemButton2{
        float: right;
        margin-top: 5px;
        margin-right: 10px;
    }
</style>