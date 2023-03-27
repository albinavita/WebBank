package com.example.webBank.service;

import com.example.webBank.exception.OperationError;
import com.example.webBank.model.Balance;
import com.example.webBank.repository.BalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BalanceService {

    private BalanceRepository balanceRepository;

    public Optional<Balance> getBalance(Long id) throws OperationError {
        if (id < 0) {
            throw new OperationError("Ошибка при выполнении операции");
        }
        return balanceRepository.findById(id);
    }

}
