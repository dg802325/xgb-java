# 本内容纯属个人爱好

1. 技术栈 
    + java语言
	+ JDK1.8
	+ SpringBoot
	+ mysql 5.7.22
	+ log4j
	+ Freemarker
	+ node+npm (最新版)
2. 数据库
	+ MySql 5.7
	+ 基字符集 utf8
	+ 排序规则 utf8_general_ci
3. 开发工具
    + IntelliJ Idea 
4. 目录介绍
    boot-admin --vue前端页面
    boot-api --后台响应接口 --可执行
    boot-dao --项目mapper 和 mapperxml存放目录
    boot-message --rabbit 消息队列存放目录(不定时更新开放)  --可执行
    boot-model --项目实体类存放目录
    boot-mybatis --代码生成工具逻辑目录
    boot-oss --fastdfs上传文件系统  --可执行
    boot-service --后台主要逻辑区
5. 使用指南
    1. 下载项目到自己的目录
    2. 在mysql数据库导入项目目录中的 sql 语句 
    3. 启动前端页面需安装 node + npm 最新版  请自行百度安装
    4. 在 boot-admin 根目录命令行中 执行  npm -install 导入项目所需要的依赖 
    5. 在 boot-admin 根目录命令行中 执行 npm run serve 启动 
    6. 修改 boot-api/src/main/resources 目录中 dev 环境中mysql 相关的 配置
    7. 启动 boot-api/src/main/java/com/xgb/BootApplication 中的main方法即可
    8. 使用 boot-oss 需有一个安装好nginx 和 fastdfs 环境的linux 服务器(自行解决) 需修改 yml配置文件中使用ip的地方
    9. 使用 boot-message 需有一个安装好nginx 和 rabbitmq 环境的linux 服务器(自行解决) 需修改 yml配置文件中使用ip的地方
    9. 使用 boot-message 需有一个安装好nginx 和 rabbitmq 环境的linux 服务器(自行解决) 需修改 yml配置文件中使用ip的地方