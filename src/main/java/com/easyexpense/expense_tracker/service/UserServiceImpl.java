package com.easyexpense.expense_tracker.service;

import com.easyexpense.expense_tracker.models.UserModel;
import com.easyexpense.expense_tracker.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo _userRepo;

    @Override
    public void saveUser(UserModel user) {
        _userRepo.save(user);

    }

    @Override
    public List<UserModel> getAllUsers() {
        return _userRepo.findAll();
    }
}
