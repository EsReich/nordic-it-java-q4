package com.zoo.animals;

import com.zoo.exception.NegativeValueException;

public interface Growable {

	public abstract void grow() throws NegativeValueException;
	
}
