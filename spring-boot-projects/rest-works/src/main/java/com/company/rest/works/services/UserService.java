package com.company.rest.works.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.rest.works.model.User;
import com.company.rest.works.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public Optional<User> getUserById(Integer id) {
		return userRepo.findById(id);
	}

	public User getUserByIdAsObject(Integer id) {
		Optional<User> userById = userRepo.findById(id);
		if (userById.isPresent()) {
			return userById.get();
		}
		return null; 
	}

	public User saveUser(User user) {
		return userRepo.insert(user);
	}

	public User updateUser(User user) {
		return userRepo.save(user);
	}

	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
	}

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public List<User> getAllUserByName(String name) {
		return userRepo.findByName(name); 
	}
	
	
	public List<String> getAllUsersGtSalary(double sal) {
		return userRepo.findByIncome(sal);
	}
	
}
