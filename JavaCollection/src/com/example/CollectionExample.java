package com.example;

import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		
		var set = new TreeSet<String>();
		set.add("sdf");
		set.add("qqqq");
		set.add("bbb");
		set.add("aaa");
		
		for (String str : set) {
			System.out.println(str);
		}

	}

}
