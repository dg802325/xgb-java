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
                            <el-form ref="form" label-width="300px;">
                                <div style="display: flex">
                                    <div class="v-transfer-wrapper"style="margin-top: 10px">
                                        <div class="title">
                                            选择省
                                        </div>
                                        <div class="v-transfer-item has-arrow">
                                            <ul>
                                                <li v-for="item in provinceList"
                                                    :key="item.id"
                                                    :class="{'active':provinceId===item.id}"
                                                    @click="provinceId = item.id"
                                                >{{item.divisionName}}
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div style="display: flex;padding:0 20px;align-items: center">
                                        <span>
                                            <img src="./images/u2017.png"/>
                                        </span>
                                    </div>

                                    <div class="v-transfer-wrapper" style="margin-top: 10px">
                                        <div class="title">
                                            选择市
                                        </div>
                                        <div class="v-transfer-item has-arrow">
                                            <ul>
                                                <li v-for="item in cityList"
                                                    :key="item.id"
                                                    :class="{'active':cityId===item.id}"
                                                    @click="cityId = item.id"
                                                >{{item.divisionName}}
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div style="display: flex;padding:0 20px;align-items: center">
                                        <span>
                                            <img src="./images/u2017.png"/>
                                        </span>
                                    </div>

                                    <div class="v-transfer-wrapper"style="margin-top: 10px">
                                        <div class="title">
                                            选择区
                                        </div>
                                        <div class="v-transfer-item has-arrow">
                                            <ul>
                                                <li v-for="item in areaList"
                                                    :key="item.id"
                                                    :class="{'active':areaId===item.id}"
                                                    @click="areaId=item.id"
                                                >{{item.divisionName}}
                                                </li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div style="display: flex;padding:0 20px;align-items: center">
                                        <span>
                                            <img src="./images/u2017.png"/>
                                        </span>
                                    </div>
                                    <div class="v-transfer-wrapper"style="margin-top: 10px">
                                        <div class="title">
                                            选择村
                                        </div>
                                        <div class="v-transfer-item">
                                            <ul>
                                                <li v-for="item in villageList"
                                                    :key="item.id"
                                                    :class="{'active':villageId===item.id}"
                                                    @click="villageId=item.id"
                                                >{{item.divisionName}}
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </el-form>
                        </div>
                    </div>
                    <p style="padding-top:25px;min-height:16px;padding-left:240px;color: rgb(153, 153, 153);">
                        <span>您当前的选择是：<span style="color: rgb(240, 72, 68);">{{provinceId | formatData(jsonMap)}} > {{cityId | formatData(jsonMap)}} > {{areaId | formatData(jsonMap)}} > {{villageId | formatData(jsonMap)}} </span></span>
                    </p>
                    <div class="c-bottom">
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
                provinceList: [],
                cityList: [],
                areaList: [],
                villageList:[],
                provinceId: '',
                cityId: '',
                areaId:'',
                villageId:'',
                jsonMap: {}
            }
        },
        watch: {
            provinceId() {
                this.getCityList()
            },
            cityId(){
                this.getAreaList()
            },
            areaId(){
                this.getVillageList()
            }
        },
        created() {
            this.getProvinceList()

        },

        methods: {

            //查询省
            async getProvinceList() {
                let res = await this.$get("/admin/getProvinceList")
                this.provinceList = res.lists
                res.lists.forEach(item => {
                    this.jsonMap[item.id] = item.divisionName
                })
            },
            //查询市
            async getCityList() {
                let res = await this.$get("/admin/getCityList", {parentId: this.provinceId})
                this.cityList = res.lists
                res.lists.forEach(item => {
                    this.jsonMap[item.id] = item.divisionName
                })
            },
            //查询区
            async getAreaList(id){
                let res = await this.$get("/admin/getAreaList", {parentId:this.cityId})
                this.areaList = res.lists
                res.lists.forEach(item => {
                    this.jsonMap[item.id] = item.divisionName
                })

            },
            //查询村
            async getVillageList(id){
                let res = await this.$get("/admin/getVillageList", {parentId:this.areaId})
                this.villageList = res.lists
                res.lists.forEach(item => {
                    this.jsonMap[item.id] = item.divisionName
                })

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

    .c-bottom {
        width: 100%;
        height: auto;
        border-bottom: 1px #e4e4e4 solid;
        margin-top: 20px;
        display: flex;
        padding-bottom: 20px;
    }

</style>