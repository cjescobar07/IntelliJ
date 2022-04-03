package com.syntax.class25_ABSTRACT;

interface HealthAble{
    void healthy();
}
public interface Walk extends HealthAble{
    // void healthy();
    void burnCalories();
}
interface Milk extends HealthAble{
    // void healthy();
    void giveEnergy();
}
interface Banana extends HealthAble{
    // void healthy();
    void giveEnergy();
}

class Demo implements Banana{

    @Override
    public void healthy() {
        System.out.println("Banana's are good for you");
    }

    @Override
    public void giveEnergy() {
        System.out.println("It gives us energy");
    }

}
class DemoTester {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.giveEnergy();
        demo.healthy();
    }
}