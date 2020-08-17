package com.example;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		
		var list = new ArrayList <Integer>();
		
		var listMatrix = new ArrayList <ArrayList <Integer>>(); //��������� ������;
		
		list.add(7); // ���������� ��������, ������� 7, ������ (� �����);
		list.add(1);
		list.add(0,5); //���������� � ������� ������ ��������, ������� 5; ������ ���...
					   //...���� ���������� ������; 
		list.set(1, 9); //��������� �������� � �������� 1 �� �������, ������ 9;
		
		System.out.println(list.size());

		for (var i : list) {             //����� i - int ��� Integer?
			System.out.print(i);
		}
		
		System.out.println("\n==========\n");
		
		System.out.println(list.get(1)); //���������� ������� ������ � �������� 1;
		
		System.out.println("\n==========\n");
		
		var list1 = new ArrayList <Integer>(5); //???
		list1.add(3);
		for (var i : list1) {             
			System.out.println(i);
		}
		
		
		System.out.println(list1.size());
	}

}
