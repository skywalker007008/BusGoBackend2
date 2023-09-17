package com.skywalker.tinybusgo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Skywalker
 * Date: 2023/9/6
 * File: MybatisPlusConfig
 * Description: mybatis-plus的配置文件
 */

@Configuration
//@MapperScan("com.skywalker.testspring.mapper")
public class MybatisPlusConfig {
    // 分页插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

//    @Bean
//    public SqlSessionFactory mybatisSqlSessionFactory(DataSource dataSource, MybatisPlusInterceptor interceptor) throws Exception {
//        MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
//        sessionFactoryBean.setPlugins(interceptor);
//
//        GlobalConfig globalConfig = new GlobalConfig();
//        globalConfig.setBanner(false);
//        sessionFactoryBean.setGlobalConfig(globalConfig);
//
//        return sessionFactoryBean.getObject();
//    }


}
