package com.syntax.class19;

public class Horsetester {
    public static void main(String[] args){
        Horse horse = new Horse("Cugo", 20 , 400  );

        /*
        Horse --> Data type(Names of classes)
        horse --> Object/instance/reference variable/variable
        = -> assignment operator
         Horse("Jacky", 20, 400) -> call to a constructor
         */
        horse.printHorseName();
    }

}
