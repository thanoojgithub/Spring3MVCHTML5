package com.html5one.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.html5one.vo.Customer;

@Controller
public class CustomerDetailsController {

	@RequestMapping("/")
	public String welcome(ModelMap model) {
		return "index";

	}

	@RequestMapping("addCustomer.do")
	public String setCustomerDetails(@ModelAttribute("customer") Customer customer, BindingResult result, Model map) {
		map.addAttribute("customer", customer);
		System.out.println(customer);
		return "viewCustomerDetails";
	}
	
	@RequestMapping("getVehicleList.do")
	public @ResponseBody List<String> getVechicle(@RequestParam(value = "vehicle") String vehicle, Model map) {
		map.addAttribute("vehicle", vehicle);
		System.out.println(vehicle);
		List<String> vehicleList = new ArrayList<String>();
		if("Bike".equals(vehicle)){
			vehicleList.add("Suzuki");
			vehicleList.add("Honda");
			vehicleList.add("Yamaha");
		}else{
			vehicleList.add("audi");
			vehicleList.add("Honda");
			vehicleList.add("BMW");	
		}
		return vehicleList;
	}
}