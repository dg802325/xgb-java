<template>
    <div>
        <glob-breadcrumb title="填写物资信息"/>
        <br><br>
        <div class="z-di-cc">
            <div class="z-space-cc">
                <el-steps :space="340" :active="2" finish-status="success" align-center>
                    <el-step title="选择物资分类"></el-step>
                    <el-step title="填写物资信息"></el-step>
                </el-steps>
            </div>
        </div>

        <div class="all">
            <div class="right">
                <div class="image3">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png"v-if="bbiCategoryParamList.length>0">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">详细规格</p>
                </div>

                <div class="image4">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png"v-if="bbiCategoryParamList.length>0">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">物资参数</p>
                </div>

                <div class="image">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">基本信息</p>
                </div>
                <div class="image1">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">物资相册</p>
                </div>
            </div>
            <div style="min-height: 1300px;">
            <div class="left">
                <div class="form">
                    <el-form  ref="form" label-width="100px">
                        <el-form-item label="物资分类:" required>
                            <p style="float: left;font-size: 14px;color: #666666">{{threeCategory}}>{{oneCategory}}>{{twoCategory}}</p>
                            <!--                            <p @click="editor" style="color: #1abc9c;">&nbsp;&nbsp;编辑</p>-->
                        </el-form-item>

                        <el-form-item  label="物资名称:" required>
                            <el-input v-model="spuName" size="1" style="margin-top: -10px;width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <el-form-item  label="物资品牌:" required>
                            <el-select  v-model="brandId" style="width: 250px" placeholder="请选择">
                                <el-option
                                        v-for="item in options"
                                        :key="item.id"
                                        :label="item.brandName"
                                        :value="item.id">
                                </el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item  label="计量单位:" required>
                            <el-select  v-model="metering" style="width: 250px" placeholder="请选择">
                                <el-option
                                        v-for="item in DictList"
                                        :key="item.dictValue"
                                        :label="item.name"
                                        :value="item.dictValue">
                                </el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="物资货号:" required>
                            <el-input v-model="spuNo" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <el-form-item style="padding-top: 20px" label="物资介绍:" required>
                            <el-input type="textarea" style="width: 350px;padding-top: 10px" v-model="spuSharerDescribe" rows="6"
                                      resize="none"></el-input>
                        </el-form-item>

                    </el-form>
                </div>
                <div class="imageUpload" style="padding-top: 20px">
                <div class="photo"style="margin-left: 360px" v-if="uploadFileList.length==0">
                    <img style="width: 100%;height: 80%" src="./image/1120.png">
                    <div style=" width: 100%;height: 20%;display: flex;line-height: 32px">
                        <p style="margin-left: 20px;color: #1abc9c">设为主图</p>
                        <p style="margin-left: 10px;color: #1abc9c">删除图片</p>
                    </div>
                </div>
                <div class="photos" style="display: flex " v-if="uploadFileList.length">
                    <div class="photo" style="margin-left: 365px" v-for="(url,index) in uploadFileList">
                        <img style=" width: 100%;height: 80%"
                             :src="url"
                             fit="contain"
                        >

                        <div style=" width: 100%;height: 20%;display: flex;line-height: 32px">
                            <p v-if="index==0"><span class="red" style="margin-left: 20px;color: red">物资主图</span></p>
                            <p v-else @click="setMain(index)" style="margin-left: 20px;color: #1abc9c"><span>设为主图</span></p>
                            <p><span @click="handleRemove(index)" style="margin-left: 20px;color: #1abc9c">删除图片</span></p>
                        </div>
                    </div>
                </div>
                <div class="uploading">
                    <el-upload
                            :action="Base_url+'/admin/upload/pictureUrl'"
                            :show-file-list="false"
                            :on-change="fileChange"
                            multiple
                            :limit="5"
                            :on-exceed="exceedMsg"
                            :on-success="imageSuccess"
                    >
                        <el-button style="width: 117px;height: 35px;background: #48c9b0;border: none;color: white;margin-left: 350px">上传图片</el-button>
                    </el-upload>

                </div>
                </div>
                <br><br>

                <!--录入参数-->
                <div class="table" style="padding-top:80px" align="center"v-if="bbiCategoryParamList.length>0">
                    <el-table
                            :data="bbiCategoryParamList"
                            border
                            style="width: 702px">
                        <el-table-column fixed prop="paramName" label="参数类型" width="200px"align="center"></el-table-column>

                        <el-table-column label="录入参数"width="350px" align="center">
                            <template slot-scope="{row}" >
                                <span v-if="row.paramName">
                                <el-input style="width:300px" v-model="row.value" />
                                </span>
                            </template>
                        </el-table-column>

                        <el-table-column align="center" label="操作" width="150px">
                            <template slot-scope="scope">
                                <span v-if="scope.row.paramName">
                                <el-button @click.native.prevent="deleteRow(scope.$index, bbiCategoryParamList)" type="text" size="small">移除</el-button>
                                </span>
                            </template>
                        </el-table-column>
                    </el-table>
                </div>
                <!--录入规格参数-->
                <div class="alls" v-if="specItems.length" style="padding-top: 140px;color: #606266;margin: auto">
                    <div class="spec-wrapper"  v-for="(specs,i) in specItems" :key="i">
                        <div>
                            <div class="spec">
                                {{specs.specName}}
                            </div>
                            <div class="values" v-if="specs.specName" style="margin-top: -10px">
                                <div style="padding-left: 100px;padding-top:10px;display: inline-block" v-for="(values,indexs) in specs.keys" :key="indexs">
                                    {{values.value}}：<el-input style="width: 120px" v-model="values.Parameters" />
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="Dict" style="position:relative;width: 700px;padding-top: 120px;margin: auto">
                    <div class="image2" style="position: absolute;top:120px;left:-290px" >
                        <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                        <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">单位换算</p>
                    </div>
                    <div>
