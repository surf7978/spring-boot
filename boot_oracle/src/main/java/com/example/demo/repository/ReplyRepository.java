package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Reply;

//public interface ReplyRepository extends JpaRepository<Reply, Long> {
//	List<Reply> findByTitle(String title);
//}
public interface ReplyRepository extends CrudRepository<Reply, Long> {
	
}
