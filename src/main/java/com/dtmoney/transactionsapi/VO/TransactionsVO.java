package com.dtmoney.transactionsapi.VO;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionsVO {
	
	
	private String description;
	
	private BigDecimal price;
	
	private String category;
	
	private String type;
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
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
	
	
	
}
