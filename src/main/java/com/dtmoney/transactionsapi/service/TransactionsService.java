package com.dtmoney.transactionsapi.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.dtmoney.transactionsapi.VO.FilterQueryVO;
import com.dtmoney.transactionsapi.VO.TransactionsVO;
import com.dtmoney.transactionsapi.models.Transaction;
import com.dtmoney.transactionsapi.repositories.criteria.FilterCriteria;

public interface TransactionsService {
	
	void save (TransactionsVO form);
	
	List<Transaction> getTransactions();
	
	ResponseEntity<?> findAllFiltered(FilterQueryVO form, FilterCriteria filter);
	
}
