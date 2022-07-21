package com.enjoyCode.UniversityCourseTracker.entity;

public class Professor extends Person {
	
	private static String[] courses;
	private static double salary;
	private static double bonus;
	private static String year;
	private static double yearlyIncome;
	
	
	public Professor() {
		
	}
	
	public Professor(String[] courses, double salary, double bonus, String year, double yearlyIncome) {
		super();
		setCourses(courses);
		setSalary(salary);
		setBonus(bonus);
		setYear(year);
		setYearlyIncome(yearlyIncome);
	}


	public static String[] getCourses() {
		return courses;
	}


	public static void setCourses(String[] courses) {
		Professor.courses = courses;
	}


	public static double getSalary() {
		return salary;
	}


	public static void setSalary(double salary) {
		Professor.salary = salary;
	}


	public static double getBonus() {
		return bonus;
	}


	public static void setBonus(double bonus) {
		Professor.bonus = bonus;
	}


	public static String getYear() {
		return year;
	}


	public static void setYear(String year) {
		Professor.year = year;
	}


	public static double getYearlyIncome() {
		return yearlyIncome;
	}


	public static void setYearlyIncome(double yearlyIncome) {
		Professor.yearlyIncome = yearlyIncome;
	}


	@Override
	public String toString() {
		return "Professor [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
