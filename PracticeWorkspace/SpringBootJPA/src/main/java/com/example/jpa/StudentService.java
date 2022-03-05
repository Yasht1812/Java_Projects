package com.example.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	public List<Student> saveStudents(List<Student> students) {
		return repo.saveAll(students);
	}
	
	public List<Student> getStudent() {
		return repo.findAll();
	}
	public Optional<Student> getStudentById(int id) {
		return repo.findById(id);
	}
	
	public Optional<Student> getParticularStudent(int id) {
		return repo.findById(id);
	}
	
	
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "student removed" + id;
	}
	public Student updateStudent(int id,Student student) {
		return repo.save(student);
	}
}
