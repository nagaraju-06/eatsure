package com.alpha.eatsure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.restaurant.dto.RestaurantRequestDto;
import com.alpha.eatsure.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/register")
    public String registerRestaurant(@RequestBody RestaurantRequestDto dto) {
        restaurantService.registerRestaurant(dto);
        return "Restaurant Registered Successfully";
    }
}
