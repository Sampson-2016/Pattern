package com.njust.factory;

public class ChcagoStore extends PizzaStore {
	 Pizza createPizza(String type) {
		return new ChicagoStyleCheesePizza();
	}
}
