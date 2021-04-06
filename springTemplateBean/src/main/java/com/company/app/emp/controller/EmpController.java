package com.company.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.app.emp.service.Emp;
import com.company.app.emp.service.impl.EmpMapper;

@Controller
public class EmpController  {
	@Autowired
	EmpMapper dao;
	
	@RequestMapping(value="/empSelect", 
			        method = RequestMethod.GET   )
	public String select() {
		//조회
		return "emp/select";
	}	
	@GetMapping("/empUpdateForm")
	public String updateForm(Model model, Emp emp) {
		model.addAttribute("emp", dao.getEmp(emp));
		model.addAttribute("jobs", dao.jobSelect());
		//model.addAttribute("depts", dao.deptSelect());
		return "emp/insert";   //foward
	}	
	
	
	@GetMapping("/empinsertForm")
	public String insertForm(Model model, Emp emp) {
		model.addAttribute("jobs", dao.jobSelect());
		return "emp/insert";   //foward
	}	
	
	@PostMapping("/empInsert") 
	public String insert(@ModelAttribute("employee") Emp emp){
		dao.insertEmp(emp);
		return "emp/insertOutput";
	}
	/*
	 * @PostMapping("/empInsert") public String insert(HttpServletRequest request,
	 * 
	 * @RequestParam(value="lastName", required = false, defaultValue = "noname")
	 * String lName,
	 * 
	 * @RequestParam(required = false) int salary, Emp emp ) { //파라미터 String fName =
	 * request.getParameter("firstName"); System.out.println(lName + ":" + fName +
	 * ":" + salary); System.out.println("emp\n" + emp); //등록처리 //redirect return
	 * "redirect:/empSelect"; }
	 */
}
