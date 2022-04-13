package com.syntax.class29_MAP_INTRO;

import java.math.BigDecimal;

public class FloatDemo {
    public static void main(String[] args) {

        //Don't need to worry about
        float fl=1/3f;
        if(fl==3.33) {
            System.out.println("Equal");
        }else {
            System.out.println("not");
        }
        // System.out.println(10/3);
        BigDecimal bigDecimal=new BigDecimal(3.25);
        System.out.println(bigDecimal);
        float f=3.25f;
        double f2=3.25;
        System.out.println(f);
        System.out.println(f2);
    }
}
