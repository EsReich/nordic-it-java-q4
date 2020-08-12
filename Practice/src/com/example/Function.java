package com.example;

import java.util.Scanner;

public class Function {

	public static int sum(int num, int divider) {
		var res = 0;
		
		for (var i = divider; i <= num; i = i + divider) {
			res += i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		var num = in.nextInt();
		var divider = in.nextInt();
		System.out.print(sum(num, divider));
	}

}
