package com.company.app;

import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.company.app.config.BeanConfiguration;
import com.company.app.config.DBConfiguration;
import com.company.app.config.MybatisConfiguration;
import com.company.app.emp.service.Emp;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.impl.EmpMapper;

@Transactional //테스트 후에 자동 롤백해줌1
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfiguration.class, MybatisConfiguration.class, BeanConfiguration.class})
public class EmpMapperClient {
	//TDD(테스트주도개발)알아보기 단위테스트(JUnit)에 대해 알아보기
	@Autowired EmpMapper empMapper;
	@Autowired EmpService empService;
	
	@Test
	@Rollback //테스트 후에 자동 롤백해줌1
	public void insert() {
		Emp emp = Emp.builder()
				.employeeId("60001")
				.firstName("aaa")
				.lastName("bbb")
				.email("z@z.X")
				.hireDate(new Date(System.currentTimeMillis()))
				.jobId("IT_PROG")
				.build();
		empService.insertEmp(emp);
		emp = empMapper.getEmp(emp);
		assertNotNull(emp);
	}
}
