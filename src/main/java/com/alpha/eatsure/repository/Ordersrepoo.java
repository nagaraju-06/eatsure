package com.alpha.eatsure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Orders;

@Repository
public interface Ordersrepoo extends JpaRepository<Orders, Integer> {
	Optional<Orders> findByOtp(String otp);
}
