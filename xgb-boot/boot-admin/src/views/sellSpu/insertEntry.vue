<template>
    <div>
        <add-spu-info v-show="step==1" @addSpuInfoStep="addSpuInfoStep"/>
        <sku-resource v-show="step==2"  @save="insertSkuEvent" @retreat="skuResourceRetreat"/>
    </div>
</template>

<script>
    import addSpuInfo from './addSpuInfo';
    import skuResource from './skuResource'
    export default {
        data(){
            return{
                step: 1,
                params: {},
                parentId: ''
            }
        },
        created(){
            this.parentId = this.$route.params.threeCategoryId
        },
        methods: {
            addSpuInfoStep(data){
                this.params = data;
                this.step = 2;

            },
            skuResourceRetreat(){
                this.step = 1
            },
            async insertSkuEvent(data){
                let params = {...{parentId: this.parentId},...this.params,...data};
                let res =await this.$post('/admin/insertSkuSpuId',params)
                if (res.code ==200){
                    this.$router.push('/sku/selectTable')
                }
                if (res.code ==999){
                    this.$message.info("该商品已上架!")
                    return;
                }
            }
        },
        components: {
            addSpuInfo,
            skuResource
        }
    }
</script>

<style scoped>

</style>