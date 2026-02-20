package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.entity.Customer;
import com.alpha.eatsure.service.CustomerService;

@RestController
public class FindCustomer {
	@Autowired
	private CustomerService customerservice;

	@GetMapping("/find/customer")
	public ResponseEntity<Customer> findCustomer(@RequestParam long mobno) {
		Customer c = customerservice.findCustomer(mobno);
		return new ResponseEntity<Customer>(c, HttpStatus.OK);
	}

}
