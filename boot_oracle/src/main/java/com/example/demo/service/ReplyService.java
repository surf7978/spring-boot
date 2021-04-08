package com.example.demo.service;


import com.example.demo.domain.Reply;

public interface ReplyService {
	void insertReply(Reply reply);
	Iterable<Reply> selectAll();
}
