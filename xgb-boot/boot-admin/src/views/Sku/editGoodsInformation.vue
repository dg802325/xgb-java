<template>
    <div>
        <glob-breadcrumb title="填写商品信息"/>
        <br><br>
        <div class="z-di-cc">
            <div class="z-space-cc">
                <el-steps :space="340" :active="2" finish-status="success" align-center>
                    <el-step title="选择商品分类"></el-step>
                    <el-step title="填写商品信息"></el-step>
                    <el-step title="填写商品属性"></el-step>
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
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">商品参数</p>
                </div>

                <div class="image">
                    <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                    <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">基本信息</p>
                </div>
            </div>

            <div class="left">
                <div class="form">
                    <el-form  ref="form" label-width="100px">
                        <el-form-item label="商品分类:" required>
                            <p style="float: left;font-size: 14px;color: #666666">{{threeCategory}}>{{oneCategory}}>{{twoCategory}}</p>
                            <p @click="editor" style="color: #1abc9c;">&nbsp;&nbsp;编辑</p>
                        </el-form-item>
                        <el-form-item  label="商品名称:" required>
                            <el-input v-model="shpSkus.skuName" size="1" style="margin-top: -10px;width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <el-form-item  label="商品品牌:" required>
                        <el-select  v-model="shpSkus.brandId" style="width: 250px" placeholder="请选择">
                            <el-option
                                    v-for="item in options"
                                    :key="item.id"
                                    :label="item.brandName"
                                    :value="item.id">
                            </el-option>
                        </el-select>
                        </el-form-item>

                        <el-form-item  label="运费模板:" required>
                            <el-select  v-model="shpSkus.templateName" style="width: 250px" placeholder="请选择">
                                <el-option
                                        v-for="item in options"
                                        :key="item.id"
                                        :label="item.brandName"
                                        :value="item.id">
                                </el-option>
                            </el-select>
                        </el-form-item>


                        <el-form-item label="商品货号:" required>
                            <el-input v-model="shpSkus.skuNo" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>
                        <el-form-item label="商品价格:" required>
                            <el-input v-model="shpSkus.skuPrice" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>
                        <el-form-item label="商品毛重:" required>
                            <el-input v-model="shpSkus.weight" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <p style="padding-left: 100px;color: #999999">如果您不输入商品货号，系统将自动生成一个唯一的货号</p>

                        <el-form-item style="padding-top: 20px" label="商品介绍:" required>
                            <el-input type="textarea" style="width: 350px;padding-top: 10px" v-model="shpSkus.skuSharerDescribe" rows="6"
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

                        <div class="values" v-if="specs.specName" >
                            <div style="padding-left: 100px;padding-top:10px;display: inline-block" v-for="(values,indexs) in specs.keys" :key="indexs">
                                {{values.value}}：<el-input style="width: 180px" v-model="values.Parameters" />
                            </div>
                        </div>

                    </div>
                </div>
                </div>
                <div class="hx"></div>

                <div class="botton" >
                    <button class="up"  @click="retreat" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: white;color: #1abc9a;">上一步，选择商品分类</button>
                    <button type="primary" @click="saveCategory" class="bottoms" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: #1abc9a;color: white">下一步，填写商品属性</button>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
    export default {

        data() {
            return {
                templateName:'',
                price:'',
                parametersName:'',
                options: [],
                value: '',
                classify:'',
                shopGoods:'',
                skuName:'',
                skuNo:'',
                skuSharerDescribe:'',
                categoryList:[],
                paramName:[],
                category:[],
                bbiCategoryParamList:[
                ],
                specItems:[

                ],
                shpSkus:{},
                oneCategory: '',
                twoCategory: '',
                threeCategory:'',
                brandId:'',
                Values:[],
                SpecValues:[],
                paramsId:[],
                paramsIds:[],
                SpecparamValues:[],
            }



        },
        created() {
            this.parentId = this.$route.params.creatorId
            this.skuId = this.$route.params.id
        },
        mounted() {
           this.getCategory()
            this.selectBrand()
            this.getSkuInfo()
        },
        methods: {
            async getSkuInfo() {
                let Sku = await this.$get("/admin/getSkuShop", {id:this.skuId});
                this.shpSkus = Sku.item
                console.log(Sku)
            },

            async editor(){
                this.$router.push('/sku/addGoods/ReturnClass/' + this.parentId)
            },

            async selectBrand(){
                let resq = await this.$get("/admin/getBrandList")
                this.options = resq.list
                console.log(this.options)
            },

            async deleteRow(index, rows) {
                rows.splice(index, 1);
                console.log(index)
                let resa = await this.$get("/admin/getEditCategoryThree", {categoryId: this.parentId,id:this.parentId,Spceid:''})
                let res = await this.$post("/admin/remove_spec", {id: resa.bbiCategoryParamList[index].id})
                console.log(resa.bbiCategoryParamList[index].id)
                if (res.code == 200) {
                    this.$message.success(res.message);
                } else {
                    this.$message.error(res.message);
                }
            },

            async getCategory(){
                console.log(this.parentId)
                let resq = await this.$get("/admin/getCategory", {categoryId: this.parentId})
                this.oneCategory= resq.oneCategory.categoryName
                this.twoCategory = resq.twoCategory.categoryName
                this.threeCategory = resq.ThreeCategory.categoryName
                console.log(resq);
                var ids = []
                var ParamValue = []
                var SpecParamValue = []
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
                // ----------------------------
                const parma = ids.join()
                let resa = await this.$get("/admin/getEditCategoryspecparamThree", {Spceid:parma})
                    resa.bbiCategorySpecParamList.forEach(item =>{
                    let index  = this.findIndex(item.categorySpecId);
                    if(index>=0){
                        let paramName = JSON.parse(item.paramName);
                        this.specItems[index].keys = [...this.specItems[index].keys,...paramName]
                    }
                })
                console.log(this.specItems)
                this.specItems = JSON.parse(JSON.stringify(this.specItems))

                //编辑回显参数详细值
                for (let i = 0; i<this.bbiCategoryParamList.length;i++ ){
                    ParamValue[i] = this.bbiCategoryParamList[i].id
                }

                this.Values = ParamValue.join()
                let paramValue = await this.$get("/admin/getEditParamenterValue", {categoryParamId:this.Values})
                for (let i = 0; i<paramValue.ShpSkuParamValueList.length;i++ ){
                    this.paramsId[i] = paramValue.ShpSkuParamValueList[i].id
                }
                this.paramsIds = this.paramsId.join()
                paramValue.ShpSkuParamValueList.forEach(item =>{
                    let index  = this.findIndexs(item.categoryParamId);
                    if(index>=0){
                        this.bbiCategoryParamList[index].value = item.parametersName
                    }
                })

                this.bbiCategoryParamList = JSON.parse(JSON.stringify(this.bbiCategoryParamList))

                //编辑回显规格参数详细值
                for (let i = 0; i<this.specItems.length;i++ ){
                    SpecParamValue[i] = this.specItems[i].id
                }

                this.SpecValues = SpecParamValue.join()
                let SpecparamValue = await this.$get("/admin/getEditParamenterSpecValue", {categoryParamSpecId:this.SpecValues})
                SpecparamValue.ShpSkuParamSpecValueList.forEach(item =>{
                    let index  = this.findIndexSpec(item.categorySpecParamId);
                    if(index>=0){
                        let SpecparamName = JSON.parse(item.paramName);
                        this.specItems[index].keys = [...SpecparamName]
                    }
                })
                this.specItems = JSON.parse(JSON.stringify( this.specItems))
                let list = SpecparamValue.ShpSkuParamSpecValueList
                list.forEach(item=>{
                    this.SpecparamValues.push(item.id)
                })
                this.SpecparamValues = this.SpecparamValues.join()
            },

            findIndexSpec(id){
                for(let i=0;i<this.specItems.length;i++){
                    if(this.specItems[i].id===id){
                        return i;
                        continue;
                    }
                }
                return -1
            },

            findIndexs(id){
                for(let i=0;i<this.bbiCategoryParamList.length;i++){
                    if(this.bbiCategoryParamList[i].id===id){
                        return i;
                        continue;
                    }
                }
                return -1
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


            async saveCategory(){
                console.log(this.shpSkus)
                let data = {
                    skuPrice:this.shpSkus.skuPrice,
                    weight:this.shpSkus.weight,
                    brandId:this.shpSkus.brandId,
                    id:this.skuId,
                    creatorId: this.parentId,
                    classify: this.classify,
                    shopGoods: this.shopGoods,
                    skuName: this.shpSkus.skuName,
                    skuNo: this.shpSkus.skuNo,
                    value :this.value,
                    skuSharerDescribe: this.shpSkus.skuSharerDescribe,

                };
                if (!this.shpSkus.skuName){
                    this.$message.info("请输入商品名称!")
                    return;
                }
                if(!this.shpSkus.skuNo){
                    this.$message.info("请输入商品货号!")
                    return;
                }
                if(!this.shpSkus.skuSharerDescribe){
                    this.$message.info("请输入商品介绍!")
                    return;
                }
                console.log( this.parentId)
                let res = await this.$post("/admin/insertSku", data);

                let dataa ={
                    id:this.paramsIds,
                    bbiCategoryParamLists: JSON.stringify(this.bbiCategoryParamList),
                }
                let resa = await this.$post("/admin/insertParameters", dataa);
                console.log(resa)
                let datas ={
                    id:this.SpecparamValues,
                    categoryId: this.parentId,
                    skuId : this.skuId,
                    specItem: JSON.stringify(this.specItems),
                }

                let ress = await this.$post("/admin/insertParamValue", datas);

                console.log(ress)
                if (res.code == 200) {
                this.$router.push('/sku/addGoods/editAddGoodsAttribute/'+ this.parentId+'/'+this.skuId)
                    console.log(this.parentId)
                }
            },

            async retreat(){
                this.$router.push('/sku/addGoods/ReturnClass/' + this.parentId)
                // this.$router.push('editAddGoodsInformation' + this.parentId+this.skuId)
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
        height: 250px;
        padding-top: 32px;
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
        margin: auto;
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