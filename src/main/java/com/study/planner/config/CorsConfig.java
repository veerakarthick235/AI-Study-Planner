package com.study.planner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        // The exact URLs that are allowed to talk to your backend
                        .allowedOrigins(
                                "http://localhost:5500", 
                                "http://localhost:3000", 
                                "https://study-planner-21xx.vercel.app" 
                        )
                        // Explicitly allowing the methods Vercel needs
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        // Allowing JSON headers
                        .allowedHeaders("*")
                        // Allowing credentials (required for secure logins)
                        .allowCredentials(true);
            }
        };
    }
}