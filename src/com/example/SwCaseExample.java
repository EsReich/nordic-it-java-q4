package com.example;

import java.util.Scanner;

public class SwCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		switch (a % 12) {
		case 0: {
			System.out.print("�����");
			break;
		}
		case 1: {
			System.out.print("���");
			break;
		}
		case 2: {
			System.out.print("����");
			break;
		}
		case 3: {
			System.out.print("������");
			break;
		}
		case 4: {
			System.out.print("������");
			break;
		}
		case 5: {
			System.out.print("����");
			break;
		}
		case 6: {
			System.out.print("������");
			break;
		}
		case 7: {
			System.out.print("����");
			break;
		}
		case 8: {
			System.out.print("��������");
			break;
		}
		case 9: {
			System.out.print("�����");
			break;
		}
		case 10: {
			System.out.print("������");
			break;
		}
		case 11: {
			System.out.print("�����");
			break;
		}
		}
		switch (a % 10){
		case 0:
		case 1: {
			System.out.print("������");
			break;
		}
		
		case 2:
		case 3:{
			System.out.print("����");
			break;
		}
		
		case 4:
		case 5: {
			System.out.print("������");
			break;
		}
		
		case 6:
		case 7: {
			System.out.print("�����");
			break;
		}
		
		case 8:                           // ==> case 0: {
		case 9: {                         // ==>     System.out.print("�����");
			System.out.print("�����");    // ==>     break;
			break;                        // ==>     }
		}                                 // ==> case 1: {
		}                                 // ==>     System.out.print("�����");
	}                                     // ==>     break;
                                          // ==>     }
}                                         // ==>     }
