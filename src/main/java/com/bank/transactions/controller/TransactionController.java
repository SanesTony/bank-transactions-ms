package com.bank.transactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

	@GetMapping(value = "/api/v1/transactions")
	public String getMessage(){
		return "Transaction Message";
	}
}
