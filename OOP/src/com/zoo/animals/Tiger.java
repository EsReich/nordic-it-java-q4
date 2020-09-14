package com.zoo.animals;

import com.zoo.exception.NegativeValueException;
import com.zoo.exception.UnnamedAnimalException;

public class Tiger extends Animal implements Growable, Jumpable {

//	private String name;
//	private int dateOfBirth;
//	private int currentDate;
//	private String homeland;
	private float length;     // в метрах;
	
	
	public Tiger() {
		super();
	}
	
	public Tiger(String name, int dateOfBirth, int currentDate, String homeland, float length) {
		super(name, dateOfBirth, currentDate, homeland);
//		this.name = name;
//		this.dateOfBirth = dateOfBirth;
//		this.currentDate = currentDate;
//		this.homeland = homeland;
		this.length = length;
	}
	
	
	public void say() {
		System.out.println(this.name + ": \"Arrrgh!\"");
	}
	
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
	
//	public void setDateOfBirth(int dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
//	
//	public int getDateOfBirth() {
//		return dateOfBirth;
//	}
	
//	public void setCurrentDate(int currentDate) {
//		this.currentDate = currentDate;
//	}
//	
//	public int getCurrentDate() {
//		return currentDate;
//	}
	
//	public void setHomeland(String homeland) {
//		this.homeland = homeland;
//	}
//	
//	public String getHomeland() {
//		return homeland;
//	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getLength() {
		return length;
	}
	
	
	public void announceAge() {
		System.out.println(this.name + " прожил " + (this.currentDate - this.dateOfBirth) + " лет");
	}
	
	public void announceHomeland() {
		System.out.println(this.name + " прибыл из " + this.homeland);
	}
	
	public void grow() throws NegativeValueException {
		if (this.length < 0) {
			throw new NegativeValueException("Значение length не может быть отрицательным");
		} else {
			System.out.println("Длина тела " + this.name + " с хвостом составляет " + this.length + " метров");
		}
	}
	
	public void jump() throws UnnamedAnimalException {
		if (this.name != null) {
			System.out.println("Во время охоты " + this.name + " способен преодолеть за один прыжок до " + this.length * 2.9 + " метров");
		} else {
			throw new UnnamedAnimalException("Животное не может быть безымянным!");
		}
	}
	
}
