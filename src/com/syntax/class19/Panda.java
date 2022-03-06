package com.syntax.class19;

public class Panda {
    String name = "Kungfu";
    String breed = "Giant Panda";
    String color = "Black and White";
    double height = 6.5;
    int age = 10;
    double weight = 350.0;

    Panda(){

    }

    Panda(String pandaName){
        name = pandaName;
    }

    Panda (String pandaName, String pandaBreed) {
        name = pandaName;
        breed = pandaBreed;
    }

    Panda (String pandaName, String pandaBreed, String pandaColor, double pandaHeight, int pandaAge,
           double pandaWeight) {
        name = pandaName;
        breed = pandaBreed;
        color = pandaColor;
        height = pandaHeight;
        age = pandaAge;
        weight = pandaWeight;
    }

    void printInfo(){
        System.out.println(name + " "+breed+" "+color+" "+height+"" +age+" "+weight);
    }
}
