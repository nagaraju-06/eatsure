package com.alpha.eatsure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.DeliveryPartner;

@Repository
public interface DeliveryPatnerrepoo extends JpaRepository<DeliveryPartner, Integer>{
	
}