package com.example;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"Введите операцию (без кавычек): \n'+' (сложение), \n‘-’ (разность), \n‘*’ (умножение), \n‘/’ (деление),"
				+ " \n‘div’ (целочисленное деление), \n‘mod’ (остаток от деления), \n‘^’ (возведение в степень)");

		Scanner in = new Scanner(System.in);

		var operation = in.nextLine();

		while (!("+".equals(operation)) && !("-".equals(operation)) && !("*".equals(operation))
				&& !("/".equals(operation)) && !("div".equals(operation)) && !("mod".equals(operation))
				&& !("^".equals(operation))) {
			System.out.println("Введена некорректная операция, попробуйте еще раз");
			operation = in.nextLine();
		}

		System.out.println("Введите первое число");
		var number1 = in.nextInt();

		System.out.println("Введите второе число");
		var number2 = in.nextInt();

		switch (operation) {

		case "+": {
			System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
			break;
		}

		case "-": {
			System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
			break;
		}

		case "*": {
			System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
			break;
		}

		case "/": {
			if (number2 == 0) {
				System.out.print("Недопустимая операция");
			} else {
				System.out.println(number1 + " / " + number2 + " = " + ((float) number1 / number2));
			}
			break;
		}

		case "div": {
			if (number2 == 0) {
				System.out.print("Недопустимая операция");
			} else {
				System.out.println(number1 + " div " + number2 + " = " + (number1 / number2));
			}
			break;
		}

		case "mod": {
			if (number2 == 0) {
				System.out.print("Недопустимая операция");
			} else {
				System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));
			}
			break;
		}

		case "^": {
			var result = 1f;
			for (var i = 1; i <= Math.abs(number2); i++) {
				result = result * number1;
			}
			if (number2 < 0) {
				System.out.println(number1 + " ^ " + number2 + " = " + (1 / result));
			} else if (number1 == 0 && number2 == 0) {
				System.out.println(number1 + " ^ " + number2 + " = " + Double.POSITIVE_INFINITY);
			} else {
				System.out.println(number1 + " ^ " + number2 + " = " + result);
			}
			break;
		}
		
		default: {
			System.out.println("Unreasonable default case");
		}
		
		}
	}

}
