package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();// 10

		// Object obj;

		list.add(new Student(101, "Ajay"));
		list.add(null);
		list.add(new Student(102, "Kiran"));

		System.out.println(list);

		System.out.println(list.get(2));

	}

}
