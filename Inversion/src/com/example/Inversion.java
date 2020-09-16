package com.example;

public class Inversion {
	
	// Переворачивание массива:
	public static int[] invert(int[] mass) {
		for (var i = 0; i < 4; i++) {
			var inter = 0;
			inter = mass[i];
			mass[i] = mass[mass.length - 1 - i];
			mass[mass.length - 1 - i] = inter;	
		}
		return mass;
	}

	public static void main(String[] args) {

		var mass = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		
		for (var i = 0; i < 8; i++) {
		System.out.print(mass[i]);
		}
		
		System.out.println("");
		
		invert(mass);
		
		for (var i = 0; i < 8; i++) {
		System.out.print(mass[i]);
		}
	
	}

}
