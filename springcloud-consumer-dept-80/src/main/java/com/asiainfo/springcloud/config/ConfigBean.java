package com.asiainfo.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: cdf
 * @create: 2020-05-31 15:26
 **/
@Configuration
public class ConfigBean {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
