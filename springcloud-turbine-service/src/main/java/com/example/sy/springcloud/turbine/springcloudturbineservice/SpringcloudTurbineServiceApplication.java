package com.example.sy.springcloud.turbine.springcloudturbineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class SpringcloudTurbineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTurbineServiceApplication.class, args);
	}
}
