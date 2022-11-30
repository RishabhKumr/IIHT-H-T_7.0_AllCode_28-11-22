package com.basic.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String args[]) {
		Predicate<Integer> predicate = (t) -> t%2 == 0;
		
		System.out.println(predicate.test(50));
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		
		numberList.stream().filter(predicate).forEach(number -> System.out.println("Printing: "+number));
	}
	  //Single Line Code

      //numberList.stream().filter((t) -> t%2 == 0).forEach(number -> System.out.println("Printing: "+number));
}
