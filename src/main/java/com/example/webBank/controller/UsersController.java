package com.example.webBank.controller;

import com.example.webBank.model.Users;
import com.example.webBank.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/getbalance/{id}")
     public Long getBalance(@PathVariable Long id) {
       return usersService.getBalance(id);
    }

    @PutMapping("/putMoney")
    public void putMoney(@RequestParam Long id, @RequestParam Long amount) {
        usersService.putMoney(id, amount);
    }

    @PutMapping("/takeMoney")
    public void takeMoney(@RequestParam Long id, @RequestParam Long amount) {
        usersService.takeMoney(id, amount);

    }
}
