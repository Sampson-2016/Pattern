package com.njust.observer;

import java.util.Observable; 
/**
 * 观察者模式
 * @author sampson
 * 可观察者
 * Observable是类，降低了复用潜力，毕竟weatherData不能再继承其他类
 * setChanged是protected方法，不能在其他类中通过创建Observable对象来组合使用
 * 
 * 注意推和拉两种方式，拉可以实现自己提取数据，数据对外方法，不安全，但是能避免提取无用数据
 * 现在实现的推方式，去掉注解是拉方式
 */
public class WeatherData extends Observable{
	private WeaNode node;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		node=new WeaNode();
	}
	
	public void measurementsChanged(){
		setChanged();
		//notifyObservers();
		
		notifyObservers(node);
	}
	


/*	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}*/
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		node.setHumidity(humidity);
		node.setPressure(pressure);
		node.setTemperature(temperature);
		measurementsChanged();
	}
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	public static void main(String[] args) {
		WeatherData w=new WeatherData();
		CurrentConditionDisplay conditionDisplay=new CurrentConditionDisplay(w);
		w.setMeasurements(30, 20, 10);;
	}
}
