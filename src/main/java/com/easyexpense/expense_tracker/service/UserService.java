package com.easyexpense.expense_tracker.service;

import com.easyexpense.expense_tracker.models.UserModel;

import java.util.List;

public interface UserService {
    void saveUser(UserModel user);

    List<UserModel> getAllUsers();
}
