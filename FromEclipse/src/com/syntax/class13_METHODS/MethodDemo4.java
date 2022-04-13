package com.syntax.class13_METHODS;

public class MethodDemo4 {
	
	// Create a method that takes boolean isSaleOn, double price, double discount
	// if isSalseOn == true, then return discounted price, otherwise return original price
	
      double checkDiscount (boolean isSaleOn , double price, double discount) {
		if(isSaleOn) {
			return price*discount; // also can use price-price*discount;
		}else {
			return price;
		}
	}
      
      void methodWithoutParameters() {
  		
  	}
  	
	
	
public static void main(String[] args) {

	MethodDemo4 price = new MethodDemo4();
	System.out.println(price.checkDiscount(true, 1000, .15));
	System.out.println(price.checkDiscount(false, 1000, .15));

	
	
	
	
 }
}
