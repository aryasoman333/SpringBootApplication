package com.assignment.CustomerCRM.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assignment.CustomerCRM.model.Customer;
import com.assignment.CustomerCRM.service.CustomerService;
import com.assignment.CustomerCRM.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{customerId}")
	public Customer getCustomerById(int custId) {
		return customerService.getCustomerById(custId);
	}
	
	@PostMapping
	public void createCustomer(int custId, String custName) {
		customerService.createCustomer(custId, custName);
	}
	
	@DeleteMapping("/{customerId}")
	public void deleteCustomer(int custId) {
		customerService.deleteCustomerbyId(custId);
	}
}

