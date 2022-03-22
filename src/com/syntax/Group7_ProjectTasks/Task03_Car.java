package com.syntax.Group7_ProjectTasks;

import javax.smartcardio.CardPermission;

/*
3.	Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    which should be returning a price of the car.Create 2 sub classes: Sedan and Truck. The Truck class has field as
    weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as
    following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.The Sedan
    class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan
    is >20 feet then returned car price should include 5% discount, otherwise 10% discount

 */
class Car{
    double carPrice;
    String color;

    Car(double carPrice, String color){
        this.carPrice = carPrice;
        this.color = color;
    }
    double calculateSalePrice(){
        return carPrice;
    }
}

class Sedan extends Car{
    int length;

    Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }
    @Override
    double calculateSalePrice(){
        double calculateSalePrice = super.calculateSalePrice();

        if(length>20){
            return calculateSalePrice-calculateSalePrice*0.05;
        }else{
            return calculateSalePrice-calculateSalePrice*0.1;
        }
    }
}

class Truck extends Car{
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    @Override
    double calculateSalePrice(){
        double calculateSalePrice = super.calculateSalePrice();
        if(weight > 2000){
            return calculateSalePrice-calculateSalePrice*0.10;
        }else{
            return calculateSalePrice-calculateSalePrice*0.20;
        }

    }
}


public class Task03_Car {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(29999,"Red", 20);
        System.out.println("The sale price for the Sedan: " + sedan.calculateSalePrice());

        Truck truck = new Truck(39999,"Blue", 2500);
        System.out.println("The sale price for the Truck: " + truck.calculateSalePrice());
    }
}
