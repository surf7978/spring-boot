package com.example.demo;

//이거 수동으로 추가함2
import static org.hamcrest.MatcherAssert.assertThat;
//이거 수동으로 추가함
import static org.hamcrest.Matchers.is;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
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
	@Commit
	public void save() {
		Reply reply = Reply.builder()
								.title("test1")
								.build();
		em.persist(reply); //이게 저장임
		assertThat(em.find(Reply.class, reply.getSeq()), is(reply));
	}
}
