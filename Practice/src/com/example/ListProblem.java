package com.example;

import java.util.ArrayList;
import java.util.Random;

public class ListProblem {

//	Нахождение максимального и минимального чисел в списке, 
//	а также расчет среднего арифметического.
	
	public static void main(String[] args) {
		var list = new ArrayList <Integer>();
		
		for (var i = 0; i < 5; i++) {
			var element = new Random().nextInt(10);
			list.add(element);
		}
		
		for (var i : list) {
			System.out.print(i);
		}
		System.out.println("");
		
		var sum = 0;
		for (var i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("Cреднее арифметическое равно" + " " + sum / (float)list.size());
		
		//max
		var count = 0;
		for (var i = 0; i < list.size(); i++) {
			for (var j = 0; j < list.size(); j++) {
				if (list.get(i) >= list.get(j)) {
					count++;
				} else {
					count = 0;
					break;
				}
			}
			if (count == list.size()) {
				System.out.println("Максимальное значение равно" + " " + list.get(i));
				break;
			} else {
				continue;
			}
		}
		
		//min
		var count1 = 0;
		for (var i = 0; i < list.size(); i++) {
			for (var j = 0; j < list.size(); j++) {
				if (list.get(i) <= list.get(j)) {
					count1++;
				} else {
					count1 = 0;
					break;
				}
			}
			if (count1 == list.size()) {
				System.out.println("Минимальное значение равно" + " " + list.get(i));
				break;
			} else {
				continue;
			}
		}
		
	}

}
