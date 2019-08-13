<template>
    <div>
        <glob-breadcrumb title="系统首页"/>
        <div class="container dashboard-container">
            <div class="statistics-container">
                <div class="statistics-item">
                    <div class="icon">
                        <img src="./images/order.png"/>
                    </div>
                    <div class="context">
                        <p class="label">今日订单总数</p>
                        <p class="value">0</p>
                    </div>
                </div>
                <div class="statistics-item">
                    <div class="icon">
                        <img src="./images/u2611.png"/>
                    </div>
                    <div class="context">
                        <p class="label">今日销售总额</p>
                        <p class="value">¥0.00</p>
                    </div>
                </div>
                <div class="statistics-item">
                    <div class="icon">
                        <img src="./images/u2611.png"/>
                    </div>
                    <div class="context">
                        <p class="label">总销售额</p>
                        <p class="value">¥0.00</p>
                    </div>
                </div>
                <div class="statistics-item">
                    <div class="icon">
                        <img src="./images/u2611.png"/>
                    </div>
                    <div class="context">
                        <p class="label">资金余额</p>
                        <p class="value">¥0.00</p>
                    </div>
                </div>
            </div>

            <div class="total-container">
                <glob-card title="商品总览" class="total-wrapper">
                    <ul>
                        <li>
                            <p class="num">100</p>
                            <p class="title">已下架</p>
                        </li>
                        <li>
                            <p class="num">100</p>
                            <p class="title">已上架</p>
                        </li>
                        <li>
                            <p class="num">100</p>
                            <p class="title">库存紧张</p>
                        </li>
                        <li>
                            <p class="num">100</p>
                            <p class="title">全部商品</p>
                        </li>
                    </ul>
                </glob-card>

                <glob-card title="订单总览" class="total-wrapper">
                    <ul>
                        <li>
                            <p class="num">100</p>
                            <p class="title">今日新增</p>
                        </li>
                        <li>
                            <p class="num">100</p>
                            <p class="title">昨日新增</p>
                        </li>
                        <li>
                            <p class="num">100</p>
                            <p class="title">本月新增</p>
                        </li>
                        <li>
                            <p class="num">100</p>
                            <p class="title">会员总数</p>
                        </li>
                    </ul>
                </glob-card>
            </div>

            <glob-card title="待处理事务">
                <ul class="todo">
                    <li>
                        <router-link to="/orderManager/1">待提现申请</router-link>
                        <span class="num">(<span class="red">10</span>)</span>
                    </li>
                    <li class="m0">
                        <router-link to="/refundMoney/1">待处理退款申请</router-link>
                        <span class="num">(<span class="red">10</span>)</span>
                    </li>
                </ul>
                <br><br><br><br><br><br><br>
            </glob-card>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                orderTime: ''
            }
        },
        mounted() {
        },
        methods: {
        }
    }
</script>

<style lang="scss">
    .dashboard-container {
        width: 1060px;
        .glob-card .glob-card-header .title {
            font-weight: 600;
        }
        .statistics-container {
            padding: 20px 0;
            display: flex;
            justify-content: space-between;
            .statistics-item {
                display: flex;
                padding-top: 24px;
                box-sizing: border-box;
                width: 247px;
                height: 98px;
                border: 1px #e4e4e4 solid;
                .icon {
                    flex: 0 0 79px;
                    width: 79px;
                    text-align: center;
                }
                .label {
                    font-size: 15px;
                    color: #999;
                    line-height: 25px;
                }
                .value {
                    padding-top: 7px;
                    line-height: 1;
                    font-size: 20px;
                    color: #666;
                }
            }
        }
        .todo {
            overflow: hidden;
            padding: 13px 0 21px 19px;
            li {
                float: left;
                display: flex;
                padding: 0 12px 0 20px;
                margin: 0 30px 3px 0;
                justify-content: space-between;
                width: 320px;
                font-size: 14px;
                line-height: 36px;
                border-bottom: 1px #f2f2f2 solid;
                box-sizing: border-box;
                &.m0 {
                    margin-right: 0;
                }
                a {
                    flex: 1;
                    font-size: 14px;
                    color: #666;
                    &:hover {
                        color: #1abc9c;
                    }
                }
                .num {
                    font-size: 14px;
                }
                .num:hover,
                .num:hover .red {
                    color: #1abc9c
                }
            }
            .red {
                color: rgb(240, 72, 68);
            }
        }
        .entry-list {
            overflow: hidden;
            .entry-item {
                display: inline-block;
                width: 116px;
                height: 154px;
                border-left: 1px transparent solid;
                border-right: 1px transparent solid;
                text-align: center;
                cursor: pointer;
                &:first-child {
                    border-left: none;
                }
                &:hover {
                    border-color: #e4e4e4;
                    background: #f9f9f9;
                    .name {
                        color: #1abc9c;
                    }
                }
                .icon {
                    height: 70px;
                    padding-top: 32px;
                }
                .name {
                    font-size: 14px;
                    line-height: 1;
                    color: rgb(102, 102, 102);
                }
            }
        }
        .total-container {
            overflow: hidden;
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }
        .total-wrapper {
            width: 517px;
            ul {
                display: flex;
                li {
                    height: 154px;
                    flex: 1;
                    text-align: center;
                    .num {
                        line-height: 1;
                        padding: 45px 0 19px;
                        color: #F04844;
                        font-size: 28px;
                    }
                    .title {
                        line-height: 1;
                        color: #666;
                        font-size: 14px;
                    }
                }
            }
        }

        .chart-container {
            height: 321px;
            .chart-left {
                float: left;
                width: 145px;
                height: 321px;
                border-right: 1px #ebebeb solid;
                .census-wrapper {
                    padding: 33px 0 0 23px;
                    font-size: 12px;
                    line-height: 1;
                    color: #989898;
                    .title {
                        height: 19px;
                    }
                    .num {
                        font-size: 23px;
                        height: 31px;
                        color: #666;
                    }
                    .compare {
                        color: #ccc;
                        line-height: 1;
                        span {
                            display: inline-block;
                            padding-left: 15px;
                            padding-right: 5px;
                            height: 12px;
                            &.up {
                                background: url(./images/up.png) no-repeat left center;
                                color: #00a950;
                            }
                            &.down {
                                background: url(./images/down.png) no-repeat left center;
                                color: #f04844;
                            }
                        }

                    }
                }
            }
            .chart-right {
                float: left;
                width: 910px;
                height: 320px;
                position: relative;
                overflow: hidden;
                .echarts-wrapper {
                    margin-top: 3%;
                    width: 100%;
                    height: 90%;
                    overflow: hidden;
                }
                .chart-header {
                    position: absolute;
                    z-index: 10;
                    left: 0;
                    top: 0;
                    width: 100%;
                    box-sizing: border-box;
                    height: 30px;
                    display: flex;
                    padding: 24px 15px 0 15px;

                    align-items: center;
                    justify-content: space-between;
                    .title {
                        color: #989898;
                    }
                    .el-range__icon {
                        display: none;
                    }
                    .chart-sort {
                        display: flex;
                        padding-right: 35px;
                        align-items: center;
                        ul {
                            li {
                                display: inline-block;
                                color: #656565;
                                margin-right: 19px;
                                cursor: pointer;
                            }
                            .active {
                                color: #1abc9c;
                            }
                        }
                    }
                }
            }
        }

    }
</style>