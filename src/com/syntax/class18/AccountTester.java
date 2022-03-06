package com.syntax.class18;

public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account();
        // System.out.println(account.userName);
        // System.out.println(account.password);
        System.out.println(account.accountNumber);
        // System.out.println(account.accountBalance);
        /*
        Accessing a field directly is different than accessing the same field
        with methods having different access modifiers
         */
        // account.printUserName(); private access
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();



    }
}
