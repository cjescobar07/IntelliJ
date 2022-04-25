package com.syntax.class33_EXCEPTION_FINAL_BLOCK_FINALLY_THROWS;

public class NullPointerDemo {
    public static void main(String[] args) {

        String str = null;
        // we get the null pointer exception when a method
        // is called an object which is not initialized

        str.length();
    }
}
