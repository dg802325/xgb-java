<template>
  <div class="c-border c-info-container">
    <div class="center-tab">
      <div class="tab-item active">基本信息</div>
    </div>
    <div class="cover-wrapper">
      <img v-if="headProtrait" :src="headProtrait"/>
      <img v-else src="../images/cover.jpg"/>
      <a href="javascript:;" @click="uploadEvent">修改头像</a>
    </div>
    <el-form label-width="350px" class="info-form-wrapper v-form-group">
      <!--<el-form-item label="用户ID：">-->
        <!--<el-input v-model="id" disabled=""></el-input>-->
      <!--</el-form-item>-->
      <el-form-item label="昵称：">
        <el-input v-model="memberName" ></el-input>
      </el-form-item>
      <el-form-item label="性别：">
        <el-radio v-model="memberSex" label="1">男</el-radio>
        <el-radio v-model="memberSex" label="2">女</el-radio>
      </el-form-item>
      <el-form-item label="生日：">
        <el-select
            v-model="year"
            placeholder="年"
            style="width: 93px;"
            @change="yearChange"
            >
          <el-option
            v-for="item in years"
            :key="item"
            :label="item"
            :value="item">
          </el-option>
        </el-select>
        <el-select
            v-model="month"
            @change="monthChange"
            placeholder="月"
            style="width: 93px;margin: 0 10px;"
            >
          <el-option
            v-for="item in months"
            :key="item"
            :label="item"
            :value="item">
          </el-option>
        </el-select>
        <el-select
            v-model="date"
            placeholder="日"
            style="width: 93px;"
            >
          <el-option
            v-for="item in dates"
            :key="item"
            :label="item"
            :value="item">
          </el-option>
        </el-select>
      </el-form-item>
       <el-form-item label="城市：">
         <el-cascader
             style="width: 300px"
             v-model="citys"
             :props="optionProps"
             :options="regions"
             @change="handleChange"></el-cascader>
      </el-form-item>
       <el-form-item label="职业：">
        <el-input v-model="memberOccuption"/>
        </el-form-item>
       <el-form-item label="个性签名：" style="height:100px;">
        <el-input
          type="textarea"
          :rows="4"
          placeholder="请输入个性答名"
          v-model="memberSign">
        </el-input>
       </el-form-item>
        <el-form-item label="">
          <el-button type="primary" class="primary-button" @click="updateMemInfo">保存</el-button>
        </el-form-item>
    </el-form>
  </div>
</template>

<script>
import {host} from "../../../config";
import { mapGetters } from 'vuex'
import {getToken} from "../../../utils/auth";
export default {
  data(){
    return {
      id: '',
      memberOccuption: '',
      birthday: '',
      year: '',
      years: [],
      month: '',
      months: [],
      date: '',
      headProtrait:'',
      dates:[],
      memberName: '',
      memberSex: '1',
      memberSign: '',
      citys: [],
      memberProvince: '',
      memberCity: '',
      memberArea: '',
      memberBirthday: '', // 生日
      optionProps: {
        value: 'id',
        label: 'divisionName',
        children: 'children',
        expandTrigger: 'hover'
      }
    }
  },
  mounted(){
    let years = [];
    const oDate = new Date();
    let currentY = oDate.getFullYear();
    for(let i=currentY-100;i < currentY;i++){
        years.unshift(''+i);
    }
    this.years = years;
    this.getMemInfo();
  },
  computed: {
    ...mapGetters(['regions'])
  },
  methods: {
    // 上传图片
    uploadEvent(){
      let token = getToken();
      let oFile = document.createElement("input");
      oFile.setAttribute("type", "file");
      oFile.click();
      oFile.onchange = async (e) => {
        event.preventDefault();
        let formData = new FormData();
        formData.append('token',token)
        formData.append('headImage', e.target.files[0]);
        let res = await this.$fileUpload("/api/updateHead", formData);
        console.log(res)
        // if(res.code==='200'){

        //   let headImage = res.fileUrl;
        //   let upload = await this.$post('/api/updateHead',{
        //     token,
        //     headImage
        //   })
        //   console.log(upload)
        // }
      }
    },
    yearChange(val){
      this.month = '';
      this.date = '';
      this.months = ['01','02','03','04','05','06','07','08','09','10','11','12'];
      this.dates = [];
    },
    monthChange(val){
      const oDate = new Date(this.year,val,0);
      const len = oDate.getDate();
      this.date = '';
      let dates = [];
      for(let i=1;i<=len;i++){
        dates.push((i<10?'0'+i: ''+i));
      }
      this.dates = dates
    },
    handleChange(val){
      this.citys = val;
    },
    // 获取用户信息
    async getMemInfo(){
      let token = getToken();
      let res = await this.$post('/api/getMemInfo',{
        token
      });
      if(res.code==='200'){
        let member = res.member;
        let {
          id,
          memberName,
          memberSex,
          memberSign,
          memberProvince,
          memberCity,
          memberArea,
          memberBirthday,
          headProtrait,
          memberOccuption
        } = member;
        this.id  = id;
        this.headProtrait = headProtrait
        this.memberOccuption = memberOccuption=='null'?'':memberOccuption;
        this.memberName = memberName;
        if(memberSex){
          this.memberSex = memberSex;
        }
        this.memberSign = memberSign=='null'?'':memberSign;
        if(memberProvince && memberCity && memberArea){
          this.citys = [memberProvince,memberCity,memberArea];
        }
        let _memberBirthday = memberBirthday.split(' ')
        if(_memberBirthday.length==2){
          let birthday =  _memberBirthday[0].split('-')
          this.year =birthday[0];
          this.month =birthday[1];
          this.date =birthday[2];
        }
      }
    },
    async updateMemInfo(){
      if(!this.memberName) {
        this.$message.warning('昵称不能为空！');
        return;
      }
      if(this.citys.length===0){
        this.$message.warning('请选择城市！');
        return
      }
      if(!this.year || !this.month || !this.months ){
        this.$message.warning('请选择生日日期！');
        return
      }
      let token = getToken();
      let memberBirthday = `${this.year}-${this.month}-${this.date}`
      let params = {
        token,
        memberName:this.memberName,
        memberSex: this.memberSex,
        memberSign: this.memberSign,
        memberProvince: this.citys[0],
        memberCity: this.citys[1],
        memberArea:this.citys[2],
        memberBirthday: memberBirthday,
        memberOccuption: this.memberOccuption
      };

      let res = await this.$post('/api/updateMemInfo',params);
      if(res.code==='200'){
        this.$message.success('保存成功！')
      }else{
        this.$message.error(res.message)
      }
    }
  }
}
</script>

<style lang="scss">
.c-info-container{
  background:#fff;
  padding-bottom: 180px;
  .cover-wrapper{
    padding-top: 77px;
    text-align: center;
    img{
      display: block;
      width: 73px;
      height: 73px;
      overflow: hidden;
      border-radius: 50%;
      margin: 0 auto 24px;
    }
    a{
      font-size: 14px;
      color: #1ABC9C;
    }
  }
  .info-form-wrapper{
    padding-top:70px;
    width: 650px;
  }

}
</style>
