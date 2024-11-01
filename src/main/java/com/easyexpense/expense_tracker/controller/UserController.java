package com.easyexpense.expense_tracker.controller;

import com.easyexpense.expense_tracker.models.UserModel;
import com.easyexpense.expense_tracker.service.UserService;
import com.easyexpense.expense_tracker.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl _userService;


    @GetMapping("/all_users")
    public List<UserModel> getAllUsers() {
        return _userService.getAllUsers();
    }
}
