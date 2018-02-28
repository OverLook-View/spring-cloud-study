package com.example.sy.springcloud.eurekaclient.springclouderurkaclient.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaClientApplication {

	@Value("${server.port}")
	private String port;
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam String name){
		return "hello,this is "+name+",port: "+port;
	}
}
