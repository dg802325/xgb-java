(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-d826164e"],{2850:function(t,e,l){"use strict";l.r(e);var a=function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",{staticClass:"c-border s-apple-container"},[t._m(0),l("table",{staticClass:"v-sku-info-table"},[t._m(1),l("tbody",[l("tr",[l("td",{attrs:{align:"left"}},[l("div",{staticClass:"t-sku-info"},[t._m(2),l("div",{staticClass:"info"},[l("p",{staticClass:"name"},[l("router-link",{attrs:{to:"/detail"}},[t._v("心连心氮肥 5KG/袋")])],1),l("p",{staticClass:"type"},[t._v("适合种玉米、黄瓜")])])])]),l("td",[t._v("¥249")]),l("td",[t._v("1")]),l("td",[t._v("¥249")]),l("td",[t._v("¥249")])])])]),l("div",{staticClass:"s-apple-title"},[t._v("申请信息")]),l("div",{staticClass:"c-border"},[l("el-form",{staticClass:"info-form-wrapper v-form-group",attrs:{"label-width":"140px"}},[l("el-form-item",{attrs:{label:"提交数量：",required:""}},[l("el-input-number",{attrs:{size:"small",min:1},model:{value:t.number,callback:function(e){t.number=e},expression:"number"}}),l("span",{staticClass:"v-tip"},[t._v("您最多可提交数量为1个")])],1),l("el-form-item",{attrs:{label:"退货原因：",required:""}},[l("el-select",{attrs:{placeholder:"请选择"},model:{value:t.reason,callback:function(e){t.reason=e},expression:"reason"}},[l("el-option",{attrs:{value:"质量问题"}},[t._v("质量问题")]),l("el-option",{attrs:{value:"配件问题"}},[t._v("配件问题")]),l("el-option",{attrs:{value:"少件/漏发"}},[t._v("少件/漏发")]),l("el-option",{attrs:{value:"与商品描述不符"}},[t._v("与商品描述不符")]),l("el-option",{attrs:{value:"包装/商品残破"}},[t._v("包装/商品残破")]),l("el-option",{attrs:{value:"发票问题"}},[t._v("发票问题")]),l("el-option",{attrs:{value:"其它"}},[t._v("其它")])],1)],1),l("el-form-item",{staticStyle:{height:"225px"},attrs:{label:"问题描述：",required:""}},[l("el-input",{attrs:{type:"textarea",rows:10,placeholder:"请输入问题描述，不得少于10个字。",maxlength:"500","show-word-limit":""},model:{value:t.desc,callback:function(e){t.desc=e},expression:"desc"}})],1),l("el-form-item",{staticStyle:{height:"110px","margin-bottom":"0"},attrs:{label:"上传凭证",required:""}},[l("el-upload",{attrs:{action:"#","list-type":"picture-card","auto-upload":!1},scopedSlots:t._u([{key:"file",fn:function(e){var a=e.file;return l("div",{},[l("img",{staticClass:"el-upload-list__item-thumbnail",attrs:{src:a.url,alt:""}}),l("span",{staticClass:"el-upload-list__item-actions"},[l("span",{staticClass:"el-upload-list__item-preview",on:{click:function(e){return t.handlePictureCardPreview(a)}}},[l("i",{staticClass:"el-icon-zoom-in"})]),t.disabled?t._e():l("span",{staticClass:"el-upload-list__item-delete",on:{click:function(e){return t.handleDownload(a)}}},[l("i",{staticClass:"el-icon-download"})]),t.disabled?t._e():l("span",{staticClass:"el-upload-list__item-delete",on:{click:function(e){return t.handleRemove(a)}}},[l("i",{staticClass:"el-icon-delete"})])])])}}])},[l("div",{attrs:{slot:"default"},slot:"default"},[l("i",{staticClass:"fa fa-plus"}),l("p",{staticClass:"t"},[t._v("选择图片")])])]),l("el-dialog",{attrs:{visible:t.dialogVisible},on:{"update:visible":function(e){t.dialogVisible=e}}},[l("img",{attrs:{width:"100%",src:t.dialogImageUrl,alt:""}})])],1),l("el-form-item",{staticStyle:{height:"40px"},attrs:{label:""}},[l("div",{staticStyle:{"line-height":"1.6"}},[l("p",{staticStyle:{color:"#999999","font-size":"12px"}},[t._v("为了帮助您更好的解决问题，请上传图片")]),l("p",{staticStyle:{color:"#CCCCCC","font-size":"12px"}},[t._v("最多可上传5张图片，每张图片大小不超过5M，支持bmp,gif,jpg,png,jpeg格式文件")])])])],1)],1),l("div",{staticClass:"s-apple-title"},[t._v("联系方式")]),l("div",{staticClass:"c-border"},[l("el-form",{staticClass:"info-form-wrapper v-form-group",staticStyle:{width:"450px"},attrs:{"label-width":"140px"}},[l("el-form-item",{attrs:{label:"联系人:"}},[l("el-input",{model:{value:t.contacts,callback:function(e){t.contacts=e},expression:"contacts"}})],1),l("el-form-item",{attrs:{label:"联系电话:"}},[l("el-input",{model:{value:t.mobile,callback:function(e){t.mobile=e},expression:"mobile"}})],1)],1)],1),l("button",{staticClass:"submit-btn",on:{click:t.handleSubmit}},[t._v("确认提交")]),t._m(3)])},i=[function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",{staticClass:"s-apple-header"},[l("p",{staticClass:"l"},[t._v("申请退货")]),l("p",{staticClass:"r"},[l("i",{staticClass:"fa fa-comments"}),t._v(" 客服电话 400-000-000\n    ")])])},function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("thead",[l("tr",[l("td",{attrs:{width:"413"}},[t._v("商品信息")]),l("td",{attrs:{width:"100"}},[t._v("单价")]),l("td",{attrs:{width:"130"}},[t._v("数量")]),l("td",{attrs:{width:"110"}},[t._v("小计")]),l("td",[t._v("实付")])])])},function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"t-cover"},[a("img",{attrs:{src:l("5833")}})])},function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("dl",{staticClass:"tips"},[l("dt",[l("i",{staticClass:"fa fa-exclamation-circle"}),t._v("温馨提示：")]),l("dd",[t._v("• 商品寄回地址将在审核通过后以短信形式告知，或在申请记录中查询。")]),l("dd",[t._v("• 提交服务单后，售后专员可能与您电话沟通，请保持手机畅通。")]),l("dd",[t._v("• 退货处理成功后退款金额将原路返回到您的支持账户中；")])])}],s={data:function(){return{number:1,reason:"",desc:"",dialogVisible:!1,dialogImageUrl:"",contacts:"Windir",mobile:"180****1849"}},methods:{handleSubmit:function(){this.$router.push("/center/service/success")},handleRemove:function(t){console.log(t)},handlePictureCardPreview:function(t){this.dialogImageUrl=t.url,this.dialogVisible=!0},handleDownload:function(t){console.log(t)}}},c=s,A=(l("364b"),l("2877")),o=Object(A["a"])(c,a,i,!1,null,null,null);e["default"]=o.exports},"364b":function(t,e,l){"use strict";var a=l("d983"),i=l.n(a);i.a},5833:function(t,e){t.exports="data:image/jpeg;base64,/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAAA8AAD/4QMvaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjYtYzE0NSA3OS4xNjM0OTksIDIwMTgvMDgvMTMtMTY6NDA6MjIgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDQyAyMDE5IChXaW5kb3dzKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpEQTlDQjY4NDk4QTgxMUU5OUUxNjg0MkM1NTlBRUU3RiIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpEQTlDQjY4NTk4QTgxMUU5OUUxNjg0MkM1NTlBRUU3RiI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkRBOUNCNjgyOThBODExRTk5RTE2ODQyQzU1OUFFRTdGIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkRBOUNCNjgzOThBODExRTk5RTE2ODQyQzU1OUFFRTdGIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+/+4ADkFkb2JlAGTAAAAAAf/bAIQABgQEBAUEBgUFBgkGBQYJCwgGBggLDAoKCwoKDBAMDAwMDAwQDA4PEA8ODBMTFBQTExwbGxscHx8fHx8fHx8fHwEHBwcNDA0YEBAYGhURFRofHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8f/8AAEQgAUABQAwERAAIRAQMRAf/EAHUAAQEAAwEBAAAAAAAAAAAAAAAEAQIDBQgBAQEBAAAAAAAAAAAAAAAAAAABAhAAAQMCAQgJAwUAAAAAAAAAAQACAxEEBTFxwdESFDRUIUFRkbFSkqIVoSIyYYHhQhMRAQEBAQEAAAAAAAAAAAAAAAABAjFB/9oADAMBAAIRAxEAPwD6FQEBAQEBAQEBAQEBAQEBAQEBAQEBB1t4XTStjBpXKf0VguNhYNOy6ejhlBc0aFBjcsO5j3N1IG5YdzHubqQNyw7mPc3Ugblh3Me5upBkYfYv+2Oer+obTT9Ag8+WN0cjmOytNEg0QEFeGcW3MfBWJXXdhcYjKHGjG9LqLOeLXW6w2AQudENlzRXKTWmdKseUqjZjHvcGsBc45AEGCCDQ9BGUIKsM4tuY+CsStL7i5c+hZy1U6qCCvDOLbmPgrEraW5db4hI9oqK0c3tFFnPFre5xT/SIsjYW7Qo4nsVELGPkeGMFXHIEHtWdmy3Z2yH8naAqjlf2AlBkjFJBlHm/lZVHhoIvAD0EA1H7LUStL7i5c+hZy1U6qCCvDOLbmPgrErFzE+W+kYwVcToWcrXpQWUMUJYRtF35k9atIzbWcVvUt6XH+xy07EHdAQQkAYqKClW1PcmfS+Ib7i5c+hTK1Oqggrwzi25j4KxKoZcRQ385kNAaAdBPgs54t6o+Ss/Oe46lQ+Ss/Oe46kD5Kz857jqQPkrPznuOpBPHNHNibXxmrdmlcnUk9S+JL7i5c+hTLVTqoIOkEzoZWyN6SOrtCC04hZuO063BccpIaUDfrHlh6WoG/WPLD0tQN+seWHpagb9Y8sPS1AGI2rPujgDXdRAA+oQQSSOkkc92VxqUGqAgICAgICAgICAgICAgICAgICAgIP/Z"},d983:function(t,e,l){}}]);
//# sourceMappingURL=chunk-d826164e.6c65ad56.js.map