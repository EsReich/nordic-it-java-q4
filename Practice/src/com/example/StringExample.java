package com.example;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = new String("a");
		var b = new String("a");
		
		var a1 = "a";
		var b1 = "a";
		
		var c = "Привет";
		var d = "приВеТ";
		
		var in = new Scanner(System.in);
//		var line = in.nextLine();
		
		String line1 = null;
		
		System.out.println(a == b);                      //false    1
		System.out.println(a1 == b1);                    //true     2
		System.out.println(a.equals(b));                 //true     3
		System.out.println(c == d);                      //false    4
		System.out.println(c.equals(d));                 //false    5
		System.out.println(c.equalsIgnoreCase(d));       //true     6
		System.out.println(a == a1);                      //false   7
		System.out.println("привет".equals(line1));      //false    8
//		System.out.println(line1.equals("привет"));      //ошибка   9 (поэтому так... 
		                                                 //... равнивать нельзя) 
		System.out.println("=============="); 
		
		var e = "";
		System.out.println(e.isBlank());  //возвращает true, если строка пуста или...
		                                  //...содержит только white space
		
		System.out.println(e.isEmpty());  //возвращает true, если строка пуста
		
		var s = "Привет";
		System.out.println(s.charAt(3)); //возвращает 3-ий символ строки (нумерация с 0)
		System.out.println(s.startsWith("П"));
		System.out.println(s.endsWith("т"));
		System.out.println(s.replace("П", "Т"));
		System.out.println(s.replace('П', 'Т'));
		System.out.println(s.replace("Привет", "Пока"));
	}

}
