package com.syntax.class06_SWITCH_STATEMENT;

public class SwitchCaseLimitations {

	public static void main(String[] args) {
		
		//Non Primitive - String, Switch Case
		//Primitive - byte, short, int, long, float, double, boolean, char
		//String, byte, short, int, char	
		//You can not use the variable expression in case.
		//You cannot use the same constant in two different cases
		
		boolean happy=true;
		//Cannot switch on a value of type boolean.
		//Only convertible int value, string variables are permitted
		
		//Switch Case cannot work with boolean, double, float, || long
		//
		//boolean happy=true;
		//	switch (happy){}
		
		//double number=1.99;
		//	switch (number){}
		
		//float number=1.99f;
		//	switch(number) {}
		
		//long number=1.99l;
        // switch (happy){}
		
		//Switch case cannot be used with Relational or Logical Operators
		// int num1=10;
		
		// switch (num1) {
		//	case num1>10:
		//	case num1>= && num1<=100
		// }
		
		
	}

}
