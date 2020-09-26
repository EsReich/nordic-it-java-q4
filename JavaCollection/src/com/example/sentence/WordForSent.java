package com.example.sentence;

public class WordForSent implements Comparable<WordForSent> {
	
	private String word;

	public WordForSent(String word) {
		this.word = word;
	}
	
	public WordForSent() {
	} 

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "WordForSent [word=" + word + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordForSent other = (WordForSent) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	@Override
	public int compareTo(WordForSent o) {
		Integer length1 = this.word.length();
		Integer length2 = o.word.length();
		return length1.compareTo(length2);

//		»ли то же, что:
		
//		if (this.word.length() > o.word.length()) {
//			return 1;
//		} else if (this.word.length() < o.word.length()) {
//			return -1;
//		} else {
//			return 0;
//		}
	}

	
}
