package com.syntax.class33_EXCEPTION_FINAL_BLOCK_FINALLY_THROWS;

public class ThrowDemo {
    public static void main(String[] args)  {
        Account account = new Account();
        try{
            account.setBalance(-15);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
