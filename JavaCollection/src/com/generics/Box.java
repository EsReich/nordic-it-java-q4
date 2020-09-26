package com.generics;

public class Box<T> { // было: public class Box {  ---> в этом заключается использование дженериков;
	
	private T value; // было: private Object value;
	
	public Box() {
		
	}
	
	public Box(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Box [value=" + value + "]";
	}
	
}
