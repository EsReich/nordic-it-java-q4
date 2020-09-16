package com.example;

import java.util.List;
import java.util.Scanner;

public class NewCalcApplication {

	public static int romanToArabic(String input) {
	    String romanNumeral = input.toUpperCase();
	    int result = 0;

	    List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

	    int i = 0;

	    while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
	        RomanNumeral symbol = romanNumerals.get(i);
	        if (romanNumeral.startsWith(symbol.name())) {
	            result += symbol.getValue();
	            romanNumeral = romanNumeral.substring(symbol.name().length());
	        } else {
	            i++;
	        }
	    }

//	    if (romanNumeral.length() > 0) {
//	        throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
//	    }

	    return result;
	}
	
	public static String arabicToRoman(int number) {
//	    if ((number <= 0) || (number > 4000)) {
//	        throw new IllegalArgumentException(number + " is not in range (0,4000]");
//	    }

	    List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

	    int i = 0;
	    StringBuilder sb = new StringBuilder();

	    while ((number > 0) && (i < romanNumerals.size())) {
	        RomanNumeral currentSymbol = romanNumerals.get(i);
	        if (currentSymbol.getValue() <= number) {
	            sb.append(currentSymbol.name());
	            number -= currentSymbol.getValue();
	        } else {
	            i++;
	        }
	    }

	    return sb.toString();
	}
	
	public static void main(String[] args) {

		var in = new Scanner(System.in);
		var string = in.nextLine();
		String[] mass = string.split(" ");
		
		var num1 = 0; 
		var num2 = 0; 
		var numRom1 = new String();
		var numRom2 = new String();
		
		if (mass[0].equals("1") || mass[0].equals("2") || mass[0].equals("3") || mass[0].equals("4") || mass[0].equals("5") 
				|| mass[0].equals("6") || mass[0].equals("7") || mass[0].equals("8") || mass[0].equals("9") || mass[0].equals("10")) {
			num1 = Integer.parseInt(mass[0]);
		} else if (mass[0].equals("I") || mass[0].equals("II") || mass[0].equals("III") || mass[0].equals("IV") || mass[0].equals("V") 
				|| mass[0].equals("VI") || mass[0].equals("VII") || mass[0].equals("VIII") || mass[0].equals("IX") || mass[0].equals("X")) {
			numRom1 = mass[0];
		} else {
			throw new IllegalArgumentException(mass[0] + " is invalid character");
		}
		
		if (mass[2].equals("1") || mass[2].equals("2") || mass[2].equals("3") || mass[2].equals("4") || mass[2].equals("5") 
				|| mass[2].equals("6") || mass[2].equals("7") || mass[2].equals("8") || mass[2].equals("9") || mass[2].equals("10")) {
			num2 = Integer.parseInt(mass[2]);
		} else if (mass[2].equals("I") || mass[2].equals("II") || mass[2].equals("III") || mass[2].equals("IV") || mass[2].equals("V") 
				|| mass[2].equals("VI") || mass[2].equals("VII") || mass[2].equals("VIII") || mass[2].equals("IX") || mass[2].equals("X")) {
			numRom2 = mass[2];
		} else {
			throw new IllegalArgumentException(mass[2] + " is invalid character");
		}

		var condition1 = num1 != 0 && num2 != 0;
		var condition2 = !numRom1.isEmpty() && !numRom2.isEmpty();
		switch (mass[1]) {

			case "+": {
				if (condition1) {
					System.out.println(num1 + num2);
				} else if (condition2) {
					System.out.println(arabicToRoman(romanToArabic(numRom1) + romanToArabic(numRom2)));
				} else {
					throw new ClassCastException("Numbers are incompatible");
				}
				break;
			}
	
			case "-": {
				if (condition1) {
					System.out.println(num1 - num2);
				} else if (condition2) {
					if (romanToArabic(numRom1) < romanToArabic(numRom2)) {
						System.out.println("-" + arabicToRoman(romanToArabic(numRom2) - romanToArabic(numRom1)));
					} else if (romanToArabic(numRom1) > romanToArabic(numRom2)) {
						System.out.println(arabicToRoman(romanToArabic(numRom1) - romanToArabic(numRom2)));
					} else {
						System.out.println("nihil");
					}
				} else {
					throw new ClassCastException("Numbers are incompatible");
				}
				break;
			}
	
			case "*": {
				if (condition1) {
					System.out.println(num1 * num2);
				} else if (condition2) {
					System.out.println(arabicToRoman(romanToArabic(numRom1) * romanToArabic(numRom2)));
				} else {
					throw new ClassCastException("Numbers are incompatible");
				}
				break;
			}
	
			case "/": {
				if (condition1) {
					System.out.println(num1 / num2);
				} else if (condition2) {
					if (romanToArabic(numRom1) > romanToArabic(numRom2)) {
						System.out.println(arabicToRoman(romanToArabic(numRom1) / romanToArabic(numRom2)));
					} else {
						System.out.println("nihil");
					}
				} else {
					throw new ClassCastException("Numbers are incompatible");
				}
				break;
			}
	
			default: {
				throw new IllegalArgumentException(mass[1] + " is invalid character");
			}
		
		}

	}

}
