<template>
    <div class="glob-card">
        <div class="glob-card-header">
            <div class="title" v-html="title"></div>
            <div class="glob-card-header-right">
                <slot name="right"></slot>
            </div>
        </div>
        <div class="glob-card-body">
            <slot></slot>
        </div>
    </div>
</template>

<script>
    export default {
        props: {
            title: String
        }
    }
</script>

<style lang="scss" scoped>
.glob-card{
    border: 1px #e4e4e4 solid;
    .glob-card-header{
        padding: 0 19px;
        display: flex;
        align-items: center;
        justify-content: space-between;
        background: #f3f3f3;
        height: 43px;
        .title{
            font-size: 12px;
            color:#666;
        }
        .glob-card-header-right{
            display: flex;
            align-items: center;
        }
    }
    .glob-card-body{
        border-top:1px #e4e4e4 solid;
        background: #fff;
    }
}
</style>