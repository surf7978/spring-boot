package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ReplyService;

@Controller
@RequestMapping("/reply")//여기에 적으면 모든 메소드에 공통으로 들어감
public class ReplyController {
	@Autowired ReplyService replyService;
	
	//http://localhost:85/reply/list
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", replyService.selectAll());
		return "list"; 
	}
}
