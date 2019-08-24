<template>
    <div class="glob-breadcrumb">
        <div class="container">
            <div class="title">
                <span class="line"></span>{{title}}
            </div>
            <slot>
            <div>
                <el-button @click="ruturn" size="mini">返回</el-button>
            </div>
            </slot>
        </div>
    </div>
</template>

<script>
    export default {
        props: {
            title: String
        },

        methods: {
            ruturn(){
                this.$router.go(-1)
            }
        }
    }


</script>


<style lang="scss" scoped>
@import "../../assets/scss/common";

.glob-breadcrumb {
    height: 48px;
    background: #f3f3f3;
    border-bottom: 1px #e4e4e4 solid;
    .container {
        display: flex;
        align-items: center;
        justify-content: space-between;
        height: 100%;
        .title{
            display: flex;
            align-items: center;
            font-size: 14px;
            color:#999;
            .line {
                margin-right: 5px;
                width: 5px;
                height: 18px;
                background: #1abc9c;
            }
        }
    }
}
</style>