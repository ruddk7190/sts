package com.hb.ex01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex")
public class Ex02Controller {
	
	@RequestMapping("/ex01")
	public String test01() {
		
		return "index";
	}
}
