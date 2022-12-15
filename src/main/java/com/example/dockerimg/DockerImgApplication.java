package com.example.dockerimg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerImgApplication {
	@GetMapping("/")
	public String welPage() {
		return "Welcome to Docker-Git Integration";
	}
	@GetMapping("/view")
	public String viewPage() {
		return "Welcome to View Page";}
	public static void main(String[] args) {
		SpringApplication.run(DockerImgApplication.class, args);
	}

}
