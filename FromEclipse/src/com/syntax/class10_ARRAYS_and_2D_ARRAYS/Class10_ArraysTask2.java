package com.syntax.class10_ARRAYS_and_2D_ARRAYS;

public class Class10_ArraysTask2 {

	public static void main(String[] args) {
		
		// Create an array of countries. While retrieving all value from an array print
		// Capital of each country. 
		
		System.out.println("---------One Way-----------");
		String[] country= {"United States", "Dominican Replublic", "El Salvador", "Mexico"};
		String capital = null;
		for(int i=0; i<country.length; i++) {
			
			switch(country[i]) {
			
			case "United States":
				capital = "Washington DC";
				break;
				
			case "Dominican Replublic":
				capital = "Santo Domingo";
				break;
				
			case "El Salvador":
				capital = "San Salvador";
				break;
				
			case "Mexico":
				capital = "Mexico City";
				break;
				
				default:
			}
			System.out.println("The capital of " + country[i]+ " is " + capital);
			
		}
		System.out.println();
		System.out.println("-------Another Way---------");
				
		for(String countries : country) {
			if (countries.equals("United States")) {
				capital="Washington DC";
			}else if (countries.equals("Domican Republic")) {
				capital="Santo Domingo";
			}else if (countries.equals("El Salvador")) {
				capital="San Salvador";
			}else if (countries.equals("Mexico")) {
				capital="Mexico City";
			}
			System.out.println("The capital of " + countries + " is " + capital);
		}
	
		
		
		
		
		
		
		
		
	}
}
