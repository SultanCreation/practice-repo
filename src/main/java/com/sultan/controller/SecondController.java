package com.sultan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {

	@GetMapping("/getWish")
	   public ModelAndView getWishMsg() {
		   ModelAndView mav = new ModelAndView();
		   mav.addObject("msg", "this is 1st method of 2nd controller class");
		   mav.setViewName("index3");
		   return mav;
		   
	   }
}
