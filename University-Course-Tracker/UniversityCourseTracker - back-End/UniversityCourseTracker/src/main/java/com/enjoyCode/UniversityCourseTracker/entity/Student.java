package com.enjoyCode.UniversityCourseTracker.entity;

public class Student extends Person {
	
	private static String[] courses;
	private static double average_grade;
	private static Form_of_enrollment from_of_enrollment;
	private static Type_of_Student type_of_Student;
	private static boolean on_Probation = false;
	
	public Student() {
		
	}
	
	public Student(String[] courses, double average_grade, Form_of_enrollment from_of_enrollment, Type_of_Student type_of_Student, boolean on_Probation) {
		super();
		setCourses(courses);
		setAverage_grade(average_grade);
		setFrom_of_enrollment(from_of_enrollment);
		setType_of_Student(type_of_Student);
		setOn_Probation(on_Probation);	
	}
	
	public static String[] getCourses() {
		return courses;
	}
	public static void setCourses(String[] courses) {
		Student.courses = courses;
	}
	public static double getAverage_grade() {
		return average_grade;
	}
	public static void setAverage_grade(double average_grade) {
		Student.average_grade = average_grade;
	}
	public static Form_of_enrollment getFrom_of_enrollment() {
		return from_of_enrollment;
	}
	public static void setFrom_of_enrollment(Form_of_enrollment from_of_enrollment) {
		Student.from_of_enrollment = from_of_enrollment;
	}
	public static Type_of_Student getType_of_Student() {
		return type_of_Student;
	}
	public static void setType_of_Student(Type_of_Student type_of_Student) {
		Student.type_of_Student = type_of_Student;
	}
	public static boolean isOn_Probation() {
		return on_Probation;
	}
	public static void setOn_Probation(boolean on_Probation) {
		Student.on_Probation = on_Probation;
	}

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
