<template>
    <div>
        <div>
            <glob-breadcrumb title="编辑模板"/>
            <br><br>
        <div class="container">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    编辑运费模板
                </div>
            </div>
            <div class="content_b">
                <div class="content_b_tx">
                    <br/>
                    <div style="min-height: 702px;padding-left: 15px;padding-top: 39px">
                        <el-form ref="form" label-width="150px" class="el-form-item_1">
                            <!--            <el-form ref="form" label-width="100px">-->
                            <el-form-item label="模板名称：" required style="width: 570px">
                                <el-input v-model="shopFreightTemplate.templateName"></el-input>
                            </el-form-item>
                <el-form-item label="货物地址：" required>
                    <el-select
                        v-model="province"
                        placeholder="省份"
                        @change="setCity"
                        style="width:139px">




                        <el-option
                            v-for="item in pickupSiteMap.province"
                            :key="item.value"
                            :label="item.label"
                            :value="item.value">
                        </el-option>
                    </el-select>
                    <el-select
                        v-model="city"
                        placeholder="城市"
                        @change="setArea"
                        style="width:139px;margin:0 2px;"
                    >
                        <el-option
                            v-for="item in pickupSiteMap.city"
                            :key="item.value"
                            :label="item.label"
                            :value="item.value">
                        </el-option>
                    </el-select>
                    <el-select
                        v-model="address"
                        placeholder="区县"
                        style="width:140px"
                    >
                        <el-option
                            v-for="item in pickupSiteMap.area"
                            :key="item.value"
                            :label="item.label"
                            :value="item.value">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="是否包邮：" required>
                    <el-radio-group v-model="shopFreightTemplate.isFreeShipping">
                        <el-radio  :label="1">自定义运费</el-radio>
                        <el-radio  :label="2">卖家承担运费</el-radio>
                    </el-radio-group>
                </el-form-item>
                <el-form-item label="计价方式：" required>
                    <el-radio-group v-model="shopFreightTemplate.valuationMethod"@change="priceClick">
                        <el-radio :label="1"value="1">按件数</el-radio>
                        <el-radio :label="2"value="2">按重量</el-radio>
                        <el-radio :label="3"value="3">按体积</el-radio>
                    </el-radio-group>
                </el-form-item>
                <el-form-item label="运送方式：" required>
                    <div>
                        <el-form>
                            <div class="flex-center">
                                <el-form-item label="默认运费">
                                    <el-input v-model="shopFreightTemplate.kgWithin" style="width:100px"></el-input>
                                </el-form-item>
                                <el-form-item :label="compay">
                                    <el-input v-model="shopFreightTemplate.kgWithinAmount"
                                              style="width:100px"></el-input>
                                </el-form-item>
                                <el-form-item label="元,每增加">
                                    <el-input v-model="shopFreightTemplate.kgAdd" style="width:100px"></el-input>
                                </el-form-item>
                                <el-form-item :label="com">
                                    <el-input v-model="shopFreightTemplate.kgAddAmount" style="width:100px"></el-input>
                                </el-form-item>
                                <p>元</p>
                            </div>

                        </el-form>
                    </div>
                    <div>
                        <el-button style="margin-top:10px;" icon="el-icon-plus" type="text" @click="addRow">添加</el-button>
                    </div>
                    <div class="table_border" style="width: 700px;">
                    <el-table
                        :data="feeList"
                        border
                        style="width: 700px;">
                        <el-table-column
                            prop="name"
                            align="center"
                            label="运送到">
                            <template slot-scope="{row}">
                                <p class="ellipsis">
                                    <span v-for="(item,index) in row.list" v-if="index<3">{{item | formatData(cityNameMap)+"  "}}</span>
                                </p>
                            </template>
                        </el-table-column>
                        <el-table-column
                            align="center"
                            label="编辑">
                            <template slot-scope="{row}">
                                <el-button type="text" @click="handleClick(row)">编辑</el-button>
                            </template>
                        </el-table-column>
                        <el-table-column
                            align="center"
                            :label="con">
                            <template slot-scope="{row}">
                                <el-input v-model="row.firstPriority"/>
                            </template>
                        </el-table-column>
                        <el-table-column
                            align="center"
                            label="首费(元)">
                            <template slot-scope="{row}">
                                <el-input v-model="row.firstCharge"/>
                            </template>
                        </el-table-column>
                        <el-table-column
                            align="center"
                            :label="cog">
                            <template slot-scope="{row}">
                                <el-input v-model="row.continuousWeight"/>
                            </template>
                        </el-table-column>
                        <el-table-column
                            align="center"
                            label="续费(元)">
                            <template slot-scope="{row}">
                                <el-input v-model="row.renew"/>
                            </template>
                        </el-table-column>
                        <el-table-column
                            label="操作">
                            <template slot-scope="{$index}">
                                <el-button type="text" @click="handleDelete($index)">删除</el-button>
                            </template>
                        </el-table-column>
                    </el-table>
                    </div>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
            <el-button type="primary" @click="updateErpFreightTemplate">保 存</el-button>
        </span>
        </div>
        <delivery v-if="deliveryVisible" :nodes="nodes"  :deliveryVisible="deliveryVisible" @close="closeDeliveryEvent"
                  :defaultChecked="allCheckCitie"/>
                </div>
            </div>
        </div>
        </div>
    </div>

