#######################################################################################################################################

生成 Controller

    权限列表如下：

            查询 ： ${permissions!}:MENU

       新增/修改 ： ${permissions!}:SAVE

            删除 ： ${permissions!}:DELETE

生成 Vue

    菜单列表如下：

        //${vueTableName!}
        const ${someModelName!}Router = [
            {
                path: '${someModelName!}',
                component: Layout,
                redirect: '/login',
                children: [
                    {
                        path: '${someModelName!}',
                        component: () => import('./views/${someModelName!}/${modelName!}.vue'),
                        meta: {title: '${vueTableName!}管理'}
                    },
                ]
            },
        ];