<!--                        <el-button class="el-button_1" type="text" style="margin-top:30px;width:95px;" icon="el-icon-plus"  @click="addRow">-->
<!--                            添加-->
<!--                        </el-button>-->
                    </div>

                    <el-table
                        :data="feeList"
                        border
                        style="width: 700px"align="center">
                    <el-table-column
                            align="center"
                            label="单位">
                        <template slot-scope="{row}">
                            每&nbsp&nbsp&nbsp&nbsp<el-select disabled v-model="row.metering" style="width: 100px" placeholder="请选择">
                            <el-option
                                    v-for="item in DictList"
                                    :key="item.dictValue"
                                    :label="item.name"
                                    :value="item.dictValue">
                            </el-option>
                        </el-select>
                        </template>
                    </el-table-column>
                    <el-table-column
                            align="center"
                            label="换算比例">
                        <template slot-scope="{row}">
                            =&nbsp&nbsp&nbsp&nbsp<el-input v-model="row.conversionUnit" style="width: 100px"/>
                        </template>
                    </el-table-column>
                    <el-table-column
                            align="center"
                            label="单位">
                        <template slot-scope="{row}">
                            &nbsp&nbsp&nbsp&nbsp<el-select  v-model="row.unit" style="width: 100px" placeholder="请选择">
                            <el-option
                                    v-for="item in DictList"
                                    :key="item.dictValue"
                                    :label="item.name"
                                    :value="item.dictValue">
                            </el-option>
                        </el-select>
                        </template>
                    </el-table-column>
<!--                    <el-table-column-->
<!--                            label="操作">-->
<!--                        <template slot-scope="{$index}">-->
<!--                            <el-button type="text" @click="handleDelete($index)">删除</el-button>-->
<!--                        </template>-->
<!--                    </el-table-column>-->
                </el-table>
                </div>


                <div class="hx"></div>
                <div class="botton">
                    <button class="up"  @click="retreats" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: white;color: #1abc9a;">上一步，选择物资分类</button>
                    <button type="primary" @click="saveCategory" class="bottoms" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: #1abc9a;color: white">保存物资信息</button>
                </div>
            </div>
            </div>
        </div>
    </div>
