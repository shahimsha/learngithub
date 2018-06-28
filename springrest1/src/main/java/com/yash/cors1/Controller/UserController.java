package com.yash.cors1.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:7070", methods = RequestMethod.PUT)
@RestController
public class UserController {

	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public User update(@RequestBody User user) {
		user.setName(user.getName() + "shaik");
		System.out.println("rest call shahismsha");

		return user;
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User update2(@PathVariable int id) {
		User user = new User();
		user.setId(id);
		user.setName("shahimshashaik");
		System.out.println("rest call shahismsha");

		return user;
	}

}
