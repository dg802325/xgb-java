import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './plugins/element.js'
import './assets/css/reset.css'
import './assets/css/main.scss'
import './components/global';
import './filters/formatter';
import {get,post} from './utils/http'
import echarts from 'echarts'
Vue.prototype.$echarts = echarts
Vue.config.productionTip = false
Vue.prototype.$get = get
Vue.prototype.$post = post

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
