package com.nestedclass;

public class PizzaBuilder {

	public static void main(String[] args) {
		Pizza pizza=new Pizza.Builder("cake" ).build();
		System.out.println("Name:"+pizza.getName());
		System.out.println("Extra Sauce: "+pizza.isExtraSauce());
		System.out.println("Salad:"+pizza.isSalad());
				

	}

}
