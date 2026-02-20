package com.alpha.eatsure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.eatsure.dto.CustomerDTO;
import com.alpha.eatsure.dto.CustomerReqDto;
import com.alpha.eatsure.entity.Customer;
import com.alpha.eatsure.repository.Customerrepoo;


@Service
public class CustomerService {

    @Autowired
    private Customerrepoo custrepoo;

    public void adding(CustomerReqDto customerReqDto) {
        Customer customer = new Customer();
        customer.setName(customerReqDto.getName());
        customer.setMobno(customerReqDto.getMobno());
        customer.setMailid(customerReqDto.getMailid());
        customer.setGender(customerReqDto.getGender());
        custrepoo.save(customer);
   }

   public void deleteCustomer(long mobno) {
      Customer c= Customerrepoo.findByMobno(mobno).orElse(null);
      Customerrepoo.delete(c);

   }

   public Customer findCustomer(long mobno) {
       return  Customerrepoo.findByMobno(mobno);



   }
}