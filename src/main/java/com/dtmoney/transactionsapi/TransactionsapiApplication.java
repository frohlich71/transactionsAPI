package com.dtmoney.transactionsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
@EntityScan("com.dtmoney.transactionsapi.models")
@EnableJpaRepositories("com.dtmoney.transactionsapi.repositories")
public class TransactionsapiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TransactionsapiApplication.class, args);
	}

}
