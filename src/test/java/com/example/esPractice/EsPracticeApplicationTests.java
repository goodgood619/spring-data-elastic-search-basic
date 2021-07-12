package com.example.esPractice;

import com.example.esPractice.models.Blog;
import com.example.esPractice.repository.BlogEsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EsPracticeApplicationTests {

	@Autowired
	private BlogEsRepository blogEsRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void saveTest() {
		Blog blog = new Blog();
		blog.setId("1");
		blog.setContent("es 테스트 내용");
		blog.setTitle("es Title");
		blogEsRepository.save(blog);
	}
}
