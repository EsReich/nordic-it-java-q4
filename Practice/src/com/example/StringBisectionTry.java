package com.example;

public class StringBisectionTry {

	public static void main(String[] args) {

		var str = "asdfghjgffghmjh5gfggsgfgcfwegxfb";
		System.out.println(str.length());
		System.out.println(str.substring(0, str.length() / 2));
		var ind = (str.substring(0, str.length() / 2)).length();
		System.out.println(ind);
		
	}

}
