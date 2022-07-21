package com.enjoyCode.UniversityCourseTracker.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private static Long person_id;
	private static String first_name;
	private static String last_name;
	private static String email_Address;
	private static String phone_number;
	private static  Address address;
	private static Role role;
	
	public Person( ) {
	
		
	}
	
	public Person(Long id, String fname, String lname, String email, String phone_number, Address home_address, Role role ) {
		setPerson_id(id); 
		setFirst_name(fname);
		setLast_name(lname);
		setEmail_Address(email);
		setPhone_number(phone_number);
		setAddress(home_address);
		setRole(role);
		
	}
	
	public static Long getPerson_id() {
		return person_id;
	}


	public static void setPerson_id(Long person_id) {
		Person.person_id = person_id;
	}


	public static String getFirst_name() {
		return first_name;
	}


	public static void setFirst_name(String first_name) {
		Person.first_name = first_name;
	}


	public static String getLast_name() {
		return last_name;
	}


	public static void setLast_name(String last_name) {
		Person.last_name = last_name;
	}


	public static String getEmail_Address() {
		return email_Address;
	}


	public static void setEmail_Address(String email_Address) {
		Person.email_Address = email_Address;
	}


	public static String getPhone_number() {
		return phone_number;
	}


	public static void setPhone_number(String phone_number) {
		Person.phone_number = phone_number;
	}


	public static Address getAddress() {
		return address;
	}


	public static void setAddress(Address address) {
		Person.address = address;
	}


	public static Role getRole() {
		return role;
	}


	public static void setRole(Role role) {
		Person.role = role;
	}


	@Override
	public String toString() {
		return "Person [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
