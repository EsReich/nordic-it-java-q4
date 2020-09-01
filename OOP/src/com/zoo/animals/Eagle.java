package com.zoo.animals;

public class Eagle {

	private String name;
	private int dateOfBirth;
	private int currentDate;
	private String homeland;
	private int altitude;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void say() {
		System.out.println(this.name + ": \"Caw-caw!\"");
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
	
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
	public int getAltitude() {
		return altitude;
	}
	
	
	public void announceAge() {
		System.out.println(this.name + " прожил " + (this.currentDate - this.dateOfBirth) + " лет");
	}
	
	public void announceHomeland() {
		System.out.println(this.name + " прибыл из " + this.homeland);
	}
	
	public void fly() {
		System.out.println(this.name + " летает на высоте " + this.altitude + " километров");
	}
	
	public void dive() {
		System.out.println(this.name + " пикирует на добычу со скоростью " + this.altitude * 36 + " километров в час");
	}
	
}
