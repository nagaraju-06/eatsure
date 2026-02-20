package com.alpha.eatsure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.eatsure.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{
	 Optional<Address> findByStreet(String street);
	

}
