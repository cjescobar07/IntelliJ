package com.syntax.class14_STRING_METHODS;

public class Task3 {
	
	/* 
	 * Create a method that will say Hello in a different language based on the country 
	 * that will be passed when the method is executed 
	 */ 
	 
	String sayHello(String country) {
	 //country = country.toLowerCase();
	 //String returnedCountry="";
	 switch(country) {
	 
	 case "USA":
		 return "Hello";		 
		 //returnedCountry = "Hello";
		 //break:
	 case "El Salvador":
		 return "Hola";	
		 //returnedCountry = "Hola";
		 //break:
		 
	 case "France":
		 return "Bonjour";
		 //returnedCountry = "Bonjour";
		 //break:
		 
	 case "Turkey":
		 return "Merhaba";
		 //returnedCountry = "Merhaba";
		 //break:
	
	 default:
		 return "We don't know what language you speak";
		 //returnedCountry = "We don't know what language you speak";
 }
	     //return returnedCountry;
}
	 
	public static void main(String[] args) {
		Task3 object = new Task3();
		String country=object.sayHello("Yo");
		System.out.println(country);
	
		
		
		
	

	
 }
}
