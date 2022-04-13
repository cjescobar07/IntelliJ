package com.syntax.class06_SWITCH_STATEMENT;

public class SwitchCase {

	public static void main(String[] args) {
		
		/* if statement
		 * 
		 * if 
		 * 
		 * if else
		 * 
		 * if else if else
		 * 
		 * Switch statement - is another conditional statement
		 * 
		 * a greater alternative for other conditions
		 * 	
		 * switch SYNTAX
		 * switch (variable
		 * 
		 */			
			
			int day=3;
			
			//default value of all non primitive types is null
			String dayName = null;
			if (day==1) {
				dayName="Monday";			
			}else if (day==2) {
				dayName="Tuesday";	
			}else if (day==3) {
				dayName="Wednesday";	
			}else if(day==4) {
				dayName="Thursday";	
			}else if(day==5) {
				dayName="Friday";	
			}else if(day==6) {
				dayName="Saturday";	
			}else if (day==7) {
				dayName="Sunday";	
			}else { // always last block in IF statement
				System.out.println("Invalid");
			}
		
			System.out.println(dayName);
			System.out.println("----------------");
			
			switch (day) {
			
			case 1:
				dayName="Monday";
				break; //break helps code get out and find the
			
			case 2:
				dayName="Tuesday";
				break;
			
			case 3:
				dayName="Wednesday";
				break;
				
			case 4:
				dayName="Thursday";
				break;
				
			case 5:
				dayName="Friday";
				break;
				
			case 6:
				dayName="Saturday";
				break;
				
			case 7:
				dayName="Sunday";
				break;
				
			default: //could be placed anywhere, but best to keep it for last
				dayName="Invalid";
				break;
			}
			System.out.println(dayName);

	}

}
