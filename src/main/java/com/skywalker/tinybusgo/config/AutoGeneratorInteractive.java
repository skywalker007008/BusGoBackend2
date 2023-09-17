package com.skywalker.tinybusgo.config;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Skywalker
 * Date: 2023/9/6
 * File: AutoGeneratorInteractive
 * Description: 交互式代码生成器
 */
public class AutoGeneratorInteractive {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/spbusgo?allowPublicKeyRetrieval=true&useSSL=false";
        String username = "skywalker";
        String password = "lzh19970929";
        FastAutoGenerator.create(jdbcURL, username, password)
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author(scanner.apply("请输入作者名称？"))
//                        .enableSwagger()
                        .disableOpenDir()
                        //.fileOverride()/ 以失效
                        .outputDir("E://IdeaProject//Go Platform//SimpleBusGoBackend//src//main//java"))
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent(scanner.apply("请输入包名？")) // 设置父包模块名
//                        .other("entity.dto") //DTO层
                        .pathInfo(Collections.singletonMap(OutputFile.xml, "E://IdeaProject/Go Platform//SimpleBusGoBackend/src/main/resources/mapper")))
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                        .controllerBuilder().enableRestStyle().enableHyphenStyle()//.enableFileOverride()
//                        .mapperBuilder().enableFileOverride()
//                        .serviceBuilder().enableFileOverride()
                        .entityBuilder().enableLombok().addTableFills(
                                new Column("create_time", FieldFill.INSERT)
                        ).enableFileOverride().build())
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 */
                .templateEngine(new VelocityTemplateEngine())
                .execute();


// 处理 all 情况

    }

    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
