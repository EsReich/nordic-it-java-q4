package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionProblem {

	public static void main(String[] args) {

		var in = new Scanner(System.in);

		var letters = new HashSet<Character>();
		var word = in.nextLine();

		for (var i = 0; i < word.length(); i++) {

			letters.add(word.charAt(i));

		}

		var counter = 0;
		String guessWord;
		var wordsBase = new ArrayList<String>();

		do {
			counter++;
			guessWord = in.nextLine();
			
			if (wordsBase.contains(guessWord)) {
				
				System.out.println("Такое слово уже угадано");
				counter--;
			} else {
				
				wordsBase.add(guessWord);
				for (var i = 0; i < guessWord.length(); i++) {

					if (letters.contains(guessWord.charAt(i))) {
						continue;
					} else {
						System.out.println("Слово не содержит такой буквы");
						counter--;
						break;
					}

				}
				
			}

		} while (!guessWord.isEmpty());

		counter--;

		System.out.println("Количество верных попыток равно " + counter);

	}

}
