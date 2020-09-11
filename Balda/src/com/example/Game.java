package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {

		var in = new Scanner(System.in);

		System.out.println("Ведущий называет слово:");
		
		var letters = new HashSet<Character>();
		var word = in.nextLine();

		for (var i = 0; i < word.length(); i++) {

			letters.add(word.charAt(i));

		}
		
		var turn = 0;
		var endGame1 = false;
		var endGame2 = false;
		var counter1 = 0;
		var counter2 = 0;
		String guessWord;
		var wordsBase = new ArrayList<String>();
		
		do {
			var turn1 = (turn % 2 == 0);
			var turn2 = (turn % 2 != 0);
			var condition1 = (turn1 && endGame1 == false) || ((turn1 || turn2) && endGame2 == true);
			var condition2 = (turn2 && endGame2 == false) || ((turn1 || turn2) && endGame1 == true);
			if (condition1) {
				turn++;
				counter1++;
				System.out.println("Ход первого игрока:");
			} else if (condition2) {
				turn++;
				counter2++;
				System.out.println("Ход второго игрока:");
			}
			
			guessWord = in.nextLine();
			
			if (guessWord.isEmpty()) {
				if (condition1) {
					endGame1 = true;
					counter1--;
				} else if (condition2) {
					endGame2 = true;
					counter2--;
				}
			} else if (wordsBase.contains(guessWord)) {
				System.out.println("Такое слово уже угадано");
				if (condition1) {
					counter1--;
				} else if (condition2) {
					counter2--;
				}
			} else {
				wordsBase.add(guessWord);
				for (var i = 0; i < guessWord.length(); i++) {
					if (letters.contains(guessWord.charAt(i))) {
						continue;
					} else {
						System.out.println("Слово не содержит такой буквы");
						if (condition1) {
							counter1--;
						} else if (condition2) {
							counter2--;
						}
						break;
					}
				}
			}
			
		} while ((endGame1 != true) || (endGame2 != true));
		
		System.out.println("Количество верных попыток первого игрока равно " + counter1);
		System.out.println("Количество верных попыток второго игрока равно " + counter2);
		System.out.println("Конец игры");
		
	}

}
