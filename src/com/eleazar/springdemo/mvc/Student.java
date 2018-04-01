/*
 * COMMENTS DICTIONARY:
 * 1-Option to load values from the Java class Student into the drop down list on jsp view
 * */

package com.eleazar.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	//1-private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> favoriteLanguageOpts;
	
	public Student() {
		/*1-
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("MX", "Mexico");
		countryOptions.put("FR", "France");
		countryOptions.put("DN", "Germany");
		countryOptions.put("US", "United States of America");
		*/
		
		//Load the options for favorite language
		favoriteLanguageOpts = new LinkedHashMap<>();
		
		favoriteLanguageOpts.put("Java", "Java");
		favoriteLanguageOpts.put("Python", "Python");
		favoriteLanguageOpts.put("Ruby", "Ruby");
		favoriteLanguageOpts.put("JavaScript", "JavaScript");
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
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOpts() {
		return favoriteLanguageOpts;
	}

}
