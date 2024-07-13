package com.pkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkg.exception.ResourceNotFoundException;
import com.pkg.model.User;
import com.pkg.persistence.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;

	    public List<User> getAllUsers() {
	        return (List<User>) userRepository.findAll();
	    }

	    public User getUserById(Long id) {
	        return userRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	    }

	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    public User updateUser(Long id, User userDetails) {
	        User user = userRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	        user.setUserName(userDetails.getUserName());
	        user.setEmail(userDetails.getEmail());
	        return userRepository.save(user);
	    }
	

	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
    
}
