package com.syntax.class12_OBJECTS_and_CLASSES;

public class PhoneTester {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Phone pixel = new Phone();
        pixel.make="pixel";
        pixel.model="pixel 6";
        pixel.noOfCams=2;
        pixel.color="blue";
        pixel.screenSize=6.8;
        pixel.os="ANdroid 12";
        pixel.phoneNumber="578966855";
        pixel.makeCall();
        pixel.takePictures();
        pixel.printCompleteInfo();

    }
}
