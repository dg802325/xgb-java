<template>
  <div class="plus-address-dialog">
    <div class="plus-address--wrapper">
      <span class="close" @click="handleClick"></span>
      <div class="dialog-title">添加收货地址</div>
      <div class="body">
        <div style="display:flex;">
          <div class="input-wrapper name">
            <div class="label">姓名</div>
            <input type="text" v-model="receiveName" placeholder="收货人姓名" class="input" />
          </div>
          <div class="input-wrapper">
            <div class="label">手机号</div>
            <input type="text" v-model="receivePhone" placeholder="手机号码" class="input" />
          </div>
        </div>
        <div class="input-wrapper" style="width:100%;border:none;box-sizing: border-box">
          <el-cascader
              style="width: 100%"
              v-model="region"
              separator="-"
              :props="optionProps"
              :options="regions"
              @change="handleChange"></el-cascader>
        </div>
        <div class="input-wrapper" style="width:100%;box-sizing: border-box">
          <div class="label">详细地址</div>
          <textarea placeholder="完善详细地址" v-model="detailAdd" class="textarea"></textarea>
        </div>
      </div>
      <div class="footer">
        <a href="javascript:;" class="btn default" @click="handleClick">取消</a>
        <a href="javascript:;" class="btn danger" @click="saveEvent">确定</a>
      </div>
    </div>
  </div>
</template>

<script>
import { getToken } from "../../../utils/auth";
// import cityOption from '../../../utils/region';
import { mapGetters } from 'vuex';
export default {
  data() {
    return {
      region: [],
      detailAdd: "",
      postCode: "",
      isDefault: false,
      receiveName: "",
      receivePhone: "",
      receiveProvince: "",
      receiveCity: "",
      receiveArea: "",
      optionProps: {
        value: 'id',
        label: 'divisionName',
        children: 'children',
        expandTrigger: 'hover'
      }
    };
  },
  created() {
  },
  computed: {
    ...mapGetters(['regions'])
  },
  methods: {
    handleChange(value){
      this.region = value;
    },
    handleClick() {
      this.$emit("close");
    },
    async saveEvent() {
      let detailAdd = this.detailAdd;
      let postCode = this.postCode;
      let isDefault = this.isDefault;
      let receiveName = this.receiveName;
      let receivePhone = this.receivePhone;
      if (!this.receiveName) {
        this.$message.warning("请输入收货人姓名");
        return;
      }
      if (!this.receivePhone) {
        this.$message.warning("请输入手机号码");
        return;
      }
      if (this.receivePhone.length!==11) {
        this.$message.warning("手机号码格式不正确");
        return;
      }

      if (this.region.length === 0) {
        this.$message.warning("请选择所在省份、城市、区县");
        return;
      }
      let receiveProvince = this.region[0];
      let receiveCity = this.region[1];
      let receiveArea = this.region[2];

      if (!this.detailAdd) {
        this.$message("请输入详细地址");
        return;
      }
      let token = getToken();
      let res = await this.$post("/api/insertMemberAddress", {
        token,
        detailAdd,
        postCode,
        isDefault,
        receiveName,
        receivePhone,
        receiveProvince,
        receiveCity,
        receiveArea
      });
      if (res.code === "200") {
        this.$message.success(res.message);
      }else{
        this.$message.error(res.message);
      }
      this.$emit("close");
    }
  }
};
</script>

<style lang="scss">
.plus-address-dialog {
  position: fixed;
  left: 0;
  top: 0;
  bottom: 0;
  right: 0;
  z-index: 9999;
  background: rgba(0, 0, 0, 0.34);
  .plus-address--wrapper {
    position: fixed;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    padding: 0 35px 35px;
    width: 600px;
    height: 396px;
    background: #fff;
    border-radius: 3px;
    box-sizing: border-box;
    .dialog-title {
      font-family: 微软雅黑 Bold, 微软雅黑 Regular, 微软雅黑;
      font-weight: 700;
      font-size: 20px;
      text-align: center;
      height: 50px;
      line-height: 50px;
    }
    .close {
      position: absolute;
      right: 20px;
      top: 20px;
      cursor: pointer;
      width: 13px;
      height: 13px;
      background: url(../images/u977.png);
      &:hover {
        background: url(../images/u978.png);
      }
    }
    .body {
      padding-top: 20px;
      .input-wrapper {
        margin-bottom: 20px;
        width: 248px;
        position: relative;
        border: 1px #DCDFE6 solid;
        &.name {
          margin-right: 29px;
        }
        .label {
          position: absolute;
          left: 10px;
          top: -13px;
          font-size: 12px;
          text-indent: 10px;
          color: #999999;
          line-height: 20px;
          min-width: 50px;
          padding-right: 5px;
          background: #fff;
        }
        .input {
          padding: 0 20px;
          width: 208px;
          height: 38px;
          border: none;
        }
        .textarea {
          padding: 10px 20px;
          height: 78px;
          border: none;
          width: 100%;
          resize: none;
          box-sizing: border-box;
          font-family: 微软雅黑;
        }
      }
    }
    textarea:focus,
    input:focus {
      outline: none;
    }
    textarea::placeholder,
    input::placeholder {
      color: #cccccc;
    }
  }
  .footer {
    padding: 20px 0 20px;
    display: flex;
    justify-content: center;
    .btn {
      margin: 0 6px;
      display: block;
      width: 150px;
      height: 45px;
      color: #ffffff;
      background-color: rgba(26, 188, 156, 1);
      line-height: 45px;
      text-align: center;
      font-size: 14px;
      &:hover {
        opacity: 0.9;
      }
    }
    .default {
      background: #f5f5f5;
      border: 1px #e4e4e4 solid;
      color: #999999;
      &:hover {
        color: #333333;
      }
    }
    .danger {
      background: #f04844;
      border: 1px #f04844 solid;
      color: #fff;
      &:hover {
        color: #fff;
      }
    }
  }
}
</style>
