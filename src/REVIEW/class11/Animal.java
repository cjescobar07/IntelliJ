package REVIEW.class11;

public class Animal {
    //String name;
    //String color;

    void Sleep(){
        System.out.println("Animals sleep");
    }
}

class Dog extends Animal{
    void Sleep(){
        System.out.println("Dog sleeps in the day");
    }
}

class Cat extends Animal{
    void Sleep(){
        System.out.println("Cat sleeps all day");
    }
    void Eat(){
        System.out.println("we like to eat fish");
    }
}

class Test2 {
    public static void main(String[] args) {
        //Cat cat = new Dog();
        //Cat cat = new Animal(); down casting
        Animal animal = new Cat(); // upcasting
        animal.Sleep();
        //animal.Eat(); we can't use the methods that are speicifc to Cat class because right now it is behaving as an animal
        //Dog dog = (Dog) animal;
        //dog.Sleep();

    }
}

