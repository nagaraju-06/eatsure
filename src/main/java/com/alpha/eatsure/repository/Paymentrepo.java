package com.alpha.eatsure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Payment;

@Repository
public interface Paymentrepo extends JpaRepository<Payment, Integer>{

}
