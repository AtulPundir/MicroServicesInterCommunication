package com.ap.appfordocker2.ap_fordocker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApFordocker2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApFordocker2Application.class, args);
	}

}
