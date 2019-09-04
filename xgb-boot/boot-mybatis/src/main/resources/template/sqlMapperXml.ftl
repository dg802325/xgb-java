${sqlMapperHeader!}
<mapper namespace="${mapperPackage!}.${modelName!}SqlMapper">
    <sql id="Base_Column_List">
${codeSqlMapperModel!}
    </sql>

    <select id="get${modelName!}Count" resultType="java.lang.Integer" parameterType="Map">
        select count(*) from ${tableName!} ${tn!}
        where 1=1
${codeSqlIsModelNull}
    </select>

    <select id="get${modelName!}List" resultType="${mapperPackage!}.${modelName!}" parameterType="Map">
        select
        <include refid="Base_Column_List"/>
        from ${tableName!} ${tn!}
        where 1=1
${codeSqlIsModelNull}
        <if test="begin!=null and end != null">
            ${limit}
        </if>
    </select>
    <select id="selectOne" resultType="${mapperPackage!}.${modelName!}" parameterType="Map">
        select
        <include refid="Base_Column_List"/>
        from ${tableName!} ${tn!}
        where 1=1
${codeSqlIsModelNull}
        limit 0,1
    </select>

</mapper>