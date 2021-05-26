package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerOccupation 
{
	@Id
	private int customerid;
	
	private String customeroccupation;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeroccupation() {
		return customeroccupation;
	}

	public void setCustomeroccupation(String customeroccupation) {
		this.customeroccupation = customeroccupation;
	}

	
	
}
