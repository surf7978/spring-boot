package com.example.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Reply;
import com.example.demo.repository.ReplyRepository;
import com.example.demo.service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired ReplyRepository repo;
	
	public void insertReply(Reply reply) {
		repo.save(reply);
	}

	public Iterable<Reply> selectAll() {
		return repo.findAll();
	}

}
