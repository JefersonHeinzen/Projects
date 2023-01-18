package com.leitorcsv;

import com.leitorcsv.service.ServiceClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;




@EnableJpaAuditing
@EnableTransactionManagement
@EnableHystrix
@SpringBootApplication
@EnableConfigurationProperties
public class LeitorCsvApplication {

    public static void main(String[] args) {
       ApplicationContext applicationContext = SpringApplication.run(LeitorCsvApplication.class, args);
        ServiceClient service = applicationContext.getBean(ServiceClient.class);
        try {
            service.save();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


