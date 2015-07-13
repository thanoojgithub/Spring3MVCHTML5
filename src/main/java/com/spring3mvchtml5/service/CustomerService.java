package com.spring3mvchtml5.service;

import java.util.List;

import com.spring3mvchtml5.vo.Customer;

public interface CustomerService {

	public List<Customer> customerPersistenceCreateReadOperations();
	public Integer customerPersistenceDeleteOperations();
}
