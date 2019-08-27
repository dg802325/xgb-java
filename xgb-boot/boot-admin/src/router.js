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

//注册
const applyResidentce = [
    {
        path: '/registUser',
        component: () => import('./views/ApplyResidentce/entry.vue'),
        meta: {title: '新用户注册'}
    },
    {
        path: '/protocolDetail',
        component: () => import('./views/ApplyResidentce/lookProtocol.vue'),
        meta: {title: '服务协议'}
    },
    {
        path: '/registSuccess/:id',
        component: () => import('./views/ApplyResidentce/success.vue'),
        meta: {title: '注册成功'}
    },
];

//消息
const messageRouter = [
    {
        path: '/message',
        component: Layout,
        children: [
            {
                path: 'list',
                component: () => import('./views/Message/entry.vue'),
                meta: {title: '消息列表'}
            },
        ]
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


//商品
const skuRouter = [
    {
        path: '/sku',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'delivery/:skuId/:parentId/:id',
                component: () => import('./views/Sku/delivery.vue'),
                meta: {title: '配送区域'}
            },
            {
                path: 'selectTable',
                component: () => import('./views/sellSpu/spuList.vue'),
                meta: {title: '商品列表'}
            },
            {
                path: 'selectTable/editSkuInfo/:threeCategoryId/:spuId/:id',
                component: () => import('./views/sellSpu/editSkuInfo.vue'),
                meta: {title: '编辑商品详情'}
            },
            {
                path: 'selectTable/editResource/:parentId/:spuId/:id',
                component: () => import('./views/sellSpu/editResource.vue'),
                meta: {title: '编辑商品属性'}
            },
            {
                path: 'selectFl',
                component: () => import('./views/sellSpu/selectFl.vue'),
                meta: {title: '商品分类'}
            },
            {
                path: 'selectTable/editSpuInfo/:threeCategoryId/:spuId/:id',
                component: () => import('./views/sellSpu/backAddSpuInfo.vue'),
                meta: {title: '编辑上架商品'}
            },
            {
                path: 'selectFl/skuResource/:parentId/:spuId/:id',
                component: () => import('./views/sellSpu/skuResource.vue'),
                meta: {title: '资源录入'}
            },
            {
                path: 'selectTables',
                component: () => import('./views/Spu/SkuTable.vue'),
                 meta: {title: '商品列表'}
            },
             {
                  path: 'elavaluation',
                  component: () => import('./views/goodEvaluation/Management.vue'),
                  meta: {title: '商品评价'}
             },
             {
                   path: 'elavaluation/detailElavaluation/:id',
                   component: () => import('./views/goodEvaluation/resourceInfo.vue'),
                   meta: {title: '评价详情'}
              },

            {
                path: 'selectFl/addSpuInfo/:threeCategoryId',
                component: () => import('./views/sellSpu/insertEntry.vue'),
                meta: {title: '商品详情'}
            },
            {
                path: 'addGoods/ReturnClass/:parentId',
                component: () => import('./views/sellSpu/returnGoodsClass.vue'),
                meta: {title: '返回分类'}
            },
            {
                path: 'selectTable/backEditSkuInfo/:threeCategoryId/:spuId/:id',
                component: () => import('./views/sellSpu/backEditSkuInfo.vue'),
                meta: {title: '编辑返回商品详情'}
            },

             {
                 path: 'addGoodInformation/:threeCategoryId',
                 component: () => import('./views/Spu/GoodsInformation.vue'),
                 meta: {title: '填写商品信息'}
             },
            {
               path: 'addGoods/editAddGoodInformation/:creatorId/:id',
               component: () => import('./views/Spu/editGoodsInformation.vue'),
               meta: {title: '修改商品信息'}
            },

            {
                path: 'addGoodAttributes/:parentId/:spuId',
                component: () => import('./views/Spu/goodAttribute.vue'),
                meta: {title: '填写商品属性'}
            },

            {
                 path: 'addGoods/editAddGoodsAttributes/:parentId/:skuId',
                 component: () => import('./views/Spu/editGoodsAttribute.vue'),
                 meta: {title: '修改商品属性'}
             },
            {
                path: 'brandManager',
                component: () => import('./views/BrandManager/entry.vue'),
                meta: {title: '品牌管理'}
            },
            {
                path: 'brandManager/brandAdd',
                component: () => import('./views/BrandManager/insert.vue'),
                meta: {title: '添加品牌'}
            },
            {
                path: 'brandManager/brandDetail/:id',
                component: () => import('./views/BrandManager/look.vue'),
                meta: {title: '品牌详情'}
            },


        ]
    },
];

//销售
const saleRouter = [
    {
        path: '/sale',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'orderManagement',
                component: () => import('./views/OrderManagement/entry.vue'),
                meta: {title: '销售订单列表'}
            },
            {
                path: 'orderManagement/audite/:id',
                component: () => import('./views/OrderManagement/audite.vue'),
                meta: {title: '查看订单'}
            },
            {
                path: 'orderManagement/sendGoods/:id',
                component: () => import('./views/OrderManagement/sendGoods.vue'),
                meta: {title: '去发货'}
            },
            {
                path: 'directDealManagement',
                component: () => import('./views/DirectDealManager/entry.vue'),
                meta: {title: '厂家直销'}
            },
            {
                path: 'directDealManagement/insert',
                component: () => import('./views/DirectDealManager/insert.vue'),
                meta: {title: '新增厂家直销单'}
            },
            {
                path: 'directDealManagement/edit/:id',
                component: () => import('./views/DirectDealManager/edit.vue'),
                meta: {title: '厂家直销单编辑'}
            },
            {
                path: 'directDealManagement/lookDetail/:id',
                component: () => import('./views/DirectDealManager/detail.vue'),
                meta: {title: '厂家直销单详情'}
            },
        ]
    },
];

