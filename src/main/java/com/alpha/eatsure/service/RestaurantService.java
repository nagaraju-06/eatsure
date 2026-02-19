package com.alpha.eatsure.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alpha.eatsure.dto.ResponseStructure;
import com.alpha.eatsure.dto.RestaurantDto;
import com.alpha.eatsure.entity.Address;
import com.alpha.eatsure.entity.Restaurant;
import com.alpha.eatsure.repository.RestaurantRepository;


@Service
public class RestaurantService {
@Autowired
private RestaurantRepository restaurantrepository;
@Autowired
private RestTemplate restTemplate;
   
public ResponseEntity<ResponseStructure<Restaurant>> register(RestaurantDto restaurantdto){
	Restaurant restaurant=new Restaurant();
	restaurant.setName(restaurantdto.getName());
	restaurant.setMobile(restaurantdto.getPhone());
	restaurant.setEmail(restaurantdto.getEmail());
	restaurant.setDescription(restaurantdto.getDescription());
	restaurant.setPackagingFee(restaurantdto.getPackagefees());
	restaurant.setType(restaurantdto.getType());
	
	String url="https://us1.locationiq.com/v1/reverse?key=pk.e13376a26985e3fd5361223a1ed9aabb&lat="+ restaurantdto.getCordinates().getLatitude()+"&lon="
			+restaurantdto.getCordinates().getLongitude()+"&format=json&";
			
			Map<String,Object> response=restTemplate.getForObject(url,Map.class);
			
			Map<String,Object> addressMap=(Map<String,Object>) response.get("address");
			
			Address address=new Address();

			address.setLatitude(restaurantdto.getCordinates().getLatitude());
			address.setLongitude(restaurantdto.getCordinates().getLongitude());

			address.setArea((String) addressMap.get("suburb"));
			address.setCity((String) addressMap.get("city"));
			address.setDistrict((String) addressMap.get("county"));
			address.setState((String) addressMap.get("state"));
			address.setCountry((String) addressMap.get("country"));
			address.setPincode((String) addressMap.get("postcode"));
			restaurant.setAddress(address);
			restaurantrepository.save(restaurant);
			ResponseStructure<Restaurant> rs=new ResponseStructure<Restaurant>();
			rs.setData(restaurant);
			rs.setMessage("restaurant saved successfully ");
		
	
			rs.setStatuscode(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<Restaurant>>(rs,HttpStatus.CREATED);
}
}
