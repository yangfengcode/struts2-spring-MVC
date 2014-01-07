package com.spring.action;
import java.util.Map;
	 
	import com.opensymphony.xwork2.Action;
	import com.opensymphony.xwork2.ActionContext;
	import com.opensymphony.xwork2.ActionSupport;
	import com.spring.model.User;
	import com.spring.service.LoginService;
	import com.spring.util.Md5Encode; 


public class LoginAction extends ActionSupport {
	private static final long serialVersionUID  =   1L ;
		    private String username;
	    private String password;
		     
		    private LoginService loginService;
		     
		    @Override
		    public void validate()
		    {
		         
		    }
		     
		     
		    public String execute() throws Exception
		    {  
		         
		        User user=new User();
		        user.setUsername(username);
		        user.setPassword(Md5Encode.MD5Encode(password));
		        boolean result=this.loginService.login(user);
        if(result){
		            return this.SUCCESS;
		        }else{
		            return this.ERROR ;
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
		 
		    public LoginService getLoginService() {
		        return loginService;
		    }
		 
		    public void setLoginService(LoginService loginService) {
		        this.loginService = loginService;
		    }
}
