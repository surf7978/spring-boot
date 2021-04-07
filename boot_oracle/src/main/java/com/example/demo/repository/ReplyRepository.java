package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
	List<Reply> findByTitle(String title);
}
