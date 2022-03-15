package com.okdevtv.tdd.hello;

public class HelloWorld {
	public String getMessage() {
		return "Hello World";
	}

	public String getMessage(String string) {
		if (string == null) {
			return getMessage();
		}
		return "Hello " + string;
	}
}
