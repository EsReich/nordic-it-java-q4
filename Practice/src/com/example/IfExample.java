package com.example;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a < 0) {
			System.out.println("Вы ввели отрицательное число");
		} else if (a >= 0 && a <= 10) {
			System.out.println(a * 2);
		} else if (a > 10 && a < 100) {
			System.out.println("Вы ввели большое число");
		} else {
			System.out.println("Вы ввели слишком большое число");
		}

	}

}
