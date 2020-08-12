package com.example;

import java.util.Scanner;

public class fibonacciSequence {

	public static int seq(int index) {
		int res = 0;
		
		if (index == 0) {
			res = 0;
		} else if (index == 1 || index == 2) {
			res = 1;
		} else {
			res = seq(index - 1) + seq(index - 2);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		var index = in.nextInt();
		
		System.out.println(seq(index));
	}

}
