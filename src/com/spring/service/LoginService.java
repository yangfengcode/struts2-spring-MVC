package com.spring.service;
import com.spring.dao.UserDao;
import com.spring.model.User;

public class LoginService {

	 private UserDao userdao;
	 	    public boolean login(User user) throws Exception{
	         boolean flag=false;
	         if(userdao.checkUser(user.getUsername(), user.getPassword())){
	 	            flag=true;
	 	        }
	 	        return flag;
	     }
	     public void setUserdao(UserDao userdao) {
	         this.userdao = userdao;
	     }	
	
}
