package com.syntax.class04_NESTED_IF;
/*
 * to auto import in mac: cmd+shift+o
 * to auto import in windows: ctrl+shift+o
 */
import java.util.Scanner;

public class TakeInput {
 public static void main(String[] args) {
	 
	 // 1. Create a scanner and assign to a variable	 
	 Scanner scan=new Scanner(System.in);
	 
	 // 2. Specify instructions
	 System.out.println("Please enter country where you are from");
	 
	 // 3. We need to capture String value --> use next();
	 String country=scan.next();
	 System.out.println("You are from "+country);
	 
	 // If you are from USA --> you speak English
	 if (country.equalsIgnoreCase("United States")) {
		 System.out.println("You speak English");
	 }else if (country.equals("France")) {
		 System.out.println("You speak French");
	 }else if (country.equals("China")){
		 System.out.println("You speak Spanish");
	 }else {
		 System.out.println("Any other country I do know what language you speak");
	 }
	 
	 
	 
	 
	 
 }
}
