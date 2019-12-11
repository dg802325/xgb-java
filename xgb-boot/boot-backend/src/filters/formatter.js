import Vue from 'vue';

Vue.filter('formatData',function(value,map){
    return map[value];
});
