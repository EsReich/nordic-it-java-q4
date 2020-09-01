package com.zoo.animals;

public class Lion {
	
	private String name;
	private int dateOfBirth;
	private int currentDate;
	private String homeland;
	private int meatEaten;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void say() {
		System.out.println(this.name + ": \"Meow\"");
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
	
	public void setMeatEaten(int meatEaten) {
		this.meatEaten = meatEaten;
	}
	
	public int getMeatEaten() {
		return meatEaten;
	}
	
	
	public void announceAge() {
		System.out.println(this.name + " прожил " + (this.currentDate - this.dateOfBirth) + " лет");
	}
	
	public void announceHomeland() {
		System.out.println(this.name + " прибыл из " + this.homeland);
	}
	
	public void eat() {
		System.out.println(this.name + " сегодня съел " + this.meatEaten + " килограммов мяса");
	}
	
	public void copulate() {
		System.out.println("В брачный период " + this.name + " способен спариваться с самкой до " + this.meatEaten * 5 + " раз в день");
	}
	
}
