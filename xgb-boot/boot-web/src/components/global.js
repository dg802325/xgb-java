import Vue from 'vue';
import InitView from './InitView/entry';
import ThumbsUp from './ThumbsUp/entry';
import vRate from './Rate/entry';
import vLogistics from './Logistics/entry';
import vCancelOrder from './CancelOrder/entry';

Vue.component('v-init-view',InitView)
Vue.component('v-thumbs-up',ThumbsUp)
Vue.component('v-rate',vRate)
Vue.component('v-logistics',vLogistics)
Vue.component('v-cancel-order',vCancelOrder)
