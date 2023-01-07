package com.dtmoney.transactionsapi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.dtmoney.transactionsapi.models.Transaction;

public interface TransactionsRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {
	
}
