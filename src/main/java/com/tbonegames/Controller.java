package com.tbonegames;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //creates an initial handler and allows for my subcategories to occur
public class Controller {
	
	@GetMapping("/hello")
	public String helloSpring() {
		return "Hello, Spring Boot!";
		
	}

}
