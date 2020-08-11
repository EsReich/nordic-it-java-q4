package com.example;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		var num = in.nextInt();
		var res = 1L;

		for (var i = 1; i <= num; i++) {
			res = res * i;
		}

		if (num <= 20) {
			System.out.println(num + "!" + " " + "=" + " " + res);
		} else {
			System.out.println("Введено слишком большое число");
		}

	}

}
