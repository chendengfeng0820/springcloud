package com.asiainfo.springcloud.controller;

import com.asiainfo.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-05-31 15:22
 **/
@RestController
public class DeptConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	private static final String REST_URL_PREFIX="http://localhost:8001";

	@RequestMapping("/consumer/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(REST_URL_PREFIX+"/add",dept,Boolean.class);
	}

	@RequestMapping("/consumer/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX+"/get/"+id,Dept.class);
	}

	@RequestMapping("/consumer/list")
	public List<Dept> getAll() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/list",List.class);
	}
}
