package com.syntax.class26_INTRO_TO_COLLECTIONS;

public class ShoppingCart {
    private double originalPrice = 100;
    private double discount = .15;

    void setDiscount(double discount){ // setter method is to access/set the value
        if (discount > 0 && discount <= .15){
            this.discount = discount;
        }else{
            System.out.println("Can't have that much of a discount");
        }
    }
    public double getDiscount(){ // getter method is to read/get the value
        return discount;
    }
    void calculatePrice(){
        double price = originalPrice-(originalPrice * discount);
        System.out.println(price);
    }
}
