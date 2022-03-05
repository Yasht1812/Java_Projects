package com.example.rest;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	List<Student> l = new ArrayList<Student>();
	@RequestMapping(value = "/")
	public String hello() {
		return "Hey there from student controller";
	}

	@GetMapping(value="/studentdetails")
	public List<Student> studentDetails() {
		
		l.add(new Student(1, "Naruto"));
		l.add(new Student(2, "Sasuke"));
		l.add(new Student(3, "Sakura"));
		return l;
	}
	@PostMapping(value="/postdetails/{id}")
	public Student postDetails(@PathVariable("id") int id,@RequestBody  Student student){
		System.out.println(student);
		System.out.println(id);
		return student;
		
	}
	
	@DeleteMapping(value="/deletedetails")
	public Student deleteDetails(@RequestParam("id")int sid,@RequestParam("name")String name,@RequestBody Student student) {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(student);
		return student ;
	}
	@PutMapping(value="/updatedetails")
	public Student updateDetails(@RequestBody Student student) {
		System.out.println(student);
		return student;
	}
}
