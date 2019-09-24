<template>
 <div class="bj">
    <div class="container" style="padding-bottom:30px;">
      <div class="breadcrumb-wrapper">
        <router-link to="/">首页</router-link> > <span>评价晒单</span >
      </div>
      <div class="c-border pub-evaluate-container">
        <div class="l">
          <div class="sku-info">
            <div class="sku">
               <img src="./images/u123.png"/>
              <p class="name">心连心氮肥  5KG/袋</p>
              <p class="price">¥249</p>
              <p class="evaluate">9978人评价</p>
            </div>
            <div class="order">
              <p class="order-num"><span class="label">订单编号：</span>62205697599</p>
              <p class="order-time"><span class="label">下单时间：</span>2018-01-08 15:02:00</p>
            </div>
          </div>
        </div>
        <div class="r">
          <el-form label-width="180px" class="info-form-wrapper v-form-group">
            <el-form-item label="商品评分：" style="margin:0;">
                <el-rate
                v-model="evaluate"
                void-color="#999"
                text-color="#999"
                :icon-classes="iconClasses"
                void-icon-class="fa fa-heart-o"
                show-text
                :texts="['非常差','差','一般','好','非常好']"
                :colors="['#FF9900', '#FF9900', '#FF9900']">
              </el-rate>
            </el-form-item>
            <el-form-item label="填写评价：" style="height:225px;" >
              <el-input
                style="width: 573px;"
                type="textarea"
                :rows="10"
                placeholder="宝贝是否满足了你的期待？说说你的使用心得分享给其它想购买的朋友吧。"
                maxlength="500"
                show-word-limit
                v-model="text"
              ></el-input>
            </el-form-item>
            <el-form-item label="评价晒单"  style="height:110px;margin-bottom:0">
              <el-upload  style="display:inline-block"  action="#" list-type="picture-card" :auto-upload="false">
                <div slot="default">
                  <i class="fa fa-plus"></i>
                  <p class="t">选择图片</p>
                </div>

                 <div slot="file" slot-scope="{file}">
                  <img
                    class="el-upload-list__item-thumbnail"
                    :src="file.url" alt=""
                  >
                  <span class="el-upload-list__item-actions">
                    <span
                      class="el-upload-list__item-preview"
                      @click="handlePictureCardPreview(file)"
                    >
                      <i class="el-icon-zoom-in"></i>
                    </span>
                    <span
                      v-if="!disabled"
                      class="el-upload-list__item-delete"
                      @click="handleRemove(file)"
                    >
                      <i class="el-icon-delete"></i>
                    </span>
                  </span>
                </div>
              </el-upload>
                <p class="tips" >共<span >1</span>张，还能上传<span>9</span>张</p>

              <el-dialog :visible.sync="dialogVisible">
                <img width="100%" :src="dialogImageUrl" alt>
              </el-dialog>
            </el-form-item>
      </el-form>
        </div>
      </div>
      <div class="submit-wrapper c-border">
        <a href="javascript:;">提交</a>
        </div>
   </div>
  
 </div>
</template>

<script>
export default {
  data(){
    return {
      disabled: false,
      dialogVisible:false,
      dialogImageUrl: "",
      text: "",
      evaluate: null,
      iconClasses: ['fa fa-heart','fa fa-heart','fa fa-heart', 'fa fa-heart', 'fa fa-heart']
    }
  },
  methods:{
     handleRemove(file) {
      console.log(file);
    },
    handlePictureCardPreview(file) {
      this.dialogImageUrl = file.url;
      this.dialogVisible = true;
    },
    handleDownload(file) {
      console.log(file);
    }
  }
}
</script>

<style lang="scss">
.pub-evaluate-container{
  height: 504px;
  background: #fff;
  display: flex;
  .l{
    flex: 0 0 378px;
    border-right: 1px #ededed solid;
    .sku-info{
      margin: 0 auto;
      width: 245px;
      .sku{
        padding-top: 48px;
        text-align: center;
        height: 283px;
        border-bottom: 1px #e4e4e4 solid;
      }
      img{
        margin: 0 auto;
        display: block;
        width: 150px;
        height: 150px;
      }
      .name{
        padding: 27px 0 14px;
        font-size:14px;
        color: #666666;
      }
      .price{
        padding-bottom: 15px;
        font-size: 14px;
        color:#F04844;
      }
      .evaluate{
        color:#999999;
      }
      .order{
        padding-top:19px;
        p{
          font-size: 14px;
          line-height: 28px;
          span{
            display: inline-block;
            color: #666666;
          }
          .label{
            width: 80px;
            text-align: right;
            color: #999999;
          }
        }
      }
    }
  }
  .r{
    padding-top:45px;
  }
  .v-form-group .el-form-item__label{
    padding-right: 20px;
  }
  .v-form-group .el-form-item__content,
  .v-form-group .el-form-item__label{
    line-height: 35px;
    height: 35px;
    font-size: 14px;
  }
  .el-textarea__inner::placeholder{
    color: #CCCCCC;
    font-family: 微软雅黑;
    font-size: 14px
  }
  .el-textarea__inner:focus{
    outline: none;
    border:1px #e4e4e4 solid;
  }
  .v-form-group .el-form-item{
    margin-bottom:10px;
  }
  .el-form-item__content{
    padding-top: 10px;
  }
  .el-rate__item{
    margin-right: 5px;
    i{
      font-size: 22px;
    }
  }
  .el-upload--picture-card,
  .el-upload-list--picture-card .el-upload-list__item {
    line-height: 1;
    width: 100px;
    height: 100px;
    border: 1px solid #d7dde4;
    background: #fff;
    border-radius: 0;
  }
  .el-upload--picture-card i {
    font-size: 25px;
    margin: 30px 0 6px;
    color: #ccc;
  }
  .el-upload--picture-card .t {
    font-size: 12px;
    color: #ccc;
  }
  .el-upload-list--picture-card .el-upload-list__item-actions {
    bottom:0;
    top: auto;
    height:30px;
    background-color: #666666;
  }
  .el-icon-zoom-in,
  .el-icon-delete {
    font-size: 14px;
    color: #fff;
  }
  .tips{
    line-height: 2;
    padding-bottom:20px;
    padding-left: 12px;
    vertical-align: bottom;
    display:inline-block;
    font-size: 12px;
    color: #999999;
    span{
      color:#F04844;
    }
  }
 
}
.submit-wrapper{
    margin-top:20px;
    display: flex;
    align-items: center;
    justify-content: center;
    padding-right: 48px;
    height: 100px;
    background-color: rgba(249, 249, 249, 1);
    a{
      display: inline-block;
      text-align: center;
      line-height: 45px;
      font-size: 14px;
      color:#fff;
      width: 150px;
      height: 45px;
      background-color: rgba(240, 72, 68, 1);
      &:hover{
        opacity: 0.9;
      }
    }
  }
</style>
