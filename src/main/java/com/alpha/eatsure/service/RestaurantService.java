package com.alpha.eatsure.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alpha.eatsure.dto.RestaurantRequestDto;
import com.alpha.eatsure.entity.Address;
import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.repository.AddressRepo;
import com.alpha.eatsure.repository.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

	public void adding(RestaurantRequestDto restaurantReqDto) {

        Restaurant restaurant=new Restaurant();
        restaurant.setName(restaurantReqDto.getName());
        restaurant.setMobno(restaurantReqDto.getMobno());
        restaurant.setMailid(restaurantReqDto.getMailid());
        //error line
//        restaurant.setAddress(restaurantReqDto.getLocationCordinate());
        restaurant.setAddress(null);


        restaurant.setDescription(restaurantReqDto.getDescription());
        restaurant.setPackagingFees(restaurantReqDto.getPackagingFees());
        restaurant.setType(restaurantReqDto.getType());

        restaurantRepository.save(restaurant);

    }

    public void deleteRestaurant(long mobno) {
          Restaurant r=  RestaurantRepository.findByMobno(mobno);
          restaurantRepository.delete(r);
    }

    public Restaurant findRestaurant(long mobno) {
        return restaurantRepository.findByMobno(mobno);
    }
}
