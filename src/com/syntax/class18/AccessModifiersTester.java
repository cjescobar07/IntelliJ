package com.syntax.class18;

public class AccessModifiersTester {
    public static void main(String[] args){
        AccessModifiers am = new AccessModifiers();
        /*
        can't access as name has private access
         */
        // System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
