package com.syntax.class22_INHERITANCE2;

/*public class Task1 {

}*/
class userClass1{
    String name;
    String mobileNumber;
    userClass1(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class userInfo1 extends userClass1{
    String userAddress;
    userInfo1(String name, String mobileNumber, String userAddress){
        super(name,mobileNumber);
        this.userAddress = userAddress;
    }
    void userDetails1(){
        System.out.println("name: " + name + " MobileNumber: "+ mobileNumber + " Address: " + userAddress);
    }
}
public class Task1{
    /*
     Write program: userClass that has a constructor that initializes instance variable name and mobile number.
     Create a subclass userInfo that will have user address variable and it also being
     initialized through constructor call. Print users name, mobile number and address in userDetails method.
     Test your code.
     */
    public static void main(String[] args) {
        userInfo1 userInfo = new userInfo1("Chris", "1234567890", "USA");
        userInfo.userDetails1();
    }
}

