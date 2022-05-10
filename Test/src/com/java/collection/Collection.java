package com.java.collection;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {

		// list 1 can store only string types
		ArrayList<String> list1 = new ArrayList<String>();

		// list2 can store any typeofobject
		ArrayList list2 = new ArrayList();

		// 1.add data in the list
		list1.add("John");
		list1.add("Jack");
		list1.add("Joesph");
		list1.add("Jack");
		// list1.add(123); //error because list1 will store only string values
		list2.add(123);
		list2.add("Joe");

		System.out.println(list1);
		System.out.println(list2);
		
	}
}
