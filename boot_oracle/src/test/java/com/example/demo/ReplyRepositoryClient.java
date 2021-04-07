package com.example.demo;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Reply;
import com.example.demo.repository.ReplyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class ReplyRepositoryClient {
	@Autowired ReplyRepository repository;
	
	@Test
	@Commit
	public void 댓글저장() { //Test에는 메소드명 한글로 해도됨
		Reply reply = Reply.builder()
								.title("test3")
								.build();
		repository.save(reply); //이게 저장임
	}
	
	@Test
	public void 댓글조회() {
		//여기서 쓰는 sql은 jpql로 써야함
		//EntityManager에서 persist merge remove find가 CRUD임
		//https://docs.spring.io/spring-data/jpa/docs/2.4.7/reference/html/#jpa.query-methods.query-creation 여기서 명령어 참조하기
		List<Reply> list = repository.findAll();
		System.out.println(list);
	}
	
	@Test
	public void 제목조회() {
		List<Reply> list = repository.findByTitle("test4");
		System.out.println(list);
	}
}
