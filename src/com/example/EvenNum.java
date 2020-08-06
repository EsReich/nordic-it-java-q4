package com.example;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		var num = in.nextInt();
		var res = 0;

		for (var i = 2; i <= num; i = i + 2) {
			res = res + i;
		}
		System.out.print(res);
	}

}
