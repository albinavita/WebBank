package com.example.webBank.service;

import com.example.webBank.model.Balance;
import com.example.webBank.repository.BalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BalanceService {

    private BalanceRepository balanceRepository;

    public Optional<Balance> getBalance(Long id) {
        return balanceRepository.findById(id);
    }



}
