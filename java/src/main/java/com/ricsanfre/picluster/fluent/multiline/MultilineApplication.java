package com.ricsanfre.picluster.fluent.multiline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class MultilineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultilineApplication.class, args);
	}

}
