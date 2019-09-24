<template>
  <div class="c-border message-container">
    <div class="center-tab">
      <div class="tab-item active">系统消息</div>
    </div>
    <div class="empty" v-if="list.length==0">
      <img src="./images/u806.svg" />
      <p>暂无系统消息</p>
    </div>

    <div class="msg-list">
      <div class="msg-item" v-for="item in list" :key="item.id">
        <div class="item-header">
          <p class="title">{{item.title}}</p>
          <p class="date " :class="{'active':item.isRead==0}">{{item.createTime}}</p>
        </div>
        <div class="item-body">
          <p class="value" v-html="item.content"></p>
          <a href="javascript:;" class="check" @click="checkDetail(item)">查看详情 ></a>
        </div>
      </div>
    </div>
    <div class="v-modal-mask"  @click="visibility=false" v-if="visibility"></div>
   <el-card class="v-modal-container" v-if="visibility">
      <div class="modal-header">
        <i class="fa fa-close" @click="visibility=false"></i>
        <div class="title">{{detail.noticeTitle}}</div>
        <div class="date">{{detail.createTime}}</div>
      </div>
      <div class="modal-body" v-html="detail.noticeContent">
      </div>
      <div class="modal-footer">
        <el-button type="primary" class="v-primary" @click="visibility=false">确定</el-button>
      </div>
    </el-card>
  </div>
</template>

<script>
  import {getToken} from "../../../utils/auth";

  export default {
  data(){
    return {
      visibility: false,
      list: [],
      detail: {}
    }
  },
  created() {
    this.getMbMessageList();
  },
  methods: {
    // 详情
    async checkDetail({id,noticeId}){
      let token = getToken();
        let res = await this.post('/api/getMbMessageInfo',{
          id,
          noticeId,
          token
        });
        if(res.code==='200'){
          this.visibility = visibility;
          this.detail = res.sysNotice;
          this.getMbMessageList();
        }else{
          this.$message.error(res.message)
        }
    },
    // 列表
    async getMbMessageList(){
      let token = getToken();
      let res = await this.$get('/api/getMbMessageList', {
        token,
        origin: 'pc'
      });
      if(res.code==='200'){
        this.list = res.mbMessageList;
      }
    }
  }
}
</script>

<style lang="scss">
.message-container{
  background:#fff;
  min-height: 535px;
  .msg-list{
    padding: 20px 19px 0;
    .msg-item{
      border:1px #ededed solid;
      margin-bottom: 20px;
      .item-header{
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 0 19px 0 19px;
        background: #f9f9f9;
        height: 48px;
        border-bottom:1px #ededed solid;
        .title{
          font-size: 16px;
        }
        .date{
          position: relative;
          color:#999;
          font-size: 14px;
          &.active::after{
            position: absolute;
            left:-12px;
            top: 3px;
            content:'';
            width:8px;
            height: 8px;
            background-color: rgba(255, 89, 24, 1);
            border-radius: 50%;
          }
        }
      }
      .item-body{
        height: 60px;
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding:0 19px;
        .value{
          width: 720px;
          font-size: 14px;
          color: #999999;
          white-space: nowrap;
          overflow: hidden;
          text-overflow: ellipsis;
        }
        .check{
          &:hover{
            color: rgb(26, 188, 156);
          }
        }
      }
    }
  }
}
</style>
