package com.syntax.class03_IF_STATEMENT;

public class IfElseBlock {

	public static void main(String[] args) {
		
		int num1=100;
		int num2=500;
		
		//Which number is largest
		
		if (num1>num2) {
			
			System.out.println(num1+" is larger than "+num2);
		}else {
			System.out.println(num2+" is larger than "+num1);		
		}
		
		int temp=45;
		
		//if temp is more than 4, I'll go for a walk
		//else I'm staying at home
		
		if (temp>=45) {
			System.out.println("I am going for a walk");
		}else {
			System.out.println("I am going outside.");
		}
		
		
		/* I need a variable that stores a genders
		 *if gender is f  ----> please use front of the train
		 *otherwise ----> please use back of the train
		 */
		
		char gender='f';
		if (gender=='f') {
			System.out.println("Please use front of the train");
		}else {
			System.out.println("please use back of the train");
		}
		
	}
      }	

	


