package com.syntax.class18;

public class Account{

    private String userName = "Chris";
    private String password = "Admin";
    public String accountNumber = "123456";
    private double accountBalance = 150000;

    private void printUserName(){
        System.out.println(userName);
    }
    protected void printPassword(){

        System.out.println(password);
    }
    void printBalance(){

        System.out.println(accountBalance);
    }
    public void printAccountNumber(){

        System.out.println(accountNumber);
    }
    public static void main(String[] args){
        Account account = new Account();
        System.out.println(account.userName);
        System.out.println(account.password);
        System.out.println(account.accountNumber);
        System.out.println(account.accountBalance);

        account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();


    }
}
