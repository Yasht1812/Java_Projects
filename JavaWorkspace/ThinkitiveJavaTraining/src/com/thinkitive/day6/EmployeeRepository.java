package com.thinkitive.day6;


import java.util.*;

public class EmployeeRepository<T> {
	List<EmployeeCollections2> l = new ArrayList<EmployeeCollections2>();
public void insertEmp(EmployeeCollections2 e) {
	l.add(e);
}
public List<EmployeeCollections2>getAll(){
	return l;
}
public  void removeEmp(EmployeeCollections2 e) {
	l.remove(e);
}
public void updateEmp(EmployeeCollections2 old , EmployeeCollections2 newemp) {
	l.set(l.indexOf(old), newemp);
	
}

}
