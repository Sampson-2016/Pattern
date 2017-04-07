package com.njust.singleton;

public class InstanceFactory {
	private static class InstanceHolder{
		public static Instance instance=new Instance();
	}
	public static Instance getInstance(){
		return InstanceHolder.instance;
	}
	
	public static void main(String[] args) {
		InstanceFactory.getInstance();
	}
}
