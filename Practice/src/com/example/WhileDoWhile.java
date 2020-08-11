package com.example;

import java.util.Scanner;

import java.util.Random;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = new Random().nextInt(10);
		Scanner in = new Scanner(System.in);
		var b = in.nextInt();
		var count = 1;
		while (a != b) {
			if (a < b) {
				System.out.println("Загаданное число меньше, введите новое число");
			} else {
				System.out.println("Загаданное число больше, введите новое число");
			}
			b = in.nextInt();
			count++;
		}

		System.out.println("Вы угадали");
		System.out.println("Количество попыток равно" + " " + count);

	}

}