//合同
const contractRouter=[
    {
        path: '/contract',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'contractManagement',
                component: () => import('./views/BbiContract/contractManagement.vue'),
            meta: {title: '电子合同管理'}
            },
            {
                path: 'contractManagement/partyContract/:contractId',
                component: () => import('./views/BbiContract/partyContract.vue'),
                 meta: {title: '合同审核状态'}
            },
        ]
    },
];

//财务
const financeRouter=[
    {
        path: '/finance',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'withdrawalApplication',
                component: () => import('./views/Withdrawal/toApplyFor.vue'),
                meta: {title: '提现管理'}
            },

            {
                path: 'withdrawalApplication/withdrawalApproval/:id',
                component: () => import('./views/Withdrawal/Approval.vue'),
                meta: {title: '提现审批'}
            },
            {
                path: 'balane',
                component: () => import('./views/Withdrawal/balane.vue'),
                meta: {title: '账户余额'}
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
    ]
  },
];
//库存
const stockRouter = [
    {
        path: '/stock',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'InventoryManagement',
                component: () => import('./views/InventoryManagement/InventoryManagement.vue'),
                meta: {title: '库存管理'}
            },
            {
                path: 'erpStorehouseList',
                component: () => import('./views/ErpStorehouse/entry.vue'),
                meta: {title: '仓库管理'}
            },
            {
                path: 'erpStorehouseList/erpEditStorehouse/:id',
                component: () => import('./views/ErpStorehouse/edit.vue'),
                meta: {title: '仓库管理'}
            },
            {
                path: 'erpStorehouseList/insertStorehouse',
                component: () => import('./views/ErpStorehouse/insert.vue'),
                meta: {title: '新增仓库'}
            },
            {
                path: 'erpStorehouseLogList',
                component: () => import('./views/ErpStorehouseLog/entry.vue'),
                meta: {title: '库存变动明细'}
            },
            {
                path: 'erpStorehouseList/lookStorehouse/:id',
                component: () => import('./views/ErpStorehouse/view.vue'),
                meta: {title: '查看仓库'}
            },
            {
                path: 'resourceManagement',
                component: () => import('./views/resourceManagement/Management.vue'),
                meta: {title: '物资管理'}
            },
            {
                path: 'resourceManagement/resourceInfo/:id',
                component: () => import('./views/resourceManagement/resourceInfo.vue'),
                meta: {title: '物资管理'}
            },
            {
                path: 'resourceManagement/editGoodsClass/:parentId/:spuId',
                component: () => import('./views/resourceManagement/editGoodsClass.vue'),
                meta: {title: '编辑物资分类'}
            },
            {
                path: 'resourceManagement/editResource/:threeCategoryId/:spuId',
                component: () => import('./views/resourceManagement/editResource.vue'),
                 meta: {title: '编辑物资'}
             },
             {
                 path: 'resourceManagement/returnClass/:parentId',
                 component: () => import('./views/Spu/returnGoodsClass.vue'),
                 meta: {title: '上一步选择物资分类'}
              },


              {
                path: 'resourceManagement/returnClassAttribute/:parentId/:spuId',
                component: () => import('./views/Spu/returnGoodsAttribute.vue'),
                meta: {title: '上一步选择物资属性分类'}
              },

            {
                path: 'resourceManagement/addGoods',
                    component: () => import('./views/Spu/chooseClass.vue'),
                meta: {title: '选择商品分类'}
            },
            {
                path: 'resourceManagement/addGoodInformation/:threeCategoryId',
                   component: () => import('./views/Spu/GoodsInformation.vue'),
                meta: {title: '填写商品信息'}
            },
            {
               path: 'resourceManagement/addGoodAttributes/:parentId/:spuId',
                   component: () => import('./views/Spu/goodAttribute.vue'),
               meta: {title: '填写商品属性'}
             },
        ]
    },
];

//代理
const agentRouter = [
    {
        path: '/agent',
        component: Layout,
        redirect: '/login',
        children: [
            {
                path: 'dealerManament',
                component: () => import('./views/DealerManagemer/entry.vue'),
                meta: {title: '县域服务商列表'}
            },
            {
                path: 'dealerManament/lookDetail/:id',
                component: () => import('./views/DealerManagemer/detail.vue'),
                meta: {title: '邀请县域服务商代理'}
            },
            {
                path: 'applyAgentManament',
                component: () => import('./views/ApplyAgentManagemer/entry.vue'),
                meta: {title: '代理申请管理'}
            },
            {
                path: 'applyAgentManament/applyAgentAudit/:id',
                component: () => import('./views/ApplyAgentManagemer/lookDetail.vue'),
                meta: {title: '审核代理申请'}
            },
            {
                path: 'invitationManagement',
                component: () => import('./views/ApplyAgentManagemer/invitation.vue'),
                meta: {title: '代理邀请管理'}
            },
            {
                path: 'applyAgentManament/auditeDetail/:id',
                component: () => import('./views/ApplyAgentManagemer/auditeDetail.vue'),
                meta: {title: '邀请详情'}
            },
            {
                path: 'invitationManagement/auditeDetail/:id',
                component: () => import('./views/ApplyAgentManagemer/auditeDetail.vue'),
                meta: {title: '邀请详情'}
            },
        ]

    },
];

const routes = [...publicRouter,...systemRouter,...stockRouter,...contractRouter,...applyResidentce,...homeRouter,...skuRouter,...agentRouter,...saleRouter,...financeRouter,...messageRouter];

export default new Router({
  base: process.env.BASE_URL,
  mode:'history',
  routes
})

