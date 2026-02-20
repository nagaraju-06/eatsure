package com.alpha.eatsure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Items;

@Repository
public interface Itemsrepoo extends JpaRepository<Items, Integer> {
	Optional<Items> findByName (String naame);
}
