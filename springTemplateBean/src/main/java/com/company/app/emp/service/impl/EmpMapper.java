package com.company.app.emp.service.impl;

import java.util.List;
import java.util.Map;

import com.company.app.emp.service.Emp;
import com.company.app.emp.service.Jobs;

public interface EmpMapper {
	public Emp getEmp(Emp empVO);
	public List<Emp> getEmpList(Emp Emp);
	public void insertEmp(Emp empVO);
	public String getName(Integer id);
	public List<Map<String, Object>> getEmpMap();
	public List<Map<String, Object>> getDeptEmpCnt();
	public List<Jobs> jobSelect();
}

