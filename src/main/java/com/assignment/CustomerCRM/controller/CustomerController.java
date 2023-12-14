package com.assignment.CustomerCRM.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {
	
	//in-memory storage for customers
	private int customerId;
	List<Integer> customerList = new ArrayList<>();
	
	@GetMapping("/{customerId}")
	public String getCustomerById(Integer custId) {
		customerList.add(custId);
		return "Customer added" + custId;
		//return customerList.get(customerId);
		//System.out.println("Customer added" + customerId);
	}
	
	@PostMapping
	public void addCustomer(Integer customerId) {
		customerList.add(customerId);
		System.out.println("Customer added");
	}
	
	@DeleteMapping("/{customerId}")
	public void deleteCustomer(Integer customerId) {
		customerList.remove(customerId);
		System.out.println("Customer removed");
	}
}

