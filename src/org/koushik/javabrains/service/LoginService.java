package org.koushik.javabrains.service;

import java.util.HashMap;

import org.koushik.javabrains.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService(){
		users.put("johndoe", "John Doe");
		users.put("janedoe","Jane Doe" );
		users.put("jguru","Java Guru" );
	}
	
	public boolean authenticateLogin(String userId, String pass){
		if (pass!=null && pass.trim()!=""){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}

}
