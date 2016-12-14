package com.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Lavanya K on 12/13/2016.
 */
@EnableWebMvc
@ComponentScan(basePackages = {"com.book"})
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Autowired
    BookFilter bookFilter;
    @Override
       public void addInterceptors(InterceptorRegistry registry) {
           registry.addInterceptor(bookFilter);
       }
    
}
