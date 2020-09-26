package com.example.myInteger.collection.matrix;

public class MyMatrixApplication {
	
	public static void main(String[] args) {

		var matrix1 = new MyMatrix(3, 4);
		var testMatrix1 = new int[3][4];
		
		testMatrix1[0][0] = 1;
		testMatrix1[0][1] = 2;
		testMatrix1[0][2] = 3;
		testMatrix1[0][3] = 4;
		testMatrix1[1][0] = 8;
		testMatrix1[1][1] = 7;
		testMatrix1[1][2] = 6;
		testMatrix1[1][3] = 5;
		testMatrix1[2][0] = 9;
		testMatrix1[2][1] = 8;
		testMatrix1[2][2] = 7;
		testMatrix1[2][3] = 6;
		
		matrix1.setMatrix(testMatrix1);
		
		for (var i : matrix1.getMatrix()) {
			for (var j : i) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (Integer i : matrix1) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n=================");
	
		var matrix2 = new MyMatrix(5, 5);
		matrix2.fillMatrix();
		
		for (var i : matrix2.getMatrix()) {
			for (var j : i) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (Integer i : matrix2) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n=================");
		
		var matrix3 = new MyMatrix(5, 3);
		matrix3.fillMatrix();
		
		for (var i : matrix3.getMatrix()) {
			for (var j : i) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (Integer i : matrix3) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n=================");
	
		var matrix4 = new MyMatrix(4, 10);
		matrix4.fillRandMatrix();
		
		for (var i : matrix4.getMatrix()) {
			for (var j : i) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (Integer i : matrix4) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n=================");
		
	}

}
