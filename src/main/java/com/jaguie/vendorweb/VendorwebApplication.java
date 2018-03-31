package com.jaguie.vendorweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VendorwebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(VendorwebApplication.class, args);
	}

}
