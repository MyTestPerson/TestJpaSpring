package com.testjpaspring.service;

import com.testjpaspring.model.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User findByUsername (String username);
}
