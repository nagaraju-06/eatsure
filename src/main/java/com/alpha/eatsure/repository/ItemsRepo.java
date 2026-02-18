package com.alpha.eatsure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Items;

@Repository
public interface ItemsRepo extends JpaRepository<Items, Integer> {

}
