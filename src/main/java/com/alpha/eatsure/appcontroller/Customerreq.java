package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.dto.CustomerReqDto;
import com.alpha.eatsure.service.CustomerService;

@RestController
public class Customerreq {
	@Autowired
	private CustomerService customerservice;

	@PostMapping("/customer/register")
	public void customerdto(@RequestBody CustomerReqDto customerReqdto) {
		customerservice.adding(customerReqdto);

	}
}
