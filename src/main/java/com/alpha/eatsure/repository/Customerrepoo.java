package com.alpha.eatsure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Customer;

@Repository
public interface Customerrepoo extends JpaRepository<Customer, Integer> {
	boolean existsByMail(String mail);
}
