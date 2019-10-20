import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      component: () => import('./components/Layout/entry'),
      redirect: '/home',
      children: [
        {
          path: 'home',
          name: 'home',
          component: () => import('./views/Home/entry.vue'),
          meta: {title:'首页'}
        },
        {
          path: 'help',
          name: 'help',
          component: () => import('./views/Help/entry.vue'),
          meta: {title:'帮助中心'}
        },
        {
          path: 'business',
          name: 'business',
          component: () => import('./views/Business/entry.vue'),
          meta: {title:'帮助中心'}
        },
        {
          path: 'search',
          name: 'search',
          component: () => import('./views/Search/entry.vue'),
          meta: {title:'搜索页'}
        },
        {
          path: 'list/:parentId/:id',
          name: 'list',
          component: () => import('./views/List/entry.vue'),
          meta: {title:'列表页'}
        },
        {
          path: 'classify/:id',
          name: 'classify',
          component: () => import('./views/Classify/entry.vue'),
          meta: {title:'列表页'}
        },
        {
          path: 'detail/:id',
          name: 'detail',
          component: () => import('./views/Detail/entry.vue'),
          meta: {title:'详情页'}
        },
        {
          path: 'shop/:storeId',
          name: 'shop',
          component: () => import('./views/Detail/shop.vue'),
          meta: {title:'店铺详情'}
        },
        {
          path: 'evaluate',
          name: 'evaluate',
          component: () => import('./views/Detail/evaluate.vue'),
          meta: {title:'商品评价'}
        },
        {
          path: 'publishevaluate',
          name: 'PublishEvaluate',
          component: () => import('./views/PublishEvaluate/entry.vue'),
          meta: {title:'发布评价'}
        },
        {
          path: 'cart',
          name: 'cart',
          component: () => import('./views/Cart/entry.vue'),
          meta: {title:'购物车'}
        },
        {
          path: 'cart/order',
          component: () => import('./views/Order/cart.vue'),
          meta: {title:'购物车'}
        },
        {
          path: 'order/:skuId/:skuSum',
          name: 'order',
          component: () => import('./views/Order/entry.vue'),
          meta: {title:'填写订单信息'}
        },
        {
          path: 'order/pay/:orderId/:amountPayable/:orderCancelTime',
          component: () => import('./views/Order/pay/entry.vue'),
          meta: {title:'支付订单'}
        },
        {
          path: 'alpay/:orderId',
          component: () => import('./views/Order/pay/alpay.vue'),
          meta: {title:'支付订单'}
        },
        {
          path: 'wxpay/:orderId',
          component: () => import('./views/Order/pay/wxpay.vue'),
          meta: {title:'支付订单'}
        },
        {
          path: 'b2bUnion/:orderId/:amountPayable',
          component: () => import('./views/Order/pay/union.vue'),
          meta: {title:'支付订单'}
        },
        {
          path: 'order/success/:payType/:amountPayable',
          component: () => import('./views/Order/success/entry.vue'),
          meta: {title:'支付成功'}
        },
        {
          path: 'center',
          name: 'center',
          component: () => import('./views/Center/entry.vue'),
          redirect: '/center/person',
          children: [
            {
              path: 'person',
              component: () => import('./views/Center/person/entry.vue'),
              meta: {title: '个人中心'}
            },
            {
              path: 'message',
              component: () => import('./views/Center/message/entry.vue'),
              meta: {title: '消息通知'}
            },
            {
              path: 'info',
              component: () => import('./views/Center/info/entry.vue'),
              meta: {title: '个人信息'}
            },
            {
              path: 'security',
              component: () => import('./views/Center/security/entry.vue'),
              meta: {title: '安全中心'}
            },
            {
              path: 'changeMobile',
              component: () => import('./views/Center/security/changeMobile.vue'),
              meta: {title: '更换手机号'}
            },
            {
              path: 'address',
              component: () => import('./views/Center/address/entry.vue'),
              meta: {title: '地址管理'}
            },
            {
              path: 'order',
              component: () => import('./views/Center/order/entry.vue'),
              meta: {title: '我的订单'}
            },
            {
              path: 'order/:id',
              component: () => import('./views/Center/order/detail.vue'),
              meta: {title: '订单详情'}
            },
            {
              path: 'evaluate',
              component: () => import('./views/Center/evaluate/entry.vue'),
              meta: {title: '评价晒单'}
            },
            {
              path: 'service',
              component: () => import('./views/Center/service/entry.vue'),
              children: [
                {
                  path:'',
                  component: () => import('./views/Center/service/list/entry.vue'),
                  meta: { title: '售后申请'}
                },
                {
                  path:':id',
                  component: () => import('./views/Center/service/detail/entry.vue'),
                  meta: { title: '订单详情'}
                },
                {
                  path:'apply/:id',
                  component: () => import('./views/Center/service/apply/entry.vue'),
                  meta: { title: '申请退货'}
                },
                {
                  path:'success',
                  component: () => import('./views/Center/service/apply/success.vue'),
                  meta: { title: '申请退货'}
                }
              ]
            }
          ]
        },
      ]
    },
    {
      path: '/login',
      name: 'login',
      component: () => import('./views/Login/entry.vue'),
      meta: {title:'登录'}
    },
    {
      path: '/register',
      name: 'register',
      component: () => import('./views/Register/entry.vue'),
      meta: {title:'注册'}
    },
    {
      path: '/agreement',
      name: 'agreement',
      component: () => import('./views/Agreement/entry.vue'),
      meta: {title:'用户服务协议'}
    },
    {
      path: '/register/success',
      component: () => import('./views/Register/success.vue'),
      meta: {title:'注册成功'}
    },
    {
      path: '/forgetPassword',
      name: 'forgetPassword',
      component: () => import('./views/ForgetPassword/entry.vue'),
      meta: {title:'忘记密码'}
    },
    {
      path: '/mySume',
      name: 'mySume',
      component: () => import('./views/MySume/mySume.vue'),
      meta: {title:'我的简历'}
    },
  ],
  scrollBehavior(to, from, savedPosition) {
    return {x: 0, y: 0}
  },
})