</template>
<script>
    import {Base_url} from '../../config/index'
    export default {
        data() {
            return {
                meteringChange:{
                    metering:'',
                    conversionUnit:'',
                    unit:'',
                },
                metering:'',
                Base_url: '',
                categoryIcon: '',
                uploadFileList:[],
                Unit:'',
                // templateNames:'',
                weight:'',
                templateName:'',
                spuPrice:'',
                brandId:'',
                options: [],
                list: [],
                value: '',
                classify:'',
                shopGoods:'',
                spuName:'',
                spuNo:'',
                spuSharerDescribe:'',
                categoryList:[],
                paramName:[],
                category:[],
                bbiCategoryParamList:[
                ],
                specItems:[
                ],
                oneCategory: '',
                twoCategory: '',
                threeCategory:'',
                DictList:[],
                feeList: []
            }
        },
        created() {
            this.parentId = this.$route.params.threeCategoryId
            this.getCategory()
            this.selectBrand()
            this.getDict()
            this.addRow()
        },
        mounted() {
            this.Base_url = Base_url
            this.specItems.push({
                spec: '',
                keys:[{
                    Parameters:''
                }],
            })
        },
        watch:{
            metering(val){
                console.log(val)
                console.log(this.feeList)
                this.feeList[0].metering = val
            }
        },
        methods: {
            //获取商品单位
            async getDict(){
                let res = await this.$get("/admin/getSpuDict");
                this.DictList = res.DictList
                console.log(res)
            },

            handleRemove(index) {
                this.uploadFileList.splice(index, 1);
            },
            setMain(index) {
                let main = this.uploadFileList.splice(index, 1);
                this.uploadFileList = [...main, ...this.uploadFileList]

            },

            fileChange(file, fileList) {
            },
            exceedMsg() {
                this.$message.error('最多上传5张图片')
            },
            imageSuccess(res) {
                this.uploadFileList.push(res.fileUrl)
            },
            async handleAvatarSuccess(res) {
                this.categoryIcon = res.fileUrl;

            }, handleDelete(index) {
                this.feeList.splice(index, 1)
            },
            // addRow() {
            //     this.feeList.push({
            //         metering:this.metering,
            //         conversionUnit: '',
            //         unit: '',
            //
            //     })
            // },

            async addRow() {
                this.feeList.push(this.meteringChange)
            },


            async selectBrand(){
                let resq = await this.$get("/admin/getBrandList")
                this.options = resq.list
                console.log(this.options)
            },
            // async selectTemplate(){
            //     let resq = await this.$get("/supplier/getErpFreightTemplateForPages")
            //     this.option = resq.dateSet
            //     console.log(this.options)
            // },

            async getCategory(){
                let resq = await this.$get("/admin/getCategory", {categoryId: this.parentId})

                this.oneCategory= resq.oneCategory.categoryName
                this.twoCategory = resq.twoCategory.categoryName
                this.threeCategory = resq.ThreeCategory.categoryName

                var ids = []
                let res = await this.$get("/admin/getEditCategoryThree", {categoryId: this.parentId,id:this.parentId,Spceid:''})
                this.category = res.bbiCategorySpceList
                let bbiCategoryParamList =res.bbiCategoryParamList
                for(let i=0;i<bbiCategoryParamList.length;i++){
                    let item = bbiCategoryParamList[i];
                    item['value'] = ''
                }
                this.bbiCategoryParamList = bbiCategoryParamList;
                res.bbiCategorySpceList.forEach(item=>{
                    item.keys = [];
                });
                this.specItems  = res.bbiCategorySpceList;
                for (let i = 0; i<res.bbiCategorySpceList.length;i++ ){
                    ids[i] = res.bbiCategorySpceList[i].id
                }
                const parma = ids.join()

                let resa = await this.$get("/admin/getEditCategoryspecparamThree", {Spceid:parma})

                resa.bbiCategorySpecParamList.forEach(item =>{
                    let index  = this.findIndex(item.categorySpecId);
                    if(index>=0){
                        let paramName = JSON.parse(item.paramName);
                        this.specItems[index].keys = [...this.specItems[index].keys,...paramName]
                    }
                })
                this.specItems = JSON.parse(JSON.stringify(this.specItems))

            },
            findIndex(id){
                for(let i=0;i<this.specItems.length;i++){
                    if(this.specItems[i].id===id){
                        return i;
                        continue;
                    }
                }
                return -1
            },



            async deleteRow(index, rows) {
                rows.splice(index, 1);

                let resa = await this.$get("/admin/getEditCategoryThree", {categoryId: this.parentId,id:this.parentId,Spceid:''})
                let res = await this.$post("/admin/remove_spec", {id: resa.bbiCategoryParamList[index].id})

                if (res.code == 200) {
                    this.$message.success(res.message);
                } else {
                    this.$message.error(res.message);
                }
            },
            async saveCategory(){
                let data = {
                    brandId:this.brandId,
                    categoryId: this.parentId,
                    spuName: this.spuName,
                    spuNo: this.spuNo,
                    value :this.value,
                    spuMetering :this.metering,
                    spuSharerDescribe: this.spuSharerDescribe,
                    shpSpuResources: JSON.stringify(this.uploadFileList),
                    feeList: JSON.stringify(this.feeList),
                };
                if (!this.uploadFileList.length) {
                    this.$message.info("请录入图片!")
                    return;
                }

                if (!this.spuName){
                    this.$message.info("请输入物资名称!")
                    return;
                }
                if(!this.spuNo){
                    this.$message.info("请输入物资货号!")
                    return;
                }
                if(!this.spuSharerDescribe){
                    this.$message.info("请输入物资介绍!")
                    return;
                }
                if(!this.feeList){
                    this.$message.info("请输入辅助单位!")
                    return;
                }
                let Spu = await this.$post("/admin/insertSpu", data);
                let dataa ={
                    spuId : Spu.id,
                    bbiCategoryParamLists: JSON.stringify(this.bbiCategoryParamList),
                }
                let ParametersValue = await this.$post("/admin/insertParameter", dataa);

                let datas ={
                    categoryId: this.parentId,
                    spuId : Spu.id,
                    specItem: JSON.stringify(this.specItems),
                }
                let specParamValue = await this.$post("/admin/insertParamValues", datas);

                // if (Spu.code == 200) {
                //     let spuId = Spu.id
                //         console.log(spuId,1111111111111111111111111111111)
                //     this.$router.push('/stock/resourceManagement/addGoodAttributes/'+ this.parentId+'/'+spuId)
                // }else if(res.code == '666'){
                //     this.$message.info("请先认证企业!")
                //     return;
                // }
                this.$router.push('/stock/resourceManagement')
            },
                retreats(){
                    this.$router.push('/stock/resourceManagement/returnClass/' + this.parentId)
                }
            },


    }


