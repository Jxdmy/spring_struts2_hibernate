package com.qsx.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsx.project.common.BaseDao;
import com.qsx.project.model.UserModel;

@Repository
public class UserDao{
	@Autowired
	private BaseDao baseDao;
	
	@SuppressWarnings("unchecked")
	public List<UserModel> getUsers(){
		return (List<UserModel>) baseDao.getHibernateTemplate().find("from UserModel");
	}
	
	public UserModel getUser(UserModel userModel) {
		 return baseDao.getHibernateTemplate().get(UserModel.class, userModel.getId());
	}
	
	public void remove(UserModel userModel) {
		baseDao.getHibernateTemplate().delete(userModel);
	}
	public void save(UserModel userModel) {
		baseDao.getHibernateTemplate().save(userModel);
	}
	public void edit(UserModel userModel) {
		baseDao.getHibernateTemplate().update(userModel);
	}
}
