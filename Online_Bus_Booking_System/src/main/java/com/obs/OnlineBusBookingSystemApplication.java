package com.obs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.obs")
@EntityScan("com.obs")
@SpringBootApplication
public class OnlineBusBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBusBookingSystemApplication.class, args);
	}

}
