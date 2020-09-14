package com.zoo.animals;

public class Eagle extends Animal implements Flyable, Diveable {

//	private String name;
//	private int dateOfBirth;
//	private int currentDate;
//	private String homeland;
	private int altitude;     // в км;
	
	
	public Eagle() {
		super();
	}
	
	public Eagle(String name, int dateOfBirth, int currentDate, String homeland, int altitude) {
		super(name, dateOfBirth, currentDate, homeland);
//		this.name = name;
//		this.dateOfBirth = dateOfBirth;
//		this.currentDate = currentDate;
//		this.homeland = homeland;
		this.altitude = altitude;
	}
	
	
	public void say() {
		System.out.println(this.name + ": \"Caw-caw!\"");
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
