# 本内容纯属个人爱好


# 技术栈
1. JAVA 
	+ JDK1.8
	+ Tomcat8
	+ SpringBoot
	+ MyBatis
	+ log4j
	+ Freemarker
2. 数据库
	+ MySql 5.7
	+ 基字符集 utf8
	+ 排序规则 utf8_general_ci
# 一些介绍
1. xgb-boot xgb-工具箱
    + 一个带页面的代码生成工具目前正在完善中,使用 jdbc连接池、 freemark 模板、file文件生成等 工具 模仿mybatis代码生成工具的生成格式生成代码。 计划将日常中用到的功能都写入生成目录，可选择生成一个或者多个，节省时间去学习新的东西。
        1. 生成Model和ModelExample --已完成
        2. 生成Mapper和MapperXml --已完成 (另加 SqlMapper 和 SqlMapperXml 用于写拓展 Sql 语句 可选择不生成)
        3. 生成Service --已完成
        4. 生成Controller --已完成
        5. 生成一个带增删改(窗口化)查的Vue页面 --已完成
    + 使用方法在项目下的文档中。
2. xgm-mybatis 代码生成工具 下面简单介绍下
    + 项目借鉴自 https://github.com/fenglibin/CodeGenerator 找了很久的代码生成工具，感觉这个还是最简单易懂的，
      感谢大佬的备注............................
    + 根据日常需求和idea简单集成mybatis-generator逆向工程的文件，在原项目基础上做了一些简单的修改。
        1. 删除了普通mybatis-generator逆向工程不会生成的一些方法。(不是不好用，每次idea操作逆向工程总会覆盖掉，个人用不习惯)
        2. 新增了sqlMapper和sqlMapper.xml文件。用于需求变更和拓展sql使用
        3. 修改了根据mapper生成 Controller 的代码，改为生成固定的增删改查基本功能
    + 由于前端比较菜，没写模板。
    + 想要使用就看项目中的文档
2. 暂时其他项目只是 demo 还没写。
