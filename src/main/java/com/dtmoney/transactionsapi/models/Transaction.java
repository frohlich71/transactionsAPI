package com.dtmoney.transactionsapi.models;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (schema="public", name = "transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column (name = "transactionType")
	private String type;
	
	@Column (name = "category")
	private String category;
	
	@Column (name = "createdAt")
	private Timestamp createdAt;
	
	
	public Transaction() {
		
	}
	
	
	public Transaction(
			Long id, 
			String description, 
			BigDecimal price, 
			String type,
			String category,
			Timestamp createdAt) {
		this.id = id;
		this.description = description;
		this.price = price;
		this.type = type;
		this.category = category;
		this.createdAt = createdAt;
	}
	
	public Transaction(
			String description, 
			BigDecimal price, 
			String type,
			String category,
			Timestamp createdAt) {
		
		this.description = description;
		this.price = price;
		this.type = type;
		this.category = category;
		this.createdAt = createdAt;
	}
	
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
}