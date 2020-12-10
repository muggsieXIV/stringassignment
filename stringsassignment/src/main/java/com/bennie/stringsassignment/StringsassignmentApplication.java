package com.bennie.stringsassignment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Dependancies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// Annotation
@RestController
public class StringsassignmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(StringsassignmentApplication.class, args);
	}
	
	// Annotations
	@RequestMapping("/")
	public String hello() {
		return "Hello client, How are you doing?";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great, so easy to just respond with strings";
	}
	
	
}