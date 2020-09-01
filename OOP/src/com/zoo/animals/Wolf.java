package com.zoo.animals;

public class Wolf {

	private String name;
	private int dateOfBirth;
	private int currentDate;
	private String homeland;
	private int hoursOfSleep;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void say() {
		System.out.println(this.name + ": \"Woof-woof!\"");
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
	
	public void setHoursOfSleep(int hoursOfSleep) {
		this.hoursOfSleep = hoursOfSleep;
	}
	
	public int getHoursOfSleep() {
		return hoursOfSleep;
	}
	
	
	public void announceAge() {
		System.out.println(this.name + " прожил " + (this.currentDate - this.dateOfBirth) + " лет");
	}
	
	public void announceHomeland() {
		System.out.println(this.name + " прибыл из " + this.homeland);
	}
	
	public void sleep() {
		System.out.println(this.name + " проспал " + this.hoursOfSleep + " часов");
	}
	
	public void run() {
		if (this.hoursOfSleep >= 5 && this.hoursOfSleep <= 10) {
			System.out.println(this.name + ", загоняя добычу, способено пробежать " + this.hoursOfSleep * 8 + " километров");
		} else if (this.hoursOfSleep < 5) {
			System.out.println(this.name + " сегодня не выспался и не станет ни за кем гоняться");
		} else {
			System.out.println(this.name + " сегодня предпочитает весь день спать, а не бегать");
		}
	}
	
}
