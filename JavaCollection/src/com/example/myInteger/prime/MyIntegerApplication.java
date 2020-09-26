package com.example.myInteger.prime;

import java.util.ArrayList;
import java.util.Collections;

public class MyIntegerApplication {
	
//	Создать класс целых чисел MyInteger с порядком на основе количества простых делителей.
	
//	public static boolean isPrime(int num) {
//		for (var i = 2; i <= Math.sqrt(num); i++) {
//			if (num % i == 0) {
//				return false;
//			} 
//		}
//		return true;
//	}
//
//	public static int countPrimeDiv(int num) {
//		var counter = 0;
//		for (var i = 2; i <= num; i++) {
//			while (isPrime(i) && num % i == 0) {
//				num /= i;
//				counter++;
//			}
//		}
//		return counter;
//	}
	
	public static void main(String[] args) {
		
		var numbers = new ArrayList<MyInteger>();
		numbers.add(new MyInteger(128));
		numbers.add(new MyInteger(118));
		numbers.add(new MyInteger(7));
		numbers.add(new MyInteger(29));
		numbers.add(new MyInteger(54));
		
		Collections.sort(numbers);
		
		for (MyInteger i : numbers) {
			System.out.println(i);
		}
		
	}

}
