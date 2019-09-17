import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './permisson';
import './plugins/element.js'
import './assets/css/reset.css'
import './assets/css/main.scss'
import './components/global';
import {get,post,fileUpload} from './utils/http'
import {checkPermission} from './utils/main'
import store from './store'
import './permisson';
import echarts from 'echarts'
import './filters/formatter'
import  VueQuillEditor from 'vue-quill-editor'
// require styles 引入样式
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'
Vue.use(VueQuillEditor)
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
