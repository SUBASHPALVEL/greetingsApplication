package com.example.greetingsApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsApplication {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}