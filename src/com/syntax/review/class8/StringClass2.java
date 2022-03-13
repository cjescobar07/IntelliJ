package com.syntax.review.class8;

public class StringClass2 {
    public static void main(String[] args) {
        String student = "Chris";
        System.out.println(student.startsWith("C"));
        System.out.println(student.toLowerCase().startsWith("C"));
        System.out.println(student.endsWith("s"));
        System.out.println(student.contains("r"));

        String name = "Sebastian";
        char output = name.charAt(2);
        System.out.println(output);

    }
}
