<template>
    <div>
        <glob-breadcrumb title="编辑物资信息"/>
        <br><br>
        <div class="all">
            <div class="right">
                <div class="image3" v-if="bbiCategoryParamList.length>0">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">详细规格</p>
                </div>

                <div class="image4"  v-if="bbiCategoryParamList.length>0">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
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

            <div class="left">
                <div class="form">
                    <el-form  ref="form" label-width="100px">
                        <el-form-item label="物资分类:" required>
                            <p style="float: left;font-size: 14px;color: #666666">{{threeCategory}}>{{oneCategory}}>{{twoCategory}}</p>
                            <!--                            <p @click="editor" style="color: #1abc9c;">&nbsp;&nbsp;编辑</p>-->
                        </el-form-item>


                        <el-form-item  label="物资名称:" required>
                            <el-input v-model="shpSpu.spuName" size="1" style="margin-top: -10px;width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <el-form-item  label="物资品牌:" required>
                            <el-select  v-model="shpSpu.brandId" style="width: 250px" placeholder="请选择">
                                <el-option
                                        v-for="item in options"
                                        :key="item.id"
                                        :label="item.brandName"
                                        :value="item.id">
                                </el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item  label="物资单位:" required>
                            <el-select  v-model="shpSpu.spuMetering" @change="spuMeteringChange" style="width: 250px" placeholder="请选择">
                                <el-option
                                        v-for="item in DictList"
                                        :key="item.dictValue"
                                        :label="item.name"
                                        :value="item.dictValue">
                                </el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="物资货号:" required>
                            <el-input v-model="shpSpu.spuNo" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <el-form-item style="padding-top: 20px" label="物资介绍:" required>
                            <el-input type="textarea" style="width: 350px;padding-top: 10px" v-model="shpSpu.spuSharerDescribe" rows="6"
                                      resize="none"></el-input>
                        </el-form-item>
                    </el-form>
                </div>
                <div class="imageUpload" style="padding-top: 80px">
                <div class="photos" style="display: flex ">
                    <div class="photo" style="margin-left: 360px"align="center"  >
                        <img style=" width: 100%;height: 80%"
                             :src="fileUrl"
                             fit="contain"
                        >

                        <div style=" width: 100%;height: 20%;display: flex;line-height: 32px">
                            <p  v-if="this.fileUrl"><span class="red" style="margin-left: 20px;color: red">物资主图</span></p>
                            <!--                            <p  @click="setMain(index)" style="margin-left: 20px;color: #1abc9c"><span>设为主图</span></p>-->
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
                            :on-success="imageSuccess">

                        <el-button style="width: 117px;height: 35px;background: #48c9b0;border: none;color: white;margin-left: 350px">上传图片</el-button>
                    </el-upload>
                </div>
                </div>
                <!--录入参数-->
                <div class="tables" v-if="bbiCategoryParamList.length>0">
                    <el-table
                            :data="bbiCategoryParamList"
                            border
                            style="width: 100%">
                        <el-table-column fixed prop="paramName" label="参数类型" width="200px"align="center"></el-table-column>

                        <el-table-column label="录入参数" width="350px"align="center">
                            <template slot-scope="{row}">
                                <span v-if="row.paramName">
                                <el-input style="width:300px" v-model="row.value" />
                                </span>
                            </template>
                        </el-table-column>

                        <el-table-column fixed="right" label="操作" width="150px">
                            <template slot-scope="scope">
                                 <span v-if="scope.row.paramName">
                                <el-button @click.native.prevent="deleteRow(scope.$index, bbiCategoryParamList)" type="text" size="small">移除</el-button>
                                 </span>
                            </template>
                        </el-table-column>

                    </el-table>
                </div>
                <!--录入规格参数-->
                <div class="alls" v-if="specItems.length" style="padding-top: 200px;color: #606266">
                    <div class="spec-wrapper" v-for="(specs,i) in specItems" :key="i">
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

                <div class="tableDict" style="position:relative;width: 700px;padding-top: 110px;margin: auto">
                    <div class="image2"style="position: absolute;top:110px;left:-290px;">
                        <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                        <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">单位换算</p>
                    </div>
