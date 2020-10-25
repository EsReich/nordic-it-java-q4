package com.example;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {

	private T[] array;
	private final int LENGTH = 10;
	private int length;
	private Collection<? extends T> collection;
	private int size = 0;
	
	public MyArrayList() {
		this.array = (T[]) new Object[LENGTH];
	}
	
	public MyArrayList(int length) {
		this.length = length;
	}
	
	public MyArrayList(Collection<? extends T> collection) {
		this.collection = collection;
	}

	
	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Collection<? extends T> getCollection() {
		return collection;
	}

	public void setCollection(Collection<? extends T> collection) {
		this.collection = collection;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLENGTH() {
		return LENGTH;
	}

	
	public void add(int index, T elem) {
//		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//		} else if (size == LENGTH)
//		array[index] = elem;
	}
	
}
