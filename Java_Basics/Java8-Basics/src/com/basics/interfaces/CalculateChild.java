package com.basics.interfaces;

public class CalculateChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new CalculatorImpl();
		calc.opeartion();
		System.out.println("Sum -> "+Calculator.add(100, 200));
		System.out.println("Sub -> "+Calculator.sub(100, 200));
		System.out.println("Mul -> "+Calculator.mul(100, 200));
		System.out.println("Div -> "+Calculator.div(100, 200));
	}

}
