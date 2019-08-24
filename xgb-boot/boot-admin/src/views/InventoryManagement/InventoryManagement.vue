<template>
    <div>
        <glob-breadcrumb title="库存管理">
            <div>
                <el-button @click="reload"  size="mini">刷新</el-button>
            </div>
        </glob-breadcrumb>
        <br><br>
        <div class="all">
            <div class="left">
                <div class="titles">
                    <i class="el-icon-s-grid" style="padding-left: 20px"></i>
                    仓库
                </div>
                <div class="app">
                <el-tree :data="data"  :props="children" highlight-current default-expand-all node-key="id" current-node-key="1" @node-click="handleNodeClick"></el-tree>
                </div>
            </div>


            <div class="container" style="width: 100%;padding-left: 20px">
            <div class="v-cart-title">
                <div class="title">
                    <i class="el-icon-s-grid"></i>
                    数据列表
                </div>
                <div>
                    <el-button @click="add" style="width: 81px;height: 30px;text-align:center;padding:0px;vertical-align:middle ;line-height:22px;margin:0px;">入库</el-button>
                    &nbsp;
                    <el-button @click="to" style="width: 81px;height: 30px;text-align:center;padding:0px;vertical-align:middle ;line-height:22px;margin:0px;">出库</el-button>
                </div>
            </div>
                <div class="table_border">
                    <el-table
                            ref="multipleTable"
                            :data="spuStoreList"
                            border
                            style="width: 100%">
                        <el-table-column prop="spuNo" align="center" label="货号"></el-table-column>
                        <el-table-column prop="spuName" align="center" label="商品名称" width="160px"></el-table-column>
                        <el-table-column prop="storehouseName" align="center" label="仓库"></el-table-column>
                        <el-table-column prop="qty" align="center" label="数量" width="160px"></el-table-column>
                        <el-table-column prop="auxiliaryUnit" align="center" label="单位" width="160px"></el-table-column>
                    </el-table>
                </div>

            <div class="v-cart-bottom" style = "border-top: none">
                <div>
                </div>
                <el-pagination
                        @current-change="handleCurrentChange"
                        :pager-count="7"
                        layout="total, prev, pager, next,jumper"
                        :total="pagination.count"
                        :page-count="pagination.pages"
                        :current-page="pagination.pageNumber"
                ></el-pagination>
                </div>
<!--其它入库-->
                <div v-if="bulletBox==true" class="window">
                    <div class="title" style="width: 400px;height: 50px;background: #F2F2F2;line-height: 50px"><span style="font-size: 15px;margin-left: 20px">入库</span></div>
                    <div class="alls">
                            <table class="left-table2">
                                <tbody>
                                <tr>
                                    <td>物资名称</td>
                                    <td>
                                        <el-select  v-model="spuId" @change="Units" style=" margin-left:10px;width: 170px" splaceholder="选择商品">
                                            <el-option
                                                    v-for="item in spuList"
                                                    :key="item.id"
                                                    :label="item.spuName"
                                                    :value="item.id">
                                            </el-option>
                                        </el-select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>仓库</td>
                                    <td>
                                        <el-select  v-model="inventoryId" style=" margin-left:10px;width: 170px" placeholder="选择仓库">
                                            <el-option
                                                    v-for="item in InventoryList"
                                                    :key="item.id"
                                                    :label="item.storehouseName"
                                                    :value="item.id">
                                            </el-option>
                                        </el-select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>入库数量</td>
                                    <td><el-input style="width: 170px;margin-left: 10px" v-model="qty"/> {{Unit}}</td>
                                </tr>
                                <tr>
                                    <td>辅助单位</td>
                                    <td>
                                        <el-input disabled="" v-model="auxiliaryQtys" style="margin-left:10px;width: 170px" placeholder="单位"></el-input>&nbsp;{{auxiliaryUnit}}
                                    </td>
                                </tr>

                                <tr>
                                    <td style="height: 100px;">备注</td>
                                    <td><el-input
                                            type="textarea"
                                            :rows = "4"
                                            style="width: 170px; margin-left: 10px"
                                            v-model="explain"/>

                                    </td>
                                </tr>
                                </tbody>
                            </table>
                    </div>
                    <div class="anNiu">
                        <el-button class="addCancel" style="width: 80px;height: 35px;padding-top: 10px" @click="close">取 消</el-button>
                        <el-button class="addSuccess" style="width: 80px;height: 35px;padding-top: 10px;background-color: #1abc9c;color: white" @click="saveBbiContract">确 定</el-button>
                    </div>
                </div>
