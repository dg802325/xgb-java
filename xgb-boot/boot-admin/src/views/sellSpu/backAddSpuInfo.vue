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


                <div class="image1" v-if="paramList.length">
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
                        </el-form-item>
                        <el-form-item  label="商品货号:" required>
                            <el-input disabled v-model="spuList.spuNo" size="1" style="margin-top: -10px;width: 250px;height:40px"></el-input>
                        </el-form-item>
                        <el-form-item label="运费模板:" required>
                            <el-select v-model="skuShippingTemplate" style="width: 250px" placeholder="请选择">
                                <el-option
                                        v-for="item in templateList"
                                        :key="item.id"
                                        :label="item.templateName"
                                        :value="item.id">
                                </el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item  label="商品名称:" required>
                            <el-input  v-model="spuName" size="1" style="margin-top: -10px;width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <el-form-item label="商品价格:" required>
                            <el-input  v-model="spuPrice" size="1" style="width: 250px;height:40px"></el-input>
                        </el-form-item>
                        <el-form-item label="包装规格:" required>
                            <el-input  v-model="specification" size="1" style="width: 250px;height:40px">
                                <template slot="prepend">每{{dictNamefz}}</template>

                                <template slot="append">
                                    <el-select  v-model="skuMetering"  style="width: 60px" placeholder="请选择">
                                        <el-option
                                                v-for="item in DictList"
                                                :key="item.dictValue"
                                                :label="item.name"
                                                :value="item.dictValue">
                                        </el-option>
                                    </el-select>
                                </template>
                            </el-input>
                        </el-form-item>

<!--                        <el-form-item label="商品毛重:" required>-->
<!--                            <el-input  v-model="weight" size="1" style="width: 250px;height:40px"></el-input>-->
<!--&lt;!&ndash;                        </el-form-item>&ndash;&gt;-->
<!--                        <el-form-item v-if="ConversionUnit.length>0" label="计量单位:" required>-->
<!--                            <el-select  v-model="spuList.skuMetering"  style="width: 250px" placeholder="请选择">-->

