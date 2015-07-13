package com.spring3mvchtml5.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring3mvchtml5.dao.CustomerPersistence;
import com.spring3mvchtml5.vo.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerPersistence customerPersistence;

	@Override
	@Transactional
	public List<Customer> customerPersistenceCreateReadOperations() {
		return customerPersistence.customerPersistenceOperations();
	}

	@Override
	@Transactional
	public Integer customerPersistenceDeleteOperations() {
		return customerPersistence.customerPersistenceDeleteOperations();
	}
}
