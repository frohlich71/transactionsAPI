package com.dtmoney.transactionsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dtmoney.transactionsapi.VO.TransactionsVO;
import com.dtmoney.transactionsapi.models.Transaction;
import com.dtmoney.transactionsapi.repositories.TransactionsRepository;

import jakarta.transaction.Transactional;

@Service
public class TransactionServiceImpl implements TransactionsService {
	
	@Autowired
	TransactionsRepository transactionsRepository;
	
	@Override
	public void save(TransactionsVO form) {
		System.out.print(form);
		Transaction transaction = new Transaction(
				form.getId(), 
				form.getDescription(), 
				form.getPrice(), 
				form.getTransactionType());
		
		transactionsRepository.save(transaction);
	}
	
	@Override
	public ResponseEntity<?> getTransactions(){
		return new ResponseEntity<>(transactionsRepository.findAll(), HttpStatus.OK);
	}
}
