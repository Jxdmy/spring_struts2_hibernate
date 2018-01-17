package com.qsx.project.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qsx.project.model.UserModel;
import com.qsx.project.service.UserService;

@Component("userAction")
public class UserAction {
	@Autowired
	private UserService userService;
	
	private List<UserModel> list;
	private UserModel userModel;
	
	
	public List<UserModel> getList() {
		return list;
	}


	public UserModel getUserModel() {
		return userModel;
	}


	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}


	public String findUsers() {
		list = userService.getUsers();
		return "list";
	}
	public String remove(){
		userService.remove(userModel);
		return "remove";
	}
	public String add(){
		userService.add(userModel);
		return "add";
	}
	public String to_edit(){
		userModel = userService.getUser(userModel);
		return "to_edit";
	}
	public String do_edit(){
		userService.edit(userModel);
		return "do_edit";
	}
}
