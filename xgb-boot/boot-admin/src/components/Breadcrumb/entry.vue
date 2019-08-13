<template>
    <div class="glob-breadcrumb">
        <div class="container">
            <div class="title">
                <span class="line"></span>{{title}}
            </div>
            <div class="return">
                <el-button @click="backCategory">返回</el-button>
            </div>
            <!--<div>-->
                <!--<el-button size="mini" @click="flushEvent" icon="el-icon-refresh">刷新</el-button>-->
            <!--</div>-->
        </div>
    </div>
</template>

<script>
    export default {
        props: {
            title: String,
        },
        methods:{
            flushEvent(){
                location.reload()
            },
            backCategory(){
                this.$router.go(-1)
                // this.$router.push('/categoryTwoList/'+this.parentIdtwo)
            },
        },
    }
</script>

<style lang="scss" scoped>
@import "../../assets/scss/common";
.return{
    .el-button{
        width: 70px;
        height: 29px;
        line-height: 0px;
    }

}
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