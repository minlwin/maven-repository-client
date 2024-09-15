package com.jdc.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jdc.commons.services.HelloService;

@SpringBootTest
public class ApplicationTest {
	
	@Autowired
	private HelloService service;

	@Test
	void test() {
		assertEquals("Hello Maven Package Work flow.", service.message());
	}
}
