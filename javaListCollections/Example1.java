package com.javaListCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {

		// List<Integer> list = new ArrayList<Integer>();//10
		ArrayList<Integer> list = new ArrayList<Integer>();// 10

		list.add(100);
		list.add(null);
		list.add(200);
		list.add(600);
		list.add(400);
		list.add(670);
		list.add(null);
		list.add(330);
		list.add(240);
		list.add(700);
		list.add(670);

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("---------------------------------");

	}

}
