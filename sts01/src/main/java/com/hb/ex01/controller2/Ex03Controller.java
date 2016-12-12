package com.hb.ex01.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex03Controller {
	
	@RequestMapping("/test01")
	public String test01() {
		
		return "index";
	}
}
