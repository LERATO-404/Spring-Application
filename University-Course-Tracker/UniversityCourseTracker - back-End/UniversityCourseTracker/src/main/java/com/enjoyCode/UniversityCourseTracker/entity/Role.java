package com.enjoyCode.UniversityCourseTracker.entity;

public enum Role {
	Student, 
	Professor;
	
	public String getRole() {
	    switch(this) {
	      case Student:
	        return "Student";
	      case Professor:
	        return "Professor";

	      default:
	        return null;
	      }
	}
}
