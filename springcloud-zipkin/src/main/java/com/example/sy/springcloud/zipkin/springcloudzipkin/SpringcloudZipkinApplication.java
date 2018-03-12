package com.example.sy.springcloud.zipkin.springcloudzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringcloudZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinApplication.class, args);
	}
}
