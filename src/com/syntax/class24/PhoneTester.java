package com.syntax.class24;

import java.util.Scanner;

public class PhoneTester {
    public static void main(String[] args) {
        Phone samsung = new Samsung();
        samsung.makePhoneCall();
        samsung.displayPicture();
        samsung.sendText();

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        //Phone phone = new Phone; abstract class can't create classes
    }
}
