package com.syntax.class23_METHOD_OVERRIDING;

class CreditCard{
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculateInterest(){
        System.out.println(balance*interest);
    }
}

class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest(){
        System.out.println((balance*interest)+1);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest(){
        System.out.println((balance*interest)+2);
    }
}

public class Task5 {
    /*
       Create a class CreditCard and define variable balance and interest.
       Create an instance method that will calculate interest based on the given balance.
       Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
       Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {

        CreditCard card = new CreditCard(100, .15);
        card.calculateInterest();

        Visa visa = new Visa(100,.15);
        visa.calculateInterest();

        AX aX = new AX(100, .15);
        aX.calculateInterest();
    }
}
