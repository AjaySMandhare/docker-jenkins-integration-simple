package com.docker.dockerjenkinsintegrationsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSimpleApplication.class, args);
		System.out.println("Run successifully");
	}

}
