package com.example.p1;

import com.example.p1.models.Member;
import com.example.p1.services.MembersService;
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
	private MembersService membersService;

	@Test
	void membersRead() {
		List<Member> members = membersService.read();
		logger.info("Done: MembersRepository.read");
	}
	@Test
	void membersCreate() {
		membersService.create(new Member(0, "홍길동", 39));
		logger.info("Done: MembersRepository.create");
	}
	@Test
	void membersDelete() {
		membersService.delete(13);
		logger.info("Done: MembersRepository.delete");
	}
	@Test
	void membersUpdate() {
		membersService.update(3, new Member(0, "이순신", 33));
		logger.info("Done: MembersRepository.update");
	}

}
