package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alpha.eatsure.dto.CustomerDTO;
import com.alpha.eatsure.dto.RestaurantRequestDto;
import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.service.CustomerService;
import com.alpha.eatsure.service.RestaurantService;

@RestController
@RequestMapping("/app")
public class Appcontroller1 {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private RestaurantService restaurantService;

    // Customer Registration
    @PostMapping("/customer/register")
    public String registerCustomer(@RequestBody CustomerDTO dto) {
        return customerService.registerCustomer(dto);
    }

    // Restaurant Registration
    @PostMapping("/restaurant/register")
    public Restaurant registerRestaurant(@RequestBody RestaurantRequestDto dto) {
        return restaurantService.registerRestaurant(dto);
    }
}