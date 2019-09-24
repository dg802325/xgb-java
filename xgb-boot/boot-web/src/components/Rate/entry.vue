<template>
  <div class="v-rate">
    <template v-for="(item,index) in rates" >
      <span class="fa" 
        :key="index"
        :class="{
          'fa-heart':value-1>=index,
          'fa-heart-o':value-1 <index
         }" 
        ></span>
    </template>
  </div>
</template>

<script>
export default {
  data(){
    return {
      rates: [1,2,3,4,5]
    }
  },
  props: {
    value: {
      type:Number,
      default: 4
    }
  }
}
</script>

<style lang="scss">
.v-rate{
  display: inline-block;
  .fa{
    font-family: 'FontAwesome';
    font-weight: 400;
    color: #F04844;
    font-size: 14px;
  }
}
</style>
