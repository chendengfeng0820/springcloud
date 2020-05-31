package com.asiainfo.springcloud.service.ImpI;

import com.asiainfo.springcloud.dao.DeptDao;
import com.asiainfo.springcloud.pojo.Dept;
import com.asiainfo.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-05-31 15:02
 **/
@Service
public class DeptServiceImp implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept queryById(Long id) {
		return deptDao.queryById(id);
	}

	@Override
	public List<Dept> queryAll() {
		return deptDao.queryAll();
	}
}
