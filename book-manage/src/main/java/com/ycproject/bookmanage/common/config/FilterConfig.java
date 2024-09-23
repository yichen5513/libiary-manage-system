package com.ycproject.bookmanage.common.config;
/*
 *
 * @author:      YC
 * @date:        2024/9/23 15:36
 * @description: some description
 */
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CorsFilter> yourFilterRegistration() {
        FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CorsFilter());
        registrationBean.addUrlPatterns("/*"); // 可以指定过滤器作用的 URL 模式
        return registrationBean;
    }
}