</script>

<style lang="scss" scoped>
    @import "../../assets/scss/common";
    .z-di-cc {
        padding-top: 5px;
        margin: 0 auto;
        height: 70px;
        width: 1100px;
    }

    .z-space-cc {
        height: 70px;
        margin: 0 auto;
        width: 75%;
    }
    .all{
        margin: 0 auto;
        width: 1100px;
        border: 1px solid #e4e4e4;
        display: flex;
    }
    .right{
        width: 180px;
        height: 100%;
        background: #fcfcfc;
        border-right: 1px solid #e4e4e4;
        z-index: 20;
    }

    .left{
        width: 920px;
        height: 100%;
        background: #ffffff;

    }
    .image{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 220px;
    }
    .image1{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 780px;
    }
    .image2{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 1550px;
    }
    .image3{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 1350px;
    }
    .image4{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 1100px;
    }

    .form{
        width: 500px;
        font-size: 12px;
        margin-left: 180px;
        padding-top: 80px;
    }

    .tables{
        margin: auto;
        width: 800px;
        padding-top: 30px;
    }
    .specifications{
        width: 800px;
        margin-left: 55px;
        margin-top: 50px;
    }

    .spec-wrapper{
        width: 800px;
        padding-left: 57px;
        .spec{
            display: flex;
        }
        .keys{
            display: flex;
            padding-left:70px;
            .el-input{
                width: 150px;

            }
        }
        .el-button_1{
            width: 85px;
            padding:8px 20px;
            border-radius: 2px;
        }
        .el-input{
            width: 200px;
            margin-bottom: 10px;
            margin-right:10px;
        }


    }

    .hx{
        width: 80%;
        margin-left: 50px;
        margin-top: 60px;
        border-top:1px solid #e4e4e4;
    }

    .up{
        margin-left: 210px;
        margin-top: 30px;
    }
    .bottoms{
        margin-left: 50px;
    }
    .el-form-item{
        font-size: 12px;
    }
    .photo{
        width: 150px;
        height: 170px;
        border: 1px solid #e4e4e4;
        margin-top: 25px;
    }
    .uploading{
        display: flex;
        margin-top: 20px;
        margin-left: 30px;
    }
    .content{
        width: 830px;
        height: 410px;
        margin: 0 auto;
    }



</style>