package com.usa.his.washingaton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UsaHisEligibilityDeterminationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsaHisEligibilityDeterminationAppApplication.class, args);
	}

}
