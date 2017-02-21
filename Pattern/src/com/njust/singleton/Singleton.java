package com.njust.singleton;

public class Singleton {
	private static volatile Singleton instance;
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getInstance() {
		if(instance==null){
			synchronized (Singleton.class) {
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
	 return instance;
	}
	public static void main(String[] args) {
		System.out.println("------------------------------");
		for(int i=0;i<100;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Singleton.getInstance().hashCode());
				}
			}).start();
		}
	}
}
