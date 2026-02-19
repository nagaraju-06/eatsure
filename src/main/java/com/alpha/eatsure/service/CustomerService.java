package com.alpha.eatsure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alpha.eatsure.dto.CustomerDto;
import com.alpha.eatsure.dto.ResponseStructure;
import com.alpha.eatsure.entity.Customer;
import com.alpha.eatsure.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerrepo;
	
	public ResponseEntity<ResponseStructure<Customer>> Register(CustomerDto customerdto ){
		Customer customer =new Customer();
		customer.setName(customerdto.getName());
		customer.setphone(customerdto.getPhone());
		customer.setMail(customerdto.getEmail());
		customer.setGender(customerdto.getGender());
		
		customerrepo.save(customer);
		ResponseStructure<Customer> rs=new ResponseStructure<Customer>();
		rs.setStatuscode(HttpStatus.CREATED.value());
		rs.setMessage("customer saved sucessfully");
		rs.setData(customer);
		
		return new ResponseEntity<ResponseStructure<Customer>>(rs,HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Customer>> findcustomer(Long phone){
		Customer customer= customerrepo.finByphone(phone);
		ResponseStructure<Customer> rs=new ResponseStructure<Customer>();
		rs.setStatuscode(HttpStatus.FOUND.value());
		rs.setMessage("customer Fetched successfully");
		rs.setData(customer);
		return new ResponseEntity<ResponseStructure<Customer>>(rs,HttpStatus.OK);
	
	}
	public ResponseEntity<ResponseStructure<Customer>> deleteCustomer(Long phone){
	customerrepo.deleteByphone(phone);
	ResponseStructure<Customer> rs=new ResponseStructure<Customer>();
	rs.setStatuscode(HttpStatus.OK.value());
	rs.setMessage("customer deleted sucessfully");
	rs.setData(null);
	
	return new ResponseEntity<ResponseStructure<Customer>>(rs,HttpStatus.OK);
}
}
