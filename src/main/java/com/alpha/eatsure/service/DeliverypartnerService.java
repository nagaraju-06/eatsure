package com.alpha.eatsure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alpha.eatsure.dto.DeliveryPartnerDto;
import com.alpha.eatsure.dto.ResponseStructure;
import com.alpha.eatsure.entity.DeliveryPartner;
import com.alpha.eatsure.repository.DeliverypartnerRepo;

@Service
public class DeliverypartnerService {
@Autowired
 private DeliverypartnerRepo deliverypartnerrepo;

public ResponseEntity<ResponseStructure<DeliveryPartner>> register(DeliveryPartnerDto deliverypartnerdto){
	DeliveryPartner deliverypartner =new DeliveryPartner();
	deliverypartner.setName(deliverypartnerdto.getName());
	deliverypartner.setphone(deliverypartnerdto.getPhone());
	deliverypartner.setMail(deliverypartnerdto.getEmail());
	deliverypartner.setVechile(deliverypartnerdto.getVehicleno());
	deliverypartnerrepo.save(deliverypartner);
	
	ResponseStructure<DeliveryPartner> rs=new ResponseStructure<DeliveryPartner>();
	rs.setData(deliverypartner);
	rs.setMessage("sucessfully registerd");
	rs.setStatuscode(HttpStatus.OK.value());
	return new ResponseEntity<ResponseStructure<DeliveryPartner>>(rs,HttpStatus.CREATED);
}
public ResponseEntity<ResponseStructure<DeliveryPartner>> deletedeliverypartner(Long phone){
deliverypartnerrepo.deleteByphone(phone);
ResponseStructure<DeliveryPartner> rs=new ResponseStructure<DeliveryPartner>();
rs.setData(null);
rs.setMessage("deleted deliverypartner successfully");
rs.setStatuscode(HttpStatus.OK.value());

return  new ResponseEntity<ResponseStructure<DeliveryPartner>>(rs,HttpStatus.OK);

}
public ResponseEntity<ResponseStructure<DeliveryPartner>> finddeliverypartner(Long phone){
	DeliveryPartner deliverypartner=deliverypartnerrepo.findByphone(phone);
	if(deliverypartner==null) {
		throw new RuntimeException();}
	
	ResponseStructure<DeliveryPartner> rs=new ResponseStructure<DeliveryPartner>();
	rs.setData(deliverypartner);
	rs.setMessage("deliverypartner fetched successfully");
	rs.setStatuscode(HttpStatus.FOUND.value());
	return new ResponseEntity<ResponseStructure<DeliveryPartner>>(rs,HttpStatus.FOUND);
	}

}


