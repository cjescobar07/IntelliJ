package com.syntax.class26_INTRO_TO_COLLECTIONS;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        /*shoppingCart.originalPrice=100;
        shoppingCart.discount = .20;
         */
        //shoppingCart.setDiscount(.20);
        System.out.println(shoppingCart.getDiscount());
        shoppingCart.calculatePrice();
    }
}
