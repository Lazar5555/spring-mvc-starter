package com.eleazar.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// Method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Method to process the data to form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// New method to read form data
	// Add data to the model
	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// Read the request param from HTML form
		String theName = request.getParameter("studentName");
		
		// Convert all data to caps
		theName = theName.toUpperCase();
		
		// Create the message
		theName = "Que onda " + theName;
		
		// Add the message to the model
		model.addAttribute("message", theName);
		return "helloworld";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName, Model model) {
		
		// Convert all data to caps
		theName = theName.toUpperCase();
		
		// Create the message
		theName = "Que onda v3" + theName;
		
		// Add the message to the model
		model.addAttribute("message", theName);
		
		return "helloworld";
	}
}
