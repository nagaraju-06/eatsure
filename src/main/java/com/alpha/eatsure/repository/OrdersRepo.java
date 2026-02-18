package com.alpha.eatsure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}
