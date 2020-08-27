package com.example;

import java.util.Scanner;

public class FrameTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var in = new Scanner(System.in);
		
		var heigthOfFrame = in.nextFloat();
		var lengthOfFrame = in.nextInt();
		var stringOfFrame = in.next();
		var ends = (lengthOfFrame - stringOfFrame.length()) / 2;    // ---
		
		if (heigthOfFrame < 3 || (lengthOfFrame - 2) < stringOfFrame.length()) {
			System.out.println("Ошибка");
		} else {
			for (var i = 1; i <= heigthOfFrame; i++) {
				for (var j = 1; j <= lengthOfFrame; j++) {
					if (i == 1 || i == heigthOfFrame || j == 1 || j == lengthOfFrame) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					if (i == Math.ceil(heigthOfFrame/2) && j == ends) {
						System.out.print(stringOfFrame);
						j += stringOfFrame.length();
					}
				}
				System.out.println("");
			}
		}
		
	}

}
