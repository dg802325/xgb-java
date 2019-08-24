<template>
    <div>
        <glob-breadcrumb title="选择商品分类"/>
        <br><br>
        <div class="z-di-cc">
            <div class="z-space-cc">
                <el-steps :space="340" :active="1" finish-status="success" align-center>
                    <el-step title="选择商品分类"></el-step>
                    <el-step title="填写商品信息"></el-step>
                    <el-step title="填写商品属性"></el-step>
                </el-steps>
            </div>
        </div>
        <!--内容-->
        <div class="content-cc container">
            <!--左侧栏-->
            <div class="content_lcc">
                <div class="bgimg">
                    <img src="./image/u4013.png" class="imgs"/>
                    <p class="essential">选择分类</p>
                </div>
            </div>
            <!--右侧栏-->
            <div class="content_r">
                <div class="center_r_t">
                    <div class="top">
                        <!--专题标题-->
                        <div class="zt_title">
                            <el-form ref="form" label-width="200px">
                                <div style="display: flex">
                                    <div class="v-transfer-wrapper"style="margin-top: 50px">
                                        <div class="title">
                                            选择一级分类
                                        </div>
                                        <div class="v-transfer-item has-arrow">
                                            <ul>
                                                <li v-for="item in categoryList"
                                                    :key="item.id"
                                                    :class="{'active':oneCategoryId===item.id}"
                                                    @click="oneCategoryId = item.id"
                                                >{{item.categoryName}}
                                                </li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div style="display: flex;padding:0 20px;align-items: center">
                                        <span>
                                            <img src="./image/u2017.png"/>
                                        </span>
                                    </div>

                                    <div class="v-transfer-wrapper" style="margin-top: 50px">
                                        <div class="title">
                                            选择二级分类
                                        </div>
                                        <div class="v-transfer-item">
                                            <ul>
                                                <li v-for="item in threeCategoryList"
                                                    :key="item.id"
                                                    :class="{'active':twoCategoryId===item.id}"
                                                    @click="twoCategoryId=item.id"
                                                >{{item.categoryName}}
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div style="display: flex;padding:0 20px;align-items: center">
                                        <span>
                                            <img src="./image/u2017.png"/>
                                        </span>
                                    </div>

                                    <div class="v-transfer-wrapper"style="margin-top: 50px">
                                        <div class="title">
                                            选择三级分类
                                        </div>
                                        <div class="v-transfer-item">
                                            <ul>
                                                <li v-for="item in twoCategoryList"
                                                    :key="item.id"
                                                    :class="{'active':threeCategoryId===item.id}"
                                                    @click="threeCategoryId=item.id"
                                                >{{item.categoryName}}
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                            </el-form>
                        </div>
                    </div>
                    <p style="padding-top:25px;min-height:16px;padding-left:115px;color: rgb(153, 153, 153);">
                        <span v-if="oneCategoryId">您当前选择的商品类别是：<span style="color: rgb(240, 72, 68);">{{oneCategoryId | formatData(jsonMap)}} > {{twoCategoryId | formatData(jsonMap)}} > {{threeCategoryId | formatData(jsonMap)}} </span></span>
                    </p>
                    <div class="c-bottom">
                    </div>
                    <div>
                        <el-button type="primary" size="15" @click="toWriteSkuInfo"
                                   style="margin-top: 35px;margin-left: 285px;width: 200px;background-color: #33d0b2">下一步, 填写商品信息
                        </el-button>
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
                parentId: '',
                themeTitle: '',
                oneCategoryId: '',
                twoCategoryId: '',
                threeCategoryId:'',
                threeCategoryList:[],
                id: '',
                specName: '',
                typeId: '',
                specValues: '',
                categoryList: [],
                twoCategoryList: [],
                value: [],
                options: [],
                jsonMap: {}
            }
        },
        watch: {
            oneCategoryId(id) {
                this.parentId = id;
                // this.twoCategoryId = ''
                // this.threeCategoryId= ''
                this.twoCategoryIdClick(id)
            },
            twoCategoryId(id) {
                this.parentId = id;
                // this.threeCategoryId= ''
                this.getTwoCategoryList(id)
            }
        },


        created() {
            this.categoryId = this.$route.params.parentId
            this.getCategoryList()
            this.getCategory()
        },

        methods: {

            //查询一级
            async getCategoryList() {
                let res = await this.$get("/admin/getCategoryList")
                this.categoryList = res
                console.log(this.categoryList)
                res.forEach(item => {
                    this.jsonMap[item.id] = item.categoryName
                })
            },

            async getCategory(){
                let res = await this.$get("/admin/getCategory", {categoryId: this.categoryId})
                this.oneCategoryId = res.ThreeCategory.id
                this.twoCategoryId = res.oneCategory.id
                this.threeCategoryId = res.twoCategory.id
                console.log(res)
            },

            //查询三级
            async getTwoCategoryList() {
                let res = await this.$get("/admin/getTwoCategoryList", {parentId: this.parentId})
                console.log(res)
                this.twoCategoryList = res
                res.forEach(item => {
                    this.jsonMap[item.id] = item.categoryName
                })

            },

            //查询二级
            async twoCategoryIdClick(id){
                // this.twoCategoryId = id;
                let res = await this.$get("/admin/getTwoCategoryList", {parentId:id})
                this.threeCategoryList = res
                console.log(this.threeCategoryList)
                res.forEach(item =>{
                    this.jsonMap[item.id] = item.categoryName
                })

            },
            async toWriteSkuInfo() {
                if (!this.threeCategoryId) {
                    this.$message.info("请选择三级分类!")
                    return;
                }
                let data = {
                    categoryOneId: this.oneCategoryId,
                    categoryTwoId: this.twoCategoryId,
                    categoryThreeId : this.threeCategoryId,
                }
                this.$router.push('/sku/addGoods/addGoodsInformation/' + this.threeCategoryId)
                console.log(this.threeCategoryId)
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

    .content_lcc {
        margin:0 auto;
        width: 17.5%;
        height: auto;
        justify-content: space-around;
        background: #fcfcfc;
        border-right: 1px rgba(228, 228, 228, 1) solid;
    }

    .bgimg {
        width: 100%;
        height: 15%;
        position: relative;
    }

    .imgs {
        width: 200px;
        height: 50px;
        position: absolute;
        top: 43px;
        left: 0px;
    }

    .essential {
        font-size: 16px;
        color: #fff;
        font-weight: 400;
        position: absolute;
        top: 61px;
        left: 64px;
    }

    .content_r {
        width: 90%;
        height: auto;
        justify-content: space-around;
    }

    .center_r_t {
        width: 90%;
        height: auto;
        margin: 0 auto;
        margin-top: 30px;
    }

    .top {
        width: 100%;
        height: auto;
        margin-top: 40px;
    }

    .c-bottom {
        width: 100%;
        height: auto;
        border-bottom: 1px #e4e4e4 solid;
        margin-top: 20px;
        display: flex;
        padding-bottom: 20px;
    }

    .z-di-cc {
        padding-top: 5px;
        margin: 0 auto;
        height: 70px;
        width: 1100px;
    }

    .z-space-cc {
        margin: 0 auto;
        width: 75%;
    }


</style>