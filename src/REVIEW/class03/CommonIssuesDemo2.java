package REVIEW.class03;

import java.util.Scanner;

public class CommonIssuesDemo2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scanner.nextInt();
        System.out.println(number);
        System.out.println("Enter Name");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println(name);
        System.out.println("Program ended");
    }
}
