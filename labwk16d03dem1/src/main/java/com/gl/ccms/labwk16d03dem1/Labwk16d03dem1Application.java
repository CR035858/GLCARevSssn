package com.gl.ccms.labwk16d03dem1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.gl.ccms.labwk16d03dem1.config","com.gl.ccms.labwk16d03dem1.controller","com.gl.ccms.labwk16d03dem1.model","com.gl.ccms.labwk16d03dem1.service","com.gl.ccms.labwk16d03dem1.dao"})
public class Labwk16d03dem1Application {

	public static void main(String[] args) {
		SpringApplication.run(Labwk16d03dem1Application.class, args);
		System.out.println("Welcome to SpringBoot Based Restful Services....");
	}

}
