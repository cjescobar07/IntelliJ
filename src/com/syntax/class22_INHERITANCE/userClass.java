package com.syntax.class22_INHERITANCE;

public class userClass {
    /*
     Write program: userClass that has a constructor that initializes instance variable name and mobile number.
     Create a subclass userInfo that will have user address variable and it also being
     initialized through constructor call. Print users name, mobile number and address in userDetails method.
     Test your code.
     */

    String name;
    int mobileNumber;

    public userClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    void printInfo() {
        System.out.println(name + " " + mobileNumber);
    }
}
class userInfo extends userClass{
    String address;
    public userInfo(String name, int mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    void printInfo() {
        System.out.println(name + " " + mobileNumber + " " + address);
    }
}

class userDetails{
     public static void main(String[] args) {
        userInfo details = new userInfo("Syntax", 1234567890, "123 Syntax Way");
        details.printInfo();
     }
 }



