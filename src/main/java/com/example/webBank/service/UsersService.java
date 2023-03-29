package com.example.webBank.service;

import com.example.webBank.model.Users;
import com.example.webBank.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    @Autowired
    private UsersRepository balanceRepository;


    public Users save(Users users) {
        return balanceRepository.save(users);
    }

    public Long getBalance(long id){
        Users users = balanceRepository.findById(id).orElseThrow();
        return users.getCurrentBalance();
    }

    public int putMoney(long id, long balance) {
        Users users = balanceRepository.findById(id).orElseThrow();
        long currentBalance = users.getCurrentBalance() + balance;
        if (currentBalance > -1) {
            users.setCurrentBalance(currentBalance);
            save(users);
            //успех
            return 1;
        }
        //ошибка при выполнении операции
        return 0;

    }

    public int takeMoney(long id, long balance) {
        Users users = balanceRepository.findById(id).orElseThrow();
        long currentBalance = users.getCurrentBalance() - balance;
        if (currentBalance > -1) {
            users.setCurrentBalance(currentBalance);
            save(users);
            //успех
            return 1;
        }
        //недостаточно средств
        return 0;
    }
}
