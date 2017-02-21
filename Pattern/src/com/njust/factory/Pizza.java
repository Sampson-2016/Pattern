package com.njust.factory;

import java.util.ArrayList;

public abstract class Pizza {
	 String name;
	 String dough;
	 String sauce;
	 @SuppressWarnings("rawtypes")
	ArrayList topping =new ArrayList();
	
	void prepare(){
		System.out.println("Prepareing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding topping: ");
		for(int i=0;i<topping.size();i++){
			System.out.println(topping.get(i));
		}
	}
	
	void bake(){
		System.out.println("bake for 25 minutes");
	}
	
	void cut(){
		System.out.println("cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
}
