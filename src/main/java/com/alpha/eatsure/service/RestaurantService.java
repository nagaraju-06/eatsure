package com.alpha.eatsure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.repository.RestaurantRepository;
import com.alpha.eatsure.restaurant.dto.RestaurantRequestDto;
//import com.alpha.eatsure.restaurant.dto.RestaurantResponseDto;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public void registerRestaurant(RestaurantRequestDto dto) {

        // DTO → Entity
        Restaurant restaurant = new Restaurant();
        restaurant.setName(dto.getName());
        restaurant.setMobile(dto.getMobile());
        restaurant.setEmail(dto.getEmail());
        restaurant.setDescription(dto.getDescription());
        restaurant.setPackagingFee(dto.getPackagingFee());
        restaurant.setType(dto.getType());

        // Save to database
        Restaurant savedRestaurant = restaurantRepository.save(restaurant);
        
        System.out.println(savedRestaurant);
      
    }
}

