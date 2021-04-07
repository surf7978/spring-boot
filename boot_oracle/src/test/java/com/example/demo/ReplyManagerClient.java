package com.example.demo;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Reply;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class ReplyManagerClient {
	
	@Autowired EntityManager em;
	
	@Test
	//여기서는 자동 롤백인데 커밋해주고 싶으면 @Commit 적어주면 됨
	public void save() {
		Reply reply = Reply.builder()
								.title("test")
								.build();
		em.persist(reply); //이게 저장임
	}
}