<!--其它出库-->
                <div class="mask" v-if="bulletBoxto==true">
                    <div  class="windows">
                        <div class="title" style="width: 400px;height: 50px;background: #F2F2F2;line-height: 50px"><span style="font-size: 15px;margin-left: 20px">出库</span></div>
                        <div class="alls">
                            <table class="left-table2">
                                <tbody>
                                <tr>
                                    <td>物资名称</td>
                                    <td>
                                        <el-select  v-model="spuId" @change="skuIdChange" style=" margin-left:10px;width: 170px" filterable="true" placeholder="选择物资">
                                            <template v-for="item in wareHouseTo">
                                                <el-option
                                                        :label="item.spuName"
                                                        :value="item.spuId">
                                                </el-option>
                                            </template>
                                        </el-select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>仓库</td>
                                    <td>
                                        <el-select  v-model="storehouseIdTo" style=" margin-left:10px;width: 170px" placeholder="选择仓库">
                                            <template v-for="item in storeList">
                                                <el-option
                                                        :label="item.storehouseName"
                                                        :value="item.storehouseId">
                                                </el-option>
                                            </template>
                                        </el-select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>出库数量</td>
                                    <td><el-input style="width: 170px;margin-left: 10px" v-model="qty"/></td>
                                </tr>
                                <tr>
                                    <td>单位</td>
                                    <td>
                                        <el-input disabled="" v-model="Unit" style="margin-left:10px;width: 170px" placeholder="单位"></el-input>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 100px;">备注</td>
                                    <td><el-input
                                            type="textarea"
                                            :rows = "4"
                                            style="width: 170px; margin-left: 10px"
                                            v-model="explain"/>

                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="anNiu">
                            <el-button class="cancel" style="width: 80px;height: 35px;padding-top: 10px"  @click="closeTo">取 消</el-button>
                            <el-button class="addSuccess" style="width: 80px;height: 35px;padding-top: 10px;background-color: #1abc9c;color: white" @click="saveToInventory">确 定</el-button>
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </div>
</template>

