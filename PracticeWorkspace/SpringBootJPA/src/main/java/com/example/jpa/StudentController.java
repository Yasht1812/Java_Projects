package com.example.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@PostMapping("/addstudents")
	public List<Student> addStudents(@RequestBody List<Student> students){
		return service.saveStudents(students);
	}

	@GetMapping("/showstudents")
	public List<Student> getStudents(){
		return service.getStudent();
	}
	
	@DeleteMapping("/deletestudents/{id}")
	public String deleteStudent (@PathVariable int id) {
		return service.deleteStudent(id);
	}
	
	@GetMapping("/getSingleStudent/{id}")
	public Optional<Student> getSingleStudent(@PathVariable int id){
		return service.getParticularStudent(id);
	}
	
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@PathVariable int id , @RequestBody Student student) {
		return service.updateStudent(id , student);
	}
}
