package com.niit.backend.dao;



import java.util.List;

import com.niit.backend.model.userModel;

public interface UserDao {
 
	public boolean insertUser(userModel obj);
	 public List<userModel> listofusers();
	 public userModel singleUser(String userName);
	 public boolean deleteUser(userModel obj);
	

}
