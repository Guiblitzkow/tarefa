package com.javaweb.app03.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BaseController {

	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}