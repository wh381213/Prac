package com.example.p1;

import com.example.p1.models.User;
import com.example.p1.services.UsersService;
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
	private UsersService usersService;

	@Test
	void usersRead() {
		List<User> users = usersService.read();
		logger.info("Done: UsersRepository.read");
	}
	@Test
	void usersCreate() {
		usersService.create(new User(0, "홍길동", 39));
		logger.info("Done: UsersRepository.create");
	}
	@Test
	void usersDelete() {
		usersService.delete(13);
		logger.info("Done: UsersRepository.delete");
	}
	@Test
	void usersUpdate() {
		usersService.update(3, new User(0, "이순신", 33));
		logger.info("Done: UsersRepository.update");
	}

}
