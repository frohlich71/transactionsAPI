package com.dtmoney.transactionsapi.controllers;

import java.sql.Timestamp;
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

import com.dtmoney.transactionsapi.VO.FilterQueryVO;
import com.dtmoney.transactionsapi.VO.TransactionsVO;
import com.dtmoney.transactionsapi.models.Transaction;
import com.dtmoney.transactionsapi.repositories.criteria.FilterCriteria;
import com.dtmoney.transactionsapi.service.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(maxAge = 3600, allowedHeaders = "*")
public class TransactionsController {
	
	@Autowired
	TransactionServiceImpl transactionService;
	
	@GetMapping(value = "/findAll", produces = "application/json")
	public List<Transaction> getTransactions() {
		return transactionService.getTransactions();
	}
	
	@PostMapping(value = "/create", consumes = "application/json")
	public Transaction save(@RequestBody TransactionsVO form) {
		transactionService.save(form);
		
		//TODO VALIDAR SE O REGISTRO REALMENTE FOI SALVO E AJUSTAR RESPOSTAS HTTTP
		
		return new Transaction(form.getDescription(), form.getPrice(), form.getType(), form.getCategory(), new Timestamp(System.currentTimeMillis()));
	}
	
	
	@PostMapping(value = "/find", consumes = "application/json")
	public ResponseEntity<?> find(@RequestBody FilterQueryVO form, FilterCriteria filter) {
		return transactionService.findAllFiltered(form, filter);
	}
}