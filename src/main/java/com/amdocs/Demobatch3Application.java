package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demobatch3Application {
    
	public static void main(String[] args) {
		SpringApplication.run(Demobatch3Application.class, args);
	}
	
	@GetMapping("/msg")
	public String show() {
    	return "welcome to Chaitanya's world!";
    }

}
