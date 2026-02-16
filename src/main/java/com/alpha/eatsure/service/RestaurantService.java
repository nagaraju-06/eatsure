package com.alpha.eatsure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.eatsure.dto.RestaurantRequestDto;
import com.alpha.eatsure.entity.Address;
import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.repository.AddressRepo;
import com.alpha.eatsure.repository.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private AddressRepo addressRepository;

    public Restaurant registerRestaurant(RestaurantRequestDto dto) {

        Restaurant restaurant = new Restaurant();

        restaurant.setName(dto.getName());
        restaurant.setMobile(Long.parseLong(dto.getMobile()));
        restaurant.setEmail(dto.getEmail());
        restaurant.setDescription(dto.getDescription());
        restaurant.setPackagingFee(dto.getPackagingFee());
        restaurant.setType(dto.getType());

        restaurant.setOpen(true);
        restaurant.setRating(0.0);

        // Address mapping
        Address address = new Address();
        address.setLatitude(dto.getLatitude());
        address.setLongitude(dto.getLongitude());

        addressRepository.save(address);
        restaurant.setAddress(address);

        return restaurantRepository.save(restaurant);
    }
}