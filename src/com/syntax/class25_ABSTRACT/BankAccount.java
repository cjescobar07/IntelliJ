package com.syntax.class25_ABSTRACT;

public class BankAccount {
    private double balance = 1235;
    private String username = "Chris";
    private String password = "Chris123";

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void printBalance(String username, String password){
        if(username.equals(this.username) & password.equals(this.password)){
            System.out.println(balance);
        }else{
            System.out.println("this password is not correct");
        }
    }


}
