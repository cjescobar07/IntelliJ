package REVIEW.class03;

public class IfElseDemo4 {
    public static void main(String[] args) {

        int number=10;

        if(number==10) {
            System.out.println("Number is 10");
        }

        if(number==15) {
            System.out.println("Number is 15");
        }

        if(number==20) {
            System.out.println("Number is 15");
        }

        //best practice to write if conditions
        if(number==10) {
            System.out.println("Number is 10");
        }else if(number==15) {
            System.out.println("Number is 15");
        }else if(number==20) {
            System.out.println("Number is 20");
        }
    }
}
