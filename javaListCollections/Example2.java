package com.javaListCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(600);
		list.add(400);
		list.add(670);
		list.add(330);
		list.add(240);
		list.add(700);
		list.add(670);
		
		Collections.sort(list);
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
