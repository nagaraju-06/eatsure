package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.service.RestaurantService;

@RestController
public class DeleteResturtant {

	@Autowired
	private RestaurantService restaurantService;

	@DeleteMapping("/delete/restaurant")
	public void deleteRestaurant(@RequestParam long mobno) {
		restaurantService.deleteRestaurant(mobno);
	}

}