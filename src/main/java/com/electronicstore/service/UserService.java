package com.electronicstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.electronicstore.entity.User;

@Service

public interface UserService {
	public User addUser(User user) throws Exception;
	public List<User> getAllUser() throws Exception;
	public  void  delete(int  id);
	public User getUserByUserName(String userName)throws Exception;
	public List<User> getUserByRole(String role)throws Exception;
}
