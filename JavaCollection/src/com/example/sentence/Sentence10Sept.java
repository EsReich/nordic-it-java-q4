package com.example.sentence;

import java.util.ArrayList;
import java.util.Collections;

public class Sentence10Sept {

	public static void main(String[] args) {
		var sentence = "Раз два семсот шестнадцать";
		var list = new ArrayList<WordForSent>();
		
		for (String s : sentence.split(" ")) {
			list.add(new WordForSent(s));
		}
		
		Collections.sort(list);

		for(WordForSent w : list) {
			System.out.println(w);
		}		
		
		
	}

}
