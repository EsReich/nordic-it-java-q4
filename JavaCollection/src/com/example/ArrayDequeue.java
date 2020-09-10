package com.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeue {

	public static void main(String[] args) {

		var in = new Scanner(System.in);
		var string = in.nextLine();
		var deque = new ArrayDeque<Character>();
		
		for (var i = 0; i < string.length(); i++) {
			if ((string.charAt(i) == '(') || (string.charAt(i) == '{') || (string.charAt(i) == '[')) {
				deque.add(string.charAt(i));
			} else if ((deque.contains('(') && string.charAt(i) == ')') || 
					(deque.contains('{') && string.charAt(i) == '}') || (deque.contains('[') && string.charAt(i) == ']')) {
				deque.pollLast();
			}
			
		}
		
		if (deque.isEmpty()) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		
	}

}
