package com.crazylychee.demo01.extend;

public class Concreteclass extends AbstractClass {

    @Override
    public void abstractMethod() {
        System.out.println("Concreteclass");
        super.abstractMethod();
    }


    @Override
    public void abstractMethod(int a) {
        System.out.println("Concreteclass-a");
        super.abstractMethod(a);
    }


    @Override
    public void abstractMethod(int a, int b) {
        super.abstractMethod(a, b);
    }
}
