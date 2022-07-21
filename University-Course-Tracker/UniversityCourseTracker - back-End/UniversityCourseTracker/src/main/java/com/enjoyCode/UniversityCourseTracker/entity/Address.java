package com.enjoyCode.UniversityCourseTracker.entity;


public class Address extends Person  {

	private static String street;
	private static String city;
	private static String province;
	private static  String postal_Code;
	private static  String country;
	
	
	public Address() {
		
		
	}
	
	public Address(String street, String city, String province, String postal_Code, String country) {
		super();
		setStreet(street);
		setCity(city);
		setProvince(province);
		setPostal_Code(postal_Code);
		setCountry(country);
		
	}
	
	
	public static String getStreet() {
		return street;
	}
	public static void setStreet(String street) {
		Address.street = street;
	}
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Address.city = city;
	}
	public static String getProvince() {
		return province;
	}
	public static void setProvince(String province) {
		Address.province = province;
	}
	public static String getPostal_Code() {
		return postal_Code;
	}
	public static void setPostal_Code(String postal_Code) {
		Address.postal_Code = postal_Code;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Address.country = country;
	}
	@Override
	public String toString() {
		return "Address [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
