package com.assignment.CustomerCRM.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.assignment.CustomerCRM.service.impl.CustomerServiceImpl;

public class Customer {
	
	//TIP: could use Lombok libraries to leverage annotations are reduce boilerplate code
	private int customerId;
	private String customerName;
	CustomerServiceImpl customerServiceImpl;
	
	@Autowired
	public Customer(CustomerServiceImpl customerServiceImpl) {
		this.customerServiceImpl = customerServiceImpl;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}	
