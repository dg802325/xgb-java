
export let menus = [
    {
        title: '首页',
        icon:'u102.png',
        children: [
            {
                title: '系统首页',
                children: [
                    {
                        url: '/dashboard',
                        title: '• 系统首页'
                    },
                    {
                        url: '/system/userInfo',
                        title: '• 账户设置'
                    },
                    {
                        url: '/companyWelcome',
                        title: '• 企业认证'
                    },
                    {
                        url: '/authenStore',
                        title: '• 店铺设置'
                    }
                ],
            },

        ]

    },
    {
        title: '商品',
        icon: 'u134.png',
        children: [
            {
                title: '商品管理',
                children: [
                    {
                        url: '/sku/selectTable',
                        title: '• 商品列表'
                    },
                    {
                        url: '/sku/elavaluation',
                        title: '• 商品评价'
                    },
                    {
                        url: '/sku/addGoods',
                        title: '• 添加商品'
                    },
                    {
                        url: '/sku/brandManager',
                        title: '• 品牌管理'
                    },
                ],
            },
        ]
    },
    {
        title: '销售',
        icon: 'u131.png',
        children: [
            {
                title: '订单管理',
                children: [
                    {
                        url: '/sale/orderManagement',
                        title: '• 销售订单'
                    },
                    {
                        url: '/sale/directDealManagement',
                        title: '• 厂家直销'
                    },
                    {
                        url: '/sale/list',
                        title: '• 损耗售后管理'
                    }
                ],
            },

        ]
    },
    {
        title: '代理',
        icon: 'u131.png',
        children: [
            {
                title: '代理管理',
                children: [
                    {
                        url: '/agent/applyAgentManament',
                        title: '• 代理申请管理'
                    },
                    {
                        url: '/agent/invitationManagement',
                        title: '• 代理邀请管理'
                    },
                    {
                        url: '/agent/dealerManament',
                        title: '• 县域服务商列表'
                    }
                ],
            },

        ]
    },
    {
        title: '合同',
        icon: 'u138.png',
        children: [
            {
                title: '合同管理',
                children: [
                    {
                        url: '/contract/list',
                        title: '• 合同模板'
                    },
                    {
                        url: '/contract/contractManagement',
                        title: '• 电子合同管理'
                    }
                ],
            },

        ]
    },
    {
        title: '消息',
        icon: 'u136.png',
        children: [
            {
                title: '消息查询',
                children: [
                    {
                        url: '/',
                        title: '• 系統消息'
                    }
                ],
            },

        ]
    },
    {
        title: '库存',
        icon: 'u135.png',
        children: [
            {
                title: '库存管理',
                children: [
                    {
                        url: '/stock/erpStorehouseList',
                        title: '• 仓库管理'
                    },
                    {
                        url: '/stock/resourceManagement',
                        title: '• 物资管理'
                    },
                    {
                        url: '/stock/InventoryManagement',
                        title: '• 库存管理'
                    },
                    {
                        url: '/stock/erpStorehouseLogList',
                        title: '• 库存变动明细'
                    }
                ],
            },

        ]
    },
    {
        title: '统计',
        icon: 'u148.png',
        children: [
            {
                title: '统计分析',
                children: [
                    {
                        url: '/list',
                        title: '• 订单统计'
                    },
                    {
                        url: '/list',
                        title: '• 商品统计'
                    },
                    {
                        url: '/list',
                        title: '• 县域服务商统计'
                    }
                ],
            },

        ]
    },
    {
        title: '财务',
        icon: 'u147.png',
        children: [
            {
                title: '财务管理',
                children: [
                    {
                        url: '/list',
                        title: '• 账户余额列表'
                    },
                    {
                        url: '/finance/withdrawalApplication/',
                        title: '• 提现管理'
                    },
                    {
                        url: '/list',
                        title: '• 申请授信列表'
                    },
                    {
                        url: '/list',
                        title: '• 信用余额列表'
                    },
                    {
                        url: '/list',
                        title: '• 授信支付订单列表'
                    }
                ],
            },

        ]
    },
    {
        title: '设置',
        icon: 'u144.png',
        children: [
            {
                title: '系统设置',
                children: [
                    {
                        url: '/system/departmentManagement',
                        title: '• 岗位管理'
                    },
                    {
                        url: '/system/department',
                        title: '• 部门管理'
                    },
                    {
                        url: '/system/userManagement',
                        title: '• 成员管理'
                    },
                    {
                        url: '/system/erpWorkflow',
                        title: '• 工作流管理'
                    },
                    {
                        url: '/system/erpExpert',
                        title: '• 专家管理'
                    },
                    {
                        url: '/system/template',
                        title: '• 运费模板'
                    },
                ],
            },
        ]
    },
]
