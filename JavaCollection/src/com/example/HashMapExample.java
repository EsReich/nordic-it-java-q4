package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		var in = new Scanner(System.in);
		var string = in.nextLine();
		var map = new HashMap<Character, Integer>();
		
		for (var i = 0; i < string.length(); i++) {
			
			if (map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			} else {
				map.put(string.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println(key + ":" + value);
		}

	}

}
