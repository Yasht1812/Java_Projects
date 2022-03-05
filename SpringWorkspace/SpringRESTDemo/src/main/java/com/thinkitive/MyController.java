package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

	@GetMapping(value = "/emp/{id}")
	public Employee getEmp(@PathVariable("id")Integer id) {
		System.out.println(id);
		return new Employee(1, "ABC", 9999);
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/all")
	public List<Employee> getEmployee() {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(2, "PQR", 8888));
		l.add(new Employee(3, "LMN", 1111));
		l.add(new Employee(4, "XYZ", 7777));
		l.add(new Employee(5, "DEF", 9999));
		return l;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/save")
	public Employee insertEmployee(@RequestBody Employee e) {
		System.out.println(e);
		return e;
	}

}
