package com.syntax.class23_METHOD_OVERRIDING.class24_METHOD_OVERRIDDING;

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
