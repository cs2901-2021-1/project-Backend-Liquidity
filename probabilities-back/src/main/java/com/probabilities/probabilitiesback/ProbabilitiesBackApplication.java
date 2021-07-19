package com.probabilities.probabilitiesback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class}, scanBasePackages = "com.spring.beans")
public class ProbabilitiesBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProbabilitiesBackApplication.class, args);
	}

}
