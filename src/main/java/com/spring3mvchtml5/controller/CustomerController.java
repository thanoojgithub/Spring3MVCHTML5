package com.spring3mvchtml5.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring3mvchtml5.service.CustomerService;
import com.spring3mvchtml5.vo.Customer;

@Controller
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value="/customers" , method = RequestMethod.GET)
	public String getCustomers(Model model) {
		logger.debug("getCustomers - start");
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.customerPersistenceCreateReadOperations();
		model.addAttribute("customers", customers);
		logger.debug("getCustomers - end");
		return "customers";

	}
	
	@RequestMapping(value="/clearAllCustomers" , method = {RequestMethod.GET,RequestMethod.DELETE})
	public String doClearAllCustomers(Model model) {
		logger.debug("doClearAllCustomers - start");
		Integer customerPersistenceDeleteOperation = customerService.customerPersistenceDeleteOperations();
		model.addAttribute("customerPersistenceDeleteOperation", customerPersistenceDeleteOperation);
		logger.debug("doClearAllCustomers - end");
		return "forward:customers";

	}

}