package com.gyw.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gyw.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	public List<User> findByUserName(String userName);
	public List<User> findByEmail(String email);
	public List<User> findByPassword(String password);
	
}