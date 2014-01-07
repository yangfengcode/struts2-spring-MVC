package com.spring.dao;

import com.spring.dao.impl.IUserDao;
import com.spring.model.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao implements IUserDao {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			        this.jdbcTemplate = jdbcTemplate;
			    }
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println(password);
			        String sql="select count(*) from user where name=? and password=? ";
			        int count=jdbcTemplate.queryForInt(sql,new Object[]{username,password});
		        return count>0;
		
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		System.out.println("beign dao");
			        String sql="insert into  user (name,credits,password,last_visit,last_ip) values (?,?,?,?,?)";
		        Object[] args={user.getUsername(),user.getCredits(),user.getPassword(),user.getLastVisit(),user.getLastIp()};
			        try{
			            jdbcTemplate.update(sql, args);
			             
			        }catch (DataAccessException e)
			        {
			            e.printStackTrace();
			            return false;
			        }
			     
			        return true;
		
	}

}
