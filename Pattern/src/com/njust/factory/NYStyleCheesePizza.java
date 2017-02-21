package com.njust.factory;

public class NYStyleCheesePizza extends Pizza{
	@SuppressWarnings("unchecked")
	public NYStyleCheesePizza() {
		name="NY Style Sauce and Chinese Pizza";
		dough="Thin Crust Dough";
		sauce="Marinare Sauce";
		
		topping.add("Crated Reggiano Cheese");
	}
}

