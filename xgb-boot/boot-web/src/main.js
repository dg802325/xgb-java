import Vue from 'vue';
import App from './App.vue';
import router from './router';
import store from './store/index';
import ElementUI from 'element-ui';
// import 'element-ui/lib/theme-chalk/index.css';
import './element-variables.scss';
import './assets/css/reset.css';
import './assets/css/animate.css';
import './assets/css/main.scss';
import './components/global';
import { confirm } from './utils/confirm';
import { $get, $post,fileUpload } from "./utils/http";
import { message } from './utils/main';

Vue.prototype.$get = $get;
Vue.prototype.$post = $post;
Vue.prototype.$fileUpload = fileUpload;

Vue.use(ElementUI);
Vue.config.productionTip = false;
Vue.prototype.$$confirm = confirm;
Vue.prototype.$$message = message;

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app');
