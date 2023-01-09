package com.fineapple.backendtutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fineapple.backendtutorial.data.User;
import com.fineapple.backendtutorial.mapper.UserMapper;

@Service
public class UserService {
    
    @Autowired 
    UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.getUsers();
    }

    public void createUser(User user) {
        userMapper.createUser(user);
    }

    public void deleteUser(String id) {
        userMapper.deleteUser(id);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
    
}
