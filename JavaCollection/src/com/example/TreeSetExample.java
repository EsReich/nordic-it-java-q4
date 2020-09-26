package com.example;

import java.util.TreeSet;

public abstract class TreeSetExample {

	public static void main(String[] args) {
		
//		var films = new TreeSet<Film>(new FilmComparator()); //см. класс FilmComparator;
		
		var film1 = new Film("Avatar", 2009, "sci-fy", 4);
		var film2 = new Film("Titanic", 1996, "drama", 5);
		var film3 = new Film("Attraction", 2018, "sci-fy", 3);
		var film4 = new Film("Forsage", 2000, "thriller", 2);

		var filmCollection = new FilmCollection();
		
		filmCollection.getFilms().add(film1);
		filmCollection.getFilms().add(film2);
		filmCollection.getFilms().add(film3);
		filmCollection.getFilms().add(film4);
		
		for(Film f : filmCollection) {
			System.out.println(f);
		}
	}

}
