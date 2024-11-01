package com.easyexpense.expense_tracker.repo;

import com.easyexpense.expense_tracker.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {

}
