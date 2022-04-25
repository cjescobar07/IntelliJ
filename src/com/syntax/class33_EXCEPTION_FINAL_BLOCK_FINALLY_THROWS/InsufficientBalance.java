package com.syntax.class33_EXCEPTION_FINAL_BLOCK_FINALLY_THROWS;

public class InsufficientBalance extends RuntimeException{
    InsufficientBalance(String msg){
        super(msg);
    }
}
