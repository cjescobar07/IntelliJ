package com.syntax.review.class7;

public class Practice4 {

    void verifyBatch12IsGoodEnough(boolean isGood){
        if (isGood){
            System.out.println("Yes!!!");
        }else {
            System.out.println("No!!!");
        }

    }

    public static void main(String[] args) {
        Practice4 p = new Practice4();
        p.verifyBatch12IsGoodEnough(true);
        p.verifyBatch12IsGoodEnough(false);
    }

}
