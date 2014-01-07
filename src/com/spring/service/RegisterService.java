package com.spring.service;
import com.spring.dao.UserDao;
import com.spring.model.User;
public class RegisterService {
	private UserDao userDao;
		    public boolean Register(User user){
		        System.out.println("begin Service");
		        return userDao.register(user);
	         
		    }
		    public void setUserDao(UserDao userDao) {
		        this.userDao = userDao;
		    }
}
