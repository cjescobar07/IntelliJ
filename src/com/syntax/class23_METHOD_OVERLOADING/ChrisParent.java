package com.syntax.class23_METHOD_OVERLOADING;

public class ChrisParent {
    String girlName = "Michelle";
    double money = 10000000;
    void marry(){

        System.out.println("Chris you should marry " + girlName);
    }
}
class Chris extends ChrisParent{
    String girlName = "Salma Hayek";
    void marry(){
        super.marry();
        System.out.println("But Dad I want to marry " + girlName);
    }
}
