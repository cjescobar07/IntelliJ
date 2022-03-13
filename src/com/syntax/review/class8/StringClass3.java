package com.syntax.review.class8;

public class StringClass3 {
    public static void main(String[] args) {

    String batch = "Batch 12";
   //String course = "SDET";
    String course = "sdet";

    String company = "           Syntax      Tech";
    System.out.println(company.trim());

    String name = "Kareem Abdul-Jabbar";
    System.out.println(name.replaceAll(" ", ""));


    if("Batch 12".equals(batch) &&"SDET".equals(course)){
        System.out.println("You will get the link to MS's lecture");
    }else{
        System.out.println("Watch my youtube channel");

    }
    if("Batch 12".equalsIgnoreCase(batch) &&"SDET".equalsIgnoreCase(course)){
        System.out.println("Now all types of inputs are accepted");
    }



  }
}
