package com.basic.ref.cons;

public class ConsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are Studing Const ref");
//		IStudent iStudent = () -> {
//			return new Student();
//		};
		
		IStudent iStudent  = () -> new Student();
		Student student = iStudent.getStudent();
		student.display();

	}

}
