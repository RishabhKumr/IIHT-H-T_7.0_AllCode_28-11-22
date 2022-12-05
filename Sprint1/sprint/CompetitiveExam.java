package com.sprint;

import java.util.ArrayList;

public class CompetitiveExam {
	private int courseId;
	private String courseName;
	private String courseTeacher;
	private int courseDuration;
	private Integer totalFee;
	
	public CompetitiveExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompetitiveExam(int courseId, String courseName, String courseTeacher, int courseDuration, int totalFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.courseDuration = courseDuration;
		this.totalFee = totalFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public int getTotalFee() {
		return totalFee;
	}

	@Override
	public String toString() {
		return "CompetitiveExam [courseId=" + courseId + ", courseName=" + courseName + ", courseTeacher="
				+ courseTeacher + ", courseDuration=" + courseDuration + ", totalFee=" + totalFee + "]";
	}

	
}
