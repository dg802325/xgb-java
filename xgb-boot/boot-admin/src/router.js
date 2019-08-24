import Vue from 'vue'
import Router from 'vue-router'
import Layout from './components/Layout/entry'

Vue.use(Router)

// 登录
const PublicLogin = [
    {
        path: '/',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: '/dashboard',
                name: 'dashboard',
                component: () => import('./views/Home/home.vue')
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
const PublicHome = [
    {
        path:'/',
        component:Layout,
        redirect: '/login',
        children:[
            {
                path: '/updatePassword',
                component: () => import('./views/Home/updatePassword.vue'),
                meta: {title: '修改密码'}
            },
            {
                path: '/updateUser',
                component: () => import('./views/Home/updateUser.vue'),
                meta: {title: '修改基本信息'}
            },
            {
                path: '/userInfo',
                component: () => import('./views/UserInfo/userInfo.vue'),
                meta: {title: '修改基本信息'}
            },
        ]
    }
]

//权限
const PublicRole = [
    {
        path:'/role',
        component:Layout,
        redirect: '/dashboard',
        children:[
            {
                path: 'departmental',
                component: () => import('./views/Role/Departmental/departmental.vue'),
                meta: {title: '部门管理'}
            },
            {
                path: 'deptMember',
                component: () => import('./views/Role/DeptMember/deptMember.vue'),
                meta: {title: '成员管理'}
            },
            {
                path: 'memberPermissions',
                component: () => import('./views/Role/DeptMember/memberPermissions.vue'),
                meta: {title: '成员权限'}
            },
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
        ]
    }
]


const routes = [...PublicLogin,...PublicRole,...PublicHome];

export default new Router({
    base: process.env.BASE_URL,
    mode: 'history',
    routes
})

