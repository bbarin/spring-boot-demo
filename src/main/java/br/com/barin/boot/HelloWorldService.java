package br.com.barin.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

	@Value("${name:World}")
	private String name;

	public String getHelloMessage() {
		return "Hello Bruno " + this.name;
	}

}