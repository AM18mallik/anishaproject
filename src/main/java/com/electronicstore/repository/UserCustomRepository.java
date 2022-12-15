package com.electronicstore.repository;

import java.util.List;

import com.electronicstore.entity.User;

public interface UserCustomRepository {
	public User getUserByUserName(String userName)throws Exception;
	public List<User> getUserByRole(String role)throws Exception;
}
