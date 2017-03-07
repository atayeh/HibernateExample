package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
		ModelAndView modelandview = new ModelAndView("HelloPage"); //the view name.jsp
		//welcomeMessage is a variable, you'll use it using .jsp
		modelandview.addObject("welcomeMessage", "Hello user--1st MVC app");
		return modelandview;
	}

}
