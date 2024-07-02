package com.javaListCollections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Example4 {

	public static void main(String[] args) {

		// List<Integer> list = new Stack<Integer>();

		Stack<Integer> list = new Stack<Integer>();

		list.push(200);
		list.push(200);
		list.push(345);
		list.push(null);
		list.push(600);

		System.out.println(list.peek());

		System.out.println("------------");

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------------------------------------");

		list.pop();

		Enumeration<Integer> e = list.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("--------------------------------------");

		list.push(490);

		System.out.println(list);

		System.out.println("--------------------------------------");

		list.removeElementAt(1);

		System.out.println(list);

	}

}
