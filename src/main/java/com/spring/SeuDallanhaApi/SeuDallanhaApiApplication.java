package com.spring.SeuDallanhaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication(scanBasePackages = "com.spring.SeuDallanhaApi", exclude = { SecurityAutoConfiguration.class })
public class SeuDallanhaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeuDallanhaApiApplication.class, args);
	}

	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

}