</template>
<script>
    import delivery from './delivery'
    import {setDictMap, dataFormat} from '../../utils/main.js'
    export default {
        data() {
            return {
                pickupSiteMap: { // 省市区集合
                    province: [],
                    city: [],
                    area: [],
                },
                province: '',
                city: '',
                divisionOptions: {
                    data: {
                        simpleData: {
                            idKey: "id",
                            pIdKey: "parentId",
                        },
                        key: {
                            name: "divisionName",
                            children: 'children'
                        }
                    }
                },
                id: '',
                allCheckCitie: [],
                templateName: '',
                kgWithin: '',
                kgWithinAmount: '',
                kgAdd: '',
                cog:'',
                con:'',
                com:'',
                compay:'',
                kgAddAmount: '',
                address: '',
                isFreeShipping: '',
                valuationMethod: 2,
                wharfEng: '',
                seaportId: '',
                deliveryVisible: false,
                feeList: [],
                shopFreightFeeList: [],
                cityMap: {},
                shopFreightTemplate: {},
                item: this.editItem,
                shen: {},
                shi: {},
                qu: {},
                nodesMap: {},
                nodes: [],
                cityNameMap: {}
            }
        },
        props: {
            seaportItem: Array,
            editVisible: Boolean
        },
        async created() {
            this.id = this.$route.params.id
            this.getErpFreightTemplate(this.id)
            this.getRegionLists()
        },
        methods: {
            async getRegionLists() {
                let cityNameMap = {}
                let nodesMap = {};
                let nodes = [];
                let defaultExpanded = []
                // 大区
                let res = await this.$get("/admin/getErpRegionListAll");
                res.forEach(item=>{
                    cityNameMap[item.id] = item.regionName;
                    item['divisionName'] = item.regionName;
                    nodesMap[item.id] = item;
                    defaultExpanded.push(item.id)
                    nodes.push(item);
                });
                // 省
                let regionList = await this.$get("/admin/getErpRegionList");
                regionList.forEach(item=>{
                    //defaultExpanded.push(item.id)
                    cityNameMap[item.id] = item.divisionName;
                    nodesMap[item.id] = item;
                    if(nodesMap[item.regionId]){
                        if(!nodesMap[item.regionId].children)  nodesMap[item.regionId].children = [];
                        nodesMap[item.regionId].children.push(item);
                    }
                });
                // this.defaultExpanded = defaultExpanded;
                let region = regionList.length ? regionList : [];
                let cityIds = region.map(item=>item.id);
                // 市
                let citysData = await this.$get("/admin/getErpRegionCityList",{
                    cityId: cityIds.join()
                });
                if(citysData.code==='200'){
                    citysData.cityList.forEach(item=>{
                        cityNameMap[item.id] = item.divisionName;
                        nodesMap[item.id] = item;
                        if(nodesMap[item.parentId]){
                            if(!nodesMap[item.parentId].children)  nodesMap[item.parentId].children = [];
                            nodesMap[item.parentId].children.push(item);
                        }
                    })
                    let areaIds = citysData.cityList.map(item=>item.id);
                    /*区县*/
                    let AreaData = await this.$post("/admin/getErpAreaList",{
                        cityId : areaIds.join()
                    });
                    console.log(111111111,AreaData)
                    if(AreaData.code==='200'){

                        AreaData.areaList.forEach(item=>{
                            cityNameMap[item.id] = item.divisionName;
                            nodesMap[item.id] = item;
                            if(nodesMap[item.parentId]){
                                if(!nodesMap[item.parentId].children)  nodesMap[item.parentId].children = [];
                                nodesMap[item.parentId].children.push(item);
                            }
                        })
                    }
                    this.nodesMap = nodesMap;
                    this.nodes = nodes;
                    this.cityNameMap = cityNameMap
                }
            },

            // async getRegionLists() {
            //     let cityMap = {
            //
            //     }
            //     // let res = await getRegionList();
            //     let res = await this.$get("/admin/getRegionList1")
            //     for (let i = 0; i < res.length; i++) {
            //         let item = res[i]
            //         cityMap[item.id] = item.regionName;
            //         for (let k = 0; k < item.divisionList.length; k++) {
            //             let el = item.divisionList[k];
            //             cityMap[el.id] = el.divisionName
            //         }
            //     }
            //     this.cityMap = cityMap;
            // },
            // 打开
            deliveryEvent(item) {
                this.editItem = item;
                this.allCheckCitie = editItem.list;
                this.deliveryVisible = true
            },
            // 监听关闭
            closeDeliveryEvent(code) {
                if (code) {
                    this.editItem.list = code;
                }
                this.feeList = JSON.parse(JSON.stringify(this.feeList));
                this.deliveryVisible = false
            },
            handleDelete(index) {
                this.feeList.splice(index, 1)
            },

            priceClick(value){
                console.log(value)
                if(value=='2'){
                    this.con='首重量(kg)'
                    this.compay= 'kg内'
                    this.com='kg,增加运费'
                    this.cog='续重量(kg)'
                }else if(value=='1'){
                    this.compay='件内'
                    this.com='件，增加运费'
                    this.con='首重量(件)'
                    this.cog='续重量(件)'
                }else if(value=='3'){
                    this.compay='m2内'
                    this.com='m2，增加运费'
                    this.con='首重量(m2)'
                    this.cog='续重量(m2)'
                }
            },
            async getErpFreightTemplate(id) {
                // let res = await getErpFreightTemplate(this.id);
                let res=await this.$get('/admin/edit_erpFreightTemplate',{id:id })
                // this.id = res.erpFreightTemplate.id
                if (res.code==200) {
                    this.shopFreightTemplate = res.erpFreightTemplate
                    if(this.shopFreightTemplate.valuationMethod=='2'){
                        this.con='首重量(kg)'
                        this.compay= 'kg内'
                        this.com='kg,增加运费'
                        this.cog='续重量(kg)'
                    }else if(this.shopFreightTemplate.valuationMethod=='1'){
                        this.compay='件内'
                        this.com='件，增加运费'
                        this.con='首重量(件)'
                        this.cog='续重量(件)'
                    }else if(this.shopFreightTemplate.valuationMethod=='3'){
                        this.compay='m2内'
                        this.com='m2，增加运费'
                        this.con='首重量(m2)'
                        this.cog='续重量(m2)'
                    }
                    this.shopFreightFeeList = res.erpFreightFeeList
                    this.shen = res.province
                    this.shi = res.city
                    this.qu = res.area
                    // this.feeList =res.gtshopFreightFeeList
                    let feeList = res.erpFreightFeeList;

                    for (let i = 0; i < feeList.length; i++) {
                        let item = feeList[i];
                        item.list = item.feeDivisionList.map(el => el.divisionId)
                    }
                    this.feeList = feeList;

                    this.getChinaDivision()
                }
            },
            addRow() {
                this.feeList.push({
                    list: [],
                    firstPriority: '',
                    firstCharge: '',
                    continuousWeight: '',
                    renew: ''
                })
            },
            handleClick(item) {
                this.editItem = item;
                this.allCheckCitie = item.list;
                // this.defaultChecked = item.list;
                this.deliveryVisible = true
            },
            // 设置市
            setCity(value) {
                this.pickupSiteMap.city = this.pickupSiteList[value].children;
                this.pickupSiteMap.area = [];
                this.city = '';
                this.address = '';
                ``
            },
            // 设置区
            setArea(value) {
                if (value !== "") {
                    this.pickupSiteMap.area = this.pickupSiteList[value].children;
                    this.address = '';
                }
            },
            // 获取国内城市
            async getChinaDivision() {
                let res = await this.$get("/admin/getChinaDivisionList",data)
                let data = dataFormat(this.divisionOptions, res);
                this.pickupSiteMap.province = data.list;
                this.pickupSiteList = data.map;
                this.setProvinceCity();
            },
            // 回显省市区
            setProvinceCity(fn, time) {
                if (!this.shen) {
                    return;
                }
                this.province = this.shen.id;
                this.setCity(this.shen.id)
                this.city = this.shi.id;
                this.setArea(this.shi.id)
                this.address = this.qu.id;
            },
            closeEvent() {
                this.$emit('closeEdit')
            },
            async updateErpFreightTemplate() {
                if (!this.shopFreightTemplate.address || this.shopFreightTemplate.address == null) {
                    this.$message.info("请选择货物地址!")
                    return;
                }
                if (!this.shopFreightTemplate.templateName) {
                    this.$message.info("请填写模板名称!")
                    return;
                }
                if (!this.shopFreightTemplate.kgWithin) {
                    this.$message.info("请填写默认运费!")
                    return;
                }
                if (!this.shopFreightTemplate.kgWithinAmount) {
                    this.$message.info("请填写默认运费!")
                    return;
                }
                let data = {
                    id: this.id,
                    templateName: this.shopFreightTemplate.templateName,
                    address: this.address,
                    isFreeShipping: this.shopFreightTemplate.isFreeShipping,
                    kgWithin: this.shopFreightTemplate.kgWithin,
                    kgWithinAmount: this.shopFreightTemplate.kgWithinAmount,
                    kgAdd: this.shopFreightTemplate.kgAdd,
                    kgAddAmount: this.shopFreightTemplate.kgAddAmount,
                    valuationMethod: this.shopFreightTemplate.valuationMethod,
                    feeList: JSON.stringify(this.feeList),
                };

                let res=await this.$post("/supplier/save_erpFreightTemplate",data)
                if (res.code == 200) {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'success'
                    });
                    this.$emit('editErpFreightTemplateSuccess')
                    this.$router.push("/system/template")
                } else {
                    this.$message({
                        showClose: true,
                        message: res.message,
                        type: 'error'
                    });
                }
            }
        },
        components: {
            delivery,
        }
    }
</script>

<style>
    .content_b {
        width: 1098px;
        height: auto;
        background-color: #fff;
        border: 1px #e4e4e4 solid;
    }
    .flex-center {
        display: flex;
        align-items: center;
    }

    .flex-center .el-form-item {
        margin: 0;
        display: flex;
        width: auto;
        align-items: center;
    }

    .flex-center .el-form-item .el-form-item__label {
        padding: 0 3px;
    }

    .ellipsis {
        width: 100px;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap;
    }
</style>

