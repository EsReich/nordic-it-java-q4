package com.zoo.animals;

public class Chimpanzee extends Animal implements BmIable, Dreamable {
	
//	private String name;
//	private int dateOfBirth;
//	private int currentDate;
//	private String homeland;
	private float height;     // в метрах;
	private float mass;       // в кг;
	private boolean isClever;


	public Chimpanzee() {
		super();
	}
	
	public Chimpanzee(String name, int dateOfBirth, int currentDate, String homeland, 
			float height, float mass, boolean isClever) {
		super(name, dateOfBirth, currentDate, homeland);
//		this.name = name;
//		this.dateOfBirth = dateOfBirth;
//		this.currentDate = currentDate;
//		this.homeland = homeland;
		this.height = height;
		this.mass = mass;
		this.isClever = isClever;
	}
	
	
	public void say() {
		System.out.println(this.name + ": \"Hello, my dears!\"");
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
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setMass(float mass) {
		this.mass = mass;
	}
	
	public float getMass() {
		return mass;
	}
	
	public void setClever(boolean isClever) {
		this.isClever = isClever;
	}
	
	public boolean isClever() {
		return isClever;
	}

	
	public void announceAge() {
		System.out.println(this.name + " прожил " + (this.currentDate - this.dateOfBirth) + " лет");
	}
	
	public void announceHomeland() {
		System.out.println(this.name + " прибыл из " + this.homeland);
	}
	
	public void bmI() {
		
		float bodyMassIndex = this.mass / (this.height * this.height);
		
		if (bodyMassIndex < 18.5f) {
			System.out.println("Индекс массы тела " + this.name + 
					" составляет " + bodyMassIndex + " - покормите обезьянку!");
		} else if (bodyMassIndex >= 18.5f && bodyMassIndex <= 25f) {
			System.out.println("Индекс массы тела " + this.name + 
					" составляет " + bodyMassIndex + " - наш обезьян в прекрасной форме!");
		} else {
			System.out.println("Индекс массы тела " + this.name + 
					" составляет " + bodyMassIndex + " - пора на диету!");
		}
		
	}
	
	public void dream() {
		if (isClever == true) {
			System.out.println(this.name + " любит бананы и щипать листочки с деревьев, "
					+ "а в свободное время увлекается  чтением классической литературы");
		} else {
			System.out.println(this.name + " планирует стать java-разработчиком");
		}
	}
	
}
