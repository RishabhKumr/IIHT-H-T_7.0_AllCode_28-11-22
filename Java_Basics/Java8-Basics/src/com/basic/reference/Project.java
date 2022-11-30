package com.basic.reference;

import java.time.LocalDate;

public class Project {
	
	public static void projectProgress() {
		System.out.println("project making progress");
		LocalDate now  = LocalDate.now();
		System.out.println("on "+ now.toString());
	}
	
	public static void threadTask() {
		for(int i =0;i<= 10;i++)
		{
			System.out.println(i*2);
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void printOdd() {
		for(int i =1;i<=100;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}
