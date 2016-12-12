package com.hb.ex01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hb.ex01.model.UserBean;

@Controller
public class Ex01Controller {
	
	@RequestMapping("/ex01")
	public String test01(HttpServletRequest req){
		req.setAttribute("msg", "환영합니다");
		return "index";
	}
	
	@RequestMapping("/ex02")
	public String test02(){
		return "index";
	}
	
	@RequestMapping("/ex03")
	public String test03(Model model){
		model.addAttribute("msg","전달합니다");
		return "index";
	}
	
	@RequestMapping("/ex04")
	public String test04(HttpServletRequest req){
		String idx = req.getParameter("idx");
		req.setAttribute("msg", "param: "+idx);
		return "index";
	}

	@RequestMapping("/ex05")
	public String test05(HttpServletRequest req,Model model){
		String idx = req.getParameter("idx");
		model.addAttribute("msg", "param: "+idx);
		return "index";
	}
	
	@RequestMapping("/ex06")
	public String test06(Model model, HttpServletRequest req){
		String idx = req.getParameter("idx");
		model.addAttribute("msg", "param: "+idx);
		return "index";
	}
	
	@RequestMapping("/ex07")
	public String test07(int idx, Model model){
		
		model.addAttribute("msg", idx);
		return "index";
	}
	
	@RequestMapping("/ex08")
	public String test08(String id,String pw, Model model){	//ex08?id=admin&pw=a123
		String msg = "id: "+id+", pw: "+pw;
		
		model.addAttribute("msg", msg);
		return "index";
	}
	
	@RequestMapping("/ex09")
	public String test09(Model model,Double num){
		
		model.addAttribute("msg", num*2);
		return "index";
	}
	
//	@RequestMapping("/ex10")
//	public String test10(UserBean bean) {
//		System.out.println(bean);
//		return "index";
//	}

	@RequestMapping("/ex10")
	public String test10(@ModelAttribute("msg") UserBean bean) {
		System.out.println(bean);
		return "index";
	}
	
	@RequestMapping("/ex11")
	public ModelAndView test11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("mas", "전달");
		mav.setViewName("index");
		return mav;
	}
	
}
