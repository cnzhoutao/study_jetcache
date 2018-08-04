package com.zt.study_jetcache;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableMethodCache(basePackages = "com.zt.study_jetcache")
@EnableCreateCacheAnnotation
@MapperScan("com.zt.study_jetcache.dao")
public class StudyJetcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyJetcacheApplication.class, args);
    }
}
