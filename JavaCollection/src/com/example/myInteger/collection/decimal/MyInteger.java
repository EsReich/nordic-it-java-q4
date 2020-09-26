package com.example.myInteger.collection.decimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyInteger implements Iterable<Integer> {

	private Integer number;
	private ArrayList<Integer> list;
	
	public MyInteger() {
		this.list = new ArrayList<Integer>();
	}
	
	public MyInteger(Integer number) {
		this.number = number;
		this.list = new ArrayList<Integer>();
		var str = Integer.valueOf(number).toString();
		for (var i = 0; i < str.length(); i++) {
			list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
		}
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "MyInteger [number=" + number + "]";
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MyIntegerIterator();
	}
	
	class MyIntegerIterator implements Iterator<Integer> {

		private int pos = 0;
		
		@Override
		public boolean hasNext() {
			return pos < list.size();
		}

		@Override
		public Integer next() {
//			Collections.sort(list); // сортировка по возрастанию;
			Collections.sort(list, Collections.reverseOrder()); // сортировка по убыванию;
			return list.get(pos++);
		}
		
	}
	
}
