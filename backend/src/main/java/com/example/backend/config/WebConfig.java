//package com.example.backend.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // Map root and all unmatched routes to index.html
//        registry.addViewController("/{spring:\\w+}")
//                .setViewName("forward:/index.html");
//        registry.addViewController("/**/{spring:\\w+}")
//                .setViewName("forward:/index.html");
//        registry.addViewController("/")
//                .setViewName("forward:/index.html");
//    }
//}
//
//
