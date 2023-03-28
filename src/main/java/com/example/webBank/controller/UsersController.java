package com.example.webBank.controller;

import com.example.webBank.model.Users;
import com.example.webBank.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/balanse")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/{id}")
     public Long getBalance(@PathVariable Long id) {
       return usersService.getBalance(id);
    }

    @PostMapping("/{putMoney}")
    public void putMoney(@RequestBody Users users) {
        usersService.putMoney(users.getId(), users.getCurrentBalance());
    }

    @PostMapping("/{takeMoney}")
    public void takeMoney(@RequestBody Users users) {
        usersService.takeMoney(users.getId(), users.getCurrentBalance());

    }
}
