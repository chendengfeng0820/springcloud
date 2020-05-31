package com.asiainfo.springcloud.controller;

import com.asiainfo.springcloud.pojo.Dept;
import com.asiainfo.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-05-31 15:05
 **/

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@PostMapping("/add")
	public boolean addDept(Dept dept){
		return deptService.addDept(dept);
	}

	@GetMapping("/get/{id}")
	public Dept queryById(@PathVariable("id") Long id) {
		return deptService.queryById(id);
	}

	@GetMapping("/list")
	public List<Dept> queryAll() {
		return deptService.queryAll();
	}
}
