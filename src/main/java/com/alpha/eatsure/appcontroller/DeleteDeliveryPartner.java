package com.alpha.eatsure.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.eatsure.service.DeliveryPartnerService;

@RestController
public class DeleteDeliveryPartner {

	@Autowired
	private DeliveryPartnerService deliverypartner;

	@DeleteMapping("/delete/deliveryPartner")
	public void deletePartner(@RequestParam long mobno) {
		deliverypartner.deletePartner(mobno);

	}
}
