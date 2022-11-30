package com.basics.interfaces;

public interface Calculator {
	void opeartion();
	static Integer add(Integer num1, Integer num2) { return num1 + num2; };
	static Integer mul(Integer num1, Integer num2) { return num1 * num2; };
	static Integer sub(Integer num1, Integer num2) { return num1 - num2; };
	static Integer div(Integer num1, Integer num2) { return num1 / num2; };

}
