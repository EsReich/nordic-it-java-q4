package com.example;

import java.util.Scanner;

public class NewApp {
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		var in = new Scanner(System.in);
		var num1 = in.nextInt();
		var num2 = in.nextInt();
		System.out.println(sum(num1, num2));
	}

}
