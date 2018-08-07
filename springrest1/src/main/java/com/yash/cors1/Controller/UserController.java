package com.yash.cors1.Controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:7070", methods = RequestMethod.PUT)
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
		user.setName("shahimshashaikpavani");
		System.out.println("rest call shahismsha");

		return user;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public User add(@RequestBody User user){
		user.setName(user.getName() + "shaik pavani");
		System.out.println("rest call pavani");
		return user;
		
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User get(){
		User user=new User();
		user.setId(111);
		user.setName("tanu ja" + "shaik ");
		System.out.println("rest call");
		return user;
		
	}
	
	
	
	@RequestMapping(value="/getuser/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User method1(@RequestParam("id") int id ){
		User user=new User();
		user.setId(id);
		user.setName("abc");
		return user;
		
	}
	@RequestMapping(value="/getuser/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public User method2( @RequestParam Map<String ,String> map){
		User user=new User();
		System.out.println("welcome multiple data"+map.get("state"));
		user.setId(Integer.parseInt(map.get("id")));
		user.setName(map.get("name"));
		return user;
		
	}
	
	
	
}
