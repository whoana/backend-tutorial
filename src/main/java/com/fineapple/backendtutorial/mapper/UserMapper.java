package com.fineapple.backendtutorial.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fineapple.backendtutorial.data.User;

@Mapper
public interface UserMapper {    
    public List<User> getUsers();

    public void createUser(User user);

    public void deleteUser(@Param("id") String id);

    public void updateUser(User user);
}

