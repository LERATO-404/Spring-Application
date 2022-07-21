package com.enjoyCode.UniversityCourseTracker.entity;

public enum Type_of_Student {
	Local,
	International;
	
	public String getStudentType() {
	    switch(this) {
	      case Local:
	        return "Local";
	      case International:
	        return "International";

	      default:
	        return null;
	      }
	}
}
