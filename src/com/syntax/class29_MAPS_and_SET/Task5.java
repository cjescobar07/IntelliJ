package com.syntax.class29_MAPS_and_SET;

import java.util.LinkedList;

public class Task5 {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor
    that will initialize credit card type.  Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
*/
    public static void main(String[] args) {
        LinkedList<Card> cards=new LinkedList<>();
        cards.add(new MasterCard("Debit"));
        cards.add(new Visa("Credit"));
        for (Card c:cards) {
            c.calculateInterest();
        }
    }

}
abstract class Card{
    String cardType;
    Card(String cardType){
        this.cardType=cardType;
    }
    abstract void calculateInterest();
    void print(){
        System.out.println(cardType);
    }
}
class MasterCard extends Card{

    MasterCard(String cardType) {
        super(cardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 15%");
    }
}

class Visa extends Card{

    Visa(String cardType) {
        super(cardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 10%");
    }
}