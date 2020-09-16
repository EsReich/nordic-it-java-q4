package com.example;

public class PalindromeRecursion {

	// Проверка, является ли слово палиндромом:
	public static boolean isPalindrome1(String str) {
		var line = new String("");
		for (var i = str.length() - 1; i >= 0; i--) {
			line += str.charAt(i);
		}
		if (line.equals(str)) {
			System.out.println(str);
			System.out.println(line);
			return true;
		} else {
			System.out.println(str);
			System.out.println(line);
			return false;
		}
	}
	
	public static boolean isPalindrome2(String str) {
		if (str.length() < 2) {
			return true;
		} else if (str.charAt(0) != str.charAt(str.length() - 1)) {
			return false;
		} else {
			return isPalindrome2(str.substring(1, str.length() - 1));
		}
	}
	
	public static void main(String[] args) {
		
		var str = "�����";
		var str1 = "12321";
		var str2 = "123456789";
		var str3 = "���������������������";
		var str4 = "�����";
		var str5 = "����������";
		
		System.out.println(isPalindrome1(str));
		System.out.println(isPalindrome1(str1));
		System.out.println(isPalindrome1(str2));
		System.out.println(isPalindrome1(str3));
		System.out.println(isPalindrome1(str4));
		System.out.println(isPalindrome1(str5));
		
		System.out.println("=======================");
		
		System.out.println(isPalindrome2(str));
		System.out.println(isPalindrome2(str1));
		System.out.println(isPalindrome2(str2));
		System.out.println(isPalindrome2(str3));
		System.out.println(isPalindrome2(str4));
		System.out.println(isPalindrome2(str5));
		
	}

}
