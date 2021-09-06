package com.training.program.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


        // Css resource.
        registry.addResourceHandler("/styles/**") //
                .addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);

        // JS resource.
        registry.addResourceHandler("/scripts/**") //
                .addResourceLocations("/WEB-INF/resources/js/").setCachePeriod(31556926);


    }


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }



}


