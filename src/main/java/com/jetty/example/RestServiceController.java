package com.jetty.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {

	@RequestMapping(value = "/testService", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public String testService() {
		return "Returning to Service";
	}

}
