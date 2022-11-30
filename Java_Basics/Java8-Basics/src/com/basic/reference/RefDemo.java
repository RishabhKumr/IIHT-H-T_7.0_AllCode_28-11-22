package com.basic.reference;
//Method Reference
public class RefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method Reference Demo");
	//Provide the Implementation of IWork
		/*
	IWork iwork = () -> {
		System.out.println("this id do project from IWork");
	};
	
	iwork.doProject(); */
		//Refering Project class Method
		IWork iwork=Project::projectProgress;
		iwork.doProject();
		
		Runnable runnable = Project::threadTask;
		Thread t1  = new Thread(runnable);
		t1.start();
		
		IWork iwork1= Project::printOdd;
		iwork1.doProject();
		
		
	
	}

}
