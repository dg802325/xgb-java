<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${mapperPackage}.${modelNameUpperCamel}SqlMapper">

    <sql id="Base_Column_List">
        <#list sqlMapperXmlModel as sqlMapperModel>
            ${sqlMapperModel!''}
        </#list>
    </sql>

    <select id="get${modelNameUpperCamel}Count" resultType="java.lang.Integer" parameterType="Map">
        select count(*) from ${tableName} ${tn}
        where 1=1
       ${isModelNull}
    </select>


    <select id="get${modelNameUpperCamel}List" resultType="${modelPackage}.${modelNameUpperCamel}" parameterType="Map">
        select
        <include refid="Base_Column_List"/>
        from ${tableName} ${tn}
        where 1=1
        ${isModelNull}
        <if test="begin!=null and end != null">
            limit ${begin},${end}
        </if>
    </select>
    <select id="selectOne" resultType="${modelPackage}.${modelNameUpperCamel}" parameterType="Map">
        select
        <include refid="Base_Column_List"/>
        from ${tableName} ${tn}
        where 1=1
        ${isModelNull}
        limit 0,1
    </select>

</mapper>