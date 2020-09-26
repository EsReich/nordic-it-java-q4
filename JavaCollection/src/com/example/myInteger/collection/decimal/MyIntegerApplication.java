package com.example.myInteger.collection.decimal;

public class MyIntegerApplication {

//	Создать класс целых чисел MyInteger с итератором по цифрам десятичного представления чисел.
	
	public static void main(String[] args) {

		var num1 = new MyInteger(123);
		var num2 = new MyInteger(5624);
		var num3 = new MyInteger(73456789);
		var num4 = new MyInteger(87659343);
		var num5 = new MyInteger(54325);
		
		for (Integer i : num1) {
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("===============");
		
		for (Integer i : num2) {
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("===============");
		
		for (Integer i : num3) {
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("===============");
		
		for (Integer i : num4) {
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("===============");
		
		for (Integer i : num5) {
			System.out.print(i);
		}
		

	}

}
