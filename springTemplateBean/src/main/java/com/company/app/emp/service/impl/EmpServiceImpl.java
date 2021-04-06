package com.company.app.emp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.emp.service.Emp;
import com.company.app.emp.service.EmpService;

@Service // BeanConfiguration파일에 @Bean이거 안쓰면 써줘야함
public class EmpServiceImpl implements EmpService {
	
	@Autowired EmpMapper empMapper;
	
	public EmpServiceImpl(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}
	
	@Override
	public void insertEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}

}
