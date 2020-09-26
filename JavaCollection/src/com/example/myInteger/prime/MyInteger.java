package com.example.myInteger.prime;

public class MyInteger implements Comparable<MyInteger> {
	
	private Integer number;
	
	public MyInteger() {
		
	}
	
	public MyInteger(Integer number) {
		this.number = number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return this.number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		MyInteger other = (MyInteger) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyInteger [number=" + number + "];" + " количество простых делителей равно " + countPrimeDiv(this);
	}
	
	
	public static boolean isPrime(int num) {
		for (var i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			} 
		}
		return true;
	}

	public static Integer countPrimeDiv(MyInteger num) {
		var counter = 0;
		var thisNum = num.getNumber();
		for (var i = 2; i <= num.getNumber(); i++) {
			while (isPrime(i) && thisNum % i == 0) {
				thisNum /= i;
				counter++;
			}
		}
		return counter;
	}
	
	@Override
	public int compareTo(MyInteger o) {
		return countPrimeDiv(this).compareTo(countPrimeDiv(o));
	}
	
}
