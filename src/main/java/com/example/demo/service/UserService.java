package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	private final Logger log = (Logger) LoggerFactory.getLogger(UserService.class);
	
	public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	public User create(@Valid User user) {
		log.debug("creating new user");
		return userRepository.save(user);
	}

	public List<User> getAllUser() {
		log.debug("fetching all user");
		User user = new User();
		this.userRepository.save(user);
		return userRepository.findAll();
	}
	
    public User findById(Long id) {
    	log.debug("fetching user by id: " + id);
 
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty()) {
            throw new ResourceNotFoundException("User not found for id: " + id);
        }
        return optionalUser.get();
    }
	
}
