(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-a0112148"],{"4ce1":function(s,e,t){},7330:function(s,e,t){s.exports=t.p+"img/u1009.3240614c.svg"},c308:function(s,e,t){"use strict";t.r(e);var r=function(){var s=this,e=s.$createElement,r=s._self._c||e;return r("v-init-view",{staticClass:"bj"},[r("p",{staticClass:"to-login",attrs:{slot:"right"},slot:"right"},[s._v("\n        已有账号，\n        "),r("router-link",{attrs:{to:"/login"}},[s._v("立即登录")])],1),r("div",{staticClass:"container"},[r("div",{staticClass:"register-container"},[r("p",{staticClass:"title"},[s._v("新用户注册")]),r("el-form",{ref:"loginForm",attrs:{"show-message":!1}},[r("el-form-item",[r("el-input",{attrs:{maxlength:"20",size:"",clearable:"",placeholder:"输入手机号码"},model:{value:s.mobile,callback:function(e){s.mobile=e},expression:"mobile"}},[r("i",{staticClass:"icon",attrs:{slot:"prefix"},slot:"prefix"},[r("img",{attrs:{src:t("fb70")}})])]),r("div",{staticClass:"message",domProps:{innerHTML:s._s(s.mobileMsg)}})],1),r("el-form-item",[r("el-input",{attrs:{maxlength:"20",size:"",placeholder:"短信验证码"},model:{value:s.code,callback:function(e){s.code=e},expression:"code"}},[r("i",{staticClass:"icon",attrs:{slot:"prefix"},slot:"prefix"},[r("img",{attrs:{src:t("f7e6")}})]),r("i",{attrs:{slot:"suffix"},slot:"suffix"},[r("el-button",{staticClass:"send-msg",attrs:{disabled:s.isDisabled,type:"text"},on:{click:s.sendMobile}},[s._v("\n                                "+s._s(s.msg)+"\n                            ")])],1)]),r("div",{staticClass:"message",domProps:{innerHTML:s._s(s.codeMsg)}})],1),r("el-form-item",[r("el-input",{attrs:{type:"password",maxlength:"20",size:"",clearable:"",placeholder:"设置6至20位登录密码"},model:{value:s.password,callback:function(e){s.password=e},expression:"password"}},[r("i",{staticClass:"icon",attrs:{slot:"prefix"},slot:"prefix"},[r("img",{attrs:{src:t("7330")}})])]),r("div",{staticClass:"message",domProps:{innerHTML:s._s(s.passwordMsg)}})],1),r("el-form-item",[r("el-input",{attrs:{type:"password",maxlength:"20",size:"",clearable:"",placeholder:"请再次输入登录密码"},model:{value:s.rePassword,callback:function(e){s.rePassword=e},expression:"rePassword"}},[r("i",{staticClass:"icon",attrs:{slot:"prefix"},slot:"prefix"},[r("img",{attrs:{src:t("7330")}})])]),r("div",{staticClass:"message",domProps:{innerHTML:s._s(s.rePasswordMsg)}})],1),r("el-form-item",[r("p",{staticClass:"tip"},[r("i",{staticClass:"fa ",class:s.check?"fa-check-circle":"fa-check-circle-o",on:{click:function(e){s.check=!s.check}}}),s._v("\n                        已阅读并同意《"),r("a",{attrs:{href:"javascript:;"},on:{click:s.toAgreement}},[s._v("用户服务协议")]),s._v("》\n                    ")])]),r("el-form-item",[r("el-button",{staticClass:"register-button",attrs:{type:"primary"},on:{click:s.submitEvent}},[s._v("立即注册")])],1)],1)],1)])])},i=[],a=(t("96cf"),t("3b8d")),n=t("f576"),o=t.n(n),c={data:function(){return{empty:'<i class="el-icon-warning"></i>',error:'<i class="el-icon-error"></i>',check:!0,username:"",count:60,msg:"发送验证码",isDisabled:!1,mobile:"",code:"",password:"",rePassword:"",userNameMsg:"",mobileMsg:"",codeMsg:"",passwordMsg:"",rePasswordMsg:""}},methods:{sendMobile:function(){var s=Object(a["a"])(regeneratorRuntime.mark((function s(){var e;return regeneratorRuntime.wrap((function(s){while(1)switch(s.prev=s.next){case 0:if(this.mobile){s.next=3;break}return this.mobileMsg="手机号不能为空",s.abrupt("return");case 3:return this.codeMsg="",s.next=6,this.$post("/api/mobileCode",{mobile:this.mobile});case 6:e=s.sent,"200"===e.code?(this.$message.success("短信已发送!"),this.countDown()):this.codeMsg="".concat(this.error," ").concat(e.message);case 8:case"end":return s.stop()}}),s,this)})));function e(){return s.apply(this,arguments)}return e}(),countDown:function(){var s=this;this.isDisabled=!0,this.msg=this.count+"秒后重新发送";var e=setInterval((function(){s.count--,s.count<=0?(clearInterval(e),s.msg="获取验证码",s.isDisabled=!1):s.msg=s.count+"秒后重新发送"}),1e3)},submitEvent:function(){var s=Object(a["a"])(regeneratorRuntime.mark((function s(){var e;return regeneratorRuntime.wrap((function(s){while(1)switch(s.prev=s.next){case 0:if(this.reset(),this.mobile){s.next=4;break}return this.mobileMsg="".concat(this.empty,"请输入手机号"),s.abrupt("return");case 4:if(this.code){s.next=7;break}return this.codeMsg="".concat(this.empty,"请输入手机验证码"),s.abrupt("return");case 7:if(this.password){s.next=10;break}return this.passwordMsg="".concat(this.empty,"请输入密码"),s.abrupt("return");case 10:if(!(this.password.length<6||this.password.length>20)){s.next=13;break}return this.passwordMsg="".concat(this.error,"登录密码长度为6至20位"),s.abrupt("return");case 13:if(this.rePassword){s.next=16;break}return this.rePasswordMsg="".concat(this.empty,"请再次输入登录密码"),s.abrupt("return");case 16:if(this.password===this.rePassword){s.next=19;break}return this.rePasswordMsg="".concat(this.error,"两次密码不一致"),s.abrupt("return");case 19:if(this.check){s.next=22;break}return this.$message.error("请阅读并勾选用户服务协议！"),s.abrupt("return");case 22:return s.next=24,this.$post("/api/registered",{mobile:this.mobile,password:this.md5Event(this.password),mobileCode:this.code,origin:"pc"});case 24:e=s.sent,"200"===e.code?this.$router.push("/register/success"):this.$message.error(e.message);case 26:case"end":return s.stop()}}),s,this)})));function e(){return s.apply(this,arguments)}return e}(),md5Event:function(s){var e=new o.a;return e.update(s).digest("hex").toUpperCase()},reset:function(){this.userNameMsg="",this.mobileMsg="",this.codeMsg="",this.passwordMsg="",this.rePasswordMsg=""},toAgreement:function(){window.open("/agreement","_blank")}}},l=c,u=(t("ed3a"),t("2877")),p=Object(u["a"])(l,r,i,!1,null,null,null);e["default"]=p.exports},ed3a:function(s,e,t){"use strict";var r=t("4ce1"),i=t.n(r);i.a},f7e6:function(s,e,t){s.exports=t.p+"img/u7565.c72e76b1.svg"},fb70:function(s,e,t){s.exports=t.p+"img/u7564.dd7710d8.svg"}}]);
//# sourceMappingURL=chunk-a0112148.9e564fe6.js.map