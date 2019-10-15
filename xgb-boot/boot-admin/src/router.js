import Vue from 'vue'
import Router from 'vue-router'
import Layout from './components/Layout/entry'

Vue.use(Router)

const publicRouter = [
  {
    path: '/',
    component: Layout,
    redirect: '/login',
    children: [
      {
        path: '/dashboard',
        name: 'dashboard',
        component: () => import('./views/Home/entry.vue')
      },
    ]
  },
  {
    path: '/login',
    component: () => import('./views/Login/entry.vue'),
    meta: {title: '登录'}
  },
];

//首页
const homeRouter = [
    {
        path: '/home',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'dashboard',
                component: () => import('./views/Home/entry.vue'),
                meta: {title: '系统首页'}
            },
            {
                path: 'updateUser',
                component: () => import('./views/UserInfo/updateUser.vue'),
                meta: {title: '账户设置'}
            },
            {
                path: 'updatePassword',
                component: () => import('./views/UserInfo/updatePassword.vue'),
                meta: {title: '账户设置'}
            },
        ]
    },
];

//设置
const systemRouter = [
  {
    path: '/system',
    component: Layout,
    redirect: '/login',
    children: [
        {
            path: 'permissionsList',
            component: () => import('./views/Role/Permissions/permissionsList.vue'),
            meta: {title: '权限列表'}
        },
        {
            path: 'menusList',
            component: () => import('./views/Role/Menu/menusList.vue'),
            meta: {title: '菜单列表'}
        },
        {
            path: 'partList',
            component: () => import('./views/Role/Part/partList.vue'),
            meta: {title: '岗位管理'}
        },
        {
            path: 'deptList',
            component: () => import('./views/Role/Dept/deptList.vue'),
            meta: {title: '部门管理'}
        },
        {
            path: 'characterList',
            component: () => import('./views/Role/Character/characterList.vue'),
            meta: {title: '权限管理'}
        },
        {
            path: 'editPermissions/:sysRoleId',
            component: () => import('./views/Role/Character/editPermissions.vue'),
            meta: {title: '权限管理'}
        },
    ]
  },
];

//数据
const mybatisRouter = [
    {
        path: '/mybatis',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'mybatisPlus',
                component: () => import('./views/mybatis/mybatisPlus.vue'),
                meta: {title: '代码生成'}
            },
            {
                path: 'databaseList',
                component: () => import('./views/mybatis/databaseList.vue'),
                meta: {title: '代码生成'}
            },
        ]
    },
];

//博客
const BlogRouter = [
    {
        path: '/blog',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'blogList',
                component: () => import('./views/Blog/blogList.vue'),
                meta: {title: '博客列表'}
            },
            {
                path: 'blogAdd',
                component: () => import('./views/Blog/blogAdd.vue'),
                meta: {title: '博客添加'}
            },
            {
                path: 'blogClass',
                component: () => import('./views/Blog/blogClass.vue'),
                meta: {title: '博客分类'}
            },
        ]
    },
];

//地域
const RegoinRouter = [
    {
        path: '/region',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'regionList',
                component: () => import('./views/region/regionList.vue'),
                meta: {title: '地域4级'}
            },
        ]
    },
];

//支付
const PayRouter = [
    {
        path: '/pay',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'enterpriseIncoming',
                component: () => import('./views/Pay/enterpriseIncoming.vue'),
                meta: {title: '进件'}
            },
            {
                path: 'incomingList',
                component: () => import('./views/Pay/incomingList.vue'),
                meta: {title: '进件列表'}
            },
            {
                path: 'chinaBankCodeList',
                component: () => import('./views/Pay/chinaBankCodeList.vue'),
                meta: {title: '管理'}
            },
        ]
    },
];

//设置
const SettingsRouter = [
    {
        path: '/settings',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'dictionaries',
                component: () => import('./views/settings/dictionaries.vue'),
                meta: {title: '字典'}
            },
        ]
    },
];
//工具包
const ToolsRouter = [
    {
        path: '/tools',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'queryBankCard',
                component: () => import('./views/Bank/queryBankCard.vue'),
                meta: {title: '根据银行卡号查询银行'}
            },
        ]
    },
];

//工具包
const ShopRouter = [
    {
        path: '/shop',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'shopAdverList',
                component: () => import('./views/Shop/shopAdverList.vue'),
                meta: {title: '商城轮播图列表'}
            },
        ]
    },
];

//游戏
const GameRouter = [
    {
        path: '/game',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'maze',
                component: () => import('./views/Game/2048/maze.vue'),
                meta: {title: '2048'}
            },
            {
                path: 'notBlock',
                component: () => import('./views/Game/notBlock/index.vue'),
                meta: {title: '别踩白块'}
            },
        ]
    },
]


const routes = [...publicRouter,...systemRouter,...homeRouter,...mybatisRouter,...BlogRouter,...RegoinRouter,...PayRouter,...SettingsRouter,...ToolsRouter,...ShopRouter,...GameRouter,];

export default new Router({
  base: process.env.BASE_URL,
  mode:'history',
  routes
})

