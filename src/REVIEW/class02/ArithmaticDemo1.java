package REVIEW.class02;

public class ArithmaticDemo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * + - * / %
         */
        int number1=10;
        int number2=10;
        System.out.println(number1+number2);
        String name1="Abdul";
        String name2="Gulnar";
        System.out.println(name1+name2);
        char letter1='A'; //65
        char letter2='B'; //66
        System.out.println(letter1+letter2);
        /**************************/

        System.out.println(number1-number2);
        //System.out.println(name1-name2); not defined
        System.out.println(letter1-letter2);

        //System.out.println(number1-name1);
        /**************************/
        System.out.println(number1*number2);
        System.out.println((int)'A'); //finding the value of char A
        //System.out.println(name1*name2);

        System.out.println(letter1*letter2);

    }
}
