package com.thinkitive.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
	@Autowired
	Calculator calculator;
	@RequestMapping(value = "/add")
	public ModelAndView myadd(Integer a, Integer b) {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome1.jsp");
		model.addObject("message","Answer is:"+calculator.add(a, b));
		return model;

	}
}