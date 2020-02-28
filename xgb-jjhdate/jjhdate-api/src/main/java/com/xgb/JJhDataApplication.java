package com.xgb;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@ComponentScan(basePackages = {"com.xgb.controller","com.xgb.config","com.xgb.common","com.xgb.model","com.xgb.service"})
@MapperScan(basePackages = "com.xgb.dao")
@SpringBootApplication
//@EnableScheduling//定时任务注解
@EnableCaching
public class JJhDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(JJhDataApplication.class, args);
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        // 这里设置mybatis xml文件的地址
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/xgb/dao/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
}
