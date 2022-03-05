package com.thinkitive.day1.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyClassMVC {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ModelAndView hello(@RequestParam("username") String user, @RequestParam("password") String pass) {
		System.out.println("Hello world");
		ModelAndView model = new ModelAndView();

		System.out.println(user);
		System.out.println(pass);
		if (user.equals("admin") && pass.equals("admin")) {
			model.addObject("message", "This is sample data");
			model.setViewName("welcome.jsp");
		} else {

			model.addObject("message", "This is invalid");
			model.setViewName("welcome.jsp");
		}
		return model;
	}

	@RequestMapping(value = "/hi", method = RequestMethod.POST)
	public ModelAndView bye(@RequestParam("username") String user, @RequestParam("password") String pass) {
		System.out.println("Hello world");
		ModelAndView model = new ModelAndView();

		System.out.println(user);
		System.out.println(pass);
		if (user.equals("admin") && pass.equals("admin")) {
			model.addObject("message", "This is sample data");
			model.setViewName("welcome.jsp");
		} else {

			model.addObject("message", "This is invalid");
			model.setViewName("welcome.jsp");
		}
		return model;
	}
}
