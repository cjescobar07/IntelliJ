package com.syntax.class33_EXCEPTION_FINAL_BLOCK_FINALLY_THROWS;

public class Account {

    double balance;

    public void setBalance(double balance)  {
        throw new InsufficientBalance("can't set negative balance");
    }
}
