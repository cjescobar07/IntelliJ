package com.syntax.class18_ACCESS_MODIFIERS1;

public class Facebook {
    private String userName;
    private String password;
    private int age;

    void setAge(int personAge){
        if (personAge>5 && personAge<120){
            age = personAge;
        }else{
            System.out.println(" Access denied ");
        }
    }
}
