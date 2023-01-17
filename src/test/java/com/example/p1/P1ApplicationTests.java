package com.example.p1;

import com.example.p1.models.Member;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class P1ApplicationTests {

	@Test
	void contextLoads() {
	}

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	void membersRead() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Member> members = sqlSession.selectList("com.example.p1.repositories.MembersRepository.read");
		logger.info("Done: MembersRepository.read");
	}
}
