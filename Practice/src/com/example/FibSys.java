package com.example;

import java.util.Scanner;

public class FibSys {

	public static int seq(int index) {
		
		int res = 0;
		
		if (index == 0 || index == 1) {
			res = 1;
		} else {
			res = seq(index - 1) + seq(index - 2);
		}
		return res;
		
	}
	
	public static void main(String[] args) {

		var in = new Scanner(System.in);
		var input = in.nextLong();
		var index = 1;
		
		while (seq(index + 1) <= input) {
			index++;
		}
		
		input -= seq(index);
		
		var arr = new int[index];
		arr[0] = 1;

		var counter1 = 2;
		
		while (input != 0 && counter1 <= arr.length) {
			var counter2 = 1;
			while (seq(counter2 + 1) <= input) {
				counter2++;
			}
			counter1 = counter2;
			arr[arr.length - counter2] = 1;
			input -= seq(counter2);
		}
		
		for (var k = 0; k < arr.length; k++) {       
			System.out.print(arr[k]);                
		}                                          
		
	}

}
