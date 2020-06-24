package com.swat018.springdatademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy;

@SpringBootApplication
@Import(JinwooRegistrar.class)
//@EnableJpaRepositories(queryLookupStrategy = QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND)
public class SpringdatademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdatademoApplication.class, args);
    }

}
