package com.example.dockerimg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.example.dockerimg")
public class DockerImgApplication {
	public static void main(String[] args) {
		SpringApplication.run(DockerImgApplication.class, args);
	}

}
