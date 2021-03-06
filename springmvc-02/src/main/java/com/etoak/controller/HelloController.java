package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//1.获取参数
		String name = request.getParameter("name");
		
		//2.调用service服务层
		
		//3.返回页面
		ModelAndView mv = new ModelAndView();
		//webapp/pages/hello.jsp
		mv.setViewName("hello");
		//向request传值,相当于request.setAttribute(k,v);
		mv.addObject("result","hello " + name);
		return mv;
	}

}
