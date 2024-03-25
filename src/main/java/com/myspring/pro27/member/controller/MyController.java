package com.myspring.pro27.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.pro27a.Student;

@Controller
public class MyController {
	
	@RequestMapping(value = "/nana", method = RequestMethod.GET)
	public ModelAndView  hi(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		Student stu = new Student();
		stu.setName("김삿갓");
		mav.addObject("stu", stu);
		mav.setViewName("nana");
		return mav;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView  hi2(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hi1");
		return mav;
	}

}