<!--                                <el-option-->
<!--                                        v-for="item in ConversionUnit"-->
<!--                                        :key="item.value"-->
<!--                                        :label="item.label"-->
<!--                                        :value="item.value">-->
<!--                                </el-option>-->
<!--                            </el-select>-->
<!--                        </el-form-item>-->
<!--                        <el-form-item  v-if="ConversionUnit.length==0"  label="计量单位:" required>-->
<!--                            <el-input disabled v-model="spuList.dictNameSku" size="1" style="width: 250px;height:40px"></el-input>-->
<!--                        </el-form-item>-->
                        <el-form-item  label="商品品牌:" required>
                            <el-input disabled v-model="spuList.brandName" size="1" style="margin-top: -10px;width: 250px;height:40px"></el-input>
                        </el-form-item>

                        <el-form-item style="padding-top: 20px" label="商品介绍:" required>
                            <el-input  type="textarea" style="width: 350px;padding-top: 10px" v-model="skuSharerDescribe" rows="6"
                                      resize="none"></el-input>
                        </el-form-item>

                    </el-form>
                </div>

                <!--录入参数-->
                <div class="tables" style="padding-top: 35px "v-if="paramList.length">

                    <el-table
                            :data="paramList"
                            border
                            style="border-left: 1px solid #e4e4e4;width:100%">
                        <el-table-column fixed prop="paramName" label="参数类型" width="399px"></el-table-column>
                        <el-table-column fixed prop="parametersName" label="录入参数"  width="400px">
                        </el-table-column>
                    </el-table>
                </div>
                <!--录入规格参数-->
                <div class="allS" style="position:relative;" v-if="paramSpecList.length">
                    <div class="image2" v-if="paramSpecList.length">
                        <img style="width: 100%;height: 100%;z-index: 80" src="./image/u4013.png">
                        <p style="position: absolute;bottom: 17px;left: 40px;font-size: 16px;color: white">详细规格</p>
                    </div>
                    <div class="spec-wrapper"  v-for="(specs,i) in paramSpecList" :key="i">
                        <div>
                            <div class="spec">
                                {{specs.specName}}
                            </div>
                        </div>

                        <div class="values" v-if="paramSpecList.length" style="margin-top: -10px" v-for="(res,index) in JSON.parse(specs.paramName)" :key = "index">
                            <div style="padding-left: 50px;padding-top:20px;display: inline-block">
                                {{res.value}}：<el-input disabled="" style="width: 150px;padding-left: 10px" v-model="res.Parameters" />
                            </div>
                        </div>

                    </div>

                </div>

                <div class="hx"></div>

                <div class="botton">
                    <button class="up"  @click="retreats" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: white;color: #1abc9a;">上一步，选择商品分类</button>
                    <button type="primary" @click="saveCategory" class="bottoms" style="width: 180px;height: 35px;border:1px solid #1abc9a;background: #1abc9a;color: white">下一步，填写商品资源</button>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
    export default {

        data() {
            return {
                skuMetering:'',
                DictList:[],
                dictNamefz:'',
                weight:'',
                paramNameList:[],
                paramSpecList:[],
                paramList:[],
                spuList:{},
                spuNoId:'',
                spuNoList:[],
                skuWeight:'',
                templateName:'',
                price:'',
                brandId:'',
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
                oneCategory: '',
                twoCategory: '',
                threeCategory:'',
                spuName:'',
                spuPrice:'',
                templateList:'',
                templateId:'',
                skuShippingTemplate:'',
                ConversionUnit:[],
                specification:''
            }

        },
        created() {
            this.parentId = this.$route.params.threeCategoryId
            this.spuId =  this.$route.params.spuId
            this.id = this.$route.params.id
        },
        async mounted() {
            await this.selectTemplate()
            await this.getCategory()
            await this.spuInfo()
            await this.getDict()
        },
        methods: {
            //获取商品单位
            async getDict(){
                let res = await this.$get("/admin/getSpuDict");
                this.DictList = res.DictList
            },
            //查询所有的运费模板
            async selectTemplate(){
                let res = await this.$get('/supplier/getErpFreightTemplateForPages')
                this.templateList =res.dataSet
            },
            //回显商品详情
            async spuInfo(){
                let data = {
                    id : this.spuId
                }
                let res = await this.$get('/admin/getSupplierSkuId',data)
                let ConversionUnitMap = {};
                let ConversionUnit = [];
                res.ConversionUnit.forEach(item=>{
                    // ConversionUnitMap[item.metering]={
                    //     value:''+item.metering,
                    //     label: item.dictNames
                    // }
                    ConversionUnitMap[item.unit]={
                        value:""+item.unit,
                        label: item.dictName
                    }
                })
                for(let key in ConversionUnitMap){
                    let item = ConversionUnitMap[key];
                    ConversionUnit.push(item)
                }
                this.ConversionUnit = ConversionUnit
                let dictNames = ''
                this.ConversionUnit = res.ConversionUnit
                for (let i =0 ;i<this.ConversionUnit.length;i++){
                    dictNames = this.ConversionUnit[i].dictName
                }
                this.dictNamefz = dictNames
                this.spuList = res.item
                this.spuName = res.item.skuName
                this.spuPrice =  res.item.skuPrice
                this.weight = res.item.skuWeight
                this.skuMetering = res.item.skuMetering
                this.specification = res.item.specification
                this.skuSharerDescribe =  res.item.skuSharerDescribe
                this.skuShippingTemplate = res.item.skuShippingTemplate
                console.log(res.item.skuShippingTemplate)
                //商品参数回显
                let dataParam = {
                    categoryId:this.parentId,
                    spuId : this.spuId
                }
                let resParam = await this.$get('/admin/getSpuParam',dataParam)
                if(resParam.code ==200){
                    this.paramList = resParam.paramList
                }

                //商品规格参数回显
                let dataSpec = {
                    categoryId:this.parentId,
                    spuId : this.spuId
                }
                let resSpec = await this.$get('/admin/getSpuSpecParam',dataSpec)
                console.log(resSpec)
                //规格
                if(resSpec.code ==200){
                    this.paramSpecList = resSpec.paramSpecList
                }
            },
            //确定并上架商品
            async saveCategory(){
                let data = {
                    id : this.id,
                    skuName: this.spuName,
                    skuPrice : this.spuPrice,
                    weight:this.weight,
                    skuMetering :this.skuMetering,
                    skuSharerDescribe:this.skuSharerDescribe,
                    shippingTemplate:this.skuShippingTemplate,
                    specification:this.specification
                }
                let res = await this.$post('/admin/insertSkuSpuId',data)
                if(res.code==200){
                    // this.$router.push('/sku/skuResource/'+this.spuId+'/'+this.parentId+'/'+this.id);
                    this.$router.push('/Sku/selectFl/skuResource/'+this.parentId+'/'+this.spuId+'/'+this.id);
                }
            },
            //查询当前商品分类
            async getCategory(){
                let resq = await this.$get("/admin/getCategory", {categoryId: this.parentId})
                this.oneCategory= resq.oneCategory.categoryName
                this.twoCategory = resq.twoCategory.categoryName
                this.threeCategory = resq.ThreeCategory.categoryName
            },
            retreats(){
                // this.$router.push('/sku/addGoods/ReturnClass/' + this.parentId)
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
        margin: 0 auto;
        height: 70px;
        width: 75%;
    }
    .all{
        margin: 0 auto;
        width: 1100px;
        height: 1400px;
        border: 1px solid #e4e4e4;
        display: flex;
    }
    .right{
        width: 200px;
        height: 100%;
        background: #fcfcfc;
        border-right: 1px solid #e4e4e4;
        z-index: 20;
    }

    .left{
        width: 1020px;
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
        top: 835px;
    }
    .image2{
        width: 200px;
        height: 50px;
        z-index: 99;
        position: absolute;
        top:0;
        left:-241px;
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
        height: 270px;
    }
    .specifications{
        width: 800px;
        margin-left: 55px;
        margin-top: 50px;
    }

    .spec-wrapper{
        width: 400px;
        float: left;
        .el-input{
            width: 100px;
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
        .el-select{
            width: 100px;
        }

    }

    .allS{
        margin: auto;
        width: 800px;
        height: 200px;
    }




</style>