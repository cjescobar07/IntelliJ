package com.syntax.class06;

import java.util.Scanner;

public class SwtichCaseTask {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);	
		System.out.println("Enter your country");
		
		String country=input.nextLine();
		String language=null;
				
		switch (country) {
		
		case "USA":
			language="English";
			break;
		case "Spain":
			language="Spanish";
			break;
		case "Japan":
			 language="Japanese";
			break;
		case "China":
			language="Chinese";
			break;
		default:
			language="Unknown";
		}	
		
		input.close();	
		System.out.println("In "+country+" people speak "+language);
		
		
	}
}

