<template>
    <div>
        <glob-breadcrumb title="商品评价"/>
        <div class="container">
            <div class="eavl-wrapper">
                <div class="eavl-user">
                    <img class="avatar" src="./images/u855.png"/>
                    <div class="user-name">Windir</div>
                    <dl>
                        <dd><span class="label">商品：</span><span class="sku-name">心连心氮肥  5KG/袋</span></dd>
                        <dd><span class="label">数量：</span><span class="value">1</span></dd>
                        <dd><span class="label">评价：</span>
                            <el-rate
                                    v-model="value"
                                    disabled
                                    text-color="#f04844">
                            </el-rate>
                        </dd>
                        <dd><span class="label">日期：</span><span class="value">2017-06-15 14:35:51</span></dd>
                        <dd><span class="label">IP地址:</span>  <span class="value">192.168.1.92</span></dd>
                    </dl>
                </div>
                <div class="context">
                    <div class="t"><img src="./images/0916.png"/>点赞 1000</div>
                    <div class="txt">
                        <p>
                            棉布莱卡的出现，不过使内衣面料又多了一种选择与表现。最舒适的面料仍当数棉布，今天的女性依然偏爱棉质内衣，这因为棉布本身独一无二的透气性和天然性，使穿着感受绝不同于其他面料。从美感来说，平织棉布的印花效果和针织棉布的染色效果，都有一种天然纯朴和青春气息，为其他面料所难取代。
                        </p>
                        <p>
                            棉布莱卡的出现，不过使内衣面料又多了一种选择与表现。最舒适的面料仍当数棉布，今天的女性依然偏爱棉质内衣，这因为棉布本身独一无二的透气性和天然性，使穿着感受绝不同于其他面料。从美感来说，平织棉布的印花效果和针织棉布的染色效果，都有一种天然纯朴和青春气息，为其他面料所难取代。
                        </p>
                        <p>
                            棉布莱卡的出现，不过使内衣面料又多了一种选择与表现。最舒适的面料仍当数棉布，今天的女性依然偏爱棉质内衣，这因为棉布本身独一无二的透气性和天然性，使穿着感受绝不同于其他面料。从美感来说，平织棉布的印花效果和针织棉布的染色效果，都有一种天然纯朴和青春气息，为其他面料所难取代。
                        </p>
                    </div>
                    <div class="img-items">
                        <img src="./images/1715.png"/>
                        <img src="./images/1715.png"/>
                        <img src="./images/1715.png"/>
                        <img src="./images/1715.png"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        data() {
            return {
                value: 3
            }
        },

        created() {
        },
        methods: {

        }
    }
</script>

<style  lang="scss" scoped>
    .eavl-wrapper{
        display: flex;
        margin: 20px 0 30px;
        border: 1px rgb(228,228,228) solid;
        background: #fff;
        .eavl-user{
            background: rgb(252,252,252);
            padding-top: 60px;
            min-height: 400px;
            flex: 0 0 300px;
            border-right: 1px rgb(228,228,228) solid;
            display: flex;
            flex-direction: column;
            align-items: center;
            .avatar{
                width: 80px;
                height: 80px;
                border-radius: 50%;
                overflow: hidden;
            }
            .user-name{
                padding:18px 0 40px;
                text-align: center;
                font-size: 14px;
                line-height: 1;
                color:#999;
            }
            dl{
                width: 210px;
                dd{
                    display: flex;
                    height: 30px;
                    align-items: center;
                    .label{
                        margin-right: 10px;
                        font-family: "微软雅黑 Bold", "微软雅黑 Regular", "微软雅黑";
                        font-weight: bold;
                        color:#999;
                        font-size:14px;
                    }
                    .value{
                        font-size: 14px;
                        color:#999;
                    }
                    .sku-name{
                        cursor: pointer;
                        font-size: 14px;
                        color:#1abc9c
                    }
                }
            }
        }
        .context{
            flex: 1;
            padding: 20px 50px 50px;
            .t{
                display: flex;
                align-items: center;
                border-bottom: 1px rgb(228,228,228) solid;
                line-height: 45px;
                color: #999;
                font-size: 14px;
                img{
                    margin-right: 10px;
                }
            }
            .txt p{
                padding-bottom: 20px;
                line-height: 28px;
                color:#999;
                font-size: 14px;
            }
            .img-items {
                overflow: hidden;
                img{
                    float:left;
                    width: 70px;
                    height: 70px;
                    margin:0 8px 8px 0;
                }
            }
        }
    }
</style>
