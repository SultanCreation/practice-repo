package com.sultan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("/getWelcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "hello this  is 1st method to handle the request");
		mav.setViewName("index1");
		return mav;
	}
	@GetMapping("/getGreet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		 mav.addObject("msg", "hello this  is 2nd method to handle the request");
		 mav.setViewName("index2");
		return mav; 
	}
}
