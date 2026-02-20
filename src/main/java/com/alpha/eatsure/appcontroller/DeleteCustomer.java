package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.service.CustomerService;

@RestController
public class DeleteCustomer {
	@Autowired
	private CustomerService customerservice;

	@DeleteMapping("/delete/customer")
	public void deleteCustomer(@RequestParam long mobno) {
		customerservice.deleteCustomer(mobno);
	}

}
