package com.zoo.animals;

public abstract class Animal {
	
	protected String name;
	protected int dateOfBirth;
	protected int currentDate;
	protected String homeland;
	
	
	public Animal() {

	}
	
	public Animal(String name, int dateOfBirth, int currentDate, String homeland) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.currentDate = currentDate;
		this.homeland = homeland;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(int currentDate) {
		this.currentDate = currentDate;
	}
	public String getHomeland() {
		return homeland;
	}
	public void setHomeland(String homeland) {
		this.homeland = homeland;
	}
	
	
	public abstract void say();
	
	public abstract void announceAge();
	
	public abstract void announceHomeland();
	
	
	public int multiplyTwoNumbers(int num1, int num2) {
		return num1 * num2;
	}
	
	public float multiplyTwoNumbers(float num1, float num2) {
		return num1 * num2;
	}

}
