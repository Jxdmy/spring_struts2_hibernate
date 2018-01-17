package com.qsx.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsx.project.dao.UserDao;
import com.qsx.project.model.UserModel;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<UserModel> getUsers(){
		return userDao.getUsers();
		
	}
	public UserModel getUser(UserModel userModel) {
		return userDao.getUser(userModel);
	}
	public void remove(UserModel userModel){
		userDao.remove(userModel);
	}
	public void add(UserModel userModel){
		userDao.save(userModel);
	}
	public void edit(UserModel userModel){
		userDao.edit(userModel);
	}
}
