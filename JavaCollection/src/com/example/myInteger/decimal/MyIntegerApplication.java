package com.example.myInteger.decimal;

import java.util.ArrayList;
import java.util.Collections;

public class MyIntegerApplication {
	
//	Создать класс целых чисел MyInteger с порядком на основе количества различных (!) 
//	цифр в десятичном представлении.
	
	public static void main(String[] args) {
		
		var numbers = new ArrayList<MyInteger>();
		
		numbers.add(new MyInteger(12));
		numbers.add(new MyInteger(7));
		numbers.add(new MyInteger(33));
		numbers.add(new MyInteger(1112345337));
		numbers.add(new MyInteger(1231));
		
		Collections.sort(numbers);
		
		for (MyInteger i : numbers) {
			System.out.println(i);
		}
		
	}

}
