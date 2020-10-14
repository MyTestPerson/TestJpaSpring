package com.testjpaspring.service;

import com.testjpaspring.model.User;
import com.testjpaspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
