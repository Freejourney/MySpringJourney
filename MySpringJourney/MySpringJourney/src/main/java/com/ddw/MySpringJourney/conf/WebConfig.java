package com.ddw.MySpringJourney.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author DongDawei
 * @createTime 2020/7/2823:06
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 视图控制器
     *
     * 作为十分简单的控制器将请求转发到视图
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}
