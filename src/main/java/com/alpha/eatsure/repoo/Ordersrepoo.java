package com.alpha.eatsure.repoo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Orders;

@Repository
public interface Ordersrepoo extends JpaRepository<Orders, Integer> {

}