<script >

    export default {
        name: 'dashboard',
        data() {
            return {
                auxiliaryUnit: '',
                conversionUnits: [],
                auxiliaryQty: '',
                auxiliaryUnits: '',
                auxiliaryQtys: '',
                mainUnit: '',
                storeList: [],
                wareHouseTo: [],
                spuList: [],
                spuStoreList: [],
                explain: '',
                storeHouseId: '',
                qty: '',
                bulletBox: false,
                bulletBoxto: false,
                bulletBoxMove: false,
                spuId: '',
                data: [],
                inventoryId: '',
                InventoryList: [],
                storehouseName: '',
                Unit: '',
                spuMetering: {},
                storehouseIdTo: '',
                pagination: {
                    count: 0,
                    pageNumber: 0,
                    pageSize: 0,
                    pages: 1
                },
                children: {
                    children: "children",
                    label: "storehouseName"
                }
            }
        },

        //查询所有仓库
        async created() {
            this.requestSearch()
            let dataSetName = await this.$get('/admin/getErpStorehouseName')
            this.InventoryList = dataSetName.dataSet;
            this.data = [
                {
                    id: '1',
                    storehouseName: "全部仓库",
                    children: dataSetName.dataSet
                }
            ]
        },
        watch: {
            qty(val) {
                let auxiliaryQty = val * (this.auxiliaryQty)
                this.auxiliaryQtys = auxiliaryQty
            }
        },
        methods: {
            //获取商品单位
            async Units() {
                let num =''
                let auxiliaryUnit = ''
                let auxiliaryUnits = ''
                let mainUnit = ''
                let data = {
                    id: this.spuId,
                }
                let dataSetName = await this.$get('/admin/getSpuId', data)
                let conversionUnits = dataSetName.ConversionUnit
                for (let i=0;i<conversionUnits.length;i++){
                    num = conversionUnits[i].conversionUnit
                    auxiliaryUnit = conversionUnits[i].dictName
                    auxiliaryUnits = conversionUnits[i].unit
                    mainUnit = conversionUnits[i].metering
                }
                this.auxiliaryUnit = auxiliaryUnit
                this.auxiliaryQty = num;
                this.auxiliaryUnits = auxiliaryUnits
                this.mainUnit = mainUnit
                this.Unit = dataSetName.item.dictName
            },

            async reload() {
                this.storeHouseId = ''
                this.requestSearch()
                let dataSetName = await this.$get('/admin/getErpStorehouseName')
                this.InventoryList = dataSetName.dataSet;
                this.data = [
                    {
                        storehouseName: "全部仓库",
                        children: dataSetName.dataSet
                    }
                ]

            },
            //分页查询各个仓库物资
            async handleNodeClick({id}) {
                id = id === '1' ? '' : id
                this.storeHouseId = id
                this.requestSearch();
            },
            handleCurrentChange(page) {
                this.requestSearch(page)
            },
            async requestSearch(page) {
                let currentPage = page || 1;
                let data = {
                    storehouseId: this.storeHouseId,
                    size: this.size == '' ? '10' : this.size,
                    isDel: 0,
                    currentPage,
                }
                let res = await this.$get("/admin/getWarehouseForPage", data)
                console.log(res)
                if (res.code == 200) {
                    let page = res.dataSet
                    let dataSet = page.list
                    this.spuStoreList = dataSet;
                    this.pagination = {
                        count: page.count,
                        pageNumber: page.pageNumber,
                        pageSize: page.pageSize,
                        pages: page.pages
                    }
                }
            },

            //入库查询所有物资
            async add() {
                this.bulletBox = true
                let res = await this.$get('/admin/getSpuList')
                this.spuList = res.SpuList
                console.log(res)
            },

            //入库确定
            async saveBbiContract() {
                let data = {
                    spuId: this.spuId,
                    storehouseId: this.inventoryId,
                    qty : this.auxiliaryQtys,
                    mainQty : this.qty,
                    mainUnit :this.mainUnit,
                    unit : this.auxiliaryUnits,
                    spuExplain: this.explain,
                }
                let res = await this.$post('/admin/insertStorage', data)
                console.log(res)
                if (res.code == 200) {
                    this.requestSearch();
                    this.bulletBox = false;
                    this.spuId = ''
                    this.inventoryId = ''
                    this.explain = ''
                    this.qty = ''
                    this.Unit = ''
                }

            },

            //出库选择
            async to() {
                this.bulletBoxto = true;
                //选择出库商品
                let data = {
                    storehouseId: this.storeHouseId,
                    spuId: this.spuId
                }
                let res = await this.$get("/admin/getWarehouseTo", data)
                if (res.code === '200') {
                    let dataSet = {};
                    res.dataSet.forEach(spu => {
                        dataSet[spu.spuId] = spu
                    });
                    let _dataSet = []
                    for (let key in dataSet) {
                        _dataSet.push(dataSet[key])
                    }

                    this.wareHouseTo = _dataSet
                }
            },

            //选择出库商品仓库
            async skuIdChange(val) {
                let data = {
                    id: this.spuId,
                }
                let dataSetName = await this.$get('/admin/getSpuId', data)
                let auxiliaryUnit =''
                let conversionUnits = dataSetName.ConversionUnit
                for (let i=0;i<conversionUnits.length;i++){
                    auxiliaryUnit = conversionUnits[i].dictName
                }
                this.Unit = auxiliaryUnit
                // this.Unit = dataSetName.item.dictName
                let dataStore = {
                    spuId: val
                }
                let resStore = await this.$get("/admin/getStoreTo", dataStore)
                this.storeList = resStore.dataSet
            },

            //出库确定
            async saveToInventory() {
                let data = {
                    spuId: this.spuId,
                    storehouseId: this.storehouseIdTo,
                    qty: this.qty,
                    spuExplain: this.explain,
                    unit: this.Unit
                }
                let res = await this.$post('/admin/deleteWarehouseTo', data)
                console.log(res)
                if (res.code == 200) {
                    this.requestSearch();
                    this.bulletBoxto = false;
                    this.spuId = ''
                    this.storehouseIdTo = ''
                    this.explain = ''
                    this.qty = ''
                    this.Unit = ''
                }
            },
            close() {
                this.bulletBox = false
                this.requestSearch();
                this.bulletBox = false;
                this.spuId = ''
                this.inventoryId = ''
                this.explain = ''
                this.qty = ''
                this.Unit = ''
            },
            closeTo() {
                this.bulletBoxto = false;
                this.requestSearch();
                this.bulletBoxto = false;
                this.spuId = ''
                this.storehouseIdTo = ''
                this.explain = ''
                this.qty = ''
                this.Unit = ''
            },
            addStorehouse() {
                this.$router.push('/insertStorehouse')
            },
        }
    }
