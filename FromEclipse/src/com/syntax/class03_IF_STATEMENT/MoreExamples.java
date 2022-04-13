package com.syntax.class03_IF_STATEMENT;

public class MoreExamples {

	public static void main(String[] args) {
		
		/*
		 * We need to declare boolean variable yes or no
		 * IF statement NEEDS to be in boolean value
		 * if we are hungry --> I am going to eat
		 * otherwise --> I am going to drink tea
		 */

		boolean hungry=false;
		
		if(hungry) {
			System.out.println("I am going to eat");
		}else {
			System.out.println("I am going to drink tea");
		}
		
		boolean traffic=true;
		if (traffic) {
			System.out.println("I am coming home late");
		}else {
			System.out.println("I am on time");
		}
		
		/*define a variable to store a browser
		 * 
		 * if browser is Chrome --> we are executing test on chrome
		 * otherwise --> browser is not supported for our test
		 */
		
		String browser="Chrome";
		//always use equals to compare 2 things
		
		if (browser.equals("chrome")){
			System.out.println("We are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}
		// would work in this example but not preferable
		if (browser=="chrome") {
			System.out.println("we are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}
		
		/*
		 * if (browser) {} //Type mismatch: cannot convert from string to boolean
		 */
	}
}
