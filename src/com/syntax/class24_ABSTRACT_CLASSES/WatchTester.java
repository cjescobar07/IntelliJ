package com.syntax.class24_ABSTRACT_CLASSES;

public class WatchTester {
    public static void main(String[] args) {

        AppleWatch appleWatch = new AppleWatch(2, 16, 1.5,
                "Apple");

        appleWatch.showHealthTips();
        AppleWatch.displayTime();

    }
}
