package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SayHelloController {
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "Hello! what are you learning today";
	}

}
