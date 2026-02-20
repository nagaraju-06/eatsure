package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.dto.DeliveryPartnerDTO;
import com.alpha.eatsure.service.DeliveryPartnerService;

@RestController
public class DeliverPartnerRegController {
	@Autowired
	private DeliveryPartnerService deliverypartnerservice;

	@PostMapping("/deliveryPartner/register")
	public void adding(@RequestBody DeliveryPartnerDTO deliveryPartnerDto) {
		deliverypartnerservice.adding(deliveryPartnerDto);
	}

}
