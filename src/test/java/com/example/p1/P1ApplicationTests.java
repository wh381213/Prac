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
	@Test
	void membersCreate() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer count = sqlSession.insert(
				"com.example.p1.repositories.MembersRepository.create",
				new Member(0, "홍길동", 39)
		);
		logger.info("Done: MembersRepository.create");
	}
	@Test
	void membersDelete() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer count = sqlSession.delete(
				"com.example.p1.repositories.MembersRepository.delete",
				10
		);
		logger.info("Done: MembersRepository.delete");
	}
	@Test
	void membersUpdate() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer count = sqlSession.update(
				"com.example.p1.repositories.MembersRepository.update",
				new Member(1, "이순신", 33)
		);
		logger.info("Done: MembersRepository.update");
	}

}