package com.example.myInteger.collection.matrix;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class MyMatrix implements Iterable<Integer> {
	
	private int length;
	private int width;
	private int[][] matrix;
	
	public MyMatrix() {
	
	}
	
	public MyMatrix(int width, int length) {
		this.length = length;
		this.width = width;
		this.matrix = new int[width][length];
	}

	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + Arrays.deepHashCode(matrix);
		result = prime * result + width;
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
		MyMatrix other = (MyMatrix) obj;
		if (length != other.length)
			return false;
		if (!Arrays.deepEquals(matrix, other.matrix))
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "MyInteger [length=" + length + ", width=" + width + ", matrix=" + Arrays.toString(matrix) + "]";
	}

	
	@Override
	public Iterator<Integer> iterator() {
		return new MyMatrixIterator();
	}
	
	public void fillMatrix() {
		
		var minX = 0;
		var maxX = length - 1;
		var minY = 0;
		var maxY = width - 1;
		var elem = 1;
		
		while (elem < length * width) {
			for (var i = minX; i <= maxX; i++) {
				matrix[minY][i] = elem;
				elem++;
			}
			for (var i = minY + 1; i <= maxY; i++) {
				matrix[i][maxX] = elem;
				elem++;
			}
			for (var i = maxX - 1; i >= minX; i--) {
				matrix[maxY][i] = elem;
				elem++;
			}
			for (var i = maxY - 1; i > minY; i--) {
				matrix[i][minX] = elem;
				elem++;
			}
			minX++;
			maxX--;
			minY++;
			maxY--;
		}
		
	}
	
	public void fillRandMatrix() {
		
		var minX = 0;
		var maxX = length - 1;
		var minY = 0;
		var maxY = width - 1;
		var index = 0;
		
		while (index < length * width) {
			for (var i = minX; i <= maxX; i++) {
				matrix[minY][i] = new Random().nextInt(10);
				index++;
			}
			for (var i = minY + 1; i <= maxY; i++) {
				matrix[i][maxX] = new Random().nextInt(10);
				index++;
			}
			for (var i = maxX - 1; i >= minX; i--) {
				matrix[maxY][i] = new Random().nextInt(10);
				index++;
			}
			for (var i = maxY - 1; i > minY; i--) {
				matrix[i][minX] = new Random().nextInt(10);
				index++;
			}
			minX++;
			maxX--;
			minY++;
			maxY--;
		}
		
	}
	
	public int getElem(int pos) {
		var minX = 0;
		var maxX = length - 1;
		var minY = 0;
		var maxY = width - 1;
		var index = -1;
		var elem = 0;
		
		while (index < length * width) {
			for (var i = minX; i <= maxX; i++) {
				index++;
				if (index == pos) {
					elem = matrix[minY][i];
					break;
				}
			}
			for (var i = minY + 1; i <= maxY; i++) {
				index++;
				if (index == pos) {
					elem = matrix[i][maxX];
					break;
				}
			}
			for (var i = maxX - 1; i >= minX; i--) {
				index++;
				if (index == pos) {
					elem = matrix[maxY][i];
					break;
				}
			}
			for (var i = maxY - 1; i > minY; i--) {
				index++;
				if (index == pos) {
					elem = matrix[i][minX];
					break;
				}
			}
			minX++;
			maxX--;
			minY++;
			maxY--;
		}
		return elem;
	}
	
	
	class MyMatrixIterator implements Iterator<Integer> {

		private int pos = 0;
//		private boolean isNext = (minY <= width / 2 + 1 && length >= width) || (minX <= length / 2 + 1 && length < width);
		
		@Override
		public boolean hasNext() {
			return pos < length * width;
		}

		@Override
		public Integer next() {
			return getElem(pos++);
		}
		
	}
	
}
