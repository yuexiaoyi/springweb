package com.lxy;

import com.lxy.config.RootConfig;
import com.lxy.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * tomcat容器在启动的时候会自动查找实现ServletContainerInitializer接口的类
 * spring有一个实现了ServletContainerInitializer的类SpringServletContainerInitializer这个类。这个接口会处理实现了
 * WebApplicationInitializer接口的类。而AbstractAnnotationConfigDispatcherServletInitializer是实现WebApplicationInitializer接口的类
 * 因为如果要通过java-config的方式实现web.xml的功能，只需要继承AbstractAnnotationConfigDispatcherServletInitializer
 * @author lxy
 * @time 2019-01-04 22:30
 **/
public class UserWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
