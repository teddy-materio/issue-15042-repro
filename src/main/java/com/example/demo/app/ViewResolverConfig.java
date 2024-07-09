//package com.example.demo.app;
//
//import java.io.IOException;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
//import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
//
//import freemarker.template.TemplateException;
//
//@Configuration
//public class ViewResolverConfig {
//
//  @Bean
//  public ViewResolver viewResolver() {
//    FreeMarkerViewResolver bean = new FreeMarkerViewResolver();
//    bean.setCache(true);
//    bean.setPrefix("");
//    bean.setSuffix(".html");
//    bean.setContentType("text/html; charset=UTF-8");
//    return bean;
//  }
//
//  @Bean
//  public FreeMarkerConfigurer freemarkerConfig() throws IOException, TemplateException {
//    FreeMarkerConfigurer configurer = new FreeMarkerConfigurationFactory();
//    factory.setTemplateLoaderPaths("classpath:/blocktemplates/",
//        "classpath:/emails/",
//        "classpath:/pdftemplates/",
//        "classpath:/shared/",
//        "classpath:/print/",
//        "classpath:/web/",
//        "classpath:/templates/");
//    factory.setDefaultEncoding("UTF-8");
//    FreeMarkerConfigurer result = new FreeMarkerConfigurer();
//    result.setConfiguration(factory.createConfiguration());
//    return result;
//  }
//}
