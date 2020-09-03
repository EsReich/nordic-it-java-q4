package com.zoo.animals;

import java.util.Random;

public class Giraffe {

	private String name;
	private int dateOfBirth;
	private int currentDate;
	private String homeland;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void say() {
		System.out.println(this.name + ": \"Ehh, sorry?\"");
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
	
	
	public void announceAge() {
		System.out.println(this.name + " прожил " + (this.currentDate - this.dateOfBirth) + " лет");
	}
	
	public void announceHomeland() {
		System.out.println(this.name + " прибыл из " + this.homeland);
	}
	
	public void declaim() {
		
		var rand = new Random().nextInt(6);
		
		System.out.println(this.name + " зачитает что-то из классиков: ");
		
		if (rand == 0) {
			System.out.println("— У жирафа много пятен,\r\n" + 
					"Он, наверно, неопрятен?\r\n" + 
					"— Все необходимые\r\n" + 
					"Пятнышки родимые!");
		} else if (rand == 1) {
			System.out.println("У жирафа во-от какая шея!\r\n" + 
					"Метра два!.. А может, и длиннее!\r\n" + 
					"Думает жираф:» Я выше всех!»\r\n" + 
					"И на небо смотрит сверху вверх!");
		} else if (rand == 2) {
			System.out.println("Узнать жирафа просто,\r\n" + 
					"Узнать его легко:\r\n" + 
					"Высокого он роста\r\n" + 
					"И видит далеко.");
		} else if (rand == 3) {
			System.out.println("С важным видом, словно граф,\r\n" + 
					"По земле идет жираф,\r\n" + 
					"Доставая — он таков! —\r\n" + 
					"Головой до облаков.");
		} else if (rand == 4) {
			System.out.println("Сегодня, я вижу, особенно грустен твой взгляд,\r\n" + 
					"И руки особенно тонки, колени обняв.\r\n" + 
					"Послушай: далеко, далеко, на озере Чад\r\n" + 
					"Изысканный бродит жираф.\r\n" + 
					"\r\n" + 
					"Ему грациозная стройность и нега дана,\r\n" + 
					"И шкуру его украшает волшебный узор,\r\n" + 
					"С которым равняться осмелится только луна,\r\n" + 
					"Дробясь и качаясь на влаге широких озер.\r\n" + 
					"\r\n" + 
					"Вдали он подобен цветным парусам корабля,\r\n" + 
					"И бег его плавен, как радостный птичий полет.\r\n" + 
					"Я знаю, что много чудесного видит земля,\r\n" + 
					"Когда на закате он прячется в мраморный грот.\r\n" + 
					"\r\n" + 
					"Я знаю веселые сказки таинственных стран\r\n" + 
					"Про черную деву, про страсть молодого вождя,\r\n" + 
					"Но ты слишком долго вдыхала тяжелый туман,\r\n" + 
					"Ты верить не хочешь во что-нибудь, кроме дождя.\r\n" + 
					"\r\n" + 
					"И как я тебе расскажу про тропический сад,\r\n" + 
					"Про стройные пальмы, про запах немыслимых трав…\r\n" + 
					"— Ты плачешь? Послушай… далеко, на озере Чад\r\n" + 
					"Изысканный бродит жираф.");
		} else {
			System.out.println("В желтой жаркой Африке, в центральной ее части,\r\n" + 
					"Как-то вдруг, вне графика, случилося несчастье.\r\n" + 
					"Слон сказал, не разобрав: — видно быть потопу.\r\n" + 
					"В общем так: один жираф влюбился в антилопу.\r\n" + 
					"Тут поднялся галдеж и лай,\r\n" + 
					"И только старый попугай\r\n" + 
					"Громко крикнул из ветвей: —\r\n" + 
					"Жираф большой, ему видней.");
		}

	}
	
	public void count() {
		
		if (this.name != null) {
			System.out.println(this.name + " посчитал длину своего имени: "
				+ "она составляет " + this.name.length() + " символов.");
		} else {
			System.out.println("Owibka pri o4ictka");
		}
	
	}
	
}
