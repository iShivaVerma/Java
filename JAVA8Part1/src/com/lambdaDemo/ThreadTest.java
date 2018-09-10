package com.lambdaDemo;

public class ThreadTest{

	public static void main(String[] args) {
		
		Runnable runnableObject=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread through Anonymous Interface");
			}
		};
		
		
		Runnable runnableObject1=()->System.out.println("Lambda Thread");
		
		Runnable runnable=()->{for(int i=0;i<5;i++) System.out.println(i);};
		
		runnableObject.run();
		runnableObject1.run();
		runnable.run();
	}
	
}
