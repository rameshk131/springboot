package com.coursecube.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coursecube.springboot.dto.Customer;
import com.coursecube.springboot.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/mycustomer/custId/{custId}", produces = "application/json")
	public Customer getCustomerByCid(@PathVariable("custId") int custId) {
		System.out.println("CC-getCustomerByCid() - " + custId);
		Customer cust = customerService.getCustomerByCid(custId);
		return cust;
	}

	@GetMapping(value = "/mycustomer/phone/{phone}", produces = "application/json")
	public Customer getCustomerByPhone(@PathVariable("phone") long phone) {
		System.out.println("CC-getCustomerByPhone() - " + phone);
		Customer cust = customerService.getCustomerByPhone(phone);
		return cust;
	}

	@GetMapping(value = "/mycustomer/city/{city}", produces = "application/json")
	public List<Customer> getCustomersByCity(@PathVariable("city") String city) {
		System.out.println("CC-getCustomersByCity() - " + city);
		List<Customer> custList = customerService.getCustomersByCity(city);
		return custList;
	}

}
