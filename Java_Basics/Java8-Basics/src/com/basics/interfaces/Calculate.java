package com.basics.interfaces;


public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s1 = new SquareOf10();
		s1.square();
		System.out.println(Square.Sq(10));

	}

}

class FindSquare implements Square {
	
	@Override
	public void square() {
		System.out.println("Square of the number is: ");
	}
}

class SquareOf10 implements Square {

	@Override
	public void square() {
		// TODO Auto-generated method stub
		System.out.println("Square is ");
		
	}
	
}