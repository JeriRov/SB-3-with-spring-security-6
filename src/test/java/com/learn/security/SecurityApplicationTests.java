package com.learn.security;

import static org.assertj.core.api.Assertions.assertThat;
import com.learn.security.config.JwtService;
import com.learn.security.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityApplicationTests {

	@Autowired
	private JwtService jwtService;

	@Test
	void contextLoads() {
		assertThat(jwtService).isNotNull();
	}

}
