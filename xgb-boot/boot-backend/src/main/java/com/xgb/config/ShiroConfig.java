package com.xgb.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author: PENG
 * @date: 2018/2/7
 * @description: shiro 配置类
 */

@Configuration
public class ShiroConfig {

    @Bean(name = "authRealm")
    public MyRealm authRealm(){
        MyRealm authRealm = new MyRealm();
        return authRealm;
    }
    @Bean(name ="securityManager")
    public DefaultWebSecurityManager  securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(authRealm());
        return securityManager;

    }

    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        MyPassThruAuthenticationFilter authFilter = new MyPassThruAuthenticationFilter();
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("authc",authFilter);
        shiroFilterFactoryBean.setFilters(filterMap);

        /**
         * 、默认的登陆访问url
         */
        Map<String, String> filterChainMap = new LinkedHashMap<String, String>();
        filterChainMap.put("/admin/login", "anon");
        filterChainMap.put("/admin/upload", "anon");
        filterChainMap.put("/admin/upload/pictureUrl", "anon");
        //重启项目之后,前端跳转到登录页面
        filterChainMap.put("/admin/vrifyToken", "authc");
        filterChainMap.put("/admin/**", "anon");
        filterChainMap.put("/admin/**", "anon");
        filterChainMap.put("/vrifyToken", "authc");

        shiroFilterFactoryBean.setUnauthorizedUrl("/admin/login");
        shiroFilterFactoryBean.setLoginUrl("/admin/login");
        //9.设置shiroFilterFactoryBean的FilterChainDefinitionMap
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainMap);
        return shiroFilterFactoryBean;
    }


    /**
     *  开启shiro aop注解支持.
     *  使用代理方式;所以需要开启代码支持;
     * @param securityManager
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    /**
     * Shiro生命周期处理器:
     * 用于在实现了Initializable接口的Shiro bean初始化时调用Initializable接口回调(例如:UserRealm)
     * 在实现了Destroyable接口的Shiro bean销毁时调用 Destroyable接口回调(例如:DefaultSecurityManager)
     */
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }
}
