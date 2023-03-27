package com.example.webBank;

import com.example.webBank.exception.OperationError;
import com.example.webBank.service.BalanceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class WebBankApplication {


	public static void main(String[] args) {
		//SpringApplication.run(WebBankApplication.class, args);
		Long id = 1L;
		BigDecimal current = BigDecimal.valueOf(200);

		BalanceService balanceService = new BalanceService();
		try {
			balanceService.getBalance(id).get();
		} catch (OperationError e) {
			throw new RuntimeException(e);
		}

	}

}
