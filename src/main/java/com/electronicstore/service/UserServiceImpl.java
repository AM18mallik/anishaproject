package com.electronicstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronicstore.entity.User;
import com.electronicstore.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) throws Exception {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<User> getAllUser() throws Exception {
		// TODO Auto-generated method stub
		List<User> allUsers = userRepository.findAll();
		return allUsers;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);

	}

	@Override
	public User getUserByUserName(String userName) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.getUserByUserName(userName);
	}

	@Override
	public List<User> getUserByRole(String role) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.getUserByRole(role);
	}

}
