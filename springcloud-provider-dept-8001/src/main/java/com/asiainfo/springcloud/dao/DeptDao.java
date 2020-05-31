package com.asiainfo.springcloud.dao;


import com.asiainfo.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);

	public Dept queryById(Long id);

	public List<Dept> queryAll();

}
