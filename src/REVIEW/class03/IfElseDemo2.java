package REVIEW.class03;

public class IfElseDemo2 {
    public static void main(String[] args) {
        int age=13;

        if(age>=13) {
            System.out.println("you can play this game");
        }else {
            System.out.println("you can't play this game");
        }

        String country="USA";
        if(!country.equals("USA")) {
            System.out.println("You can't pay from USA");
        }else {
            System.out.println("You are allowed");
        }
    }
}
