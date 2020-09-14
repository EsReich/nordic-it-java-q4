package com.zoo;

import java.util.HashMap;
import java.util.HashSet;

import com.zoo.animals.Animal;
import com.zoo.animals.Chimpanzee;
import com.zoo.animals.Eagle;
import com.zoo.animals.Elefant;
import com.zoo.animals.Giraffe;
import com.zoo.animals.Lion;
import com.zoo.animals.Tiger;
import com.zoo.animals.Wolf;
import com.zoo.exception.AnimalCloneException;
import com.zoo.exception.AviaryIndexOutOfBoundsException;
import com.zoo.exception.NegativeValueException;
import com.zoo.exception.NonexistentAviaryException;
import com.zoo.exception.UnnamedAnimalException;

public class Zoo {

	public static void main(String[] args) throws NonexistentAviaryException, AviaryIndexOutOfBoundsException {

		
		var wolf = new Wolf("Balto", 2000, 2020, "Canada", 6);
		var tiger = new Tiger("Sherkhan", 1999, 2020, "India", 3.5f);
		var lion = new Lion("Simba", 1995, 2020, "Kenya", 20);
		var giraf = new Giraffe("Ruf", 2005, 2020, "Tanzania");
		var elef = new Elefant("Dambo", 1985, 2020, "Sudan", 2.4f, 1.7f, 9000f, true);
		var eagle = new Eagle("Flashy", 2010, 2020, "USA", 3);
		var chim = new Chimpanzee("Lucy", 1993, 2020, "Terra Incognita", 1.75f, 75f, false);
		
		var tigerEx = new Tiger(null, 1999, 2020, "India", - 5f);
		var lionEx = new Lion("Broken Lion", 1995, 2020, "Kenya", - 40);
		var girafEx = new Giraffe();
		
		
		wolf.say();
		wolf.announceAge();
		wolf.announceHomeland();
		wolf.sleep();
		wolf.run();
		
		tiger.say();
		tiger.announceAge();
		tiger.announceHomeland();
		try {
			tiger.grow();
		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		try {
			tiger.jump();
		} catch (UnnamedAnimalException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		
		lion.say();
		lion.announceAge();
		lion.announceHomeland();
		try {
			lion.eat();
		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		lion.copulate();
		
		giraf.say();
		giraf.announceAge();
		giraf.announceHomeland();
		giraf.declaim();
		try {
			giraf.count();
		} catch (UnnamedAnimalException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		
		elef.say();
		elef.announceAge();
		elef.announceHomeland();
		elef.dreamFly();
		elef.wise();
		
		eagle.say();
		eagle.announceAge();
		eagle.announceHomeland();
		eagle.fly();
		eagle.dive();
		
		chim.say();
		chim.announceAge();
		chim.announceHomeland();
		chim.bmI();
		chim.dream();
		
		try {
			tigerEx.grow();
		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		try {
			tigerEx.jump();
		} catch (UnnamedAnimalException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		
		try {
			lionEx.eat();
		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		
		try {
			girafEx.count();
		} catch (UnnamedAnimalException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		
		
//		Вольеры:
		
		
	}

}
