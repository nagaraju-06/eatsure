package com.alpha.eatsure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alpha.eatsure.entity.DeliveryPatner;

public interface DeliveryPatnerRepository extends JpaRepository<DeliveryPatner, Integer> {

	DeliveryPatner findByMobno(String mobno);

	void deleteByMobno(String mobno);
}
