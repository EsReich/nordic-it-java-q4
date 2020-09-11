package com.example;

public class DoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var eps = 1e-15;

		double a = 1.000001d - 0.000001d;
		double b = 1.0d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(Math.abs(a - b) < eps);
		
		System.out.println("=====================");
	
	}

}
