package com.njust.factory;

public class NYPizzaStore extends PizzaStore {
	public Pizza createPizza(String type){
		return  new NYStyleCheesePizza();
	}
}
