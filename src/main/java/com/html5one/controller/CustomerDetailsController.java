package com.html5one.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.html5one.vo.Customer;

@Controller
@RequestMapping("/Spring3MVCHTML5One")
public class CustomerDetailsController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerDetailsController.class);

	@RequestMapping("/customerDetails")
	public String getCustomerDetails(Model model) {
		logger.debug("CustomerDetailsController - sayHello - start");
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Sriram");
		customer.setLastName("Ayodya");
		customer.setEmail("Sriram@Ayodya.com");
		customers.add(customer);
		Customer customer1 = new Customer();
		customer1.setFirstName("Seetha");
		customer1.setLastName("Midhila");
		customer1.setEmail("Seetha@Midhila.com");
		customers.add(customer1);
		model.addAttribute("customers", customers);
		for (Customer cust : customers) {
			System.out.println(cust);
		}
		logger.debug("CustomerDetailsController - sayHello - end");
		return "customers";

	}

}