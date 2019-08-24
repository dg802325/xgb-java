import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './plugins/element.js'
import './assets/css/reset.css'
import './assets/css/main.scss'
import './components/global';
import {get,post,fileUpload} from './utils/http'
import './permisson';
import echarts from 'echarts'
import './filters/formatter'
Vue.prototype.$echarts = echarts
Vue.config.productionTip = false
Vue.prototype.$get = get
Vue.prototype.$post = post
Vue.prototype.$fileUpload= fileUpload
new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
