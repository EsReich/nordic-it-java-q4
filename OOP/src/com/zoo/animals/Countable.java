package com.zoo.animals;

import com.zoo.exception.UnnamedAnimalException;

public interface Countable {

	public abstract void count() throws UnnamedAnimalException;
	
}
