package com.zoo.animals;

import com.zoo.exception.NegativeValueException;

public interface Eatable {

	public abstract void eat() throws NegativeValueException;
	
}
