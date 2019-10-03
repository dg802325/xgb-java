<template>
    <div>
        <div>
            <glob-breadcrumb title="进件"/>
            <br><br>
            <div class="container">
                <div class="v-cart-title">
                    <div class="title">
                        进件 ( <span style="font-size: 15px;color: #f00;">*</span> 必填  )
                    </div>
                </div>
                <div class="content_b">
                    <div class="content_b_tx_1">
                        <div>
                            <div style="padding-top: 20px;padding-left: 176px;height: 2400px;">
                                <table class="left-table" style="width: 800px;height: 90px;">
                                    <tbody>
                                        <tr>
                                            <td>公司名称<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="companyName" class="form_item_input" placeholder="请填写公司名称"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>展示名称<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="showName" class="form_item_input" placeholder="请填写展示名称"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>网站网址</td>
                                            <td><el-input v-model="webSite" class="form_item_input" placeholder="请填写网站网址"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>接入地址</td>
                                            <td><el-input v-model="accessUrl" class="form_item_input" placeholder="请填写接入地址"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>子商户类型<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <el-select v-model="merchantType" style="width:626px;" clearable placeholder="请填写子商户类型">
                                                    <el-option
                                                            v-for="item in merchantTypeList"
                                                            :key="item.dictValue"
                                                            :label="item.dictName"
                                                            :value="item.dictValue">
                                                    </el-option>
                                                </el-select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>法人名字<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="legalPerson" class="form_item_input" placeholder="请填写法人名字"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>法人身份证号<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="legalPersonID" class="form_item_input" placeholder="请填写法人身份证号"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>统一社会信用码<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="orgNum" class="form_item_input" placeholder="请填写统一社会信用码"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>营业执照号<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="businessLicense" class="form_item_input" placeholder="请填写营业执照号"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>地址<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-select ref="storePro"  v-model="provinceId" size="1" style="width: 143px;" placeholder="省" >
                                                <el-option
                                                        v-for="item in provinceList"
                                                        :key="item.id"
                                                        :label="item.divisionName"
                                                        :value="item.id"
                                                ></el-option>
                                            </el-select>&nbsp;&nbsp;
                                                <el-select ref="storeCity" v-model="cityId" size="1" style="width: 143px;" placeholder="市" >
                                                    <el-option
                                                            v-for="item in cityList"
                                                            :key="item.id"
                                                            :label="item.divisionName"
                                                            :value="item.id"
                                                    ></el-option>
                                                </el-select>&nbsp;&nbsp;
                                                <el-select ref="storeArea"  v-model="areaId" size="1" style="width: 143px;" placeholder="区/县" >
                                                    <el-option
                                                            v-for="item in areaList"
                                                            :key="item.id"
                                                            :label="item.divisionName"
                                                            :value="item.id"
                                                    ></el-option>
                                                </el-select></td>
                                        </tr>
                                        <tr>
                                            <td>区县编码<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="regionCode" class="form_item_input" placeholder="选择省市区后自动填写" disabled></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>详细地址<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="address" class="form_item_input" placeholder="请填写详细地址"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>联系人<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="linkman" class="form_item_input" placeholder="请填写联系人"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>联系电话<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="linkPhone" class="form_item_input" placeholder="请填写联系电话"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>联系邮箱<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="email" class="form_item_input" placeholder="请填写联系邮箱"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>绑定手机</td>
                                            <td><el-input v-model="bindMobile" class="form_item_input" placeholder="请填写绑定手机"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>客服联系电话</td>
                                            <td><el-input v-model="servicePhone" class="form_item_input" placeholder="请填写客服联系电话"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>结算卡联行号<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="bankCode" class="form_item_input" placeholder="请填写结算卡联行号"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>开户名<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="accountName" class="form_item_input" placeholder="请填写开户名"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>开户账号<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="accountNo" class="form_item_input" placeholder="请填写开户账号"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>结算卡类型<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <el-select v-model="settleBankType" style="width:626px;" clearable placeholder="请选择结算卡类型">
                                                    <el-option
                                                            v-for="item in settleBankTypeList"
                                                            :key="item.dictValue"
                                                            :label="item.dictName"
                                                            :value="item.dictValue">
                                                    </el-option>
                                                </el-select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>结算类型<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <el-select v-model="settlementPeriod" style="width:626px;" clearable placeholder="请选择结算类型">
                                                    <el-option
                                                            v-for="item in settlementPeriodList"
                                                            :key="item.dictValue"
                                                            :label="item.dictName"
                                                            :value="item.dictValue">
                                                    </el-option>
                                                </el-select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>结算方式<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <el-select v-model="settlementMode" style="width:626px;" clearable placeholder="请选择结算方式">
                                                    <el-option
                                                            v-for="item in settlementModeList"
                                                            :key="item.dictValue"
                                                            :label="item.dictName"
                                                            :value="item.dictValue">
                                                    </el-option>
                                                </el-select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>结算备注</td>
                                            <td><el-input v-model="settlementRemark" class="form_item_input" placeholder="请填写结算备注"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>经营类别<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td><el-input v-model="merchantCategory" class="form_item_input" placeholder="请填写经营类别"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>行业类型编码</td>
                                            <td><el-input v-model="industryTypeCode" class="form_item_input" placeholder="请填写行业类型编码"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>授权使用平台商秘钥<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <template>
                                                    <el-radio v-model="authorizationFlag" label="true">接受</el-radio>
                                                    <el-radio v-model="authorizationFlag" label="false">拒绝</el-radio>
                                                </template>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>银联二维码</td>
                                            <td><el-input v-model="unionPayQrCode" class="form_item_input" placeholder="请填写银联二维码"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>是否需要开通 POS 功能<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <template>
                                                    <el-radio v-model="needPosFunction" label="true">接受</el-radio>
                                                    <el-radio v-model="needPosFunction" label="false">拒绝</el-radio>
                                                </template>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>法人身份证开始日期</td>
                                            <td><el-input v-model="idCardStartDate" class="form_item_input" placeholder="请填写法人身份证开始日期"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>法人身份证结束日期</td>
                                            <td><el-input v-model="idCardEndDate" class="form_item_input" placeholder="请填写法人身份证结束日期"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>经营起始日期</td>
                                            <td><el-input v-model="businessDateStart" class="form_item_input" placeholder="请填写经营起始日期"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>经营期限</td>
                                            <td><el-input v-model="businessDateLimit" class="form_item_input" placeholder="请填写经营期限"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>开户人身份证</td>
                                            <td><el-input v-model="accountIdCard" class="form_item_input" placeholder="请填写开户人身份证"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>银联 mcc 码</td>
                                            <td><el-input v-model="mcc" class="form_item_input" placeholder="请填写银联 mcc 码"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>是否同意协议<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <template>
                                                    <el-radio v-model="agreeProtocol" label="true">接受</el-radio>
                                                    <el-radio v-model="agreeProtocol" label="false">拒绝</el-radio>
                                                </template>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>回调地址</td>
                                            <td><el-input v-model="callbackUrl" class="form_item_input" placeholder="请填写回调地址"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>结算模式<span style="font-size: 15px;color: #f00;">*</span></td>
                                            <td>
                                                <el-select v-model="settleMode" style="width:626px;" clearable placeholder="请选择结算模式">
                                                    <el-option
                                                            v-for="item in settleModeList"
                                                            :key="item.dictValue"
                                                            :label="item.dictName"
                                                            :value="item.dictValue">
                                                    </el-option>
                                                </el-select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>结算信息鉴权</td>
                                            <td><el-input v-model="settlementAuth" class="form_item_input" placeholder="请填写结算信息鉴权"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>注册地址</td>
                                            <td><el-input v-model="postalAddress" class="form_item_input" placeholder="请填写注册地址"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>小微经营类型</td>
                                            <td><el-input v-model="microBizType" class="form_item_input" placeholder="请填写小微经营类型"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>证书类型</td>
                                            <td><el-input v-model="certType" class="form_item_input" placeholder="请填写证书类型"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>联系人身份证号</td>
                                            <td><el-input v-model="linkManId" class="form_item_input" placeholder="请填写联系人身份证号"></el-input></td>
                                        </tr>
                                        <tr>
                                            <td>是否需要认证</td>
                                            <td>
                                                <template>
                                                    <el-radio v-model="needAuthorize" label="true">接受</el-radio>
                                                    <el-radio v-model="needAuthorize" label="false">拒绝</el-radio>
                                                </template>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>是否特殊处理商户名称</td>
                                            <td>
                                                <template>
                                                    <el-radio v-model="specialSignName" label="true">接受</el-radio>
                                                    <el-radio v-model="specialSignName" label="false">拒绝</el-radio>
                                                </template>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div class="btn-tj">
                                    <el-button type="primary" style="height: 35px;width: 90px;margin-top: 20px"
                                               @click="toEntryResult">提 交
                                    </el-button>
                                </div>
                            </div>
                        </div>
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
                provinceList:[],//省
                cityList:[],//市
                areaList:[],//区
                companyName:'',//企业名称
                showName:'',//展示名称
                webSite:'',//网站网址
                accessUrl:'',//接入地址
                merchantType:'',//子商户类型
                legalPerson:'',//法人名字
                legalPersonID:'',//法人身份证号
                orgNum:'',//组织代码机构证
                businessLicense:'',//营业执照号
                provinceId:'',//省
                cityId:'',//市
                areaId:'',//区
                regionCode:'',//区县编码
                address:'',//详细地址
                linkman:'',//联系人
                linkPhone:'',//联系电话
                email:'',//联系邮箱
                bindMobile:'',//绑定手机
                servicePhone:'',//客服联系电话
                bankCode:'',//结算卡联行号
                accountName:'',//开户名
                accountNo:'',//开户账号
                settleBankType:'',//结算卡类型
                settlementPeriod:'',//结算类型
                settlementMode:'',//结算方式
                settlementRemark:'',//结算备注
                merchantCategory:'',//经营类别
                industryTypeCode:'',//行业类型编码
                authorizationFlag:'true',//授权使用平台商秘钥
                unionPayQrCode:'',//银联二维码
                needPosFunction:'true',//是否需要开通 POS 功能
                idCardStartDate:'',//法人身份证开始日期
                idCardEndDate:'',//法人身份证结束日期
                businessDateStart:'',//经营起始日期
                businessDateLimit:'',//经营期限
                accountIdCard:'',//开户人身份证
                mcc:'',//银联 mcc 码
                agreeProtocol:'true',//是否同意协议
                callbackUrl:'',//回调地址
                settleMode:'',//结算模式
                settlementAuth:'',//结算信息鉴权
                postalAddress:'',//注册地址
                microBizType:'',//小微经营类型
                certType:'',//证书类型
                linkManId:'',//联系人身份证号
                needAuthorize:'true',//是否需要认证
                specialSignName:'true',//是否需要特殊处理商户名称
                merchantTypeList:[],
                settleBankTypeList:[],
                settlementPeriodList:[],
                settlementModeList:[],
                settleModeList:[],
            }
        },
        watch:{
            provinceId (val) {
                if (val!=null && val!='') {
                    this.getCityList(val)
                }
            },
            cityId (val) {
                if (val!=null && val!='') {
                    this.getAreaList(val)
                }
            },
            areaId(val){
                if (val!=null && val!='') {
                    this.getRegionCode(val)
                }
            }
        },
        created(){
            this.getProvinceList()
            this.getMerchantTypeList();
            this.getBankTypeList();
            this.getMentPeriodList();
            this.getMentModeList();
            this.getSettleModeList();
        },
        methods: {
            //获得企业类型 merchantTypeList
            async getMerchantTypeList(){
                let data = {
                    code : "HLB_MERCHANT_TYPE"
                }
                let res = await this.$get("/admin/selectByOnlyCode",data)
                this.merchantTypeList = res.lists
            },
            //获得结算卡类型 settleBankTypeList
            async getBankTypeList(){
                let data = {
                    code : "HLB_SETTLE_BANK_TYPE"
                }
                let res = await this.$get("/admin/selectByOnlyCode",data)
                this.settleBankTypeList = res.lists
            },

            //获得结算类型 settlementPeriodList
            async getMentPeriodList(){
                let data = {
                    code : "HLB_SETTLE_MENT_PERIOD"
                }
                let res = await this.$get("/admin/selectByOnlyCode",data)
                this.settlementPeriodList = res.lists
            },

            //获得结算方式 SettlementModeList
            async getMentModeList(){
                let data = {
                    code : "HLB_SETTLE_MENT_MODE"
                }
                let res = await this.$get("/admin/selectByOnlyCode",data)
                this.settlementModeList = res.lists
            },

            //获得结算方式 getSettleModeList
            async getSettleModeList(){
                let data = {
                    code : "HLB_SETTLE_MODE"
                }
                let res = await this.$get("/admin/selectByOnlyCode",data)
                this.settleModeList = res.lists
            },

            async getProvinceList(){
                let data = {

                }
                let res = await this.$get("/admin/getProvinceList",data)
                this.provinceList = res.lists
            },
            async getCityList(val){
                let data = {
                    parentId:val
                }
                let res = await this.$get("/admin/getCityList",data)
                this.cityList = res.lists
            },
            async getAreaList(val){
                let data = {
                    parentId:val
                }
                let res = await this.$get("/admin/getAreaList",data)
                this.areaList = res.lists
            },
            async getRegionCode(val){
                let data = {
                    id:val
                }
                let res = await this.$get("/admin/getRegionCode",data)
                this.regionCode = res.code;
            },
            //提交信息
            async toEntryResult(){
                if(!this.companyName){this.$message.error("企业名称 不能为空");}
                if(!this.showName){this.$message.error("展示名称 不能为空");}
                if(!this.merchantType){this.$message.error("子商户类型 不能为空");}
                let data = {

                }
                let res = await this.$post("/admin/toEntryResult",data)
                console.log(res)
            }
        }
    }
</script>

<style>
    .btn-tj {
        height: 35px;
        width: 90px;
        margin-top: 20px;
        margin-left: 320px;

    }
    .content_b {
        width: 99.8%;
        height: auto;
        background-color: #fff;
        border:1px #e4e4e4 solid;
    }
    .el-form-item_1 .el-form-item__label {
        font-size: 12px;
    }
    .el-form-item_1 .el-form-item {
        margin-bottom: 5px;
    }

    .content_b_tx_1 {
        width: 100%;
        margin: 0 auto;
    }

    .el-button_2{
        width:80px;
        height: 35px;
        padding:10px 20px;
        border-radius: 2px;
    }
    .form-lable{
        border: 1px solid #000000;
        width:  600px;
    }
    .form-span{
        width: 200px;
        margin-right: 20px;
        font-size: 14px;
    }
    .form_item_1{
        width:482px;
    }
</style>
