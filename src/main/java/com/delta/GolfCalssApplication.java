package com.delta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = { "com.delta" })
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = { "com.delta" })
@EntityScan(basePackages = { "com.delta" })
@EnableScheduling
public class GolfCalssApplication {

	public static void main(String[] args) {
		SpringApplication.run(GolfCalssApplication.class, args);
	}

}
