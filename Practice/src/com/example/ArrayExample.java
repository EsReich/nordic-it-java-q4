package com.example;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		var arr = new int[]{ 0, 0, 0, 0, 4 };
		var arr1 = new int[5];
		
		arr[1] = 1;
		arr[2] = 2;
		
		System.out.println("arr:");
		for (var i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Конец arr");
		
		System.out.println("arr1:");
		
		for (var i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("Конец arr1");
		
		System.out.println("Начало матрицы matrix");
		
		var matrix = new int[4][4];
		
		matrix[0][0] = 1;
		matrix[1][1] = 1;
		matrix[2][2] = 1;
		matrix[3][3] = 1;
		
		for (var i = 0; i < 4; i++) {
			for (var j = 0; j < 4; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("Конец матрицы matrix");
		System.out.println("Начало матрицы matrix 1");
		
		var matrix1 = new int[][] {{ 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }};
		
		for (var i = 0; i < 4; i++) {
			for (var j = 0; j < 4; j++) {
				System.out.print(matrix1[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("Конец матрицы matrix 1");
		System.out.println(matrix == matrix1);
		System.out.println(Arrays.deepEquals(matrix, matrix1)); //для многомерных массивов;
		
		var a = new int [] { 1, 1 };
		var b = new int [] { 1, 1 };
		System.out.println(Arrays.equals(a, b)); //для одномерных массивов;
		
		var matrix3 = new int[][] {{ 1 }, { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 }};
		
		for (var i = 0; i < matrix3.length; i++) {
			for (var j = 0; j < matrix3[i].length; j++) {
				System.out.print(matrix3[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("Цикл foreach:"); //через foreach можно только считать...
											 //...элементы массива, переприсвоить - нельзя;
		
		for (var i : arr) {
			System.out.println(i);
		}
		
		System.out.println("Цикл foreach для двумерного массива:");
		
		for (var i: matrix) {        //т.е. for (var array: matrix) {
			for (var j: i) {         //     	for (var element: array) {
				System.out.print(j); //         	System.out.print(element);
			}                        //			}
			System.out.print("\n");  //			System.out.print("\n");
		}                            //		}
		
	}

}
