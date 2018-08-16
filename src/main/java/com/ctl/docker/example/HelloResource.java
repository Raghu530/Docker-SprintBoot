package com.ctl.docker.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloResource {
	
	@RequestMapping("/rest/docker/hello")
	public String hello() {
		return "Hello Docker Example";
	}

}
