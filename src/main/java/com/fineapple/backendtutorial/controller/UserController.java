package com.fineapple.backendtutorial.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fineapple.backendtutorial.data.User;
import com.fineapple.backendtutorial.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Slf4j
@Controller
public class UserController {
    
    @Autowired
    UserService userService;


    /**
     * List 조회 
     */
    @RequestMapping(value = "/users", params = "method=GET", method = RequestMethod.POST, headers = "content-type=application/json")
    //@GetMapping("/users")
    public @ResponseBody Map<String, Object> getUsers() throws Exception {
        List<User> users = userService.getUsers();
        log.info("call /users res:" + users.size());        
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("users", users);
        return result;
    }
    
    
    @RequestMapping(value = "/users", params = "method=POST", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody Map<String, Object> createUser(@RequestBody User user) throws Exception {
        userService.createUser(user);
        log.info("create user:" + user.getId());
        Map<String, Object> result = new HashMap<String, Object>();        
        result.put("cd", "0");
        result.put("msg", "OK");
        return result;
    }
     
    @RequestMapping(value = "/users/{id}", params = "method=DELETE", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody Map<String, Object> deleteUser(@PathVariable String id) throws Exception {
        userService.deleteUser(id);
        log.info("delete user:" + id);
        Map<String, Object> result = new HashMap<String, Object>();        
        result.put("cd", "0");
        result.put("msg", "OK");
        return result;
    }
 
    @RequestMapping(value = "/users", params = "method=PUT", method = RequestMethod.POST, headers = "content-type=application/json")
    public @ResponseBody Map<String, Object> updateUser(@RequestBody User user) throws Exception {        
        userService.updateUser(user);
        log.info("update user:" + user.getId());
        Map<String, Object> result = new HashMap<String, Object>();        
        result.put("cd", "0");
        result.put("msg", "OK");
        return result;
    }
}
