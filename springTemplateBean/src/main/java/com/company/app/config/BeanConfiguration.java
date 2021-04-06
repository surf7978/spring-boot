package com.company.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.impl.EmpMapper;
import com.company.app.emp.service.impl.EmpServiceImpl;

@Configuration
@ComponentScan(basePackages="com.company") //자동스캔(양많을때 이거 해주면됨)
public class BeanConfiguration {
	
	//@Bean // xml <bean id="" class="" ></bean>
	public EmpService empService(EmpMapper empMapper) {
		return new EmpServiceImpl(empMapper);
	}
}
