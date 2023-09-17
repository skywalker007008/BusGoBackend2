package com.skywalker.tinybusgo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Author: Skywalker
 * Date: 2023/9/5
 * File: CorsConfig
 * Description: 解决跨域请求的问题
 */
@Configuration
public class CorsConfig {

    private static final long MAX_TIME = 24*60*60;  // 最大时长

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");    // Source Address, e.g http://localhost:8080
        corsConfiguration.addAllowedHeader("*");    // Source Request Header
        corsConfiguration.addAllowedMethod("*");    // Source Request Method
        corsConfiguration.setMaxAge(MAX_TIME);
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }
}
