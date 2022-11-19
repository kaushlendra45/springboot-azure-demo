package com.springboot.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8080/message
@SpringBootApplication
@RestController
public class SpringbootK8sLab1Application {

	@GetMapping("/message")
	public String getMessage(){

		return "Welcome to Springboot-k8s-session..........!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sLab1Application.class, args);
	}

}
