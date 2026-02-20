package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.entity.DeliveryPartner;
import com.alpha.eatsure.service.DeliveryPartnerService;

@RestController
public class FindDeliveryPartner {
	@Autowired
	private DeliveryPartnerService deliverypartnerservice;

	@GetMapping("/find/deliveryPartner")
	public ResponseEntity<DeliveryPartner> findDeliveryPartner(@RequestParam long mobno) {
		DeliveryPartner d = deliverypartnerservice.findDeliveryPartner(mobno);
		return new ResponseEntity<>(d, HttpStatus.OK);
	}

}
