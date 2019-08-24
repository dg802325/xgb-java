<template>
    <div>
        <glob-breadcrumb title="填写物资信息"/>
        <br><br>
        <div class="z-di-cc">
            <div class="z-space-cc">
                <el-steps :space="340" :active="2" finish-status="success" align-center>
                    <el-step title="选择物资分类"></el-step>
                    <el-step title="填写物资信息"></el-step>
                    <el-step title="填写物资属性"></el-step>
                </el-steps>
            </div>
        </div>

        <div class="all">
            <div class="right">
                <div class="image2">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">详细规格</p>
                </div>

                <div class="image1">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">物资参数</p>
                </div>

                <div class="image">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">基本信息</p>
                </div>
            </div>

            <div class="left">
                <div class="form">
                    <el-form  ref="form" label-width="100px">
                        <el-form-item label="物资分类:" required>
                            <p style="float: left;font-size: 14px;color: #666666">{{threeCategory}}>{{oneCategory}}>{{twoCategory}}</p>
                            <p @click="editor" style="color: #1abc9c;">&nbsp;&nbsp;编辑</p>
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
                        <el-form-item label="物资货号:" required>
                            <el-input v-model="shpSpu.spuNo" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>
                        <el-form-item label="物资毛重:" required>
                            <el-input v-model="shpSpu.weight" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>
                        <el-form-item label="计量单位:" required>
                            <el-select  v-model="Unit" style="width: 250px" placeholder="请选择">
                                <el-option label="吨" :value="1"></el-option>
                                <el-option label="袋"  :value="2"></el-option>
                            </el-select>
                        </el-form-item>
                        <p style="padding-left: 100px;color: #999999">如果您不输入商品货号，系统将自动生成一个唯一的货号</p>
                        <el-form-item style="padding-top: 20px" label="物资介绍:" required>
                            <el-input type="textarea" style="width: 350px;padding-top: 10px" v-model="shpSpu.spuSharerDescribe" rows="6"
                                      resize="none"></el-input>
                        </el-form-item>
                    </el-form>
                </div>

                <!--录入参数-->
                <div class="tables">
                    <el-table
                            :data="bbiCategoryParamList"
                            border
                            style="width: 100%">
                        <el-table-column fixed prop="paramName" label="参数类型" width="200px"></el-table-column>

                        <el-table-column label="录入参数" width="350px">
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
                <div class="alls" style="padding-top: 40px;color: #606266">
                    <div class="spec-wrapper" v-if="specItems.length" v-for="(specs,i) in specItems" :key="i">
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
                <div class="hx"></div>

                <div class="botton" >
                    <button class="up"  @click="retreat" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: white;color: #1abc9a;">上一步，选择物资分类</button>
                    <button type="primary" @click="saveCategory" class="bottoms" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: #1abc9a;color: white">下一步，填写物资属性</button>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
    export default {

        data() {
            return {
                Unit:'',
                weight: '',
                spuMetering: '',
                brandId:'',
                options: [],
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
                shpSpu:{},

                oneCategory: '',
                twoCategory: '',
                threeCategory:'',
                spuId: ''
            }

        },
        async mounted() {
            this.parentId = this.$route.params.parentId
            this.spuId = this.$route.params.spuId
            this.getSpuInfo()
            this.getParmesValue()
            await this.getCategory()
            this.selectBrand()
            this.getParmes();
        },
        methods: {
            // 基本信息
            async getSpuInfo() {
                let res = await this.$get("/admin/getCountySpu", {categoryId: this.spuId})
                this.shpSpu = res.category
                this.Unit = this.shpSpu.spuMetering
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
            async getParmes() {
                let res = await this.$get("/admin/getSpuParam" ,{spuId: this.spuId,categoryId:this.parentId})
                let paramList = res.paramList;
                let spuId = this.spuId;
                paramList.forEach(item=>{
                    item.spuId =  spuId
                    item.value =item.parametersName
                })
                console.log(paramList)
                this.bbiCategoryParamList = paramList
            },

            async editor(){
                this.$router.push('/AddShops/ReturnGoods/' + this.parentId)
            },

            async selectBrand(){
                let resq = await this.$get("/admin/getCountyEditCategorySpecParamThrees")
                this.options = resq.list
                // console.log(this.options)
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

            async saveCategory(){
                let data = {
                    weight: this.shpSpu.weight,
                    spuPrice: this.shpSpu.spuPrice,
                    spuMetering: this.Unit,
                    brandId:this.shpSpu.brandId,
                    id:this.spuId,
                    categoryId: this.parentId,
                    classify: this.classify,
                    shopGoods: this.shopGoods,
                    spuName: this.shpSpu.spuName,
                    spuNo: this.shpSpu.spuNo,
                    spuSharerDescribe: this.shpSpu.spuSharerDescribe,

                };
                if (!this.shpSpu.spuName){
                    this.$message.info("请输入物资名称!")
                    return;
                }
                if(!this.shpSpu.spuNo){
                    this.$message.info("请输入物资货号!")
                    return;
                }
                if(!this.shpSpu.spuSharerDescribe){
                    this.$message.info("请输入物资介绍!")
                    return;
                }
                let res = await this.$post("/admin/insertSpu", data);
                // console.log(res)
                let dataa ={
                    id: this.spuId,
                    bbiCategoryParamLists: JSON.stringify(this.bbiCategoryParamList),
                }
                let resa = await this.$post("/admin/insertCountyParameters", dataa);
                // console.log(resa)

                let datas ={
                    id: this.id,
                    specItem: JSON.stringify(this.specItems),
                }
                let ress = await this.$post("/admin/insertParamValues", datas);
                // console.log(ress)
                if (res.code == '200') {
                    this.$router.push('/stock/resourceManagement/addGoodAttributes/'+ this.parentId+'/'+this.spuId)
                    // console.log(this.parentId)
                }else {
                    this.$message.info("请先认证企业!")
                    return;
                }
            },

            async retreat(){
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
        height: 1200px;
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
        top: 710px;
    }
    .image2{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top: 980px;
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

</style>