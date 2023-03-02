package com.tbonegames;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class User {
	
	ArrayList <String> userNames = new ArrayList<>();

	@PostMapping("/createuser") //request body is used to reqest the body from postman and put it into the ArrayList
	public String createUser(@RequestBody String userName) {
		
		userNames.add(userName);
		
		String allUsers = userNames.toString();
		return allUsers + " have been created!";
	}
	
}
