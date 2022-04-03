package com.syntax.class29_MAPS_and_SET;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
        /*   Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
             as getQuote and cancelInsurance.
             Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has
             petType attribute.
             Create 3 objects of the subclasses and store them in ArrayList. Using for loop/advanced for
             loop/ iterator access all methods of the class.
         */
}

abstract class Insurance{

    String insuranceName;
    Insurance (String insuranceName){
    this.insuranceName = insuranceName;

    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance{
    String carModel;

    Car(String insuranceName,  String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("getting quote for a car " + carModel + " from " + insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("please cancel my Car insurance " + carModel + " from " + insuranceName);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}

class Pet extends Insurance{
String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("getting quote for a pet " + petType + " from " + insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("please cancel my Pet insurance " + petType + " from " + insuranceName);
    }
}

class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Quote for Health " + "from " + insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Please cancel my Health Insurance " + "from " + insuranceName);
    }
}

class Task1_Tester{
    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("123 Insurance", "Tesla S"));
        insurances.add(new Pet("Animal Insurance", "All animals"));
        insurances.add(new Health("Kaiser"));

        for (Insurance i: insurances) {
            i.getQuote();
            i.cancelInsurance();
        }
       Iterator<Insurance> iterator = insurances.iterator();
        while(iterator.hasNext()){
            Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
    }
}
