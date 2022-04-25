package REVIEW.class11;

public abstract class Card {
    abstract void showInterest();
    // private abstract void showInterest(); not allowed
    // static abstract void showInterest(); not allowed
    // abstract final void showInterest(); not allowed
    // default abstract void showInterest();

}

class Visa extends Card {
    @Override
    void showInterest(){
        System.out.println("23%");
    }
}
