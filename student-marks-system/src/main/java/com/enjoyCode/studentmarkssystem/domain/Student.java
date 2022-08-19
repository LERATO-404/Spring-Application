package com.enjoyCode.studentmarkssystem.domain;

public class Student {

	private int test1_mark; 
	private int test2_mark; 
	private int test3_mark;
	private final int numberOfTest = 3;
	
	public int getTest1_mark() {
		return test1_mark;
	}
	public void setTest1_mark(int test1_mark) {
		this.test1_mark = test1_mark;
	}
	public int getTest2_mark() {
		return test2_mark;
	}
	public void setTest2_mark(int test2_mark) {
		this.test2_mark = test2_mark;
	}
	public int getTest3_mark() {
		return test3_mark;
	}
	public void setTest3_mark(int test3_mark) {
		this.test3_mark = test3_mark;
	} 
	public int totalMark() {
		return test1_mark + test2_mark + test3_mark;
	}
	public double getAverage() {
		return totalMark()/numberOfTest;
	}
	
	public String getGrade() {
		String finalResult;
		if(getAverage() > 50) {
			finalResult = "Pass";
		}else{
			finalResult = "Fail";
		}
		return finalResult;
	}
}
