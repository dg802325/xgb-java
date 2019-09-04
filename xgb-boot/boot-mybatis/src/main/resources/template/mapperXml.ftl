<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${mapperPackage!}.${modelName!}Mapper" >
    <resultMap id="BaseResultMap" type="${modelPackage!}.${modelName!}" >
        <constructor >
${codeXmlMapper!}
        </constructor>
    </resultMap>

    <sql id="Example_Where_Clause" >
        <where >
            <foreach collection="oredCriteria" item="criteria" separator="or" >
                <if test="criteria.valid" >
                    <trim prefix="(" suffix=")" prefixOverrides="and" >
                        <foreach collection="criteria.criteria" item="criterion" >
                            <choose >
                                <when test="criterion.noValue" >
                                    ${condition1!}
                                </when>
                                <when test="criterion.singleValue" >
                                    ${condition2!}
                                </when>
                                <when test="criterion.betweenValue" >
                                    ${condition3!}
                                </when>
                                <when test="criterion.listValue" >
                                    ${condition0!}
                                    <foreach collection="criterion.value" item="listItem" open="(" close=")" separator="," >
                                        ${listItem!}
                                    </foreach>
                                </when>
                            </choose>
                        </foreach>
                    </trim>
                </if>
            </foreach>
        </where>
    </sql>

    <sql id="Update_By_Example_Where_Clause" >
        <where >
            <foreach collection="example.oredCriteria" item="criteria" separator="or" >
                <if test="criteria.valid" >
                    <trim prefix="(" suffix=")" prefixOverrides="and" >
                        <foreach collection="criteria.criteria" item="criterion" >
                            <choose >
                                <when test="criterion.noValue" >
                                    ${condition1!}
                                </when>
                                <when test="criterion.singleValue" >
                                    ${condition2!}
                                </when>
                                <when test="criterion.betweenValue" >
                                    ${condition3!}
                                </when>
                                <when test="criterion.listValue" >
                                    ${condition0!}
                                    <foreach collection="criterion.value" item="listItem" open="(" close=")" separator="," >
                                        ${listItem!}
                                    </foreach>
                                </when>
                            </choose>
                        </foreach>
                    </trim>
                </if>
            </foreach>
        </where>
    </sql>

    <sql id="Base_Column_List" >
${getTableColumnName!}
    </sql>

    <select id="selectByExample" resultMap="BaseResultMap" parameterType="${modelPackage!}.${modelName!}Example" >
        select
        <if test="distinct" >
            distinct
        </if>
        <include refid="Base_Column_List" />
        from ${tableName!}
        <if test="_parameter != null" >
            <include refid="Example_Where_Clause" />
        </if>
        <if test="orderByClause != null" >
            order by ${orderByClause!}
        </if>
    </select>

    <select id="selectByPrimaryKey" resultMap="BaseResultMap" parameterType="java.lang.String" >
        select
        <include refid="Base_Column_List" />
        from ${tableName!}
        where ${whereId!}
    </select>

    <delete id="deleteByPrimaryKey" parameterType="java.lang.String" >
        delete from ${tableName!}
        where ${whereId!}
    </delete>

    <delete id="deleteByExample" parameterType="${modelPackage!}.${modelName!}Example" >
        delete from ${tableName!}
        <if test="_parameter != null" >
            <include refid="Example_Where_Clause" />
        </if>
    </delete>

    <insert id="insert" parameterType="${modelPackage!}.${modelName!}" >
${inset!}
    </insert>

    <insert id="insertSelective" parameterType="${modelPackage!}.${modelName!}" >
        insert into ${tableName!}
        <trim prefix="(" suffix=")" suffixOverrides="," >
${codeInsertSelective1!}
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides="," >
${codeInsertSelective2!}
        </trim>
    </insert>

    <select id="countByExample" parameterType="${modelPackage!}.${modelName!}Example" resultType="java.lang.Integer" >
        select count(*) from ${tableName!}
        <if test="_parameter != null" >
            <include refid="Example_Where_Clause" />
        </if>
    </select>

    <update id="updateByExampleSelective" parameterType="map" >
        update ${tableName!}
        <set >
${codeUpdateExampleSelective1!}
        </set>
        <if test="_parameter != null" >
            <include refid="Update_By_Example_Where_Clause" />
        </if>
    </update>

    <update id="updateByExample" parameterType="map" >
        ${update!}
        <if test="_parameter != null" >
<include refid="Update_By_Example_Where_Clause" />
        </if>
    </update>

    <update id="updateByPrimaryKeySelective" parameterType="${modelPackage!}.${modelName!}" >
        update ${tableName!}
        <set >
${codeUpdateByKeySelective!}
        </set>
        where ${whereId}
    </update>
    <update id="updateByPrimaryKey" parameterType="${modelPackage!}.${modelName!}" >
        update ${tableName!}
        set
${codeUpdateByKey!}
        where ${whereId}
    </update>
</mapper>