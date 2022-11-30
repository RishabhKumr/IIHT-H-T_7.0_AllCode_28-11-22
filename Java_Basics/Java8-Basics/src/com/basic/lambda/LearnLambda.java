package com.basic.lambda;

public class LearnLambda{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		LearnLambda learn1 = new LearnLambda();
		MathOpeartion add = (Integer n, Integer m) -> n + m;
		MathOpeartion sub = (Integer n, Integer m) -> n - m;
		MathOpeartion div = (Integer n, Integer m) -> n / m;
		
		System.out.println("addition of two number 100,50 -> "+learn1.operate(100, 50, add));
		System.out.println("Subtraction of two number 100,50 -> "+learn1.operate(100, 50, sub));
		System.out.println("division of two number 100,50 -> "+learn1.operate(100, 50, div));
	}
	
	private Integer operate(Integer num1, Integer num2, MathOpeartion math)
	{
		return math.operation(num1, num2);
	}

}
