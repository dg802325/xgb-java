<template>
    <div>
        <glob-breadcrumb title="选择配送区域"/>
        <br><br>
        <div class="z-di-cc">
            <div class="z-space-cc">
                <el-steps :space="340" :active="3" finish-status="success" align-center>
                    <el-step title="选择商品分类"></el-step>
                    <el-step title="填写商品信息"></el-step>
                    <el-step title="填写配送区域"></el-step>
                    <el-step title="填写商品属性"></el-step>
                </el-steps>
            </div>
        </div>
        <div class="container">
            <div class="all">
                <!--                <el-checkbox v-model="checkedAll"> 全选</el-checkbox>-->
                <el-tree
                        ref="treeWrapper"
                        :default-expanded-keys="defaultExpanded"
                        :data="nodes"
                        show-checkbox
                        node-key="id"
                        :props="defaultProps">
                </el-tree>

            </div>

            <span slot="footer" class="dialog-footer" style="padding-left: 380px">
            <el-button style="margin-top: 20px;margin-bottom: 30px;" type="primary" @click="back">上一步，填写商品信息</el-button>
            <el-button style="margin-top: 20px;margin-bottom: 30px;" type="primary" @click="saveSkuRegion">下一步，填写商品属性</el-button>
        </span>
        </div>
    </div>
</template>
<script>
    export default {
        data() {
            return {
                spuNoId: '',
                parentId: '',
                id: '',
                nodes: [],
                defaultExpanded: [],
                nodesMap: {},
                checkedAll: false,
                defaultProps: {
                    children: 'children',
                    label: 'divisionName'
                }
            }
        },
        async created() {
            this.spuNoId = this.$route.params.skuId
            this.parentId = this.$route.params.parentId
            this.id = this.$route.params.id
            this.getRegionLists();
        },
        watch: {
            //     checkedAll(val){
            //         if(val){
            //             // let ids = this.nodes.map(item=>item)
            //             this.$refs.treeWrapper.setCheckedNodes(this.nodes);
            //         }else{
            //             this.$refs.treeWrapper.setCheckedNodes([]);
            //         }
            //     }
        },
        methods: {
            checkChange(val){
                console.log(val)
            },
            async getRegionLists() {
                let nodesMap = {};
                let nodes = [];
                let defaultExpanded = []
                // 大区
                let res = await this.$get("/admin/getErpRegionListAll");
                res.forEach(item=>{
                    item['divisionName'] = item.regionName;
                    nodesMap[item.id] = item;
                    defaultExpanded.push(item.id)
                    nodes.push(item);
                });
                // 省
                let regionList = await this.$get("/admin/getErpRegionList");
                regionList.forEach(item=>{
                    //defaultExpanded.push(item.id)
                    nodesMap[item.id] = item;
                    if(nodesMap[item.regionId]){
                        if(!nodesMap[item.regionId].children)  nodesMap[item.regionId].children = [];
                        nodesMap[item.regionId].children.push(item);
                    }
                });
                this.defaultExpanded = defaultExpanded;
                let region = regionList.length ? regionList : [];
                let cityIds = region.map(item=>item.id);
                // 市
                let citysData = await this.$get("/admin/getErpRegionCityList",{
                    cityId: cityIds.join()
                });
                if(citysData.code==='200'){
                    citysData.cityList.forEach(item=>{
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
                            nodesMap[item.id] = item;
                            if(nodesMap[item.parentId]){
                                if(!nodesMap[item.parentId].children)  nodesMap[item.parentId].children = [];
                                nodesMap[item.parentId].children.push(item);
                            }
                        })
                    }
                    this.nodesMap = nodesMap;
                    this.nodes = nodes;
                }


            },
            async saveSkuRegion() {
                let checkedNodes = this.$refs.treeWrapper.getCheckedNodes()
                let checkedIds = checkedNodes.map(item=>item.id)
                let data ={
                    skuId : this.id,
                    ids: JSON.stringify(checkedIds)
                }
                let res = await this.$post("/admin/saveSkuRegion",data)
                if (res.code == 200){
                    this.$router.push('/sku/skuResource/'+this.spuNoId+'/'+this.parentId+'/'+this.id);
                }else {
                    return
                }

            },
            async back() {
                this.$router.push('/sku/editSpuInfo/'+this.parentId+'/'+this.spuNoId+'/'+this.id);
            }
        }
    }
</script>
<style>
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
    .all{
        padding: 20px;
        background: #fff;
    }
    .el-tree-node .el-tree-node .el-tree-node .el-tree-node{
        float: left;
        width: 200px;
    }
    .el-tree-node__content:hover{
        background: none;
    }
</style>
