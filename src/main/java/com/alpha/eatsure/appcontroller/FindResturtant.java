package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.service.RestaurantService;

@RestController
public class FindResturtant {
	@Autowired
	private RestaurantService restarurtantservice;
	@GetMapping("/find/resturtant")
	public ResponseEntity<Restaurant> findResturtant(@RequestParam long mobno) {
		Restaurant r = restarurtantservice.findRestaurant(mobno);
		return new ResponseEntity<>(r,HttpStatus.OK);
	}

}
