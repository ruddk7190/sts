package com.hb.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex04Controller {
	
	@RequestMapping("/hb01")
	public String test01() {
		return "index";
	}
	
	@RequestMapping("/hb02")
	public String test02(@RequestParam("id") String msg,Model model) {	//localhost:8080/ex01/hb02?id=aaaa
		model.addAttribute("msg", msg);
		return "index";
	}
	
	@RequestMapping("/hb02/ex01")
	public String test03(@RequestParam("msg") String msg,Model model) {
		model.addAttribute("msg", msg);
		return "index";
	}
	
	@RequestMapping("/hb03/{id}")
	public String test04(@PathVariable String id,Model model) {
		String msg = "id: "+id;
		model.addAttribute("msg", msg);
		return "index";
	}
}
