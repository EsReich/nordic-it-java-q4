package com.example;

import java.util.Comparator;
import java.util.TreeSet;

public class FilmComparator implements Comparator<Film> {

//	Comparator - то же самое, что Comparable, но позволяет сортировать и по возрастанию, и по...
//	...убыванию. Реализуется через конструкцию: var films = new TreeSet<Film>(new FilmComparator()); - см. метод main
	
	@Override
	public int compare(Film o1, Film o2) {
		// o1 > o2 => 1
		// o1 < o2 => -1
		// o1 = o2 => 0
		return o1.getRate().compareTo(o2.getRate());
	}

}
