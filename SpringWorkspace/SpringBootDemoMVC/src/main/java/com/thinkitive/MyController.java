package com.thinkitive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping(value = "/hi")
public String hello() {
	System.out.println("Hello from controller");
	return "welcome.jsp";
}
}
