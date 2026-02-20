package com.alpha.eatsure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.eatsure.entity.Customer;
import com.alpha.eatsure.entity.DeliveryPatner;
import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.repository.Customerrepoo;
import com.alpha.eatsure.repository.DeliveryPatnerRepository;
import com.alpha.eatsure.repository.RestaurantRepository;

@Service
public class CommonService {

    @Autowired
    private Customerrepoo customerRepo;

    @Autowired
    private RestaurantRepository restaurantRepo;

    @Autowired
    private DeliveryPatnerRepository deliveryRepo;

    public Customer findCustomer(String mobno) {
        return customerRepo.findByMobno(mobno);
    }

    public Restaurant findRestaurant(String mobno) {
        return restaurantRepo.findByMobno(mobno);
    }

    public DeliveryPatner findDeliveryPartner(String mobno) {
        return deliveryRepo.findByMobno(mobno);
    }

    public void deleteCustomer(String mobno) {
        customerRepo.deleteByMobno(mobno);
    }

    public void deleteRestaurant(String mobno) {
        restaurantRepo.deleteByMobno(mobno);
    }

    public void deleteDeliveryPartner(String mobno) {
        deliveryRepo.deleteByMobno(mobno);
    }
}
