package com.example;

import java.util.Scanner;

public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		var num1 = in.nextInt();
		var num2 = in.nextInt();
		var res = 1;
		var count = 1;
		for (; count <= num2; count++) {
			res = res * num1;
		}
		System.out.print(res);
	}

}
