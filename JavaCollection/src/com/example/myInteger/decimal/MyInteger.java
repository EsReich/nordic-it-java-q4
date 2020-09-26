package com.example.myInteger.decimal;

import java.util.HashSet;

public class MyInteger implements Comparable<MyInteger> {
	
	private Integer number;
	
	public MyInteger() {
		
	}
	
	public MyInteger(Integer number) {
		this.number = number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return this.number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyInteger [number=" + number + "];" + " количество различных цифр равно " + countNumerals(this);
	}
	
	public static Integer countNumerals(MyInteger number) {
		var str = Integer.valueOf(number.getNumber()).toString();
		var set = new HashSet<Character>();
		for (var i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		return set.size();
	}
	
	@Override
	public int compareTo(MyInteger o) {
		return countNumerals(this).compareTo(countNumerals(o));
	}
	
}