<!--                    <div>-->
<!--                        <el-button class="DictType" type="text" icon="el-icon-plus"  @click="addRow">添加</el-button>-->
<!--                    </div>-->
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
                <div slot="footer" class="dialog-footer" style="padding-top: 37px;float: right;padding-right: 110px">
                    <el-button class="el-button_2" type="primary" @click="saveUser">保存</el-button>
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

                Base_url: '',
                uploadFileList:[],
                fileUrl:'',
                categoryId:'',
                brandId:'',
                options: [],
                value: '',
                dictNames:'',
                spuName:'',
                spuNo:'',
                spuSharerDescribe:'',
                paramName:[],
                bbiCategoryParamList:[
                ],
                categoryTwoList:[],
                specItems:[
                ],
                spuMetering:'',
                DictList:[],
                list:[],
                shpSpu:{},
                jilMap:{},
                oneCategory: '',
                twoCategory: '',
                threeCategory:'',
                spuId: '',
                spuDict:'',
                feeList: [],


            }
        },
        async mounted() {
            this.parentId = this.$route.params.threeCategoryId
            this.spuId = this.$route.params.spuId
            this.Base_url = Base_url
            this.getCategoryTwoList()
            this.getDict()
            this.getSpuInfo()
            this.getParmesValue()
            await this.getCategory()
            this.selectBrand()
            this.getParmes();
            this.getUrl();
            this.getUnit();
        },
        methods: {
            handleRemove(index) {
                this.fileUrl = '';
            },
            fileChange(file, fileList) {
            },
            exceedMsg() {
                this.$message.error('最多上传5张图片')
            },
            imageSuccess(res) {
                // this.uploadFileList.push(res.fileUrl)
                this.fileUrl = res.fileUrl

            },

            //获取商品单位
            async getUrl(){
                let res = await this.$get("/admin/getResourceBySpuId",{id:this.spuId});

                let fileUrl=res[0].resourcesUrl
                this.fileUrl = fileUrl;

            },
            //获取商品单位
            async getDict(){
                let res = await this.$get("/admin/getSpuDict");
                this.DictList = res.DictList
                // this.jilMap = setDictMap(this.DictList,"dictValue","name")
            },

            //获取商品单位
            async getUnit(){
                let res = await this.$get("/admin/getSpuUnit",{id:this.spuId});
                res.forEach(item=>{
                    item.unit=item.unit+""
                    item.metering=item.metering+""
                })
                this.feeList=res

                // this.jilMap = setDictMap(this.DictList,"dictValue","name")

            },

            // 基本信息
            async getSpuInfo() {
                let res = await this.$get("/admin/getSpuId", {id: this.spuId})
                res.item.spuMetering = ''+res.item.spuMetering
                this.shpSpu = res.item
                this.spuDict = res.item.spuMetering
            },
            async getCategoryTwoList(categoryId) {

                let res = await this.$get("/admin/categoryAllTwoLists",{categoryId: this.spuId})
                this.categoryTwoList = res;},

            async selectBrand(){
                let resq = await this.$get("/admin/getBrandList")
                console.log(resq)
                if(resq.code==='200'){
                    this.options = resq.list
                }
            },

            // 详细规格回显
            async getParmesValue() {
                let res = await this.$get("/admin/getSpuSpecParam" ,{spuId: this.spuId,categoryId:this.parentId})
                // this.shpSpu = res.paramSpecList
                // this.specItems
                if(res.code==='200'){
                    let specItems = []
                    let paramSpecList = res.paramSpecList;
                    specItems  = paramSpecList.map(item=>({
                        specName: item.specName,
                        keys: JSON.parse(item.paramName)
                    }));
                    this.specItems =specItems;
                }

                console.log(res)
            },
            // 物资单位变化
            spuMeteringChange(){
                this.feeList.forEach(item=>{
                    item.metering = this.shpSpu.spuMetering
                })

            },

            async getParmes() {
                let res = await this.$get("/admin/getSpuParam" ,{spuId: this.spuId,categoryId:this.parentId})
                let paramList = res.paramList;
                let spuId = this.spuId;
                if(paramList){
                    paramList.forEach(item=>{
                        item.spuId =  spuId
                        item.value =item.parametersName
                    })
                }
                // paramList.forEach(item=>{
                //     item.spuId =  spuId
                //     item.value =item.parametersName
                // })
                if(paramList) {
                    this.bbiCategoryParamList = paramList
                }
            },

            // 物资参数
            async getCategory(){
                let resq = await this.$get("/admin/getCountyCategoryFl", {categoryId: this.parentId})
                // console.log(this.parentId)
                this.oneCategory= resq.oneCategory.categoryName
                this.twoCategory = resq.twoCategory.categoryName
                this.threeCategory = resq.ThreeCategory.categoryName
                // console.log(resq);
                var ids = []
                let res = await this.$get("/admin/getCountyEditCategoryThree", {categoryId: this.parentId,id:this.parentId,Spceid:''})
                this.category = res.bbiCategorySpceList
                // let bbiCategoryParamList =res.bbiCategoryParamList
                // for(let i=0;i<bbiCategoryParamList.length;i++){
                //     let item = bbiCategoryParamList[i];
                //     item['value'] = ''
                // }
                // this.bbiCategoryParamList = bbiCategoryParamList;
                res.bbiCategorySpceList.forEach(item=>{
                    item.keys = [];
                });
                // this.specItems  = res.bbiCategorySpceList;

                for (let i = 0; i<res.bbiCategorySpceList.length;i++ ){
                    ids[i] = res.bbiCategorySpceList[i].id
                }
                const parma = ids.join()
                // console.log(parma)
                let resa = await this.$get("/admin/getEditCategoryspecparamThree", {Spceid:parma})
                // console.log(resa)
                resa.bbiCategorySpecParamList.forEach(item =>{
                    let index  = this.findIndex(item.categorySpecId);
                    if(index>=0){
                        let paramName = JSON.parse(item.paramName);
                        this.specItems[index].keys = [...this.specItems[index].keys,...paramName]
                    }
                })
                // this.specItems = JSON.parse(JSON.stringify(this.specItems))
                // console.log(this.specItems)
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
            handleDelete(index) {
                this.feeList.splice(index, 1)
            },
            addRow() {
                this.feeList.push({
                    metering: this.shpSpu.spuMetering,
                    conversionUnit: '',
                    unit: '',

                })
            },

            async deleteRow(index, rows) {
                rows.splice(index, 1);
                // console.log(index)
                let resa = await this.$get("/admin/getCountyEditCategoryThree", {categoryId: this.parentId,id:this.parentId,Spceid:''})
                let res = await this.$post("/admin/removeCountyParam", {id: resa.bbiCategoryParamList[index].id})
                // console.log(resa.bbiCategoryParamList[index].id)
                if (res.code == 200) {
                    this.$message.success(res.message);
                } else {
                    this.$message.error(res.message);
                }
            },

            async saveUser(){
                let fileUrls = [];
                fileUrls.push(this.fileUrl)
                let data = {

                    oneCategory:this.oneCategory,
                    twoCategory:this.twoCategory,
                    threeCategory:this.threeCategory,
                    brandId:this.shpSpu.brandId,
                    id:this.spuId,
                    categoryId: this.parentId,
                    imgUrl:this.fileUrl,
                    // categoryId: this.shpSpu.categoryId,
                    // classify: this.classify,
                    // shopGoods: this.shopGoods,
                    weight: this.shpSpu.weight,
                    spuName: this.shpSpu.spuName,
                    spuNo: this.shpSpu.spuNo,
                    spuPrice:this.shpSpu.spuPrice,
                    spuMetering:this.shpSpu.spuMetering,
                    feeList: JSON.stringify(this.feeList),
                    shpSpuResources: JSON.stringify(fileUrls),
                    spuSharerDescribe: this.shpSpu.spuSharerDescribe,


                };

                let res = await this.$post("/admin/insertSpu", data);
                // console.log(res)
                if (res.code==200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.id=res.id
                }else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
                let dataa ={
                    id: this.spuId,
                    bbiCategoryParamLists: JSON.stringify(this.bbiCategoryParamList),
                }
                let resa = await this.$post("/admin/insertCountyParameters", dataa);
                // console.log(resa)
                let datas ={
                    specItem: JSON.stringify(this.specItems),
                }
                let ress = await this.$post("/admin/insertParamValues", datas);
                this.$router.push('/stock/resourceManagement')
            },

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
    .el-button_1{
        width: 85px;
        padding:8px 20px;
        border-radius: 2px;

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
        top: 750px;
    }
    .image2{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 1500px;
    }
    .image3{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 1200px;
    }
    .image4{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 900px;
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
        padding-top: 60px;
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
        margin: 0 auto;}
</style>