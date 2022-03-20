package com.syntax.class14;

public class Task4 {
	
	/*
	 * Create a method createEmail(). Based on values of users name,
	 * lastName and email type; your method should return complete email
	 * address. Example: createEmail (John, Snow, gmail) johnsnow@gmail.com
	 */
	 
	 String createEmail(String userName, String lastName, String emailType) {
		 return userName+lastName+"@"+emailType+".com";
	 }
	 
	 public static void main(String[] args) {
		 Task4 object = new Task4();
		 System.out.println(object.createEmail("chris", "escobar", "gmail"));
	 }
	 
	 

}
