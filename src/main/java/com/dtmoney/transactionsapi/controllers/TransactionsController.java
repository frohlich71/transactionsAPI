package com.dtmoney.transactionsapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtmoney.transactionsapi.VO.TransactionsVO;
import com.dtmoney.transactionsapi.models.Transaction;
import com.dtmoney.transactionsapi.service.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(maxAge = 3600)
public class TransactionsController {
	
	@Autowired
	TransactionServiceImpl transactionService;
	
	@GetMapping(value = "/findAll", produces = "application/json")
	public List<Transaction> getTransactions() {
		return transactionService.getTransactions();
	}
	
	@PostMapping(consumes = "application/json")
	public void save(@RequestBody TransactionsVO form) {
		transactionService.save(form);
	}
}