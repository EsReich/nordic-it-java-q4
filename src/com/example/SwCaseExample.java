package com.example;

import java.util.Scanner;

public class SwCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		switch (a % 12) {
		case 0: {
			System.out.print("Крыса");
			break;
		}
		case 1: {
			System.out.print("Бык");
			break;
		}
		case 2: {
			System.out.print("Тигр");
			break;
		}
		case 3: {
			System.out.print("Кролик");
			break;
		}
		case 4: {
			System.out.print("Дракон");
			break;
		}
		case 5: {
			System.out.print("Змея");
			break;
		}
		case 6: {
			System.out.print("Лошадь");
			break;
		}
		case 7: {
			System.out.print("Овца");
			break;
		}
		case 8: {
			System.out.print("Обезьяна");
			break;
		}
		case 9: {
			System.out.print("Петух");
			break;
		}
		case 10: {
			System.out.print("Собака");
			break;
		}
		case 11: {
			System.out.print("Кабан");
			break;
		}
		}
		switch (a % 10){
		case 0:
		case 1: {
			System.out.print("Металл");
			break;
		}
		
		case 2:
		case 3:{
			System.out.print("Вода");
			break;
		}
		
		case 4:
		case 5: {
			System.out.print("Дерево");
			break;
		}
		
		case 6:
		case 7: {
			System.out.print("Огонь");
			break;
		}
		
		case 8:                           // ==> case 0: {
		case 9: {                         // ==>     System.out.print("Земля");
			System.out.print("Земля");    // ==>     break;
			break;                        // ==>     }
		}                                 // ==> case 1: {
		}                                 // ==>     System.out.print("Земля");
	}                                     // ==>     break;
                                          // ==>     }
}                                         // ==>     }
