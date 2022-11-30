package com.basic.function;

public class BasicFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Addition(10,20));
		System.out.println(Subs(20,10));
		System.out.println(Mul(10,45));
		System.out.println(sq(10));
		System.out.println(cube(3));

	}
	static Integer Addition(Integer num1,Integer num2) {
		return num1 + num2;
	}
	static Integer Subs(Integer num1, Integer num2) {
		return num1 - num2;
	}
	static Integer Mul(Integer num1 , Integer num2)
	{
		return num1*num2;
	}
	static Integer sq(Integer num)
	{
		return num*num;
	}
	static Integer cube(Integer num1)
	{
		return num1*num1*num1;
	}
}
