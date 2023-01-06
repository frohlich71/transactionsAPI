package com.dtmoney.transactionsapi.service;

import java.util.List;


import com.dtmoney.transactionsapi.VO.TransactionsVO;
import com.dtmoney.transactionsapi.models.Transaction;

public interface TransactionsService {
	
	void save (TransactionsVO form);
	
	List<Transaction> getTransactions();
	
}
