package REVIEW.class08;

public class Class2 {

    String generateUserName(String firstName, String lastName){

        return firstName+"escobar"+lastName+"@gmail.com";
    }
    static void methodDemo(){
        System.out.println("This is the static method");
    }
    void printInfo(){

    }

    public static void main(String[] args) {
     methodDemo();
     Class2 class2 = new Class2();
        System.out.println(class2.generateUserName("cj", "07"));
    }
}
