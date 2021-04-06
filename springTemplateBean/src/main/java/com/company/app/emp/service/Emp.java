package com.company.app.emp.service;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder //객체생성
@NoArgsConstructor //생성자추가1
@AllArgsConstructor //생성자추가2
public class Emp {
    String employeeId;   
	String firstName;
	String lastName;
	String email;	
	Date hireDate;	
	String jobId;	
	String departmentId;
	Integer salary;
	String[] employeeIds;
}
