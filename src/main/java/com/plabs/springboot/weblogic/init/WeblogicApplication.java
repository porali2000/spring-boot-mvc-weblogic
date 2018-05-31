package com.plabs.springboot.weblogic.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.plabs.springboot.weblogic")
public class WeblogicApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WeblogicApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WeblogicApplication.class);
	}
}
