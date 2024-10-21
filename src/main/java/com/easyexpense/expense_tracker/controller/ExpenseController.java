package com.easyexpense.expense_tracker.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ExpenseController {

    @GetMapping("/endpoint-check")
    public String healthCheck() {
        return "ok";
    }
    

}
