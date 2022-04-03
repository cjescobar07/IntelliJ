package com.syntax.class25_ABSTRACT;

public interface InterfaceDemo01 {
    void Healthy();
}
interface Portable{
    void canCarry();
}

interface Eatable{
    void eat();
}
class Orange implements InterfaceDemo01, Portable, Eatable{

    @Override
    public void Healthy() {
        System.out.println("Orange is healthy to eat");
    }

    @Override
    public void canCarry() {
        System.out.println("We can carry orange easily");
    }

    @Override
    public void eat() {
        System.out.println("We can eat orange");
    }
}

class Laptop implements Portable{

    @Override
    public void canCarry() {
        System.out.println("We can carry a laptop easily");
    }
}
