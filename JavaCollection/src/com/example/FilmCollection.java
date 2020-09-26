package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class FilmCollection implements Iterable<Film> {
	
	private ArrayList<Film> films;

	public FilmCollection() {
		this.films = new ArrayList<Film>();
	}

	public FilmCollection(ArrayList<Film> films) {
		super();
		this.films = films;
	}

	public ArrayList<Film> getFilms() {
		return films;
	}

	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}

	@Override
	public Iterator<Film> iterator() {
		return new FilmIterator();
	}
	
	class FilmIterator implements Iterator<Film> {

		private int pos = 0;
		
		@Override
		public boolean hasNext() {
			while (pos < films.size()) {
				if (films.get(pos).getPublishedAt() > 2000) {
					break;
				} else {
					pos++;
				}
			}
			return pos < films.size();
		}

		@Override
		public Film next() {
			return films.get(pos++);
		}
		
	}
	
}
