package com.thinkitive.day6;
import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(19);
		list.add(20);
		list.add(true);
		list.add("Hello");
		System.out.println(list);
		
		List list2 = new LinkedList();
		list2.add(19);
		list2.add(20);
		list2.add(true);
		list2.add("Hello");
		System.out.println(list);
		
		List list3 = new Vector();
		list3.add(19);
		list3.add(20);
		list3.add(true);
		list3.add("Hello");
		System.out.println(list);

	}

}
