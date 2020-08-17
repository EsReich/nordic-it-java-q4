package com.example;

import java.util.Scanner;

public class FactRecursion {

	public static int factRecFor(int num) {
		var res = 1;
		
		for (int i = 1; i <= num; i++) {
			res = factRecFor(num - 1) * num;
		}
		return res;
	}
	
	public static int factRecIf(int num) {
		var res = 0;
		
		if (num == 0) {
			res = 1;
		} else {
			res = factRecIf(num - 1) * num;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		var num = in.nextInt();
		System.out.println(factRecFor(num) + " " + factRecIf(num));
	}

}