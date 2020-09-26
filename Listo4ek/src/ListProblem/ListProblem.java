package ListProblem;

import java.util.ArrayList;

public class ListProblem {
	
	// Удаление повторяющихся элементов из списка:
	public static void func(ArrayList <Integer> list) {
		var counter = 0;
		for (var i = 0; i < list.size(); i++) {
			for (var j = 0; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					counter++;
				}
				if (counter > 1 && list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
			counter = 0;
		}
	}

	public static void main(String[] args) {
		
		var list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for (Integer i : list) {
			System.out.print(i);
		}
		
		System.out.println("\n=================");
		
		func(list);
		
		for (Integer i : list) {
			System.out.print(i);
		}
		
	}

}
