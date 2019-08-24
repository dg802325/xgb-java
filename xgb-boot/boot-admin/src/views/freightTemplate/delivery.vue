<template>
    <el-dialog title="选择区域" :visible.sync="deliveryVisible" width="50%" :before-close="closeEvent">
        <div style="max-height: 400px;overflow-y: scroll">
            <el-tree
                    ref="treeWrapper"
                    class="region-tree"
                    :default-expanded-keys="defaultExpanded"
                    :data="nodes"
                    show-checkbox
                    node-key="id"
                    :props="defaultProps">
            </el-tree>
        </div>

        <span slot="footer" class="dialog-footer">
            <el-button @click="closeEvent">取 消</el-button>
            <el-button type="primary" @click="saveErpSkuRegion">确 定</el-button>
        </span>
    </el-dialog>
</template>
<script>
    export default {
        data() {
            return {
                checkAll: false,
                item: this.editItem,
                allCheckCities: [...this.defaultChecked], // 全部选中得数据
                cities: {},
                checkTotal: 0,
                defaultExpanded: [],
                checkedAll: false,
                defaultProps: {
                    children: 'children',
                    label: 'divisionName'
                }
            }
        },
        created() {
            // this.getRegionLists()
            // this.getRegionLists();
        },
        props: {
            editItem: Object,
            seaportItem: Array,
            deliveryVisible: Boolean,
            defaultChecked: {
                type: Array,
                default(){
                    return []
                }
            },
            nodes: Array
        },
        methods: {
            checkAllEvent() {
                let cities = this.cities;
                if (this.checkAll) {
                    for (let key in  cities) {
                        let item = cities[key];
                        item.checkedCities = item.ids;
                        item.checkAll = true;
                    }
                } else {
                    for (let key in  cities) {
                        let item = cities[key];
                        item.checkAll = false;
                        item.checkedCities = [];
                    }
                }
                this.cities = cities;
                this.getAllCheckCityes();
            },
            // 监听全选
            handleCheckAllChange(key) {
                let item = this.cities[key];
                let checkAll = item.checkAll;
                item.checkedCities = checkAll ? item.ids : [];
                this.getCheckedLen()
            },
            // 监听 group 选择
            handleCheckedCitiesChange(key) {
                let item = this.cities[key];
                item.checkAll = item.ids.length === item.checkedCities.length;
                this.getCheckedLen()
            },
            getAllCheckCityes() {
                let allCheckCities = [];
                for (let key in  this.cities) {
                    let item = this.cities[key];
                    allCheckCities = [...allCheckCities, ...item.checkedCities]
                }
                this.allCheckCities = allCheckCities;
            },
            getCheckedLen() {
                let len = 0;
                for (let key in  this.cities) {
                    let item = this.cities[key];
                    len += item.checkedCities.length
                }
                if (this.checkTotal === len) {
                    this.checkAll = true;
                } else {
                    this.checkAll = false;
                }
                this.getAllCheckCityes();
            },
            async getRegionLists1() {
                let checkTotal = 0;
                let cities = {};
                // let res = await getRegionList();
                let res = await this.$get("/admin/getRegionList1")
                for (let i = 0; i < res.length; i++) {
                    let item = res[i];
                    let divisionList = item['divisionList'];
                    let ids = divisionList.map(city => (city.id));
                    let checkedCities = this.allCheckCities.filter(item => {
                        return ids.indexOf(item) > -1;
                    });
                    checkTotal += item['divisionList'].length;
                    let checkAll = checkedCities.length === ids.length;
                    cities[item.id] = {
                        ids,
                        checkAll,
                        checkedCities,
                        name: item.regionName,
                        list: item['divisionList']
                    }
                }
                this.checkTotal = checkTotal;
                this.cities = cities;
            },
            closeEvent() {
                this.$emit('close')
            },
            async saveErpSkuRegion() {
                let checkedNodes = this.$refs.treeWrapper.getCheckedNodes()
                let checkedIds = checkedNodes.map(item=>item.id)
                this.$emit('close', checkedIds)
            }
        }
    }
</script>

<style>
    .region-tree .el-tree-node .el-tree-node .el-tree-node .el-tree-node{
        float: left;
        width: 200px;
    }
    .region-tree .el-tree-node__content:hover{
        background: none;
    }
</style>