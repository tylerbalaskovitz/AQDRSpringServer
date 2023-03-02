package com.tbonegames.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public class UserInformationDAO extends JpaRepository<UserInformation, Integer>{

	//we had to define this method signature on our own, because JpaRepository can't provide it for us 
		//it's a little too complicated. Spring Data is smart, but can only find by id on it's own
	//BUT Spring Data is smart enough to create this method body for us - we just have to make the abstract method
	public Optional<List<Pokemon>> findByName(String name);
	
	//NOTE* SPring wants your method name to be in camelCase, or it'll throw a vague error (something about beans)
	//make sure to call it findBy{VARIABLE NAME YOU'RE SEARCHING BY}
	//for instance, if we wanted to find by type, we'd call the method findByType
	
	//Remember, an Optional is an object that MAY have whatever it's generic is, or it may be null
	//Thanks to Optionals, we can avoid NullPointerExceptions by throwing it against some null checking control flow
	
}{

}
