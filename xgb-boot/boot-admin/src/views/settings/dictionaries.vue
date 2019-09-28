<template>
    <div>
        <glob-breadcrumb title="地域4级联动"/>
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
                                            <span>一级字典   <el-button class="addButton" type="success" size="mini" @click="addOne('')">添加</el-button></span>
                                        </div>
                                        <div class="v-transfer-item has-arrow" >
                                            <ul>
                                                <li v-for="item in oneDictList"
                                                    :key="item.id"
                                                    :class="{'active':oneDictId===item.id}"
                                                    @click="oneDictId = item.id"
                                                >{{item.dictName}}
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
                                            二级字典 <el-button class="addButton" type="success" size="mini" @click="addTwo('')">添加</el-button>
                                        </div>
                                        <div class="v-transfer-item has-arrow">
                                            <ul>
                                                <li v-for="item in twoDictList"
                                                    :key="item.id"
                                                    :class="{'active':twoDictId===item.id}"
                                                    @click="twoDictId = item.id"
                                                >{{item.dictName}} | {{item.dictValue}}
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
                addDictName:'',
                addDictCode:'',
                addDictValue:'',
                addDictSort:'',
                addDictRemark:'',
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
            async addDictOne(){
                let data = {
                    dictName:this.addDictName,
                    dictCode:this.addDictCode,
                    dictValue:this.addDictValue,
                    dictSort:this.addDictSort,
                    dictRemark:this.addDictRemark,
                }
                console.log(data)
                this.isShowAddOne = false
            },
            async addDictTwo(){
                let data = {
                    parentId :this.oneDictId,
                    dictName:this.addDictName,
                    dictCode:this.addDictCode,
                    dictValue:this.addDictValue,
                    dictSort:this.addDictSort,
                    dictRemark:this.addDictRemark,
                }
                console.log(data)
                this.isShowAddTwo = false
            }

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
        width:400px !important;
    }
    .el-form-item__label{
        width: 80px !important;
    }
    .addButton{
        margin-left:230px;
    }

</style>