package com.example;

import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {
		var arr1 = new int[8];
		var arr2 = new int[8];
		var in = new Scanner(System.in);
		
		for (var i = 0; i < 8; i++) {
			arr1[i] = in.nextInt();
		}
		
		for (var i = 0; i < 8; i++) {
			arr2[i] = in.nextInt();
		}
		
		var count = 0;
		
		for (var i = 0; i < arr1.length; i++) {
			for (var j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr2[j] = 0;
					count++;
					break;
				} 	
			}
		}
		if (count == 8) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	
	}

}
