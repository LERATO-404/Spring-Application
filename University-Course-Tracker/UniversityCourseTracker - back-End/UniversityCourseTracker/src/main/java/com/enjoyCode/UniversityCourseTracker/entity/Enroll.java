package com.enjoyCode.UniversityCourseTracker.entity;

public class Enroll extends Course {
	
	private static double grade;
	
	public Enroll() {
		
	}

	public Enroll(double grade) {
		super();
		setGrade(grade);
		
	}

	public static double getGrade() {
		return grade;
	}

	public static void setGrade(double grade) {
		Enroll.grade = grade;
	}

	@Override
	public String toString() {
		return "Enroll [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
