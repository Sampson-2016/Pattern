package com.njust.factory;

public class ChicagoStyleCheesePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public ChicagoStyleCheesePizza() {
		name="Chicago Style Deep Dish Cheese Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Plum Tomcato Sauce";
		
		topping.add("Shredded Mozzarella Cheese");

	}
	void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}
