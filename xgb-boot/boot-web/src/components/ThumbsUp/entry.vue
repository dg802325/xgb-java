<template>
  <div class="heart-wrapper" :class="{'active':status}" @click="handleClick">
    <i class="fa fa-heart" ></i>点赞 {{value}}</div>
</template>

<script>
export default {
  data(){
    return {
      status: false,
      value: 1000
    }
  },
  methods: {
    handleClick(){
      if(this.status){
        this.value--;
      }else{
        this.value++;
      }
      this.status = !this.status;
    }
  }
}
</script>

<style>

</style>
