package com.cjc.app.fl.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@EnableEurekaClient
@SpringBootApplication
public class MsMstrT1ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMstrT1ProjectApplication.class, args);
		System.out.println("This is four wheeler Loan matser Project");
	}

}
