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

	public static void main(String[] args) {

		
		System.out.println("Добро пожаловать в наш адский цирк-шапито!");
		
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
		
		
		System.out.println("Прошу знакомиться с первым его обитателем: волчарой!");
		wolf.say();
		wolf.announceAge();
		wolf.announceHomeland();
		wolf.sleep();
		wolf.run();
		
		System.out.println("А это наша тигрила!");
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
		
		System.out.println("Здоровенный лев прямиком из ада!");
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
		
		System.out.println("Следующий экземпляр: грустное длинношеее животное с озера Чад!");
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
		
		System.out.println("В углу клетки притаился слоненок:");
		elef.say();
		elef.announceAge();
		elef.announceHomeland();
		elef.dreamFly();
		elef.wise();
		
		System.out.println("А это американский орлан-белохвост "
				+ "(прямо как на пакетиках с растворимым кофе):");
		eagle.say();
		eagle.announceAge();
		eagle.announceHomeland();
		eagle.fly();
		eagle.dive();
		
		System.out.println("Люся, местная билетёрша:");
		chim.say();
		chim.announceAge();
		chim.announceHomeland();
		chim.bmI();
		chim.dream();
		
		System.out.println("И, наконец, обитатели кунсткамеры - бракованые животные:");
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
		
		
		System.out.println("Манипуляции с вольерами:");
		
		var zoo = new HashMap<Integer, HashSet<Animal>>();
		var aviary0 = new HashSet<Animal>();
		var aviary1 = new HashSet<Animal>();
		var aviary2 = new HashSet<Animal>();
		
		zoo.put(0, aviary0);
		zoo.put(1, aviary1);
		zoo.put(2, aviary2);
		
		try {
			addToAviary(zoo, 0, wolf);
			addToAviary(zoo, 0, tiger);
			addToAviary(zoo, 0, chim);
			addToAviary(zoo, 0, chim);
			addToAviary(zoo, 0, giraf);
			addToAviary(zoo, 0, elef);
			addToAviary(zoo, 0, lion);
			addToAviary(zoo, 0, eagle);
			aviary0.remove(wolf);
			addToAviary(zoo, 0, eagle);
			addToAviary(zoo, 1, lionEx);
			addToAviary(zoo, 2, girafEx);
			addToAviary(zoo, 9, tigerEx);
		} catch (NonexistentAviaryException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final block");
		}
		
		aviary0.remove(wolf);
		
		System.out.println(aviary0.size());
		System.out.println(aviary1.size());
		System.out.println(aviary2.size());
		
	}
	
	
	public static void addNewAnimal(HashSet<Animal> aviary, Animal animal) 
			throws AnimalCloneException, AviaryIndexOutOfBoundsException {
		
		if (aviary.contains(animal)) {
			throw new AnimalCloneException(animal.getName() + " уже содержится в вольере!");
		} else if (aviary.size() > 4) {
			throw new AviaryIndexOutOfBoundsException("Не удалось добавить " 
		+ animal.getName() + ". Вольер переполнен!");
		} else {
			aviary.add(animal);
		}
		
	}
	
	
	public static void addToAviary(HashMap<Integer, HashSet<Animal>> zoo, Integer aviaryNum, Animal animal) 
			throws NonexistentAviaryException {
		
		if (aviaryNum < 0 || aviaryNum > 2) {
			throw new NonexistentAviaryException("Вольера с номером " + aviaryNum + " не существует!");
		} else {
			try {
				addNewAnimal(zoo.get(aviaryNum), animal);
				System.out.println(animal.getName() + " успешно добавлен в вольер");
			} catch (AnimalCloneException | AviaryIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("Final block");
			}
		}
	}
	
	
}
