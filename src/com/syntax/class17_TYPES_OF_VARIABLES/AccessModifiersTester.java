package com.syntax.class17_TYPES_OF_VARIABLES;

import com.syntax.class18_ACCESS_MODIFIERS.AccessModifiers;

public class AccessModifiersTester {
    public static void main(String[] args){
        AccessModifiers am = new AccessModifiers();
        /*
        Can't access name because it has private access
        Can't access age because it has default access
        Can't access weight because it has protected access
        Can only access color because it has public access
        which can be accessed from anywhere inside the same project
         */

        // System.out.println(am.name);
        // System.out.println(am.age);
        // System.out.println(am.weight);
        System.out.println(am.color);
    }
}
