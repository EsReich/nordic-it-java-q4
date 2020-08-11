package com.example;

import java.util.Scanner;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		var widthOfFrame = in.nextInt();
		var lengthOfFrame = in.nextInt();
		var stringLine = in.next();

		if ((lengthOfFrame - 2) < stringLine.length()) {
			System.out.println("Ошибка");
		} else {

			var star = '*';
			var stringOfFrame = "";
			for (var i = 1; i <= lengthOfFrame; i++) {
				stringOfFrame += star;
			}
			System.out.println(stringOfFrame);

			var spaceOfLine = ' ';
			var lineOfFrame = "*";
			for (var i = 1; i <= (lengthOfFrame - 2); i++) {
				lineOfFrame += spaceOfLine;
			}
			lineOfFrame += star;
			var textLine = "*";
			for (var j = 1; j <= (widthOfFrame - 2); j++) {
				if (j == (widthOfFrame - 2) / 2 && widthOfFrame % 2 == 0) {

					for (var k = 1; k <= ((lengthOfFrame - 2 - stringLine.length()) / 2); k++) {
						textLine += spaceOfLine;
					}
					textLine += stringLine;
					if (((lengthOfFrame % 2 == 0) && (stringLine.length() % 2 == 0))
							|| (lengthOfFrame % 2 != 0) && (stringLine.length() % 2 != 0)) {
						for (var k = lengthOfFrame - 2
								- ((lengthOfFrame - 2 - stringLine.length()) / 2); k <= (lengthOfFrame - 3); k++) {
							textLine += spaceOfLine;
						}
					} else {
						for (var k = lengthOfFrame - 2
								- ((lengthOfFrame - 2 - stringLine.length()) / 2); k <= (lengthOfFrame - 2); k++) {
							textLine += spaceOfLine;
						}
					}
					textLine += star;
					System.out.println(textLine);

				} else if (j == 1 + (widthOfFrame - 2) / 2 && widthOfFrame % 2 != 0) {

					for (var k = 1; k <= ((lengthOfFrame - 2 - stringLine.length()) / 2); k++) {
						textLine += spaceOfLine;
					}
					textLine += stringLine;
					if (((lengthOfFrame % 2 == 0) && (stringLine.length() % 2 == 0))
							|| (lengthOfFrame % 2 != 0) && (stringLine.length() % 2 != 0)) {
						for (var k = lengthOfFrame - 2
								- ((lengthOfFrame - 2 - stringLine.length()) / 2); k <= (lengthOfFrame - 3); k++) {
							textLine += spaceOfLine;
						}
					} else {
						for (var k = lengthOfFrame - 2
								- ((lengthOfFrame - 2 - stringLine.length()) / 2); k <= (lengthOfFrame - 2); k++) {
							textLine += spaceOfLine;
						}
					}
					textLine += star;
					System.out.println(textLine);

				} else {
					System.out.println(lineOfFrame);
				}

			}
			System.out.println(stringOfFrame);
		}
	}

}
