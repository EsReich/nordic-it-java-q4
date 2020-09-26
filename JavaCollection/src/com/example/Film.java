package com.example;

public class Film implements Comparable<Film> {
	
	private String name;
	private Integer publishedAt;
	private String genre;
	private Integer rate;
	
	public Film() {
		
	}
	
	public Film(String name, Integer publishedAt, String genre, Integer rate) {
		this.name = name;
		this.publishedAt = publishedAt;
		this.genre = genre;
		this.rate = rate;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Integer publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	
	@Override
	public String toString() {
		return "Film [name=" + name + ", publishedAt=" + publishedAt + ", genre=" + genre + ", rate=" + rate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((publishedAt == null) ? 0 : publishedAt.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
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
		Film other = (Film) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publishedAt == null) {
			if (other.publishedAt != null)
				return false;
		} else if (!publishedAt.equals(other.publishedAt))
			return false;
		if (rate == null) {
			if (other.rate != null)
				return false;
		} else if (!rate.equals(other.rate))
			return false;
		return true;
	}

	@Override
	public int compareTo(Film o) {
		return this.rate.compareTo(o.rate);

//		что то же самое, что:		

//		if (this.rate == o.rate) {
//			return 0;
//		} else if (this.rate > o.rate) {
//			return 1;
//		} else {
//			return -1;
//		}
		
	}

	
}
