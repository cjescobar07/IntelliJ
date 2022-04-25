package com.syntax.class33_EXCEPTION_FINAL_BLOCK_FINALLY_THROWS;

public class DoSomething {

    void doSomething(int a, int b){
        Calculator calculator = new Calculator();
        calculator.DoTheMath(a,b);

    }

    public static void main(String[] args) {
        DoSomething doSomething = new DoSomething();
        doSomething.doSomething(10,10);

    }
}
