package com.zoo.animals;

public class Elefant {

	private String name;
	private int dateOfBirth;
	private int currentDate;
	private String homeland;
	private float lengthOfEar;
	private float widthOfEar;
	private float mass;
	private boolean isWise;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void say() {
		System.out.println(this.name + ": \"Doo-dee-doo!\"");
	}
	
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setCurrentDate(int currentDate) {
		this.currentDate = currentDate;
	}
	
	public int getCurrentDate() {
		return currentDate;
	}
	
	public void setHomeland(String homeland) {
		this.homeland = homeland;
	}
	
	public String getHomeland() {
		return homeland;
	}
	
	public float getLengthOfEar() {
		return lengthOfEar;
	}

	public void setLengthOfEar(float lengthOfEar) {
		this.lengthOfEar = lengthOfEar;
	}

	public float getWidthOfEar() {
		return widthOfEar;
	}

	public void setWidthOfEar(float widthOfEar) {
		this.widthOfEar = widthOfEar;
	}

	public float getMass() {
		return mass;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}
	
	public boolean isWise() {
		return isWise;
	}
	
	
	public void announceAge() {
		System.out.println(this.name + " прожил " + (this.currentDate - this.dateOfBirth) + " лет");
	}
	
	public void announceHomeland() {
		System.out.println(this.name + " прибыл из " + this.homeland);
	}
	
	public void dreamFly() {
		
		float sizeOfEars = 2 * lengthOfEar * widthOfEar;
		
		if (sizeOfEars * 8_000 < mass) {
			System.out.println("Слоны не летают");
		} else {
			System.out.println(this.name + " обладает прекрасными летными характеристиками");
		}
		
	}
	
	public void wise() {
		
		int age = this.currentDate - this.dateOfBirth;
		
		if (age < 50) {
			isWise = false;
			System.out.println("Слоненок " + this.name + " еще учится");
		} else {
			isWise = true;
			System.out.println(this.name + " - умудренный опытом слон");
		}
	
	}
	
}
