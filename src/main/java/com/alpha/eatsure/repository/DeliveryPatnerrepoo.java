package com.alpha.eatsure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.DeliveryPartner;

@Repository
public interface DeliveryPatnerrepoo extends JpaRepository<DeliveryPartner, Integer>{
	 Optional<DeliveryPartner> findByMobno(long mobno);

}