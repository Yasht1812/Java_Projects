package com.thinkitive;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	EmployeeDBQueries ed = new EmployeeDBQueries();
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

	@GetMapping(value = "/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id) {

		System.out.println(id);
		return ed.getEmployee(id);
	}

	@GetMapping(value = "/all")
	public List<Employee> getEmployee() {
		return ed.getAll();
	}


	@PostMapping(value = "/save")
	public Employee insert(@RequestBody Employee e) {
		System.out.println(e);
		ed.insertEmployee(e);
		return e;
	}
	@DeleteMapping(value = "/delete")
	public Employee delete(@RequestBody Employee e) {
		ed.deleteEmployee(e);
		System.out.println(e);
		return e;
	}

}
