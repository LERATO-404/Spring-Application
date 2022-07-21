package com.enjoyCode.UniversityCourseTracker.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private static long course_Code;
	private static String course_name;
	private static String course_Description;
	private static int min_Students;
	private static int max_Students;
	
	public Course() {
		
	}
	
	
	public Course(long course_Code,  String course_name, String course_Description, int min_Students, int max_Students) {
		setCourse_Code(course_Code);
		setCourse_name(course_name);
		setCourse_Description(course_Description);
		setMin_Students(min_Students);
		setMax_Students(max_Students);
	}
	
	
	public static long getCourse_Code() {
		return course_Code;
	}
	public static void setCourse_Code(long course_Code) {
		Course.course_Code = course_Code;
	}
	public static String getCourse_name() {
		return course_name;
	}
	public static void setCourse_name(String course_name) {
		Course.course_name = course_name;
	}
	public static String getCourse_Description() {
		return course_Description;
	}
	public static void setCourse_Description(String course_Description) {
		Course.course_Description = course_Description;
	}
	public static int getMin_Students() {
		return min_Students;
	}
	public static void setMin_Students(int min_Students) {
		Course.min_Students = min_Students;
	}
	public static int getMax_Students() {
		return max_Students;
	}
	public static void setMax_Students(int max_Students) {
		Course.max_Students = max_Students;
	}
	@Override
	public String toString() {
		return "Course [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
