package com.sprint;

import java.util.ArrayList;
import java.util.Collections;

public class CompetativeMain {
	
	public static void add(ArrayList<CompetitiveExam> list) {
		list.add(new CompetitiveExam(01,"IIT","NITIESH",90,5000));
		list.add(new CompetitiveExam(02,"NEET","NITIESH",10,1000));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<CompetitiveExam> list = new ArrayList<>();
	    IPrintByType print = (list1) -> Collections.reverse(list);
	    
	    print(list);
		
	}
	
	public static void print(ArrayList<CompetitiveExam> list) {
		for(CompetitiveExam comp : list) {
			System.out.println(comp);
		}
	}
}
