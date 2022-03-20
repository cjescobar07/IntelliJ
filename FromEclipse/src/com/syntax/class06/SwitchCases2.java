package com.syntax.class06;

public class SwitchCases2 {

	public static void main(String[] args) {
		
		char choice='n';
		String answer;
		
		switch (choice) {
		
		case 'y':
				answer="Yes";
				break;
		case 'n':
				answer="No";
				break;
		case 'm':
				answer="Maybe";
				break;
		default:
				answer="Invalid";
				break;
		}
		
			System.out.println(answer);
			System.out.println("--------------------");
			
			/*
			 * declare a variable to store a car
			 * based on the value of car define the country of origin
			 */
		
			String car="FORD";
			String country;
			
			switch (car.toLowerCase()) {
			
			case "bmw":
				country="Germany";
				break;
				
			case "ford":
				country="USA";
				break;
				
			case "lada":
				country="Russia";
				break;
				
			case "toyota":
				country="Japan";
				break;
				
			default:
				country="Unknown";
			}
			
			System.out.println(car+" is from "+country);

			System.out.println("--------------------");
			
			String car2="bm2";
			String country2;
			
			switch (car2.toUpperCase()) {
			
			case "BMW":
				country2="Germany";
				break;
				
			case "FORD":
				country2="USA";
				break;
				
			case "LADA":
				country2="Russia";
				break;
				
			case "TOYOTA":
				country2="Japan";
				break;
				
			default:
				country2="Unknown";
			}
			
			System.out.println(car2+" is from "+country2);
			
			
	}

}
