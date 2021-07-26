package com.amdocs.training.controller;
import java.util.List;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;
public class UserController {
	public static void main(String[] args) {
	UserDAO dao = new UserDAOImpl();
//	List<User> list = dao.findAll();
//		for(User u : list)
//	System.out.println(u);
	
		//Add user

//		User user1 = new User(103L, "priya", 9108765432L, "pria@abc.com", "Delhi","19-08-2021","Pass@1", "imag2.png");
//		boolean status = dao.addUser(user1);
//		if(status)
//	System.out.println("User Added Successfully");	
		
		//get user by id
//	 User user2=dao.getUserById(101L);
// System.out.println(user2);
	 
	//delete user
//	boolean result = dao.deleteUser(123L);
//	if(result)
//		System.out.println("User is deleted successfully");
//	else
//		System.out.println("No User available");

	//update user
	User u = dao.getUserById(103L);
	u.setAddress("Mumbai");
		u.setName("Pri");
	boolean updateUser = dao.updateUser(u);
	if(updateUser)
		System.out.println("user updated successfully");
	else
		System.out.println("No User available");
	
	
	}
}
