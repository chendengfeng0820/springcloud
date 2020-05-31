package com.asiainfo.springcloud.service;

import com.asiainfo.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-05-31 15:01
 **/

public interface DeptService {

	public boolean addDept(Dept dept);

	public Dept queryById(Long id);

	public List<Dept> queryAll();
}
