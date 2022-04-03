package com.syntax.class19_ACCESS_MODIFIERS2;

public class BookTask {
    /*
        Write Book class that will have instance variables and 2 Constructors.
        While creating an object make sure:
        Instance variables are being initialized
        Both Constructors are being executed
     */

    String name;
    String genre;
    String author;

    public BookTask(){
        System.out.println("No/Default argument constructor");
    }

    public BookTask(String name, String genre){
        this();
        this.name = name;
        this.genre = genre;
        System.out.println("Two argument constructor");
    }

    /*  public BookTask(String name, String genre, String author){
        // this(name, genre);
        // this.author = author;
    }
    */

    void printInfo(){
        System.out.println(this.name+ " " + this.genre + " " + this.author);
    }
}
