package com.thinkitive;

import java.util.List;

import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MyController {
	AdminQueries aq = new AdminQueries();
	TeacherQueries tq = new TeacherQueries();
	StudentQueries sq = new StudentQueries();
	ExamPages ex = new ExamPages();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String user() {
		return "Hello User";
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/showusers")
	public List<User> getAllUsers() {
		return aq.displayAll();
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/showstudents")
	public List<Student> getAllStudents() {
		return tq.displayAllMarks();
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/user")
	public User insertUser(@RequestBody User u) {
		System.out.println(u);
		aq.insertUser(u);
		return u;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/student")
	public Student marks(@RequestBody Student s) {
		System.out.println(s);
		tq.insertStudent(s);
		return s;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/questions")
	public ExamPages insertPaper(@RequestBody ExamPages ep) {
		tq.insertExam(ep);
		return ep;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PutMapping(value = "/modifyquestions")
	public ExamPages modifyPaper(@RequestBody ExamPages ep) {
		System.out.println(ep);
		tq.updateQuestions(ep);
		return ep;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/markscalculation")
	public ExamPages markscalc(@RequestBody ExamPages ep, @RequestParam(name = "sid") Integer sid,
			@RequestParam(name = "name") String name, Integer marks, @RequestParam(name = "number") Integer number,
			@RequestParam(name = "correctoption") String correctoption) {
		// System.out.println(ep);
		Student s = new Student(sid, name, marks);
		sq.calculateMarks(ep, number, correctoption, s);
		return ep;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/exam1")
	public String pages1() {
		
		return sq.appearForExam1();
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/exam2")
	public String pages2(@RequestBody ExamPages ep ) {
		sq.appearForExam2(ep);
		return "ep";
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/status")
	public void status(@RequestBody User u, @RequestParam(name = "id") String id,
			@RequestParam(name = "status") String status) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		org.hibernate.Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User cuser = new User();
		cuser = (User) session.get(User.class, Integer.parseInt(id));
		cuser.setStatus(status);
		session.update(cuser);
		t.commit();
		session.close();
		factory.close();
	}

	
	@GetMapping(value = "/validation")
	public String credentials(@RequestParam(name = "name") String name,
			@RequestParam(name = "password") String password, @RequestParam(name = "designation") String designation) {
		
		System.err.println(name + password + designation);
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		org.hibernate.Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User user= session.get(User.class, Integer.parseInt("3")); 
		
		
			if(designation.equals("student")) {
				return "exampages";
			}
		
		return "fail";
		
		

}
}
