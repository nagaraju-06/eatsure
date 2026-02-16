package com.alpha.eatsure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.eatsure.dto.CustomerDTO;
import com.alpha.eatsure.entity.Customer;
import com.alpha.eatsure.repository.Customerrepoo;


@Service
public class CustomerService {

    @Autowired
    private Customerrepoo custrepoo;

    public String registerCustomer(CustomerDTO dto) {

        // Check email already exists
        if (custrepoo.existsByMail(dto.getMail())) {
            return "Email already registered";
        }

        // DTO → Entity conversion
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setMobno(dto.getMobno());
        customer.setMail(dto.getMail());
        customer.setGender(dto.getGender());

        // Save customer
        custrepoo.save(customer);

        return "Customer Registered Successfully";
    }
}