<template>
  <div class="c-border s-apple-container">
    <div class="s-apple-header">
      <p class="l">申请退货</p>
      <p class="r">
        <i class="fa fa-comments"></i> 客服电话 400-000-000
      </p>
    </div>
    <table class="v-sku-info-table">
      <thead>
        <tr>
          <td width="413">商品信息</td>
          <td width="100">单价</td>
          <td width="130">数量</td>
          <td width="110">小计</td>
          <td>实付</td>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td align="left">
            <div class="t-sku-info">
              <div class="t-cover">
                <img src="../../images/sku.jpg">
              </div>
              <div class="info">
                <p class="name">
                  <router-link to="/detail">心连心氮肥 5KG/袋</router-link>
                </p>
                <p class="type">适合种玉米、黄瓜</p>
              </div>
            </div>
          </td>
          <td>¥249</td>
          <td>1</td>
          <td>¥249</td>
          <td>¥249</td>
        </tr>
      </tbody>
    </table>
    <div class="s-apple-title">申请信息</div>
    <div class="c-border">
      <el-form label-width="140px" class="info-form-wrapper v-form-group">
        <el-form-item label="提交数量：" required>
          <el-input-number size="small" :min="1" v-model="number"></el-input-number>
          <span class="v-tip">您最多可提交数量为1个</span>
        </el-form-item>
        <el-form-item label="退货原因：" required>
          <el-select v-model="reason" placeholder="请选择">
            <el-option value="质量问题">质量问题</el-option>
            <el-option value="配件问题">配件问题</el-option>
            <el-option value="少件/漏发">少件/漏发</el-option>
            <el-option value="与商品描述不符">与商品描述不符</el-option>
            <el-option value="包装/商品残破">包装/商品残破</el-option>
            <el-option value="发票问题">发票问题</el-option>
            <el-option value="其它">其它</el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="问题描述：" style="height:225px;" required>
          <el-input
            type="textarea"
            :rows="10"
            placeholder="请输入问题描述，不得少于10个字。"
            maxlength="500"
            show-word-limit
            v-model="desc"
          ></el-input>
        </el-form-item>
        <el-form-item label="上传凭证" required style="height:110px;margin-bottom:0">
          <el-upload action="#" list-type="picture-card" :auto-upload="false">
            <div slot="default">
              <i class="fa fa-plus"></i>
              <p class="t">选择图片</p>
            </div>

            <div slot="file" slot-scope="{file}">
              <img class="el-upload-list__item-thumbnail" :src="file.url" alt>
              <span class="el-upload-list__item-actions">
                <span class="el-upload-list__item-preview" @click="handlePictureCardPreview(file)">
                  <i class="el-icon-zoom-in"></i>
                </span>
                <span
                  v-if="!disabled"
                  class="el-upload-list__item-delete"
                  @click="handleDownload(file)"
                >
                  <i class="el-icon-download"></i>
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
          <el-dialog :visible.sync="dialogVisible">
            <img width="100%" :src="dialogImageUrl" alt>
          </el-dialog>
        </el-form-item>
        <el-form-item label style="height:40px;">
          <div style="line-height:1.6">
            <p style="color: #999999;font-size: 12px">为了帮助您更好的解决问题，请上传图片</p>
            <p
              style="color: #CCCCCC;font-size: 12px"
            >最多可上传5张图片，每张图片大小不超过5M，支持bmp,gif,jpg,png,jpeg格式文件</p>
          </div>
        </el-form-item>
      </el-form>
    </div>
    <div class="s-apple-title">联系方式</div>
    <div class="c-border">
      <el-form style="width:450px;" label-width="140px" class="info-form-wrapper v-form-group">
        <el-form-item label="联系人:">
          <el-input v-model="contacts"/>
        </el-form-item>
        <el-form-item label="联系电话:">
          <el-input v-model="mobile"/>
        </el-form-item>
      </el-form>
    </div>
    <button class="submit-btn" @click="handleSubmit">确认提交</button>
    <dl class="tips">
      <dt><i class="fa fa-exclamation-circle"></i>温馨提示：</dt>
      <dd>• 商品寄回地址将在审核通过后以短信形式告知，或在申请记录中查询。</dd>
      <dd>• 提交服务单后，售后专员可能与您电话沟通，请保持手机畅通。</dd>
      <dd>• 退货处理成功后退款金额将原路返回到您的支持账户中；</dd>
    </dl>
  </div>
</template>

<script>
export default {
  data() {
    return {
      number: 1,
      reason: "",
      desc: "",
      dialogVisible: false,
      dialogImageUrl: "",
      contacts: "Windir",
      mobile: "180****1849"
    };
  },
  methods: {
    handleSubmit(){
      this.$router.push('/center/service/success')
    },
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
};
</script>

<style lang="scss">
.s-apple-container {
  padding: 0 39px 40px;
  min-height: 533px;
  background: #fff;
  .s-apple-header {
    padding: 39px 20px 0 0;
    height: 59px;
    display: flex;
    justify-content: space-between;
    .l {
      padding: 12px 0 0 11px;
      font-size: 16px;
    }
    .r {
      width: 178px;
      height: 40px;
      background-color: rgba(255, 255, 255, 0);
      box-sizing: border-box;
      border: 1px rgba(26, 188, 156, 1) solid;
      border-radius: 3px;
      color: #1abc9c;
      text-align: center;
      line-height: 38px;
      font-size: 14px;
      color: #1abc9c;
      cursor: pointer;
      .fa {
        font-size: 16px;
        color: #1abc9c;
      }
      &:hover {
        background-color: rgba(26, 188, 156, 1);
        color: #fff;
        .fa {
          color: #fff;
        }
      }
    }
  }
  .s-apple-title {
    height: 50px;
    line-height: 50px;
    padding-top: 21px;
    font-size: 16px;
    color: #999999;
  }
  .el-form {
    width: 700px;
    padding-top: 20px;
  }
  .v-form-group .el-form-item__label {
    font-size: 14px;
  }
  .el-input-number .el-input__inner {
    height: 32px;
    line-height: 30px;
  }
  .el-textarea .el-input__count {
    line-height: 20px;
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
    margin: 20px 0 6px;
    color: #ccc;
  }
  .el-upload--picture-card .t {
    font-size: 12px;
    color: #ccc;
  }
  .el-upload-list--picture-card .el-upload-list__item-actions {
    background-color: rgba(0, 0, 0, 1);
  }
  .el-icon-delete {
    color: #fff;
  }
  .submit-btn {
    margin: 44px 0 0 110px;
    width: 300px;
    height: 45px;
    border: none;
    color: #fff;
    cursor: pointer;
    background-color: rgba(26, 188, 156, 1);
    &:hover {
      opacity: 0.8;
    }
  }
   .tips{
    padding-left: 19px;
    padding-bottom:20px;
    margin-top: 50px;
    border:1px #e4e4e4 solid;
    background:#f2f2f2;
    .fa{
      margin-right:2px;
      color: #999999;
    }
    dt{
      font-family:微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight:700;
      font-size: 14px;
      color: #999999;
      padding-top: 25px;
      padding-bottom: 6px;
    }
    dd{
      line-height: 28px;
      color: #999999;
      font-size: 14px;
    }
  }
}
</style>
