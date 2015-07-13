package com.spring3mvchtml5.dao;

import java.util.List;

import com.spring3mvchtml5.vo.Customer;

public interface CustomerPersistence {

	public List<Customer> customerPersistenceOperations();

	public Integer customerPersistenceDeleteOperations();

}
