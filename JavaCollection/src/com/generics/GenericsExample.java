package com.generics;

import java.util.ArrayList;

public class GenericsExample {

	public static int summator(ArrayList<Integer> list) { // наследование в параметрах невозможно (дописать пример);
		var sum = 0;
		for (var i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Integer) {
				sum += (int)list.get(i);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Box[] array = new Box[3];
		array[0] = new Box(1);
		array[1] = new Box(3);
		array[2] = new Box("fuck");
		
		var sum = 0;
		for (var i = 0; i < array.length; i++) {
			if (array[i].getValue() instanceof Integer) {
				sum += (int)array[i].getValue();
			}
		}
		
		System.out.println(sum);
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(5);
		list.add(8);
	
		var sum1 = 0;
		for (var i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Integer) {
				sum1 += (int)list.get(i);
			}
		}
		System.out.println(sum1);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(7);
		list1.add(2);
	
		var sum2 = 0;
		for (var i = 0; i < list.size(); i++) {
			sum2 += list1.get(i);
		}
		System.out.println(sum2);
		
		var box = new Box();
		box.setValue(1);
		var value = box.getValue();
		if (value instanceof Integer) {
			System.out.println((int)value + 5);
		}
		
		var box1 = new Box<Integer>();
		box1.setValue(5);
		var value1 = box1.getValue();
		System.out.println(value1 + 5);
		
	}

}
