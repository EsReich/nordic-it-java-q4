package com.generics;

public class Box<T> { // ����: public class Box {  ---> � ���� ����������� ������������� ����������;
	
	private T value; // ����: private Object value;
	
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
