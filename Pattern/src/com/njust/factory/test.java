package com.njust.factory;

public class test {
	public static void main(String[] args) {
		PizzaStore chiPizzaStore=new ChcagoStore();
		Pizza pizza=chiPizzaStore.orderPizza("1");
		System.out.println("第一个顾客点的是："+pizza.getName());
		
		PizzaStore nyPizzaStore=new NYPizzaStore();
		Pizza nypizza=nyPizzaStore.orderPizza("2");
		System.out.println("第二个顾客点的是："+nypizza.getName());
	}
}
