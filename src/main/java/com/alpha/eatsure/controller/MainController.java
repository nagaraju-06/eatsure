package com.alpha.eatsure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.entity.Customer;
import com.alpha.eatsure.entity.DeliveryPatner;
import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.service.CommonService;

@RestController
public class MainController {

	@Autowired
	private CommonService service;

	@GetMapping("/customer")
	public Customer findCustomer(@RequestParam String mobno) {
		return service.findCustomer(mobno);
	}

	@GetMapping("/restaurant")
	public Restaurant findRestaurant(@RequestParam String mobno) {
		return service.findRestaurant(mobno);
	}

	@GetMapping("/delivery-partner")
	public DeliveryPatner findDeliveryPartner(@RequestParam String mobno) {
		return (DeliveryPatner) service.findDeliveryPartner(mobno);
	}

	@DeleteMapping("/customer")
	public String deleteCustomer(@RequestParam String mobno) {
		service.deleteCustomer(mobno);
		return "Customer deleted";
	}

	@DeleteMapping("/restaurant")
	public String deleteRestaurant(@RequestParam String mobno) {
		service.deleteRestaurant(mobno);
		return "Restaurant deleted";
	}

	@DeleteMapping("/delivery-partner")
	public String deleteDeliveryPartner(@RequestParam String mobno) {
		service.deleteDeliveryPartner(mobno);
		return "Delivery Partner deleted";
	}
}
