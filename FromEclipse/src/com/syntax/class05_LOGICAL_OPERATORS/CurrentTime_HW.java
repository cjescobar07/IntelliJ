package com.syntax.class05_LOGICAL_OPERATORS;

import java.util.Scanner;

public class CurrentTime_HW {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
			System.out.println("Please enter you time in 24 format");
			
			int time=input.nextInt();
						
			if (time>=0000 && time <=1159) {
				System.out.println("Morning");
			}else if(time>=1200 && time<=1559) {
				System.out.println("Afternoon");
			}else if(time>=1600 && time<=2059) {
				System.out.println("Evening");
			}else if(time>=2100 && time<=2359) {
				System.out.println("Night");
			}		
		
		
		
		
		
		

	}

}
