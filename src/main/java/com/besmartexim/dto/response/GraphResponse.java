package com.besmartexim.dto.response;

import java.math.BigDecimal;

public class GraphResponse {
	
	private String monthName;
	private BigDecimal monthValue;
	
	
	
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public BigDecimal getMonthValue() {
		return monthValue;
	}
	public void setMonthValue(BigDecimal monthValue) {
		this.monthValue = monthValue;
	}

	
}
