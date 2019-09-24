<template>
  <div class="select-city-wrapper">
    <el-cascader
        class="select-city-addres"
        v-model="regions"
        placeholder="选择省份/自治区"
        separator="-"
        :props="optionProps"
        :options="cityOption"
        @change="handleChange"
    ></el-cascader>
  </div>
</template>

<script>
  import { mapGetters,mapMutations } from 'vuex';
  import Cookies from 'js-cookie';
  export default {
    data() {
      return {
        regions: [],
        optionProps: {
          value: 'id',
          label: 'divisionName',
          children: 'children',
          expandTrigger: 'hover'
        },
      };
    },
    computed: {
      ...mapGetters(['regionMap'])
    },
    props: {
      cityOption: {
        type: Array,
        default: function(){
          return []
        }
      },
      showCity: {
        type: Array,
        default: function () {
          return []
        }
      }
    },
    watch: {
      showCity(val){
        this.regions = val;
      }
    },
    created() {
    },
    methods: {
      ...mapMutations({
        'setCode':'SET_CODE'
      }),
      handleChange(value){
        if(value.length==3){
          let code = this.regionMap[value[2]].divisionCode;
          Cookies.set('code',code ,{ expires: 100 });
          this.setCode(code)
        }
        this.$emit('changeCity',value)
      }
    }
  };
</script>

<style lang="scss">
.select-city-wrapper{
  position: absolute;
  left:8px;
  top:50px;
  height: 47px;
  width: 400px;
  background: #333333;
  .el-input__inner{
    background: #333333;
    color:#ccc;
    border:none;
    width: 400px;
  }
  .select-city-addres{

  }
}
</style>
