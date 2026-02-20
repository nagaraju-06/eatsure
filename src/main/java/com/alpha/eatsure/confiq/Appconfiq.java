package com.alpha.eatsure.confiq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class Appconfiq {
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