</script>

<style lang="scss" scoped>
    @import url("//unpkg.com/element-ui@2.10.1/lib/theme-chalk/index.css");
    .el-table--enable-row-transition .el-table__body td {
        height: 40px;
    }

    .all{
        z-index: 10;
        width: 1100px;
        height: 800px;
        margin: auto;
        display: flex;
        .left{
            border-width: 1px;
            border-style: solid;
            border-color: rgba(228, 228, 228, 1);
            border-radius: 0px;
            .titles{
                width: 255px;
                height: 50px;
                font-size: 12px;
                line-height: 50px;
                background-color: #f3f3f3;
                border-width: 0px;
                border-bottom: 1px;
                border-style: solid;
                border-color: rgba(228, 228, 228, 1);
                border-radius: 0px;
            }
            width: 257px;
            height: 793px;
            background: inherit;
            background-color: rgba(253, 253, 254, 1);
            box-sizing: border-box;
            border-color: rgba(228, 228, 228, 1);
        }
        .app{
            width: 200px;
            height: 80px;
            padding-left: 15px;
            padding-top: 15px;
        }
    }
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
    .window{
        z-index: 35;
        width: 400px;
        height: 400px;
        background: white;
        position: absolute;
        top: 100px;
        left: 700px;
        border: 1px solid #e4e4e4;
    }
    .mask{
        /*position: fixed;*/
        /*left: 0;*/
        /*top:0;*/
        /*right: 0;*/
        /*bottom: 0;*/
        /*background: rgba(0,0,0,0.5);*/
        /*z-index:20;*/
    }
    .windows{
        z-index: 25;
        width: 400px;
        height: 400px;
        background: white;
        position: absolute;
        top: 100px;
        left: 700px;
        border: 1px solid #e4e4e4;
    }
    .alls{
        margin: auto;
        margin-top: 10px;
        width: 350px;
        height: 285px;
    }
    .el-table--fit {
        border-left: none;
        border-right: none;
        border-bottom: none;
    }
    .left-table2 {
        width: 100%;
        height: 180px;
    }

    .left-table2 td {
        height: 45px;
        width: 300px;
        padding-left: 10px;
        vertical-align: middle;
        border: 1px #e4e4e4 solid;
        color: #000000;
        font-size: 12px;
        background: #fff;
    }

    .left-table2 td:first-child {
        padding-right: 15px;
        width: 120px;
        text-align: right;
        background: #f9fafc;
    }
    .left-table2 td:nth-child(3) {
        padding-right: 15px;
        width: 123px;
        text-align: right;
        background: #f9fafc;
    }
    .anNiu{
        padding-top: 10px;
        padding-left: 205px;
    }
</style>
