package com.enjoyCode.UniversityCourseTracker.entity;

public enum Form_of_enrollment {
	Part_time,
	Full_time;
	
	public String getEnrollmentType() {
	    switch(this) {
	      case Part_time:
	        return "Part time";

	      case Full_time:
	        return "Full time";

	      default:
	        return null;
	      }
	}
}
