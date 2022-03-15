package com.okdevtv.tdd.hello;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	private HelloWorld hello;
	
	@Before
	public void setup() {
		hello = new HelloWorld();
	}

	@Test
	public void test() {
		String msg = hello.getMessage();
		assertEquals("Hello World", msg);
	}

	@Test
	public void testGetMessage() {
		String msg = hello.getMessage("name");
		assertEquals("Hello name", msg);
	}

	@Test
	public void testGetMessageNull() {
		String msg = hello.getMessage(null);
		assertEquals("Hello World", msg);
	}

	@After
	public void teardown() {
		System.out.println("...");
	}
}
