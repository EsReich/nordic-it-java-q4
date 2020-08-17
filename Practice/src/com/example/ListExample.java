package com.example;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		
		var list = new ArrayList <Integer>();
		
		var listMatrix = new ArrayList <ArrayList <Integer>>(); //двумерный список;
		
		list.add(7); // добавление элемента, равного 7, справа (с конца);
		list.add(1);
		list.add(0,5); //добавление в нулевой индекс элемента, равного 5; список при...
					   //...этом сдвигается вправо; 
		list.set(1, 9); //изменение элемента с индексом 1 на элемент, равный 9;
		
		System.out.println(list.size());

		for (var i : list) {             //здесь i - int или Integer?
			System.out.print(i);
		}
		
		System.out.println("\n==========\n");
		
		System.out.println(list.get(1)); //возвращает элемент списка с индексом 1;
		
		System.out.println("\n==========\n");
		
		var list1 = new ArrayList <Integer>(5); //???
		list1.add(3);
		for (var i : list1) {             
			System.out.println(i);
		}
		
		
		System.out.println(list1.size());
	}

}
