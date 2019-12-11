<template>
    <div class="glob-base-search container" :class="[className]">
        <div class="search-header">
            <div class="title">
                <i class="el-icon-search"></i>筛选查询
            </div>
            <div class="search-button">
                <div class="toggle-screen" @click="handleToggle">
                    <i class="el-icon-arrow-up" v-if="arrowUp"></i>
                    <i class="el-icon-arrow-down" v-else></i>
                    收起筛选
                </div>
                <slot name="button"></slot>
            </div>
        </div>
        <div class="search-body" v-show="arrowUp">
            <slot>

            </slot>
        </div>
    </div>
</template>

<script>
    export default {
        data(){
          return {
              arrowUp: true
          }
        },
        props: {
            className: {}
        },
        methods: {
            handleToggle(){
                this.arrowUp = !this.arrowUp;
            }
        }
    }
</script>

<style lang="scss" >
.glob-base-search{
    box-sizing: border-box;
    border: 1px #e4e4e4 solid;
    margin-bottom: 20px;
    .search-header{
        padding:0 18px;
        height: 48px;
        display: flex;
        align-items: center;
        justify-content: space-between;
        background:#f3f3f3;
        .title{
            color:#666;
            i{
                margin-right: 3px;
                font-size: 12px;
                font-weight: bold;
            }
        }
        .search-button {
            display: flex;
            align-items: center;
            .toggle-screen{
                width: 80px;
                color:#999999;
                cursor: pointer;
                i{
                    cursor: pointer;
                    margin-right: 3px;
                }
            }
        }

    }
    .search-body{
        padding-top: 12px;
        border-top: 1px #e4e4e4 solid;
        .el-form-item{
            margin-bottom: 12px;
        }
        .el-select,.el-input{
            width: 180px;
        }
        .el-input__inner{
            height: 35px;
            line-height: 35px;
        }
        .el-form-item--mini .el-form-item__label{
            line-height: 35px;
        }
        .el-form-item__label{
            color:#666;
        }
    }
}
</style>