package com.evangel;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceCamden {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ComputeServiceCamden.class).web(true)
				.run(args);
	}
}
// http://localhost:2222/add?a=1&b=2