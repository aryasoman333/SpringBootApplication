package com.assignment.CustomerCRM.model;

public class Customer {
	
	//TIP: could use Lombok libraries to leverage annotations are reduce boilerplate code
	private int customerId;
	private String customerName;
	
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
