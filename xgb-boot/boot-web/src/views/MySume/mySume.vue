<template style="background-color: #FFFFFF">
    <el-container>
        <el-header class="header">
           java求职简历
        </el-header>
        <el-main class="main">
            <h2>简单个人信息</h2>
            <div style="display: flex;width: 100%;">
                <div class="persion_about">
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">姓名：</span>
                        </div>
                        <div>
                            <span class="td_value">邓根</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">性别：</span>
                        </div>
                        <div>
                            <span class="td_value">男</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">年龄：</span>
                        </div>
                        <div>
                            <span class="td_value">27</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">学历：</span>
                        </div>
                        <div>
                            <span class="td_value">大专</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">电话：</span>
                        </div>
                        <div>
                            <span class="td_value">13051893217</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">毕业时间：</span>
                        </div>
                        <div>
                            <span class="td_value">2015年07月</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">现居住地：</span>
                        </div>
                        <div>
                            <span class="td_value">北京市门头沟区</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div class="about_title">
                            <span class="td_label">常用邮箱：</span>
                        </div>
                        <div>
                            <span class="td_value">295841112@qq.com</span>
                        </div>
                    </div>
                </div>
                <div>
                    <img class="header_img" src="http://www.lovexgb.com/group1/M00/00/00/rBGnWl2q5pyAVvigAAXQwi4guXg461.png">
                </div>
            </div>

            <div style="margin-top: 20px">
                <h2>专业技能<span style="font-size: 8px;color:red">(点击可展开)</span></h2>
                <el-collapse accordion class="profilessional">
                    <el-collapse-item>
                        <template slot="title">
                            java
                        </template>
                        <div>1、有二年以上J2EE项目开发经验，精通java面向对象编程，良好地规范代码编写习惯;</div>
                        <div>2、熟悉WEB应用研发的过程及各种常用的设计模式;</div>
                        <div>3、熟练使用springMVC、springboot、mybatis、shiro、rabbitmq、fastdfs等开源框架技术，能够独立完成项目搭建开发;</div>
                        <div>4、熟悉使用MySQL数据库，熟悉简单的sql优化;</div>
                        <div>6、熟练使用Debug进行程序调试、log4j进行日志管理、Git项目管理;</div>
                        <div>7、熟练使用IDEA、Eclipse开发工具;</div>
                        <div>8、熟悉使用linux 常用命令，搭建项目生产环境、项目发布、线上问题排查等操作 </div>
                    </el-collapse-item>
                    <el-collapse-item title="微信小程序">
                        <div>1、熟悉微信小程序项目搭建，可根据指定UI页面进行环境搭建及开发。</div>
                        <div>2、熟悉微信小程序从创建到上线的全部过程</div>
                    </el-collapse-item>
                    <el-collapse-item title="前端">
                        <div>1、熟悉HTML、CSS、JS基础语法</div>
                        <div>2、熟练使用layui、vue、element-ui等前端敏捷开发框架</div>
                    </el-collapse-item>
                </el-collapse>
            </div>

            <div style="margin-top: 20px;">
                <h2>工作经历<span style="font-size: 8px;color:red">(点击可展开)</span></h2>
                <el-collapse accordion class="profilessional">
                    <el-collapse-item>
                        <template slot="title">
                            <span class="work_title">北京财神科技有限公司</span> <span style="font-size: 10px;margin-left: 5px;">2019/02~2019/10</span>
                        </template>
                        <div style="font-size: 10px;">
                            <span style="font-weight:bold">行业类别：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;软件开发 | 企业性质：民营 | 规模：10-30人 | 职位月薪：6000元/月
                        </div>
                        <div>
                            <div>
                                <span style="font-weight:bold">工作描述：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、维护旧项目<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、开发新项目<br/>
                            </div>
                        </div>
                        <div class="project">
                            <div>
                                <span style="font-weight:bold">参与项目：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;E农商城
                            </div>
                            <div>
                                <span style="font-weight:bold">项目构成：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;3个后台管理+web商城+app(e农农服)+小程序(e农农服、e农村镇服务商)
                            </div>
                            <div>
                                <span style="font-weight:bold">使用技术：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;Springboot+redis+shiro+mybatis+fastDFS+rabbitMQ+vue+element-ui+ElasticSearch
                            </div>
                            <div>
                                <span style="font-weight:bold">项目职责：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、商城订单模块：订单创建->订单支付后拆单->发货管理;<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、商城支付模块：合利宝支付宝二维码支付，微信二维码支付，银联B2B、B2C支付，按订单分账，余额查询、账单下载、解析等;<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;3、企业认证模块：合利宝子商户认证、开通收款。法大大企业认证、电子合同鉴定<br/>
                            </div>
                        </div>
                        <div class="project">
                            <div>
                                <span style="font-weight:bold">参与项目：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;珠宝商城
                            </div>
                            <div>
                                <span style="font-weight:bold">项目构成：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;后台管理系统+微信小程序(深金珠宝管家)
                            </div>
                            <div>
                                <span style="font-weight:bold">使用技术：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;Springboot+redis+shiro+mybatis+fastDFS+rabbitMQ+vue+element-ui+ElasticSearch
                            </div>
                            <div>
                                <span style="font-weight:bold">项目职责：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、微信小程序项目搭建，根据现有UI实现小程序页面<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、实现项目中会员注册、账号登录、微信登录、签到、基本信息修改等常用功能<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;3、实现商城商品租赁、购买、订单方面及微信支付。<br/>
                            </div>
                        </div>
                        <div class="project">
                            <div>
                                <span style="font-weight:bold">参与项目：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;国肽商城
                            </div>
                            <div>
                                <span style="font-weight:bold">项目构成：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;商城后台管理系统+web商城+app(国肽商城)+小程序(国肽商城)
                            </div>
                            <div>
                                <span style="font-weight:bold">使用技术：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;Springboot+redis+shiro+mybatis+fastDFS+rabbitMQ+vue+element-ui+ElasticSearch
                            </div>
                            <div>
                                <span style="font-weight:bold">项目职责：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、App会员注册、登录、二维码注册、推广二维码、app微信登录<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、小程序环境搭建及开发，微信支付<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;3、微信原生支付、银联B2B、B2C、二维码支付，查询、退款<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;4、微信小程序二维码带信息分享，会员建立上下级关系<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;5、后台管理系统一些查询修改功能<br/>
                            </div>
                        </div>
                        <div class="project">
                            <div>
                                <span style="font-weight:bold">参与项目：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;龙宝小掌门
                            </div>
                            <div>
                                <span style="font-weight:bold">项目构成：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;后台管理系统+app(龙宝小掌门)
                            </div>
                            <div>
                                <span style="font-weight:bold">使用技术：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;Springboot+redis+shiro+mybatis+fastDFS+rabbitMQ+hatchet-ui+Thymeleaf
                            </div>
                            <div>
                                <span style="font-weight:bold">项目职责：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、会员账号充值、消费等资金处理、苹果内购<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、一级推广与二级推广与老师与会员之间的关系及推广资金计算<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;3、后台管理中资源上传、管理员权限分配等功能<br/>
                            </div>
                        </div>
                        <div class="project">
                            <div>
                                <span style="font-weight:bold">参与项目：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;LAC货币交易系统
                            </div>
                            <div>
                                <span style="font-weight:bold">项目构成：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;后台管理系统+移动端web页面
                            </div>
                            <div>
                                <span style="font-weight:bold">使用技术：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;Springboot+redis+shiro+mybatis+fastDFS+rabbitMQ+hatchet-ui+Thymeleaf+element-ui+vue
                            </div>
                            <div>
                                <span style="font-weight:bold">项目职责：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、会员身份认证、充值、转币、货币提现<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、Websocket消息推送、货币兑换比例变化、账户余额变化、系统消息推送<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;3、注册、充值、转币成功后发送短信<br/>
                            </div>
                        </div>
                    </el-collapse-item>
                    <el-collapse-item>
                        <template slot="title">
                            <span class="work_title">山西车易融电子商户有限公司</span> <span style="font-size: 10px;margin-left: 5px;">2018/03~2018/11</span>
                        </template>
                        <div>
                            <span style="font-weight:bold">行业类别：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;网络汽车销售 | 企业性质：民营 | 规模：40-60人 | 职位月薪：4000元/月
                        </div>
                        <div>
                            <div>
                                <span style="font-weight:bold">工作描述：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、参与公司网络推广计划、实现活动页面、收集用户意向信息<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、微信小程序制作<br/>
                            </div>
                        </div>
                        <div class="project">
                            <div>
                                <span style="font-weight:bold">参与项目：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;车容易体验店
                            </div>
                            <div>
                                <span style="font-weight:bold">项目构成：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;后台管理+小程序(车容易体验店)
                            </div>
                            <div>
                                <span style="font-weight:bold">使用技术：</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;Springboot+mybatis+freemarker+layui
                            </div>
                            <div>
                                <span style="font-weight:bold">项目职责：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、独立搭建及开发微信小程序<br/>
                            </div>
                        </div>
                    </el-collapse-item>
                    <el-collapse-item>
                        <template slot="title">
                            <span class="work_title">云软集团</span> <span style="font-size: 10px;margin-left: 5px;">2017/06~2018/02</span>
                        </template>
                        <div>
                            <div>
                                <span style="font-weight:bold">参与培训：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、学习java基础知识、基础语法、基础框架知识<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、学习html、css、js基础知识、基础语法<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;3、学习Mysql数据库、Oracle数据库基础知识<br/>
                            </div>
                        </div>
                    </el-collapse-item>
                    <el-collapse-item>
                        <template slot="title">
                            <span class="work_title">陕西思达迈尔测绘工程有限公司</span> <span style="font-size: 10px;margin-left: 5px;">2014/07~2017/04</span>
                        </template>
                        <div>
                            <div>
                                <span style="font-weight:bold">学校实习：</span><br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;1、使用GPS定位工具测量、记录电力设备、并在供电公司内部系统绘制出来<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;2、培训新人快速使用GPS定位工具，快速融入项目<br/>
                                &nbsp;&nbsp;&nbsp;&nbsp;3、考察项目实际采集区域、预算时间及签署合同等。<br/>
                            </div>
                        </div>
                    </el-collapse-item>
                </el-collapse>
            </div>

            <div style="margin-top: 20px">
                <h2>求职意向</h2>
                <div>
                    <div class="person_div1">
                        <div>
                            <span class="intention_label">职位：</span>
                        </div>
                        <div>
                            <span class="intention_value">java后端开发</span>
                        </div>
                    </div>
                    <div class="person_div">
                        <div>
                            <span class="intention_label">薪资：</span>
                        </div>
                        <div>
                            <span class="intention_value">10000元~15000元(税前)</span>
                        </div>
                    </div>
                </div>
            </div>
            <div style="margin-top: 20px">
                <h2>业余项目地址</h2>
                <div>
                    <div class="person_div1">
                        <a class="intention_label" href="https://github.com/dg802325/xgb-java">https://github.com/dg802325/xgb-java</a>
                    </div>
                </div>
            </div>
            <div style="margin-top: 20px">
                <h2>展示</h2>
                <div>
                    <div class="person_div1">
                        <a class="intention_label" href="http://admin.lovexgb.com">http://admin.lovexgb.com</a>
                    </div>
                </div>
            </div>
        </el-main>
        <el-footer>

        </el-footer>
    </el-container>
</template>

<script>
    export default {
        name: "mySume"
    }
</script>

<style scoped>
    .el-collapse {
        border-top: 0 !important;
        border-bottom: 1px solid #EBEEF5;
    }
    .header{
        font-size: 18px;
        margin-top: 20px;
        text-align: center;
    }
    .main{
        margin-top: -50px;
    }
    .person_div{
        display: flex;
        margin-top: 5px;
    }
    .person_div1{
        display: flex;
        margin-top: 10px;
    }
    .persion_about{
        margin-top: 10px;
        width: 600px;
    }
    .about_title{
        text-align:right;
        width: 80px;
    }
    .td_label{
        font-size: 15px;
        margin-right: 5px;
    }
    .td_value{
        font-size: 15px;
    }
    .header_img{
        width: 100px;
        height: auto;
    }
    .profilessional{
        margin-left: 15px;
        margin-right: 15px;
        background-color:transparent
    }
    .work_title{
        font-size: 12px;
    }
    .intention_label{
        margin-top: 5px;
        margin-left: 15px;
    }
    .project{
        border-top:1px solid #00ff00;
    }
</style>