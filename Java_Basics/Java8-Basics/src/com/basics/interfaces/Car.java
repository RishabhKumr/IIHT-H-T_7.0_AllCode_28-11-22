package com.basics.interfaces;

public class Car implements Drivable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void driven() {
		// TODO Auto-generated method stub
		System.out.println("The car is being driven");
		
	}

}
class Vehicle 
{
	public static void main(String args[]) {
		Drivable d1 = new Car();
		Drivable d2 = new Bike();
		Drivable d3 = new Truck();
		d1.driven();
		d2.driven();
		d3.driven();
	}
}
class Bike implements Drivable
{

	@Override
	public void driven() {
		// TODO Auto-generated method stub
		System.out.println("the Bike is driven");
		
	}
	
}
class Truck implements Drivable
{

	@Override
	public void driven() {
		// TODO Auto-generated method stub
		System.out.println("the Truck is driven");
		
	}
	
}