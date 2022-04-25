package REVIEW.class08;

public class Class1 {

    public void printSmallerDigit(int x, int y){

        if(x<y){
            System.out.println(x+" is smaller");
        }else if(y<x){                                      //method is declared
            System.out.println(y+" is smaller");
        }else{
            System.out.println("both values are the same");
        }
    }

    public static void main(String[] args) {
        Class1 obj=new Class1();

        obj.printSmallerDigit(3,5);
        obj.printSmallerDigit(15,7);
        obj.printSmallerDigit(5,5);

    }
}
