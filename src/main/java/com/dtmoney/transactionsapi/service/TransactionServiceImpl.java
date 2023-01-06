package com.dtmoney.transactionsapi.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtmoney.transactionsapi.VO.TransactionsVO;
import com.dtmoney.transactionsapi.models.Transaction;
import com.dtmoney.transactionsapi.repositories.TransactionsRepository;



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
				form.getTransactionType(),
				form.getCategory(),
				new Timestamp(System.currentTimeMillis()));
		
		transactionsRepository.save(transaction);
	}
	
	@Override
	public List<Transaction> getTransactions(){
		return transactionsRepository.findAll();
	}
}
