/*
 * COMMENTS DICTIONARY:
 * 1-Option to load values from the Java class Student into the drop down list on jsp view
 * */

package com.eleazar.springdemo.mvc;

//1-import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	//1-private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		/*1-
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("MX", "Mexico");
		countryOptions.put("FR", "France");
		countryOptions.put("DN", "Germany");
		countryOptions.put("US", "United States of America");
		*/
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*1-
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	*/
	
	
}
