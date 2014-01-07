package com.spring.action;

import java.util.Date;
	import java.util.Map;	 
	import com.opensymphony.xwork2.Action;
	import com.opensymphony.xwork2.ActionContext;
	import com.opensymphony.xwork2.ActionSupport;
	import com.spring.model.User;
	import com.spring.service.RegisterService;
	import com.spring.util.Md5Encode;	
	import org.apache.struts2.ServletActionContext;


public class RegisterAction extends ActionSupport {
	 private String username;
	     private String password;
	 	     
	     private RegisterService registerService;
	 	    public String execute() throws Exception{
	 	        System.out.println("begin action");
	 	         
	 	         
	         User user=new User();
	 	        user.setUsername(username);
	 	        user.setPassword(Md5Encode.MD5Encode(password));
	 	        user.setCredits(10);
	 	        user.setLastVisit(new Date());
	 	        user.setLastIp(ServletActionContext.getRequest().getRemoteAddr());
	 	        if(this.registerService.Register(user)){
	             return this.SUCCESS;
	 	        } else{
	 	            return this.ERROR;
	         }
	 	         
	 	         
	 	    }
	 	    public String getUsername() {
	 	        return username;
	 	    }
	 	    public void setUsername(String username) {
	 	        this.username = username;
	 	    }
	 	    public String getPassword() {
	 	        return password;
	 	    }
	 	    public void setPassword(String password) {
	 	        this.password = password;
	 	    }
	 	     
	 	    public void setRegisterService(RegisterService registerService) {
	 	        this.registerService = registerService;
	     }
}
