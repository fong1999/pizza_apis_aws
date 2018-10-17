package com.fong.pizzashopapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FongRestController {
	@RequestMapping
	String mapToHttp() {
		return  "Welcome!";
	}

}
