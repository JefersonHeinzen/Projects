package com.DbLeas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableJpaAuditing
@EnableTransactionManagement
@EnableHystrix
@SpringBootApplication
@EnableConfigurationProperties
public class DbLeasApplication {

    public static void main( String[] args ) {
        SpringApplication.run( DbLeasApplication.class, args );
    }
}


