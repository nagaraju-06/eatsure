package com.alpha.eatsure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alpha.eatsure.entity.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>
{
	 Restaurant findByMobno(long mobno);
}
