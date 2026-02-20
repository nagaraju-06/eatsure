package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.dto.RestaurantRequestDto;
import com.alpha.eatsure.service.RestaurantService;

@RestController
public class Restuartantregcontroller {
	@Autowired
	private RestaurantService resturtantservice;

	public void adding(@RequestBody RestaurantRequestDto restaurtantrequestdto) {
		resturtantservice.adding(restaurtantrequestdto);
	}

}
