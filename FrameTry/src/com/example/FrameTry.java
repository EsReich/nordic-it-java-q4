package com.example;

import java.util.Scanner;

public class FrameTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var in = new Scanner(System.in);
		
		var heigthOfFrame = in.nextInt();
		var lengthOfFrame = in.nextInt();
		var stringOfFrame = in.next();
		var ends = (lengthOfFrame - stringOfFrame.length()) / 2;
		boolean parity = heigthOfFrame % 2 == 0;
		
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
					if (parity == true && i == heigthOfFrame / 2 && j == ends) {
						System.out.print(stringOfFrame);
						j += stringOfFrame.length();
					} else if (parity == false && i == heigthOfFrame / 2 + 1 && j == ends) {
						System.out.print(stringOfFrame);
						j += stringOfFrame.length();
					}
				}
				System.out.println("");
			}
		}
		
	}

}
