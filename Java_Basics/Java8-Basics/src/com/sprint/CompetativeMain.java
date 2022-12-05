package com.sprint;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class CompetativeMain {
	
	public static void add(ArrayList<CompetitiveExam> list) {
		
		list.add(new CompetitiveExam(1,"IIT","RAM",90,5000));
		list.add(new CompetitiveExam(2,"NEET","SHAYAM",20,1000));
		list.add(new CompetitiveExam(3,"UPSC","NITIESH",10,7000));
		list.add(new CompetitiveExam(4,"SSC","NISHANT",30,6000));
		list.add(new CompetitiveExam(5,"NDA","RAVI",40,4000));
		list.add(new CompetitiveExam(6,"CDS","RISHABH",70,3000));
		list.add(new CompetitiveExam(7,"AFCAT","SHUBHAM",100,2000));
		list.add(new CompetitiveExam(8,"PCS","SOURABH",50,8000));
		list.add(new CompetitiveExam(9,"ISRO","KUMAR",60,9000));
		list.add(new CompetitiveExam(10,"GATE","RAJA",80,10000));
		list.add(new CompetitiveExam(11,"DRDO","GIRISH",110,11000));
		list.add(new CompetitiveExam(12,"OLYMPIADS","ABHISHEK",5,16000));
		list.add(new CompetitiveExam(13,"CAT","KALAB",101,13000));
		list.add(new CompetitiveExam(14,"GRE","PRIYA",104,14000));
		list.add(new CompetitiveExam(15,"GMAT","RIYA",108,12000));
		
	}

	private void print(ArrayList<CompetitiveExam> list,ISortByType sorti) {
		sorti.sort(list);
		list.forEach((comp)-> { System.out.println(comp); });
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<CompetitiveExam> list = new ArrayList<>();
		
		add(list);
		
		System.out.println("-----  List sorted in ascending order based on Fee -----");
		ISortByType sortByFee = (arrayList) -> {
		Collections.sort(arrayList,(x,y) -> Integer.compare(x.getTotalFee(), y.getTotalFee()));
		};
		CompetativeMain main = new CompetativeMain();
		main.print(list,sortByFee);
		Collections.reverse(list);
		
		System.out.println("-----  List sorted in decending order based on Fee -----");
		list.forEach((action)-> { System.out.println(action); });
		System.out.println("-------------------------*************------------------------------");
		
		System.out.println("-----  List sorted in ascending order based on Duration -----");
		ISortByType sortByDuration = (arrayList) -> {
			Collections.sort(arrayList,(x,y) -> Integer.compare(x.getCourseDuration(), y.getCourseDuration()));
			};
		main.print(list, sortByDuration);
		System.out.println("-----  List sorted in decending order based on Fee -----");
		Collections.reverse(list);
		list.forEach((action)-> { System.out.println(action); });
	    
	}
	
}
