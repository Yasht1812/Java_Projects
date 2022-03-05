package com.thinkitive.spring2;



public class Student {
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
int studentID;
String studentName;
public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public void displayStudent() {

	System.out.println("The info of student is" + studentID + " " + studentName);
}


}


