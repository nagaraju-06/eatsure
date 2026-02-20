package com.alpha.eatsure.service;

import com.alpha.eatsure.dto.DeliveryPartnerDTO;
import com.alpha.eatsure.entity.DeliveryPartner;
import com.alpha.eatsure.repository.DeliveryPatnerrepoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPartnerService {

    @Autowired
    private DeliveryPatnerrepoo deliveryPartnerRepository;

    public void adding(DeliveryPartnerDTO deliveryPartnerDto) {
        DeliveryPartner deliveryPartner = new DeliveryPartner();
        deliveryPartner.setName(deliveryPartnerDto.getName());
        deliveryPartner.setMobno(deliveryPartnerDto.getMobno());
        deliveryPartner.setEmail(deliveryPartnerDto.getEmail());
        deliveryPartner.setVehicleNo(deliveryPartnerDto.getVehicleNo());
        deliveryPartnerRepository.save(deliveryPartner);
    }

    public void deletePartner(long mobno) {
        DeliveryPartner d = deliveryPartnerRepository.findByMobno(mobno);
        deliveryPartnerRepository.delete(d);
    }

    public DeliveryPartner findDeliveryPartner(long mobno) {
        return deliveryPartnerRepository.findByMobno(mobno);
    }
}